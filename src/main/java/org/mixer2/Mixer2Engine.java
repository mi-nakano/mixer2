package org.mixer2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.cache.Cache;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mixer2.jaxb.xhtml.Html;
import org.mixer2.xhtml.AbstractJaxb;
import org.mixer2.xhtml.NamedEntityEnum;
import org.mixer2.xhtml.TagCustomizeWriter;

/**
 * mixer2のエンジンです。現在はxhtml1.0またはhtml5の
 * XML構文で書かれたテンプレートだけを取り扱います
 * このクラスのインスタンスは、APサーバもしくはDIコンテナ内において、
 * singletonとして使いまわすことをお勧めします。
 *
 * テンプレート上にDOCTYPE宣言が指定されていてもそれは削除されます。
 *
 * @author watanabe
 *
 */
public class Mixer2Engine {

    private JAXBContext jaxbContext = null;

    private Cache<String, Html> cache = null;

    private static Log log = LogFactory.getLog(Mixer2Engine.class);

    public Mixer2Engine() {
        init();
    }

    /**
     * unmarshal済みのテンプレートをキャッシュするためのオブジェクトをセットします。
     * キャッシュのキーはStringで、テンプレート文字列自体のsha1ハッシュ値が自動的に使われます。
     *
     * @param cache
     */
    public void setCache(Cache<String, Html> cache) {
        this.cache = cache;
    }

    /**
     * 初期化です。 インスタンス化する際にコンストラクタから自動的に呼び出されます。
     *
     */
    public synchronized void init() {
        log.info("initializing mixer2 engine...");
        try {
            jaxbContext = JAXBContext.newInstance("org.mixer2.jaxb.xhtml");
        } catch (JAXBException e) {
            log.fatal("can't make newInstance of JAXBContext.");
            e.printStackTrace();
        }
    }

    /**
     * テンプレート文字列をJAXBのHtmlオブジェクト型にロード（unmarshal)します。
     * cacheがある場合にはそれを返します。
     * cacheがない場合にはFileをunmarshalした結果をcacheに保存しつつそれを返します。
     */
    public Html loadHtmlTemplateThroughCache(StringBuffer sb) {
        Html html = null;
        String cacheKey = DigestUtils.shaHex(sb.toString());
        if (cache == null) {
            if (log.isDebugEnabled()) {
                log.debug("cache object is null. processing without cache...");
            }
        } else {
            html = cache.get(cacheKey);
            if (log.isDebugEnabled() && html != null) {
                log.debug("cache hit ! " + cacheKey);
            }
        }
        if (html == null) {
            html = loadHtmlTemplate(sb);
            if (cache != null) {
                cache.putIfAbsent(cacheKey, html);
            }
        }
        return html;
    }

    /**
     * テンプレート文字列をJAXBのHtmlオブジェクト型にロード（unmarshal)します。
     * cacheがある場合にはそれを返します。
     * cacheがない場合にはFileをunmarshalした結果をcacheに保存しつつそれを返します。
     *
     * @throws IOException
     *
     */
    public Html loadHtmlTemplateThroughCache(File file) throws IOException {
        StringBuffer sb = fileToStringBuffer(file);
        return loadHtmlTemplateThroughCache(sb);
    }

    /**
     * <p>
     * テンプレートファイルをJAXBのHtmlオブジェクト型にロード（unmarshal)します。
     * cacheがある場合にはそれを返します。
     * cacheがない場合にはFileをunmarshalした結果をcacheに保存しつつそれを返します。
     * </p>
     */
    public Html loadHtmlTemplateThroughCache(String str) {
        StringBuffer sb = new StringBuffer(str);
        return loadHtmlTemplateThroughCache(sb);
    }

    /**
     * <p>
     * テンプレート文字列をJAXBのHtmlオブジェクト型にロード（unmarshal)します。
     * </p>
     */
    public Html loadHtmlTemplate(StringBuffer sb) {
        Html html = null;
        sb = removeDoctypeDeclaration(sb);
        sb = replaceNamedEntity(sb);
        StringReader stringReader = new StringReader(sb.toString());
        try {
            html = (Html) jaxbContext.createUnmarshaller().unmarshal(
                    stringReader);
        } catch (JAXBException e) {
            log.warn("unmarshal failed.");
            e.printStackTrace();
        }
        return html;
    }

    /**
     * テンプレートファイルをJAXBのHtmlオブジェクト型にロード（unmarshal)します。
     */
    public Html loadHtmlTemplate(File file) throws IOException {
        return loadHtmlTemplate(fileToStringBuffer(file));
    }

    /**
     * テンプレートファイルをJAXBのHtmlオブジェクト型にロード（unmarshal)します。
     */
    public Html loadHtmlTemplate(String str) {
        StringBuffer sb = new StringBuffer(str);
        return loadHtmlTemplate(sb);
    }

    /**
     * 任意のタグオブジェクトをmarshalして文字列にして返します。
     *
     */
    public <T extends AbstractJaxb> String saveToString(T tag) {
        StringWriter sw = new StringWriter();
        saveToStringWriter(tag, sw);
        return sw.toString();
    }

    /**
     * 任意のタグのオブジェクトをmarshalして指定されたStringWriterに書き込みます。
     */
    public <T extends AbstractJaxb> void saveToStringWriter(T tag,
            StringWriter writer) {
        tag.removeEmptyCssClass();
        StringWriter tmpWriter = new StringWriter();
        Marshaller m;
        try {
            m = jaxbContext.createMarshaller();
            m.setProperty(Marshaller.JAXB_ENCODING, Charset.defaultCharset()
                    .name());
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.setProperty(Marshaller.JAXB_FRAGMENT, true);
            // m.marshal(html, writer);
            XMLEventWriter xmlEventWriter = XMLOutputFactory.newInstance()
                    .createXMLEventWriter(tmpWriter);
            m.marshal(tag, new TagCustomizeWriter(xmlEventWriter));
        } catch (JAXBException e) {
            log.warn("marshal failed.");
            e.printStackTrace();
        } catch (XMLStreamException e) {
            log.warn("XMLStreamException happend. while saveToWriter().");
            e.printStackTrace();
        } catch (FactoryConfigurationError e) {
            log.warn("FactoryConfigurationError happend. while saveToWriter().");
            e.printStackTrace();
        }

        // 整形する
        String xmlStr;
        if (tag.getClass().getSimpleName().toLowerCase().equals("html")) {
            xmlStr = tmpWriter.toString().trim();
        } else {
            xmlStr = tmpWriter.toString().trim()
                    .replaceFirst("xmlns=\"[^\"]+\"", "");
        }
        Reader xml = new StringReader(xmlStr);
        TransformerFactory transFactory = TransformerFactory.newInstance();
        Transformer transformer;
        try {
            transformer = transFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION,
                    "yes");
            transformer.transform(new StreamSource(xml), new StreamResult(
                    writer));
        } catch (TransformerConfigurationException e) {
            log.warn("TransformerConfigurationException happend. while saveToWriter().");
            e.printStackTrace();
        } catch (TransformerException e) {
            log.warn("TransformerException happend. while saveToWriter().");
            e.printStackTrace();
        }
    }

    /**
     * DOCTYPE宣言を除去します。
     */
    public StringBuffer removeDoctypeDeclaration(StringBuffer sb) {
        if (sb == null) {
            return null;
        }
        String patternStr = "(\\s*)<!DOCTYPE [^>]+>(.+)";
        Pattern ptn = Pattern.compile(patternStr, Pattern.DOTALL);
        Matcher m = ptn.matcher(sb);
        if (m.find()) {
            return new StringBuffer(m.group(1).trim() + "\n"
                    + m.group(2).trim());
        } else {
            return sb;
        }
    }

    /**
     * 文字列内の&amp;copy; や &amp;trade; のようなHTMLの特殊文字の参照を、
     * 数値実体参照に置換します。
     * 主にxhtmlテンプレートをHtmlオブジェクトにunmarshalする直前に使用します。
     *
     * @param sb xhtmlテンプレート
     * @return 該当箇所を置換したxhtmlテンプレート
     */
    public StringBuffer replaceNamedEntity(StringBuffer sb) {
        for (NamedEntityEnum nEnum : NamedEntityEnum.values()) {
            int i;
            while ((i = sb.indexOf(nEnum.getName())) > -1) {
                sb.replace(i, i + nEnum.getName().length(), nEnum.getNumber());
            }
        }
        return sb;
    }

    public void removeAllCache() {
        if (this.cache != null) {
            cache.removeAll();
        }
    }

    private StringBuffer fileToStringBuffer(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuffer sb = new StringBuffer();
        while (br.ready()) {
            sb.append(br.readLine());
        }
        br.close();
        return sb;
    }

}


package org.mixer2.jaxb.xhtml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/1999/xhtml}Flow">
 *       &lt;attGroup ref="{http://www.w3.org/1999/xhtml}attrs"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "noframes")
public class Noframes
    extends Flow
    implements Cloneable, CopyTo
{

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> cssClass;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "title")
    protected String title;
    @XmlAttribute(name = "accesskey")
    protected String accesskey;
    @XmlAttribute(name = "contenteditable")
    protected Boolean contenteditable;
    @XmlAttribute(name = "contextmenu")
    protected String contextmenu;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;
    @XmlAttribute(name = "draggable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String draggable;
    @XmlAttribute(name = "dropzone")
    protected List<String> dropzone;
    @XmlAttribute(name = "hidden")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hidden;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String langCode;
    @XmlAttribute(name = "role")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String role;
    @XmlAttribute(name = "spellcheck")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String spellcheck;
    @XmlAttribute(name = "tabindex")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Integer tabindex;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;
    @XmlAttribute(name = "onclick")
    protected String onclick;
    @XmlAttribute(name = "ondblclick")
    protected String ondblclick;
    @XmlAttribute(name = "onmousedown")
    protected String onmousedown;
    @XmlAttribute(name = "onmouseup")
    protected String onmouseup;
    @XmlAttribute(name = "onmouseover")
    protected String onmouseover;
    @XmlAttribute(name = "onmousemove")
    protected String onmousemove;
    @XmlAttribute(name = "onmouseout")
    protected String onmouseout;
    @XmlAttribute(name = "onkeypress")
    protected String onkeypress;
    @XmlAttribute(name = "onkeydown")
    protected String onkeydown;
    @XmlAttribute(name = "onkeyup")
    protected String onkeyup;
    @XmlAttribute(name = "onabort")
    protected String onabort;
    @XmlAttribute(name = "onblur")
    protected String onblur;
    @XmlAttribute(name = "oncanplay")
    protected String oncanplay;
    @XmlAttribute(name = "oncanplaythrough")
    protected String oncanplaythrough;
    @XmlAttribute(name = "onchange")
    protected String onchange;
    @XmlAttribute(name = "oncontextmenu")
    protected String oncontextmenu;
    @XmlAttribute(name = "oncuechange")
    protected String oncuechange;
    @XmlAttribute(name = "ondrag")
    protected String ondrag;
    @XmlAttribute(name = "ondragend")
    protected String ondragend;
    @XmlAttribute(name = "ondragenter")
    protected String ondragenter;
    @XmlAttribute(name = "ondragleave")
    protected String ondragleave;
    @XmlAttribute(name = "ondragover")
    protected String ondragover;
    @XmlAttribute(name = "ondragstart")
    protected String ondragstart;
    @XmlAttribute(name = "ondrop")
    protected String ondrop;
    @XmlAttribute(name = "ondurationchange")
    protected String ondurationchange;
    @XmlAttribute(name = "onemptied")
    protected String onemptied;
    @XmlAttribute(name = "onended")
    protected String onended;
    @XmlAttribute(name = "onerror")
    protected String onerror;
    @XmlAttribute(name = "onfocus")
    protected String onfocus;
    @XmlAttribute(name = "onformchange")
    protected String onformchange;
    @XmlAttribute(name = "onforminput")
    protected String onforminput;
    @XmlAttribute(name = "oninput")
    protected String oninput;
    @XmlAttribute(name = "oninvalid")
    protected String oninvalid;
    @XmlAttribute(name = "onload")
    protected String onload;
    @XmlAttribute(name = "onloadeddata")
    protected String onloadeddata;
    @XmlAttribute(name = "onloadedmetadata")
    protected String onloadedmetadata;
    @XmlAttribute(name = "onloadstart")
    protected String onloadstart;
    @XmlAttribute(name = "onmousewheel")
    protected String onmousewheel;
    @XmlAttribute(name = "onpause")
    protected String onpause;
    @XmlAttribute(name = "onplay")
    protected String onplay;
    @XmlAttribute(name = "onplaying")
    protected String onplaying;
    @XmlAttribute(name = "onprogress")
    protected String onprogress;
    @XmlAttribute(name = "onratechange")
    protected String onratechange;
    @XmlAttribute(name = "onreadystatechange")
    protected String onreadystatechange;
    @XmlAttribute(name = "onreset")
    protected String onreset;
    @XmlAttribute(name = "onscroll")
    protected String onscroll;
    @XmlAttribute(name = "onseeked")
    protected String onseeked;
    @XmlAttribute(name = "onseeking")
    protected String onseeking;
    @XmlAttribute(name = "onselect")
    protected String onselect;
    @XmlAttribute(name = "onshow")
    protected String onshow;
    @XmlAttribute(name = "onstalled")
    protected String onstalled;
    @XmlAttribute(name = "onsubmit")
    protected String onsubmit;
    @XmlAttribute(name = "onsuspend")
    protected String onsuspend;
    @XmlAttribute(name = "ontimeupdate")
    protected String ontimeupdate;
    @XmlAttribute(name = "onvolumechange")
    protected String onvolumechange;
    @XmlAttribute(name = "onwaiting")
    protected String onwaiting;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

    /**
     * Gets the value of the cssClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cssClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCssClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCssClass() {
        if (cssClass == null) {
            cssClass = new ArrayList<String>();
        }
        return this.cssClass;
    }

    public boolean isSetCssClass() {
        return ((this.cssClass!= null)&&(!this.cssClass.isEmpty()));
    }

    public void unsetCssClass() {
        this.cssClass = null;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    public boolean isSetStyle() {
        return (this.style!= null);
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Gets the value of the accesskey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccesskey() {
        return accesskey;
    }

    /**
     * Sets the value of the accesskey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccesskey(String value) {
        this.accesskey = value;
    }

    public boolean isSetAccesskey() {
        return (this.accesskey!= null);
    }

    /**
     * Gets the value of the contenteditable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContenteditable() {
        return contenteditable;
    }

    /**
     * Sets the value of the contenteditable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContenteditable(boolean value) {
        this.contenteditable = value;
    }

    public boolean isSetContenteditable() {
        return (this.contenteditable!= null);
    }

    public void unsetContenteditable() {
        this.contenteditable = null;
    }

    /**
     * Gets the value of the contextmenu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextmenu() {
        return contextmenu;
    }

    /**
     * Sets the value of the contextmenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextmenu(String value) {
        this.contextmenu = value;
    }

    public boolean isSetContextmenu() {
        return (this.contextmenu!= null);
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        if (dir == null) {
            return "auto";
        } else {
            return dir;
        }
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
    }

    public boolean isSetDir() {
        return (this.dir!= null);
    }

    /**
     * Gets the value of the draggable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraggable() {
        if (draggable == null) {
            return "auto";
        } else {
            return draggable;
        }
    }

    /**
     * Sets the value of the draggable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraggable(String value) {
        this.draggable = value;
    }

    public boolean isSetDraggable() {
        return (this.draggable!= null);
    }

    /**
     * Gets the value of the dropzone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dropzone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDropzone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDropzone() {
        if (dropzone == null) {
            dropzone = new ArrayList<String>();
        }
        return this.dropzone;
    }

    public boolean isSetDropzone() {
        return ((this.dropzone!= null)&&(!this.dropzone.isEmpty()));
    }

    public void unsetDropzone() {
        this.dropzone = null;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHidden(String value) {
        this.hidden = value;
    }

    public boolean isSetHidden() {
        return (this.hidden!= null);
    }

    /**
     * Gets the value of the langCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * Sets the value of the langCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangCode(String value) {
        this.langCode = value;
    }

    public boolean isSetLangCode() {
        return (this.langCode!= null);
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * Gets the value of the spellcheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpellcheck() {
        return spellcheck;
    }

    /**
     * Sets the value of the spellcheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpellcheck(String value) {
        this.spellcheck = value;
    }

    public boolean isSetSpellcheck() {
        return (this.spellcheck!= null);
    }

    /**
     * Gets the value of the tabindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getTabindex() {
        return tabindex;
    }

    /**
     * Sets the value of the tabindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabindex(Integer value) {
        this.tabindex = value;
    }

    public boolean isSetTabindex() {
        return (this.tabindex!= null);
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    public boolean isSetLang() {
        return (this.lang!= null);
    }

    /**
     * Gets the value of the onclick property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnclick() {
        return onclick;
    }

    /**
     * Sets the value of the onclick property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnclick(String value) {
        this.onclick = value;
    }

    public boolean isSetOnclick() {
        return (this.onclick!= null);
    }

    /**
     * Gets the value of the ondblclick property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndblclick() {
        return ondblclick;
    }

    /**
     * Sets the value of the ondblclick property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndblclick(String value) {
        this.ondblclick = value;
    }

    public boolean isSetOndblclick() {
        return (this.ondblclick!= null);
    }

    /**
     * Gets the value of the onmousedown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmousedown() {
        return onmousedown;
    }

    /**
     * Sets the value of the onmousedown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmousedown(String value) {
        this.onmousedown = value;
    }

    public boolean isSetOnmousedown() {
        return (this.onmousedown!= null);
    }

    /**
     * Gets the value of the onmouseup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmouseup() {
        return onmouseup;
    }

    /**
     * Sets the value of the onmouseup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmouseup(String value) {
        this.onmouseup = value;
    }

    public boolean isSetOnmouseup() {
        return (this.onmouseup!= null);
    }

    /**
     * Gets the value of the onmouseover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmouseover() {
        return onmouseover;
    }

    /**
     * Sets the value of the onmouseover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmouseover(String value) {
        this.onmouseover = value;
    }

    public boolean isSetOnmouseover() {
        return (this.onmouseover!= null);
    }

    /**
     * Gets the value of the onmousemove property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmousemove() {
        return onmousemove;
    }

    /**
     * Sets the value of the onmousemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmousemove(String value) {
        this.onmousemove = value;
    }

    public boolean isSetOnmousemove() {
        return (this.onmousemove!= null);
    }

    /**
     * Gets the value of the onmouseout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmouseout() {
        return onmouseout;
    }

    /**
     * Sets the value of the onmouseout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmouseout(String value) {
        this.onmouseout = value;
    }

    public boolean isSetOnmouseout() {
        return (this.onmouseout!= null);
    }

    /**
     * Gets the value of the onkeypress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnkeypress() {
        return onkeypress;
    }

    /**
     * Sets the value of the onkeypress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnkeypress(String value) {
        this.onkeypress = value;
    }

    public boolean isSetOnkeypress() {
        return (this.onkeypress!= null);
    }

    /**
     * Gets the value of the onkeydown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnkeydown() {
        return onkeydown;
    }

    /**
     * Sets the value of the onkeydown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnkeydown(String value) {
        this.onkeydown = value;
    }

    public boolean isSetOnkeydown() {
        return (this.onkeydown!= null);
    }

    /**
     * Gets the value of the onkeyup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnkeyup() {
        return onkeyup;
    }

    /**
     * Sets the value of the onkeyup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnkeyup(String value) {
        this.onkeyup = value;
    }

    public boolean isSetOnkeyup() {
        return (this.onkeyup!= null);
    }

    /**
     * Gets the value of the onabort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnabort() {
        return onabort;
    }

    /**
     * Sets the value of the onabort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnabort(String value) {
        this.onabort = value;
    }

    public boolean isSetOnabort() {
        return (this.onabort!= null);
    }

    /**
     * Gets the value of the onblur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnblur() {
        return onblur;
    }

    /**
     * Sets the value of the onblur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnblur(String value) {
        this.onblur = value;
    }

    public boolean isSetOnblur() {
        return (this.onblur!= null);
    }

    /**
     * Gets the value of the oncanplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOncanplay() {
        return oncanplay;
    }

    /**
     * Sets the value of the oncanplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOncanplay(String value) {
        this.oncanplay = value;
    }

    public boolean isSetOncanplay() {
        return (this.oncanplay!= null);
    }

    /**
     * Gets the value of the oncanplaythrough property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOncanplaythrough() {
        return oncanplaythrough;
    }

    /**
     * Sets the value of the oncanplaythrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOncanplaythrough(String value) {
        this.oncanplaythrough = value;
    }

    public boolean isSetOncanplaythrough() {
        return (this.oncanplaythrough!= null);
    }

    /**
     * Gets the value of the onchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnchange() {
        return onchange;
    }

    /**
     * Sets the value of the onchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnchange(String value) {
        this.onchange = value;
    }

    public boolean isSetOnchange() {
        return (this.onchange!= null);
    }

    /**
     * Gets the value of the oncontextmenu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOncontextmenu() {
        return oncontextmenu;
    }

    /**
     * Sets the value of the oncontextmenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOncontextmenu(String value) {
        this.oncontextmenu = value;
    }

    public boolean isSetOncontextmenu() {
        return (this.oncontextmenu!= null);
    }

    /**
     * Gets the value of the oncuechange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOncuechange() {
        return oncuechange;
    }

    /**
     * Sets the value of the oncuechange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOncuechange(String value) {
        this.oncuechange = value;
    }

    public boolean isSetOncuechange() {
        return (this.oncuechange!= null);
    }

    /**
     * Gets the value of the ondrag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndrag() {
        return ondrag;
    }

    /**
     * Sets the value of the ondrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndrag(String value) {
        this.ondrag = value;
    }

    public boolean isSetOndrag() {
        return (this.ondrag!= null);
    }

    /**
     * Gets the value of the ondragend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndragend() {
        return ondragend;
    }

    /**
     * Sets the value of the ondragend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndragend(String value) {
        this.ondragend = value;
    }

    public boolean isSetOndragend() {
        return (this.ondragend!= null);
    }

    /**
     * Gets the value of the ondragenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndragenter() {
        return ondragenter;
    }

    /**
     * Sets the value of the ondragenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndragenter(String value) {
        this.ondragenter = value;
    }

    public boolean isSetOndragenter() {
        return (this.ondragenter!= null);
    }

    /**
     * Gets the value of the ondragleave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndragleave() {
        return ondragleave;
    }

    /**
     * Sets the value of the ondragleave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndragleave(String value) {
        this.ondragleave = value;
    }

    public boolean isSetOndragleave() {
        return (this.ondragleave!= null);
    }

    /**
     * Gets the value of the ondragover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndragover() {
        return ondragover;
    }

    /**
     * Sets the value of the ondragover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndragover(String value) {
        this.ondragover = value;
    }

    public boolean isSetOndragover() {
        return (this.ondragover!= null);
    }

    /**
     * Gets the value of the ondragstart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndragstart() {
        return ondragstart;
    }

    /**
     * Sets the value of the ondragstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndragstart(String value) {
        this.ondragstart = value;
    }

    public boolean isSetOndragstart() {
        return (this.ondragstart!= null);
    }

    /**
     * Gets the value of the ondrop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndrop() {
        return ondrop;
    }

    /**
     * Sets the value of the ondrop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndrop(String value) {
        this.ondrop = value;
    }

    public boolean isSetOndrop() {
        return (this.ondrop!= null);
    }

    /**
     * Gets the value of the ondurationchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndurationchange() {
        return ondurationchange;
    }

    /**
     * Sets the value of the ondurationchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndurationchange(String value) {
        this.ondurationchange = value;
    }

    public boolean isSetOndurationchange() {
        return (this.ondurationchange!= null);
    }

    /**
     * Gets the value of the onemptied property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnemptied() {
        return onemptied;
    }

    /**
     * Sets the value of the onemptied property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnemptied(String value) {
        this.onemptied = value;
    }

    public boolean isSetOnemptied() {
        return (this.onemptied!= null);
    }

    /**
     * Gets the value of the onended property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnended() {
        return onended;
    }

    /**
     * Sets the value of the onended property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnended(String value) {
        this.onended = value;
    }

    public boolean isSetOnended() {
        return (this.onended!= null);
    }

    /**
     * Gets the value of the onerror property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnerror() {
        return onerror;
    }

    /**
     * Sets the value of the onerror property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnerror(String value) {
        this.onerror = value;
    }

    public boolean isSetOnerror() {
        return (this.onerror!= null);
    }

    /**
     * Gets the value of the onfocus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnfocus() {
        return onfocus;
    }

    /**
     * Sets the value of the onfocus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnfocus(String value) {
        this.onfocus = value;
    }

    public boolean isSetOnfocus() {
        return (this.onfocus!= null);
    }

    /**
     * Gets the value of the onformchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnformchange() {
        return onformchange;
    }

    /**
     * Sets the value of the onformchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnformchange(String value) {
        this.onformchange = value;
    }

    public boolean isSetOnformchange() {
        return (this.onformchange!= null);
    }

    /**
     * Gets the value of the onforminput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnforminput() {
        return onforminput;
    }

    /**
     * Sets the value of the onforminput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnforminput(String value) {
        this.onforminput = value;
    }

    public boolean isSetOnforminput() {
        return (this.onforminput!= null);
    }

    /**
     * Gets the value of the oninput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOninput() {
        return oninput;
    }

    /**
     * Sets the value of the oninput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOninput(String value) {
        this.oninput = value;
    }

    public boolean isSetOninput() {
        return (this.oninput!= null);
    }

    /**
     * Gets the value of the oninvalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOninvalid() {
        return oninvalid;
    }

    /**
     * Sets the value of the oninvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOninvalid(String value) {
        this.oninvalid = value;
    }

    public boolean isSetOninvalid() {
        return (this.oninvalid!= null);
    }

    /**
     * Gets the value of the onload property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnload() {
        return onload;
    }

    /**
     * Sets the value of the onload property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnload(String value) {
        this.onload = value;
    }

    public boolean isSetOnload() {
        return (this.onload!= null);
    }

    /**
     * Gets the value of the onloadeddata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnloadeddata() {
        return onloadeddata;
    }

    /**
     * Sets the value of the onloadeddata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnloadeddata(String value) {
        this.onloadeddata = value;
    }

    public boolean isSetOnloadeddata() {
        return (this.onloadeddata!= null);
    }

    /**
     * Gets the value of the onloadedmetadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnloadedmetadata() {
        return onloadedmetadata;
    }

    /**
     * Sets the value of the onloadedmetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnloadedmetadata(String value) {
        this.onloadedmetadata = value;
    }

    public boolean isSetOnloadedmetadata() {
        return (this.onloadedmetadata!= null);
    }

    /**
     * Gets the value of the onloadstart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnloadstart() {
        return onloadstart;
    }

    /**
     * Sets the value of the onloadstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnloadstart(String value) {
        this.onloadstart = value;
    }

    public boolean isSetOnloadstart() {
        return (this.onloadstart!= null);
    }

    /**
     * Gets the value of the onmousewheel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnmousewheel() {
        return onmousewheel;
    }

    /**
     * Sets the value of the onmousewheel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnmousewheel(String value) {
        this.onmousewheel = value;
    }

    public boolean isSetOnmousewheel() {
        return (this.onmousewheel!= null);
    }

    /**
     * Gets the value of the onpause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnpause() {
        return onpause;
    }

    /**
     * Sets the value of the onpause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnpause(String value) {
        this.onpause = value;
    }

    public boolean isSetOnpause() {
        return (this.onpause!= null);
    }

    /**
     * Gets the value of the onplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnplay() {
        return onplay;
    }

    /**
     * Sets the value of the onplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnplay(String value) {
        this.onplay = value;
    }

    public boolean isSetOnplay() {
        return (this.onplay!= null);
    }

    /**
     * Gets the value of the onplaying property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnplaying() {
        return onplaying;
    }

    /**
     * Sets the value of the onplaying property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnplaying(String value) {
        this.onplaying = value;
    }

    public boolean isSetOnplaying() {
        return (this.onplaying!= null);
    }

    /**
     * Gets the value of the onprogress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnprogress() {
        return onprogress;
    }

    /**
     * Sets the value of the onprogress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnprogress(String value) {
        this.onprogress = value;
    }

    public boolean isSetOnprogress() {
        return (this.onprogress!= null);
    }

    /**
     * Gets the value of the onratechange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnratechange() {
        return onratechange;
    }

    /**
     * Sets the value of the onratechange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnratechange(String value) {
        this.onratechange = value;
    }

    public boolean isSetOnratechange() {
        return (this.onratechange!= null);
    }

    /**
     * Gets the value of the onreadystatechange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnreadystatechange() {
        return onreadystatechange;
    }

    /**
     * Sets the value of the onreadystatechange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnreadystatechange(String value) {
        this.onreadystatechange = value;
    }

    public boolean isSetOnreadystatechange() {
        return (this.onreadystatechange!= null);
    }

    /**
     * Gets the value of the onreset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnreset() {
        return onreset;
    }

    /**
     * Sets the value of the onreset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnreset(String value) {
        this.onreset = value;
    }

    public boolean isSetOnreset() {
        return (this.onreset!= null);
    }

    /**
     * Gets the value of the onscroll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnscroll() {
        return onscroll;
    }

    /**
     * Sets the value of the onscroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnscroll(String value) {
        this.onscroll = value;
    }

    public boolean isSetOnscroll() {
        return (this.onscroll!= null);
    }

    /**
     * Gets the value of the onseeked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnseeked() {
        return onseeked;
    }

    /**
     * Sets the value of the onseeked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnseeked(String value) {
        this.onseeked = value;
    }

    public boolean isSetOnseeked() {
        return (this.onseeked!= null);
    }

    /**
     * Gets the value of the onseeking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnseeking() {
        return onseeking;
    }

    /**
     * Sets the value of the onseeking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnseeking(String value) {
        this.onseeking = value;
    }

    public boolean isSetOnseeking() {
        return (this.onseeking!= null);
    }

    /**
     * Gets the value of the onselect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnselect() {
        return onselect;
    }

    /**
     * Sets the value of the onselect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnselect(String value) {
        this.onselect = value;
    }

    public boolean isSetOnselect() {
        return (this.onselect!= null);
    }

    /**
     * Gets the value of the onshow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnshow() {
        return onshow;
    }

    /**
     * Sets the value of the onshow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnshow(String value) {
        this.onshow = value;
    }

    public boolean isSetOnshow() {
        return (this.onshow!= null);
    }

    /**
     * Gets the value of the onstalled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnstalled() {
        return onstalled;
    }

    /**
     * Sets the value of the onstalled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnstalled(String value) {
        this.onstalled = value;
    }

    public boolean isSetOnstalled() {
        return (this.onstalled!= null);
    }

    /**
     * Gets the value of the onsubmit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnsubmit() {
        return onsubmit;
    }

    /**
     * Sets the value of the onsubmit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnsubmit(String value) {
        this.onsubmit = value;
    }

    public boolean isSetOnsubmit() {
        return (this.onsubmit!= null);
    }

    /**
     * Gets the value of the onsuspend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnsuspend() {
        return onsuspend;
    }

    /**
     * Sets the value of the onsuspend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnsuspend(String value) {
        this.onsuspend = value;
    }

    public boolean isSetOnsuspend() {
        return (this.onsuspend!= null);
    }

    /**
     * Gets the value of the ontimeupdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntimeupdate() {
        return ontimeupdate;
    }

    /**
     * Sets the value of the ontimeupdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntimeupdate(String value) {
        this.ontimeupdate = value;
    }

    public boolean isSetOntimeupdate() {
        return (this.ontimeupdate!= null);
    }

    /**
     * Gets the value of the onvolumechange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnvolumechange() {
        return onvolumechange;
    }

    /**
     * Sets the value of the onvolumechange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnvolumechange(String value) {
        this.onvolumechange = value;
    }

    public boolean isSetOnvolumechange() {
        return (this.onvolumechange!= null);
    }

    /**
     * Gets the value of the onwaiting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnwaiting() {
        return onwaiting;
    }

    /**
     * Sets the value of the onwaiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnwaiting(String value) {
        this.onwaiting = value;
    }

    public boolean isSetOnwaiting() {
        return (this.onwaiting!= null);
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    public java.lang.Object clone() {
        return copyTo(createNewInstance());
    }

    public java.lang.Object copyTo(java.lang.Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public java.lang.Object copyTo(ObjectLocator locator, java.lang.Object target, CopyStrategy strategy) {
        final java.lang.Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof Noframes) {
            final Noframes copy = ((Noframes) draftCopy);
            if (this.isSetId()) {
                String sourceId;
                sourceId = this.getId();
                String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                copy.setId(copyId);
            } else {
                copy.id = null;
            }
            if (this.isSetCssClass()) {
                List<String> sourceCssClass;
                sourceCssClass = (this.isSetCssClass()?this.getCssClass():null);
                @SuppressWarnings("unchecked")
                List<String> copyCssClass = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "cssClass", sourceCssClass), sourceCssClass));
                copy.unsetCssClass();
                if (copyCssClass!= null) {
                    List<String> uniqueCssClassl = copy.getCssClass();
                    uniqueCssClassl.addAll(copyCssClass);
                }
            } else {
                copy.unsetCssClass();
            }
            if (this.isSetStyle()) {
                String sourceStyle;
                sourceStyle = this.getStyle();
                String copyStyle = ((String) strategy.copy(LocatorUtils.property(locator, "style", sourceStyle), sourceStyle));
                copy.setStyle(copyStyle);
            } else {
                copy.style = null;
            }
            if (this.isSetTitle()) {
                String sourceTitle;
                sourceTitle = this.getTitle();
                String copyTitle = ((String) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle));
                copy.setTitle(copyTitle);
            } else {
                copy.title = null;
            }
            if (this.isSetAccesskey()) {
                String sourceAccesskey;
                sourceAccesskey = this.getAccesskey();
                String copyAccesskey = ((String) strategy.copy(LocatorUtils.property(locator, "accesskey", sourceAccesskey), sourceAccesskey));
                copy.setAccesskey(copyAccesskey);
            } else {
                copy.accesskey = null;
            }
            if (this.isSetContenteditable()) {
                boolean sourceContenteditable;
                sourceContenteditable = (this.isSetContenteditable()?this.isContenteditable():false);
                boolean copyContenteditable = strategy.copy(LocatorUtils.property(locator, "contenteditable", sourceContenteditable), sourceContenteditable);
                copy.setContenteditable(copyContenteditable);
            } else {
                copy.unsetContenteditable();
            }
            if (this.isSetContextmenu()) {
                String sourceContextmenu;
                sourceContextmenu = this.getContextmenu();
                String copyContextmenu = ((String) strategy.copy(LocatorUtils.property(locator, "contextmenu", sourceContextmenu), sourceContextmenu));
                copy.setContextmenu(copyContextmenu);
            } else {
                copy.contextmenu = null;
            }
            if (this.isSetDir()) {
                String sourceDir;
                sourceDir = this.getDir();
                String copyDir = ((String) strategy.copy(LocatorUtils.property(locator, "dir", sourceDir), sourceDir));
                copy.setDir(copyDir);
            } else {
                copy.dir = null;
            }
            if (this.isSetDraggable()) {
                String sourceDraggable;
                sourceDraggable = this.getDraggable();
                String copyDraggable = ((String) strategy.copy(LocatorUtils.property(locator, "draggable", sourceDraggable), sourceDraggable));
                copy.setDraggable(copyDraggable);
            } else {
                copy.draggable = null;
            }
            if (this.isSetDropzone()) {
                List<String> sourceDropzone;
                sourceDropzone = (this.isSetDropzone()?this.getDropzone():null);
                @SuppressWarnings("unchecked")
                List<String> copyDropzone = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "dropzone", sourceDropzone), sourceDropzone));
                copy.unsetDropzone();
                if (copyDropzone!= null) {
                    List<String> uniqueDropzonel = copy.getDropzone();
                    uniqueDropzonel.addAll(copyDropzone);
                }
            } else {
                copy.unsetDropzone();
            }
            if (this.isSetHidden()) {
                String sourceHidden;
                sourceHidden = this.getHidden();
                String copyHidden = ((String) strategy.copy(LocatorUtils.property(locator, "hidden", sourceHidden), sourceHidden));
                copy.setHidden(copyHidden);
            } else {
                copy.hidden = null;
            }
            if (this.isSetLangCode()) {
                String sourceLangCode;
                sourceLangCode = this.getLangCode();
                String copyLangCode = ((String) strategy.copy(LocatorUtils.property(locator, "langCode", sourceLangCode), sourceLangCode));
                copy.setLangCode(copyLangCode);
            } else {
                copy.langCode = null;
            }
            if (this.isSetRole()) {
                String sourceRole;
                sourceRole = this.getRole();
                String copyRole = ((String) strategy.copy(LocatorUtils.property(locator, "role", sourceRole), sourceRole));
                copy.setRole(copyRole);
            } else {
                copy.role = null;
            }
            if (this.isSetSpellcheck()) {
                String sourceSpellcheck;
                sourceSpellcheck = this.getSpellcheck();
                String copySpellcheck = ((String) strategy.copy(LocatorUtils.property(locator, "spellcheck", sourceSpellcheck), sourceSpellcheck));
                copy.setSpellcheck(copySpellcheck);
            } else {
                copy.spellcheck = null;
            }
            if (this.isSetTabindex()) {
                Integer sourceTabindex;
                sourceTabindex = this.getTabindex();
                Integer copyTabindex = ((Integer) strategy.copy(LocatorUtils.property(locator, "tabindex", sourceTabindex), sourceTabindex));
                copy.setTabindex(copyTabindex);
            } else {
                copy.tabindex = null;
            }
            if (this.isSetLang()) {
                String sourceLang;
                sourceLang = this.getLang();
                String copyLang = ((String) strategy.copy(LocatorUtils.property(locator, "lang", sourceLang), sourceLang));
                copy.setLang(copyLang);
            } else {
                copy.lang = null;
            }
            if (this.isSetOnclick()) {
                String sourceOnclick;
                sourceOnclick = this.getOnclick();
                String copyOnclick = ((String) strategy.copy(LocatorUtils.property(locator, "onclick", sourceOnclick), sourceOnclick));
                copy.setOnclick(copyOnclick);
            } else {
                copy.onclick = null;
            }
            if (this.isSetOndblclick()) {
                String sourceOndblclick;
                sourceOndblclick = this.getOndblclick();
                String copyOndblclick = ((String) strategy.copy(LocatorUtils.property(locator, "ondblclick", sourceOndblclick), sourceOndblclick));
                copy.setOndblclick(copyOndblclick);
            } else {
                copy.ondblclick = null;
            }
            if (this.isSetOnmousedown()) {
                String sourceOnmousedown;
                sourceOnmousedown = this.getOnmousedown();
                String copyOnmousedown = ((String) strategy.copy(LocatorUtils.property(locator, "onmousedown", sourceOnmousedown), sourceOnmousedown));
                copy.setOnmousedown(copyOnmousedown);
            } else {
                copy.onmousedown = null;
            }
            if (this.isSetOnmouseup()) {
                String sourceOnmouseup;
                sourceOnmouseup = this.getOnmouseup();
                String copyOnmouseup = ((String) strategy.copy(LocatorUtils.property(locator, "onmouseup", sourceOnmouseup), sourceOnmouseup));
                copy.setOnmouseup(copyOnmouseup);
            } else {
                copy.onmouseup = null;
            }
            if (this.isSetOnmouseover()) {
                String sourceOnmouseover;
                sourceOnmouseover = this.getOnmouseover();
                String copyOnmouseover = ((String) strategy.copy(LocatorUtils.property(locator, "onmouseover", sourceOnmouseover), sourceOnmouseover));
                copy.setOnmouseover(copyOnmouseover);
            } else {
                copy.onmouseover = null;
            }
            if (this.isSetOnmousemove()) {
                String sourceOnmousemove;
                sourceOnmousemove = this.getOnmousemove();
                String copyOnmousemove = ((String) strategy.copy(LocatorUtils.property(locator, "onmousemove", sourceOnmousemove), sourceOnmousemove));
                copy.setOnmousemove(copyOnmousemove);
            } else {
                copy.onmousemove = null;
            }
            if (this.isSetOnmouseout()) {
                String sourceOnmouseout;
                sourceOnmouseout = this.getOnmouseout();
                String copyOnmouseout = ((String) strategy.copy(LocatorUtils.property(locator, "onmouseout", sourceOnmouseout), sourceOnmouseout));
                copy.setOnmouseout(copyOnmouseout);
            } else {
                copy.onmouseout = null;
            }
            if (this.isSetOnkeypress()) {
                String sourceOnkeypress;
                sourceOnkeypress = this.getOnkeypress();
                String copyOnkeypress = ((String) strategy.copy(LocatorUtils.property(locator, "onkeypress", sourceOnkeypress), sourceOnkeypress));
                copy.setOnkeypress(copyOnkeypress);
            } else {
                copy.onkeypress = null;
            }
            if (this.isSetOnkeydown()) {
                String sourceOnkeydown;
                sourceOnkeydown = this.getOnkeydown();
                String copyOnkeydown = ((String) strategy.copy(LocatorUtils.property(locator, "onkeydown", sourceOnkeydown), sourceOnkeydown));
                copy.setOnkeydown(copyOnkeydown);
            } else {
                copy.onkeydown = null;
            }
            if (this.isSetOnkeyup()) {
                String sourceOnkeyup;
                sourceOnkeyup = this.getOnkeyup();
                String copyOnkeyup = ((String) strategy.copy(LocatorUtils.property(locator, "onkeyup", sourceOnkeyup), sourceOnkeyup));
                copy.setOnkeyup(copyOnkeyup);
            } else {
                copy.onkeyup = null;
            }
            if (this.isSetOnabort()) {
                String sourceOnabort;
                sourceOnabort = this.getOnabort();
                String copyOnabort = ((String) strategy.copy(LocatorUtils.property(locator, "onabort", sourceOnabort), sourceOnabort));
                copy.setOnabort(copyOnabort);
            } else {
                copy.onabort = null;
            }
            if (this.isSetOnblur()) {
                String sourceOnblur;
                sourceOnblur = this.getOnblur();
                String copyOnblur = ((String) strategy.copy(LocatorUtils.property(locator, "onblur", sourceOnblur), sourceOnblur));
                copy.setOnblur(copyOnblur);
            } else {
                copy.onblur = null;
            }
            if (this.isSetOncanplay()) {
                String sourceOncanplay;
                sourceOncanplay = this.getOncanplay();
                String copyOncanplay = ((String) strategy.copy(LocatorUtils.property(locator, "oncanplay", sourceOncanplay), sourceOncanplay));
                copy.setOncanplay(copyOncanplay);
            } else {
                copy.oncanplay = null;
            }
            if (this.isSetOncanplaythrough()) {
                String sourceOncanplaythrough;
                sourceOncanplaythrough = this.getOncanplaythrough();
                String copyOncanplaythrough = ((String) strategy.copy(LocatorUtils.property(locator, "oncanplaythrough", sourceOncanplaythrough), sourceOncanplaythrough));
                copy.setOncanplaythrough(copyOncanplaythrough);
            } else {
                copy.oncanplaythrough = null;
            }
            if (this.isSetOnchange()) {
                String sourceOnchange;
                sourceOnchange = this.getOnchange();
                String copyOnchange = ((String) strategy.copy(LocatorUtils.property(locator, "onchange", sourceOnchange), sourceOnchange));
                copy.setOnchange(copyOnchange);
            } else {
                copy.onchange = null;
            }
            if (this.isSetOncontextmenu()) {
                String sourceOncontextmenu;
                sourceOncontextmenu = this.getOncontextmenu();
                String copyOncontextmenu = ((String) strategy.copy(LocatorUtils.property(locator, "oncontextmenu", sourceOncontextmenu), sourceOncontextmenu));
                copy.setOncontextmenu(copyOncontextmenu);
            } else {
                copy.oncontextmenu = null;
            }
            if (this.isSetOncuechange()) {
                String sourceOncuechange;
                sourceOncuechange = this.getOncuechange();
                String copyOncuechange = ((String) strategy.copy(LocatorUtils.property(locator, "oncuechange", sourceOncuechange), sourceOncuechange));
                copy.setOncuechange(copyOncuechange);
            } else {
                copy.oncuechange = null;
            }
            if (this.isSetOndrag()) {
                String sourceOndrag;
                sourceOndrag = this.getOndrag();
                String copyOndrag = ((String) strategy.copy(LocatorUtils.property(locator, "ondrag", sourceOndrag), sourceOndrag));
                copy.setOndrag(copyOndrag);
            } else {
                copy.ondrag = null;
            }
            if (this.isSetOndragend()) {
                String sourceOndragend;
                sourceOndragend = this.getOndragend();
                String copyOndragend = ((String) strategy.copy(LocatorUtils.property(locator, "ondragend", sourceOndragend), sourceOndragend));
                copy.setOndragend(copyOndragend);
            } else {
                copy.ondragend = null;
            }
            if (this.isSetOndragenter()) {
                String sourceOndragenter;
                sourceOndragenter = this.getOndragenter();
                String copyOndragenter = ((String) strategy.copy(LocatorUtils.property(locator, "ondragenter", sourceOndragenter), sourceOndragenter));
                copy.setOndragenter(copyOndragenter);
            } else {
                copy.ondragenter = null;
            }
            if (this.isSetOndragleave()) {
                String sourceOndragleave;
                sourceOndragleave = this.getOndragleave();
                String copyOndragleave = ((String) strategy.copy(LocatorUtils.property(locator, "ondragleave", sourceOndragleave), sourceOndragleave));
                copy.setOndragleave(copyOndragleave);
            } else {
                copy.ondragleave = null;
            }
            if (this.isSetOndragover()) {
                String sourceOndragover;
                sourceOndragover = this.getOndragover();
                String copyOndragover = ((String) strategy.copy(LocatorUtils.property(locator, "ondragover", sourceOndragover), sourceOndragover));
                copy.setOndragover(copyOndragover);
            } else {
                copy.ondragover = null;
            }
            if (this.isSetOndragstart()) {
                String sourceOndragstart;
                sourceOndragstart = this.getOndragstart();
                String copyOndragstart = ((String) strategy.copy(LocatorUtils.property(locator, "ondragstart", sourceOndragstart), sourceOndragstart));
                copy.setOndragstart(copyOndragstart);
            } else {
                copy.ondragstart = null;
            }
            if (this.isSetOndrop()) {
                String sourceOndrop;
                sourceOndrop = this.getOndrop();
                String copyOndrop = ((String) strategy.copy(LocatorUtils.property(locator, "ondrop", sourceOndrop), sourceOndrop));
                copy.setOndrop(copyOndrop);
            } else {
                copy.ondrop = null;
            }
            if (this.isSetOndurationchange()) {
                String sourceOndurationchange;
                sourceOndurationchange = this.getOndurationchange();
                String copyOndurationchange = ((String) strategy.copy(LocatorUtils.property(locator, "ondurationchange", sourceOndurationchange), sourceOndurationchange));
                copy.setOndurationchange(copyOndurationchange);
            } else {
                copy.ondurationchange = null;
            }
            if (this.isSetOnemptied()) {
                String sourceOnemptied;
                sourceOnemptied = this.getOnemptied();
                String copyOnemptied = ((String) strategy.copy(LocatorUtils.property(locator, "onemptied", sourceOnemptied), sourceOnemptied));
                copy.setOnemptied(copyOnemptied);
            } else {
                copy.onemptied = null;
            }
            if (this.isSetOnended()) {
                String sourceOnended;
                sourceOnended = this.getOnended();
                String copyOnended = ((String) strategy.copy(LocatorUtils.property(locator, "onended", sourceOnended), sourceOnended));
                copy.setOnended(copyOnended);
            } else {
                copy.onended = null;
            }
            if (this.isSetOnerror()) {
                String sourceOnerror;
                sourceOnerror = this.getOnerror();
                String copyOnerror = ((String) strategy.copy(LocatorUtils.property(locator, "onerror", sourceOnerror), sourceOnerror));
                copy.setOnerror(copyOnerror);
            } else {
                copy.onerror = null;
            }
            if (this.isSetOnfocus()) {
                String sourceOnfocus;
                sourceOnfocus = this.getOnfocus();
                String copyOnfocus = ((String) strategy.copy(LocatorUtils.property(locator, "onfocus", sourceOnfocus), sourceOnfocus));
                copy.setOnfocus(copyOnfocus);
            } else {
                copy.onfocus = null;
            }
            if (this.isSetOnformchange()) {
                String sourceOnformchange;
                sourceOnformchange = this.getOnformchange();
                String copyOnformchange = ((String) strategy.copy(LocatorUtils.property(locator, "onformchange", sourceOnformchange), sourceOnformchange));
                copy.setOnformchange(copyOnformchange);
            } else {
                copy.onformchange = null;
            }
            if (this.isSetOnforminput()) {
                String sourceOnforminput;
                sourceOnforminput = this.getOnforminput();
                String copyOnforminput = ((String) strategy.copy(LocatorUtils.property(locator, "onforminput", sourceOnforminput), sourceOnforminput));
                copy.setOnforminput(copyOnforminput);
            } else {
                copy.onforminput = null;
            }
            if (this.isSetOninput()) {
                String sourceOninput;
                sourceOninput = this.getOninput();
                String copyOninput = ((String) strategy.copy(LocatorUtils.property(locator, "oninput", sourceOninput), sourceOninput));
                copy.setOninput(copyOninput);
            } else {
                copy.oninput = null;
            }
            if (this.isSetOninvalid()) {
                String sourceOninvalid;
                sourceOninvalid = this.getOninvalid();
                String copyOninvalid = ((String) strategy.copy(LocatorUtils.property(locator, "oninvalid", sourceOninvalid), sourceOninvalid));
                copy.setOninvalid(copyOninvalid);
            } else {
                copy.oninvalid = null;
            }
            if (this.isSetOnload()) {
                String sourceOnload;
                sourceOnload = this.getOnload();
                String copyOnload = ((String) strategy.copy(LocatorUtils.property(locator, "onload", sourceOnload), sourceOnload));
                copy.setOnload(copyOnload);
            } else {
                copy.onload = null;
            }
            if (this.isSetOnloadeddata()) {
                String sourceOnloadeddata;
                sourceOnloadeddata = this.getOnloadeddata();
                String copyOnloadeddata = ((String) strategy.copy(LocatorUtils.property(locator, "onloadeddata", sourceOnloadeddata), sourceOnloadeddata));
                copy.setOnloadeddata(copyOnloadeddata);
            } else {
                copy.onloadeddata = null;
            }
            if (this.isSetOnloadedmetadata()) {
                String sourceOnloadedmetadata;
                sourceOnloadedmetadata = this.getOnloadedmetadata();
                String copyOnloadedmetadata = ((String) strategy.copy(LocatorUtils.property(locator, "onloadedmetadata", sourceOnloadedmetadata), sourceOnloadedmetadata));
                copy.setOnloadedmetadata(copyOnloadedmetadata);
            } else {
                copy.onloadedmetadata = null;
            }
            if (this.isSetOnloadstart()) {
                String sourceOnloadstart;
                sourceOnloadstart = this.getOnloadstart();
                String copyOnloadstart = ((String) strategy.copy(LocatorUtils.property(locator, "onloadstart", sourceOnloadstart), sourceOnloadstart));
                copy.setOnloadstart(copyOnloadstart);
            } else {
                copy.onloadstart = null;
            }
            if (this.isSetOnmousewheel()) {
                String sourceOnmousewheel;
                sourceOnmousewheel = this.getOnmousewheel();
                String copyOnmousewheel = ((String) strategy.copy(LocatorUtils.property(locator, "onmousewheel", sourceOnmousewheel), sourceOnmousewheel));
                copy.setOnmousewheel(copyOnmousewheel);
            } else {
                copy.onmousewheel = null;
            }
            if (this.isSetOnpause()) {
                String sourceOnpause;
                sourceOnpause = this.getOnpause();
                String copyOnpause = ((String) strategy.copy(LocatorUtils.property(locator, "onpause", sourceOnpause), sourceOnpause));
                copy.setOnpause(copyOnpause);
            } else {
                copy.onpause = null;
            }
            if (this.isSetOnplay()) {
                String sourceOnplay;
                sourceOnplay = this.getOnplay();
                String copyOnplay = ((String) strategy.copy(LocatorUtils.property(locator, "onplay", sourceOnplay), sourceOnplay));
                copy.setOnplay(copyOnplay);
            } else {
                copy.onplay = null;
            }
            if (this.isSetOnplaying()) {
                String sourceOnplaying;
                sourceOnplaying = this.getOnplaying();
                String copyOnplaying = ((String) strategy.copy(LocatorUtils.property(locator, "onplaying", sourceOnplaying), sourceOnplaying));
                copy.setOnplaying(copyOnplaying);
            } else {
                copy.onplaying = null;
            }
            if (this.isSetOnprogress()) {
                String sourceOnprogress;
                sourceOnprogress = this.getOnprogress();
                String copyOnprogress = ((String) strategy.copy(LocatorUtils.property(locator, "onprogress", sourceOnprogress), sourceOnprogress));
                copy.setOnprogress(copyOnprogress);
            } else {
                copy.onprogress = null;
            }
            if (this.isSetOnratechange()) {
                String sourceOnratechange;
                sourceOnratechange = this.getOnratechange();
                String copyOnratechange = ((String) strategy.copy(LocatorUtils.property(locator, "onratechange", sourceOnratechange), sourceOnratechange));
                copy.setOnratechange(copyOnratechange);
            } else {
                copy.onratechange = null;
            }
            if (this.isSetOnreadystatechange()) {
                String sourceOnreadystatechange;
                sourceOnreadystatechange = this.getOnreadystatechange();
                String copyOnreadystatechange = ((String) strategy.copy(LocatorUtils.property(locator, "onreadystatechange", sourceOnreadystatechange), sourceOnreadystatechange));
                copy.setOnreadystatechange(copyOnreadystatechange);
            } else {
                copy.onreadystatechange = null;
            }
            if (this.isSetOnreset()) {
                String sourceOnreset;
                sourceOnreset = this.getOnreset();
                String copyOnreset = ((String) strategy.copy(LocatorUtils.property(locator, "onreset", sourceOnreset), sourceOnreset));
                copy.setOnreset(copyOnreset);
            } else {
                copy.onreset = null;
            }
            if (this.isSetOnscroll()) {
                String sourceOnscroll;
                sourceOnscroll = this.getOnscroll();
                String copyOnscroll = ((String) strategy.copy(LocatorUtils.property(locator, "onscroll", sourceOnscroll), sourceOnscroll));
                copy.setOnscroll(copyOnscroll);
            } else {
                copy.onscroll = null;
            }
            if (this.isSetOnseeked()) {
                String sourceOnseeked;
                sourceOnseeked = this.getOnseeked();
                String copyOnseeked = ((String) strategy.copy(LocatorUtils.property(locator, "onseeked", sourceOnseeked), sourceOnseeked));
                copy.setOnseeked(copyOnseeked);
            } else {
                copy.onseeked = null;
            }
            if (this.isSetOnseeking()) {
                String sourceOnseeking;
                sourceOnseeking = this.getOnseeking();
                String copyOnseeking = ((String) strategy.copy(LocatorUtils.property(locator, "onseeking", sourceOnseeking), sourceOnseeking));
                copy.setOnseeking(copyOnseeking);
            } else {
                copy.onseeking = null;
            }
            if (this.isSetOnselect()) {
                String sourceOnselect;
                sourceOnselect = this.getOnselect();
                String copyOnselect = ((String) strategy.copy(LocatorUtils.property(locator, "onselect", sourceOnselect), sourceOnselect));
                copy.setOnselect(copyOnselect);
            } else {
                copy.onselect = null;
            }
            if (this.isSetOnshow()) {
                String sourceOnshow;
                sourceOnshow = this.getOnshow();
                String copyOnshow = ((String) strategy.copy(LocatorUtils.property(locator, "onshow", sourceOnshow), sourceOnshow));
                copy.setOnshow(copyOnshow);
            } else {
                copy.onshow = null;
            }
            if (this.isSetOnstalled()) {
                String sourceOnstalled;
                sourceOnstalled = this.getOnstalled();
                String copyOnstalled = ((String) strategy.copy(LocatorUtils.property(locator, "onstalled", sourceOnstalled), sourceOnstalled));
                copy.setOnstalled(copyOnstalled);
            } else {
                copy.onstalled = null;
            }
            if (this.isSetOnsubmit()) {
                String sourceOnsubmit;
                sourceOnsubmit = this.getOnsubmit();
                String copyOnsubmit = ((String) strategy.copy(LocatorUtils.property(locator, "onsubmit", sourceOnsubmit), sourceOnsubmit));
                copy.setOnsubmit(copyOnsubmit);
            } else {
                copy.onsubmit = null;
            }
            if (this.isSetOnsuspend()) {
                String sourceOnsuspend;
                sourceOnsuspend = this.getOnsuspend();
                String copyOnsuspend = ((String) strategy.copy(LocatorUtils.property(locator, "onsuspend", sourceOnsuspend), sourceOnsuspend));
                copy.setOnsuspend(copyOnsuspend);
            } else {
                copy.onsuspend = null;
            }
            if (this.isSetOntimeupdate()) {
                String sourceOntimeupdate;
                sourceOntimeupdate = this.getOntimeupdate();
                String copyOntimeupdate = ((String) strategy.copy(LocatorUtils.property(locator, "ontimeupdate", sourceOntimeupdate), sourceOntimeupdate));
                copy.setOntimeupdate(copyOntimeupdate);
            } else {
                copy.ontimeupdate = null;
            }
            if (this.isSetOnvolumechange()) {
                String sourceOnvolumechange;
                sourceOnvolumechange = this.getOnvolumechange();
                String copyOnvolumechange = ((String) strategy.copy(LocatorUtils.property(locator, "onvolumechange", sourceOnvolumechange), sourceOnvolumechange));
                copy.setOnvolumechange(copyOnvolumechange);
            } else {
                copy.onvolumechange = null;
            }
            if (this.isSetOnwaiting()) {
                String sourceOnwaiting;
                sourceOnwaiting = this.getOnwaiting();
                String copyOnwaiting = ((String) strategy.copy(LocatorUtils.property(locator, "onwaiting", sourceOnwaiting), sourceOnwaiting));
                copy.setOnwaiting(copyOnwaiting);
            } else {
                copy.onwaiting = null;
            }
        }
        return draftCopy;
    }

    public java.lang.Object createNewInstance() {
        return new Noframes();
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package oasis.names.tc.ciq.xnl._3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import oasis.names.tc.ciq.ct._3.DataQualityTypeList;


/**
 * Reusable complex type
 * 
 * <p>Java class for PersonNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameElement" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:oasis:names:tc:ciq:ct:3>String">
 *                 &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grAbbreviation"/>
 *                 &lt;attribute name="ElementType" type="{urn:oasis:names:tc:ciq:xnl:3}PersonNameElementList" />
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:xnl:3}grNameKey"/>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grValidityDate"/>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grLanguageCode"/>
 *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grDataQuality"/>
 *       &lt;attribute name="Type" type="{urn:oasis:names:tc:ciq:xnl:3}PersonNameTypeList" />
 *       &lt;attribute name="PersonID" type="{urn:oasis:names:tc:ciq:ct:3}String" />
 *       &lt;attribute name="PersonIDType" type="{urn:oasis:names:tc:ciq:xnl:3}PersonIDTypeList" />
 *       &lt;attribute name="ID" type="{urn:oasis:names:tc:ciq:ct:3}String" />
 *       &lt;attribute name="Usage" type="{urn:oasis:names:tc:ciq:xnl:3}PersonNameUsageList" />
 *       &lt;attribute name="Status" type="{urn:oasis:names:tc:ciq:ct:3}StatusList" />
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}type"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}label"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}href"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType", propOrder = {
    "nameElement"
})
@XmlSeeAlso({
    oasis.names.tc.ciq.xnl._3.PartyNameType.PersonName.class
})
public class PersonNameType {

    @XmlElement(name = "NameElement")
    protected List<PersonNameType.NameElement> nameElement;
    @XmlAttribute(name = "Type", namespace = "urn:oasis:names:tc:ciq:xnl:3")
    protected PersonNameTypeList externalOasisPersonNameTypeAttribute;
    @XmlAttribute(name = "PersonID", namespace = "urn:oasis:names:tc:ciq:xnl:3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String personID;
    @XmlAttribute(name = "PersonIDType", namespace = "urn:oasis:names:tc:ciq:xnl:3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String personIDType;
    @XmlAttribute(name = "ID", namespace = "urn:oasis:names:tc:ciq:xnl:3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "Usage", namespace = "urn:oasis:names:tc:ciq:xnl:3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String usage;
    @XmlAttribute(name = "Status", namespace = "urn:oasis:names:tc:ciq:xnl:3")
    protected String status;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected String type;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String label;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "NameKey", namespace = "urn:oasis:names:tc:ciq:xnl:3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nameKey;
    @XmlAttribute(name = "NameKeyRef", namespace = "urn:oasis:names:tc:ciq:xnl:3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nameKeyRef;
    @XmlAttribute(name = "DateValidFrom", namespace = "urn:oasis:names:tc:ciq:ct:3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateValidFrom;
    @XmlAttribute(name = "DateValidTo", namespace = "urn:oasis:names:tc:ciq:ct:3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateValidTo;
    @XmlAttribute(name = "LanguageCode", namespace = "urn:oasis:names:tc:ciq:ct:3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageCode;
    @XmlAttribute(name = "DataQualityType", namespace = "urn:oasis:names:tc:ciq:ct:3")
    protected DataQualityTypeList dataQualityType;
    @XmlAttribute(name = "ValidFrom", namespace = "urn:oasis:names:tc:ciq:ct:3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFrom;
    @XmlAttribute(name = "ValidTo", namespace = "urn:oasis:names:tc:ciq:ct:3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validTo;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the nameElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameType.NameElement }
     * 
     * 
     */
    public List<PersonNameType.NameElement> getNameElement() {
        if (nameElement == null) {
            nameElement = new ArrayList<PersonNameType.NameElement>();
        }
        return this.nameElement;
    }

    /**
     * Gets the value of the externalOasisPersonNameTypeAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameTypeList }
     *     
     */
    public PersonNameTypeList getExternalOasisPersonNameTypeAttribute() {
        return externalOasisPersonNameTypeAttribute;
    }

    /**
     * Sets the value of the externalOasisPersonNameTypeAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameTypeList }
     *     
     */
    public void setExternalOasisPersonNameTypeAttribute(PersonNameTypeList value) {
        this.externalOasisPersonNameTypeAttribute = value;
    }

    /**
     * Gets the value of the personID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonID(String value) {
        this.personID = value;
    }

    /**
     * Gets the value of the personIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonIDType() {
        return personIDType;
    }

    /**
     * Sets the value of the personIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonIDType(String value) {
        this.personIDType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
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
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the nameKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameKey() {
        return nameKey;
    }

    /**
     * Sets the value of the nameKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameKey(String value) {
        this.nameKey = value;
    }

    /**
     * Gets the value of the nameKeyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameKeyRef() {
        return nameKeyRef;
    }

    /**
     * Sets the value of the nameKeyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameKeyRef(String value) {
        this.nameKeyRef = value;
    }

    /**
     * Gets the value of the dateValidFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValidFrom() {
        return dateValidFrom;
    }

    /**
     * Sets the value of the dateValidFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateValidFrom(XMLGregorianCalendar value) {
        this.dateValidFrom = value;
    }

    /**
     * Gets the value of the dateValidTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValidTo() {
        return dateValidTo;
    }

    /**
     * Sets the value of the dateValidTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateValidTo(XMLGregorianCalendar value) {
        this.dateValidTo = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the dataQualityType property.
     * 
     * @return
     *     possible object is
     *     {@link DataQualityTypeList }
     *     
     */
    public DataQualityTypeList getDataQualityType() {
        return dataQualityType;
    }

    /**
     * Sets the value of the dataQualityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataQualityTypeList }
     *     
     */
    public void setDataQualityType(DataQualityTypeList value) {
        this.dataQualityType = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:oasis:names:tc:ciq:ct:3>String">
     *       &lt;attGroup ref="{urn:oasis:names:tc:ciq:ct:3}grAbbreviation"/>
     *       &lt;attribute name="ElementType" type="{urn:oasis:names:tc:ciq:xnl:3}PersonNameElementList" />
     *       &lt;anyAttribute processContents='lax' namespace='##other'/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class NameElement {

        @XmlValue
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String value;
        @XmlAttribute(name = "ElementType", namespace = "urn:oasis:names:tc:ciq:xnl:3")
        protected PersonNameElementList elementType;
        @XmlAttribute(name = "Abbreviation", namespace = "urn:oasis:names:tc:ciq:ct:3")
        protected Boolean abbreviation;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Normalized and Collapsed String
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the elementType property.
         * 
         * @return
         *     possible object is
         *     {@link PersonNameElementList }
         *     
         */
        public PersonNameElementList getElementType() {
            return elementType;
        }

        /**
         * Sets the value of the elementType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonNameElementList }
         *     
         */
        public void setElementType(PersonNameElementList value) {
            this.elementType = value;
        }

        /**
         * Gets the value of the abbreviation property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAbbreviation() {
            return abbreviation;
        }

        /**
         * Sets the value of the abbreviation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAbbreviation(Boolean value) {
            this.abbreviation = value;
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

    }

}

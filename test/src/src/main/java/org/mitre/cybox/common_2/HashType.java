//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.cybox.common_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The HashType type is intended to characterize hash values.
 * 
 * <p>Java class for HashType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HashType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://cybox.mitre.org/common-2}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="Simple_Hash_Value" type="{http://cybox.mitre.org/common-2}SimpleHashValueType" minOccurs="0"/>
 *           &lt;element name="Fuzzy_Hash_Value" type="{http://cybox.mitre.org/common-2}FuzzyHashValueType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Fuzzy_Hash_Structure" type="{http://cybox.mitre.org/common-2}FuzzyHashStructureType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HashType", propOrder = {
    "type",
    "simpleHashValue",
    "fuzzyHashValue",
    "fuzzyHashStructure"
})
public class HashType {

    @XmlElement(name = "Type")
    protected ControlledVocabularyStringType type;
    @XmlElement(name = "Simple_Hash_Value")
    protected SimpleHashValueType simpleHashValue;
    @XmlElement(name = "Fuzzy_Hash_Value")
    protected FuzzyHashValueType fuzzyHashValue;
    @XmlElement(name = "Fuzzy_Hash_Structure")
    protected List<FuzzyHashStructureType> fuzzyHashStructure;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setType(ControlledVocabularyStringType value) {
        this.type = value;
    }

    /**
     * Gets the value of the simpleHashValue property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleHashValueType }
     *     
     */
    public SimpleHashValueType getSimpleHashValue() {
        return simpleHashValue;
    }

    /**
     * Sets the value of the simpleHashValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleHashValueType }
     *     
     */
    public void setSimpleHashValue(SimpleHashValueType value) {
        this.simpleHashValue = value;
    }

    /**
     * Gets the value of the fuzzyHashValue property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyHashValueType }
     *     
     */
    public FuzzyHashValueType getFuzzyHashValue() {
        return fuzzyHashValue;
    }

    /**
     * Sets the value of the fuzzyHashValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyHashValueType }
     *     
     */
    public void setFuzzyHashValue(FuzzyHashValueType value) {
        this.fuzzyHashValue = value;
    }

    /**
     * Gets the value of the fuzzyHashStructure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fuzzyHashStructure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuzzyHashStructure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FuzzyHashStructureType }
     * 
     * 
     */
    public List<FuzzyHashStructureType> getFuzzyHashStructure() {
        if (fuzzyHashStructure == null) {
            fuzzyHashStructure = new ArrayList<FuzzyHashStructureType>();
        }
        return this.fuzzyHashStructure;
    }

}

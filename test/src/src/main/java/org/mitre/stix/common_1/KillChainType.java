//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.16 at 07:44:27 PM EDT 
//


package org.mitre.stix.common_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * The KillChainType characterizes a specific Kill Chain definition for reference within specific TTP entries, Indicators and elsewhere.
 * 
 * <p>Java class for KillChainType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KillChainType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kill_Chain_Phase" type="{http://stix.mitre.org/common-1}KillChainPhaseType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="definer" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="number_of_phases" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KillChainType", propOrder = {
    "killChainPhase"
})
public class KillChainType {

    @XmlElement(name = "Kill_Chain_Phase", required = true)
    protected List<KillChainPhaseType> killChainPhase;
    @XmlAttribute(name = "id")
    protected QName id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "definer")
    @XmlSchemaType(name = "anySimpleType")
    protected String definer;
    @XmlAttribute(name = "reference")
    @XmlSchemaType(name = "anyURI")
    protected String reference;
    @XmlAttribute(name = "number_of_phases")
    @XmlSchemaType(name = "anySimpleType")
    protected String numberOfPhases;

    /**
     * Gets the value of the killChainPhase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the killChainPhase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKillChainPhase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.mitre.stix.common_1.KillChainPhaseType }
     * 
     * 
     */
    public List<KillChainPhaseType> getKillChainPhase() {
        if (killChainPhase == null) {
            killChainPhase = new ArrayList<KillChainPhaseType>();
        }
        return this.killChainPhase;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.namespace.QName }
     *     
     */
    public QName getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.namespace.QName }
     *     
     */
    public void setId(QName value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the definer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefiner() {
        return definer;
    }

    /**
     * Sets the value of the definer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefiner(String value) {
        this.definer = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the numberOfPhases property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfPhases() {
        return numberOfPhases;
    }

    /**
     * Sets the value of the numberOfPhases property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfPhases(String value) {
        this.numberOfPhases = value;
    }

}

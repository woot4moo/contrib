//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.xmlschema.maec_bundle_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.mitre.maec.default_vocabularies_1.MalwareCapabilityEnum10;


/**
 * The CapabilityType captures details of a Capability that may be implemented in the malware instance, along with its child Strategic and Tactical Objectives.
 * 
 * <p>Java class for CapabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Property" type="{http://maec.mitre.org/XMLSchema/maec-bundle-4}CapabilityPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Strategic_Objective" type="{http://maec.mitre.org/XMLSchema/maec-bundle-4}CapabilityObjectiveType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Tactical_Objective" type="{http://maec.mitre.org/XMLSchema/maec-bundle-4}CapabilityObjectiveType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Behavior_Reference" type="{http://maec.mitre.org/XMLSchema/maec-bundle-4}BehaviorReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Relationship" type="{http://maec.mitre.org/XMLSchema/maec-bundle-4}CapabilityRelationshipType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="name" type="{http://maec.mitre.org/default_vocabularies-1}MalwareCapabilityEnum-1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityType", propOrder = {
    "description",
    "property",
    "strategicObjective",
    "tacticalObjective",
    "behaviorReference",
    "relationship"
})
public class CapabilityType {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Property")
    protected List<CapabilityPropertyType> property;
    @XmlElement(name = "Strategic_Objective")
    protected List<CapabilityObjectiveType> strategicObjective;
    @XmlElement(name = "Tactical_Objective")
    protected List<CapabilityObjectiveType> tacticalObjective;
    @XmlElement(name = "Behavior_Reference")
    protected List<BehaviorReferenceType> behaviorReference;
    @XmlElement(name = "Relationship")
    protected List<CapabilityRelationshipType> relationship;
    @XmlAttribute(name = "id", required = true)
    protected QName id;
    @XmlAttribute(name = "name")
    protected MalwareCapabilityEnum10 name;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityPropertyType }
     * 
     * 
     */
    public List<CapabilityPropertyType> getProperty() {
        if (property == null) {
            property = new ArrayList<CapabilityPropertyType>();
        }
        return this.property;
    }

    /**
     * Gets the value of the strategicObjective property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strategicObjective property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrategicObjective().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityObjectiveType }
     * 
     * 
     */
    public List<CapabilityObjectiveType> getStrategicObjective() {
        if (strategicObjective == null) {
            strategicObjective = new ArrayList<CapabilityObjectiveType>();
        }
        return this.strategicObjective;
    }

    /**
     * Gets the value of the tacticalObjective property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tacticalObjective property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTacticalObjective().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityObjectiveType }
     * 
     * 
     */
    public List<CapabilityObjectiveType> getTacticalObjective() {
        if (tacticalObjective == null) {
            tacticalObjective = new ArrayList<CapabilityObjectiveType>();
        }
        return this.tacticalObjective;
    }

    /**
     * Gets the value of the behaviorReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the behaviorReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBehaviorReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BehaviorReferenceType }
     * 
     * 
     */
    public List<BehaviorReferenceType> getBehaviorReference() {
        if (behaviorReference == null) {
            behaviorReference = new ArrayList<BehaviorReferenceType>();
        }
        return this.behaviorReference;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityRelationshipType }
     * 
     * 
     */
    public List<CapabilityRelationshipType> getRelationship() {
        if (relationship == null) {
            relationship = new ArrayList<CapabilityRelationshipType>();
        }
        return this.relationship;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
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
     *     {@link QName }
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
     *     {@link MalwareCapabilityEnum10 }
     *     
     */
    public MalwareCapabilityEnum10 getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MalwareCapabilityEnum10 }
     *     
     */
    public void setName(MalwareCapabilityEnum10 value) {
        this.name = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.cybox.common_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The DependencyType contains information describing a single dependency for this tool.
 * 
 * <p>Java class for DependencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DependencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dependency_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dependency_Description" type="{http://cybox.mitre.org/common-2}StructuredTextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DependencyType", propOrder = {
    "dependencyType",
    "dependencyDescription"
})
public class DependencyType {

    @XmlElement(name = "Dependency_Type")
    protected String dependencyType;
    @XmlElement(name = "Dependency_Description", required = true)
    protected StructuredTextType dependencyDescription;

    /**
     * Gets the value of the dependencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependencyType() {
        return dependencyType;
    }

    /**
     * Sets the value of the dependencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependencyType(String value) {
        this.dependencyType = value;
    }

    /**
     * Gets the value of the dependencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredTextType }
     *     
     */
    public StructuredTextType getDependencyDescription() {
        return dependencyDescription;
    }

    /**
     * Sets the value of the dependencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredTextType }
     *     
     */
    public void setDependencyDescription(StructuredTextType value) {
        this.dependencyDescription = value;
    }

}

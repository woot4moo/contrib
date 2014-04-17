//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.IntegerObjectPropertyType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * Specifies an entry-point jump code used by a packer.
 * 
 * <p>Java class for EPJumpCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EPJumpCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Depth" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Opcodes" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EPJumpCodeType", namespace = "http://cybox.mitre.org/objects#FileObject-2", propOrder = {
    "depth",
    "opcodes"
})
public class EPJumpCodeType {

    @XmlElement(name = "Depth")
    protected IntegerObjectPropertyType depth;
    @XmlElement(name = "Opcodes")
    protected StringObjectPropertyType opcodes;

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setDepth(IntegerObjectPropertyType value) {
        this.depth = value;
    }

    /**
     * Gets the value of the opcodes property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getOpcodes() {
        return opcodes;
    }

    /**
     * Sets the value of the opcodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setOpcodes(StringObjectPropertyType value) {
        this.opcodes = value;
    }

}

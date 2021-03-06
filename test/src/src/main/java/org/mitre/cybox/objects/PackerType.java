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
import org.mitre.cybox.common_2.HexBinaryObjectPropertyType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The PackerType specifies the fields that characterize a particular file packer, such as name and version.
 * 
 * <p>Java class for PackerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Entry_Point" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Signature" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://cybox.mitre.org/objects#FileObject-2}PackerClassType" minOccurs="0"/>
 *         &lt;element name="Detected_Entrypoint_Signatures" type="{http://cybox.mitre.org/objects#FileObject-2}EntryPointSignatureListType" minOccurs="0"/>
 *         &lt;element name="EP_Jump_Codes" type="{http://cybox.mitre.org/objects#FileObject-2}EPJumpCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackerType", namespace = "http://cybox.mitre.org/objects#FileObject-2", propOrder = {
    "name",
    "version",
    "entryPoint",
    "signature",
    "type",
    "detectedEntrypointSignatures",
    "epJumpCodes"
})
public class PackerType {

    @XmlElement(name = "Name")
    protected StringObjectPropertyType name;
    @XmlElement(name = "Version")
    protected StringObjectPropertyType version;
    @XmlElement(name = "Entry_Point")
    protected HexBinaryObjectPropertyType entryPoint;
    @XmlElement(name = "Signature")
    protected StringObjectPropertyType signature;
    @XmlElement(name = "Type")
    protected PackerClassType type;
    @XmlElement(name = "Detected_Entrypoint_Signatures")
    protected EntryPointSignatureListType detectedEntrypointSignatures;
    @XmlElement(name = "EP_Jump_Codes")
    protected EPJumpCodeType epJumpCodes;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setName(StringObjectPropertyType value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setVersion(StringObjectPropertyType value) {
        this.version = value;
    }

    /**
     * Gets the value of the entryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getEntryPoint() {
        return entryPoint;
    }

    /**
     * Sets the value of the entryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setEntryPoint(HexBinaryObjectPropertyType value) {
        this.entryPoint = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setSignature(StringObjectPropertyType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PackerClassType }
     *     
     */
    public PackerClassType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackerClassType }
     *     
     */
    public void setType(PackerClassType value) {
        this.type = value;
    }

    /**
     * Gets the value of the detectedEntrypointSignatures property.
     * 
     * @return
     *     possible object is
     *     {@link EntryPointSignatureListType }
     *     
     */
    public EntryPointSignatureListType getDetectedEntrypointSignatures() {
        return detectedEntrypointSignatures;
    }

    /**
     * Sets the value of the detectedEntrypointSignatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryPointSignatureListType }
     *     
     */
    public void setDetectedEntrypointSignatures(EntryPointSignatureListType value) {
        this.detectedEntrypointSignatures = value;
    }

    /**
     * Gets the value of the epJumpCodes property.
     * 
     * @return
     *     possible object is
     *     {@link EPJumpCodeType }
     *     
     */
    public EPJumpCodeType getEPJumpCodes() {
        return epJumpCodes;
    }

    /**
     * Sets the value of the epJumpCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPJumpCodeType }
     *     
     */
    public void setEPJumpCodes(EPJumpCodeType value) {
        this.epJumpCodes = value;
    }

}

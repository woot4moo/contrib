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
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The HTTPRequestHeaderType captures the raw or parsed header of an HTTP request.
 * 
 * <p>Java class for HTTPRequestHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HTTPRequestHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Raw_Header" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Parsed_Header" type="{http://cybox.mitre.org/objects#HTTPSessionObject-2}HTTPRequestHeaderFieldsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTTPRequestHeaderType", propOrder = {
    "rawHeader",
    "parsedHeader"
})
public class HTTPRequestHeaderType {

    @XmlElement(name = "Raw_Header")
    protected StringObjectPropertyType rawHeader;
    @XmlElement(name = "Parsed_Header")
    protected HTTPRequestHeaderFieldsType parsedHeader;

    /**
     * Gets the value of the rawHeader property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getRawHeader() {
        return rawHeader;
    }

    /**
     * Sets the value of the rawHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setRawHeader(StringObjectPropertyType value) {
        this.rawHeader = value;
    }

    /**
     * Gets the value of the parsedHeader property.
     * 
     * @return
     *     possible object is
     *     {@link HTTPRequestHeaderFieldsType }
     *     
     */
    public HTTPRequestHeaderFieldsType getParsedHeader() {
        return parsedHeader;
    }

    /**
     * Sets the value of the parsedHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTTPRequestHeaderFieldsType }
     *     
     */
    public void setParsedHeader(HTTPRequestHeaderFieldsType value) {
        this.parsedHeader = value;
    }

}

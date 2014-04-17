//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.cybox.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Layer7ConnectionsType specifies the different types of application (layer 7 in the OSI model) connections that may be initiated as part of the network connection.
 * 
 * <p>Java class for Layer7ConnectionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Layer7ConnectionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HTTP_Session" type="{http://cybox.mitre.org/objects#HTTPSessionObject-2}HTTPSessionObjectType" minOccurs="0"/>
 *         &lt;element name="DNS_Query" type="{http://cybox.mitre.org/objects#DNSQueryObject-2}DNSQueryObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Layer7ConnectionsType", namespace = "http://cybox.mitre.org/objects#NetworkConnectionObject-2", propOrder = {
    "httpSession",
    "dnsQuery"
})
public class Layer7ConnectionsType {

    @XmlElement(name = "HTTP_Session")
    protected HTTPSessionObjectType httpSession;
    @XmlElement(name = "DNS_Query")
    protected List<DNSQueryObjectType> dnsQuery;

    /**
     * Gets the value of the httpSession property.
     * 
     * @return
     *     possible object is
     *     {@link HTTPSessionObjectType }
     *     
     */
    public HTTPSessionObjectType getHTTPSession() {
        return httpSession;
    }

    /**
     * Sets the value of the httpSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTTPSessionObjectType }
     *     
     */
    public void setHTTPSession(HTTPSessionObjectType value) {
        this.httpSession = value;
    }

    /**
     * Gets the value of the dnsQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dnsQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDNSQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNSQueryObjectType }
     * 
     * 
     */
    public List<DNSQueryObjectType> getDNSQuery() {
        if (dnsQuery == null) {
            dnsQuery = new ArrayList<DNSQueryObjectType>();
        }
        return this.dnsQuery;
    }

}

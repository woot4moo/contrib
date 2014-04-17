//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.08 at 09:40:17 PM EDT 
//


package org.mitre.stix.incident_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.mitre.stix.common_1.ControlledVocabularyStringType;


/**
 * This type represents whether non-public data was compromised or exposed and whether that data was encrypted or not.
 * 
 * <p>Java class for NonPublicDataCompromisedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonPublicDataCompromisedType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://stix.mitre.org/common-1>ControlledVocabularyStringType">
 *       &lt;attribute name="data_encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonPublicDataCompromisedType")
public class NonPublicDataCompromisedType
    extends ControlledVocabularyStringType
{

    @XmlAttribute(name = "data_encrypted")
    protected Boolean dataEncrypted;

    /**
     * Gets the value of the dataEncrypted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataEncrypted() {
        return dataEncrypted;
    }

    /**
     * Sets the value of the dataEncrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataEncrypted(Boolean value) {
        this.dataEncrypted = value;
    }

}

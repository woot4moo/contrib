//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.default_vocabularies_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonCapabilityPropertiesEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommonCapabilityPropertiesEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="encryption algorithm"/>
 *     &lt;enumeration value="protocol used"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommonCapabilityPropertiesEnum-1.0")
@XmlEnum
public enum CommonCapabilityPropertiesEnum10 {


    /**
     * The 'encryption algorithm' value refers to the name of the encryption algorithm used in the Capability or Objective.
     * 
     */
    @XmlEnumValue("encryption algorithm")
    ENCRYPTION_ALGORITHM("encryption algorithm"),

    /**
     * It is recommended that protocols be specified by their acronym or abbreviated name, e.g. "IRC", "HTTP".
     * 
     */
    @XmlEnumValue("protocol used")
    PROTOCOL_USED("protocol used");
    private final String value;

    CommonCapabilityPropertiesEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommonCapabilityPropertiesEnum10 fromValue(String v) {
        for (CommonCapabilityPropertiesEnum10 c: CommonCapabilityPropertiesEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

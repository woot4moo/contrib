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
 * <p>Java class for DestructionTacticalObjectivesEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DestructionTacticalObjectivesEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="erase data"/>
 *     &lt;enumeration value="destroy firmware"/>
 *     &lt;enumeration value="destroy hardware"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DestructionTacticalObjectivesEnum-1.0")
@XmlEnum
public enum DestructionTacticalObjectivesEnum10 {


    /**
     * The 'erase data' value indicates that the malware instance is able to destroy data by erasure.
     * 
     */
    @XmlEnumValue("erase data")
    ERASE_DATA("erase data"),

    /**
     * The 'destroy firmware' value indicates that the malware instance is able to destroy a system's firmware.
     * 
     */
    @XmlEnumValue("destroy firmware")
    DESTROY_FIRMWARE("destroy firmware"),

    /**
     * The 'destroy hardware' value indicates that the malware instance is able to destroy a system's hardware.
     * 
     */
    @XmlEnumValue("destroy hardware")
    DESTROY_HARDWARE("destroy hardware");
    private final String value;

    DestructionTacticalObjectivesEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DestructionTacticalObjectivesEnum10 fromValue(String v) {
        for (DestructionTacticalObjectivesEnum10 c: DestructionTacticalObjectivesEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

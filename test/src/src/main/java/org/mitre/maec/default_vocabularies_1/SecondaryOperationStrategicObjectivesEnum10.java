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
 * <p>Java class for SecondaryOperationStrategicObjectivesEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecondaryOperationStrategicObjectivesEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="patch operating system file(s)"/>
 *     &lt;enumeration value="remove traces of infection"/>
 *     &lt;enumeration value="log activity"/>
 *     &lt;enumeration value="lay dormant"/>
 *     &lt;enumeration value="install other components"/>
 *     &lt;enumeration value="suicide exit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecondaryOperationStrategicObjectivesEnum-1.0")
@XmlEnum
public enum SecondaryOperationStrategicObjectivesEnum10 {


    /**
     * The 'patch operating system file(s)' value indicates that the malware instance is able to patch or modify the critical system files of the operating system under which it executes.
     * 
     */
    @XmlEnumValue("patch operating system file(s)")
    PATCH_OPERATING_SYSTEM_FILE_S("patch operating system file(s)"),

    /**
     * The 'remove traces of infection' value indicates that the malware instance is able to remove traces of its infection of a system.
     * 
     */
    @XmlEnumValue("remove traces of infection")
    REMOVE_TRACES_OF_INFECTION("remove traces of infection"),

    /**
     * The 'log activity' value indicates that the malware instance is able to log its own activity.
     * 
     */
    @XmlEnumValue("log activity")
    LOG_ACTIVITY("log activity"),

    /**
     * The 'lay dormant' value indicates that the malware instance is able to lay dormant on a system for some period of time.
     * 
     */
    @XmlEnumValue("lay dormant")
    LAY_DORMANT("lay dormant"),

    /**
     * The 'install other components' value indicates that the malware instance is able to install additional components.  This encompasses the dropping/downloading of other malicious components such as libraries, other malware, and tools.
     * 
     */
    @XmlEnumValue("install other components")
    INSTALL_OTHER_COMPONENTS("install other components"),

    /**
     * The 'suicide exit' value indicates that the malware instance is able to terminate itself based on some condition or value.
     * 
     */
    @XmlEnumValue("suicide exit")
    SUICIDE_EXIT("suicide exit");
    private final String value;

    SecondaryOperationStrategicObjectivesEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecondaryOperationStrategicObjectivesEnum10 fromValue(String v) {
        for (SecondaryOperationStrategicObjectivesEnum10 c: SecondaryOperationStrategicObjectivesEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

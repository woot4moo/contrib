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
 * <p>Java class for DeviceDriverActionNameEnum-1.1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceDriverActionNameEnum-1.1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="load and call driver"/>
 *     &lt;enumeration value="load driver"/>
 *     &lt;enumeration value="unload driver"/>
 *     &lt;enumeration value="emulate driver"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceDriverActionNameEnum-1.1")
@XmlEnum
public enum DeviceDriverActionNameEnum11 {


    /**
     * The 'load and call' value specifies the defined action of loading a driver into a system and then calling the loaded driver.
     * 
     */
    @XmlEnumValue("load and call driver")
    LOAD_AND_CALL_DRIVER("load and call driver"),

    /**
     * The 'load driver' value specifies the defined action of loading a driver into a system.
     * 
     */
    @XmlEnumValue("load driver")
    LOAD_DRIVER("load driver"),

    /**
     * The 'unload driver' value specifies the defined action of unloading a driver from a system.
     * 
     */
    @XmlEnumValue("unload driver")
    UNLOAD_DRIVER("unload driver"),

    /**
     * The 'emulate driver' value specifies the defined action of emulating an existing driver on a system.
     * 
     */
    @XmlEnumValue("emulate driver")
    EMULATE_DRIVER("emulate driver");
    private final String value;

    DeviceDriverActionNameEnum11(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceDriverActionNameEnum11 fromValue(String v) {
        for (DeviceDriverActionNameEnum11 c: DeviceDriverActionNameEnum11 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Java class for HookingActionNameEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HookingActionNameEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="add system call hook"/>
 *     &lt;enumeration value="add windows hook"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HookingActionNameEnum-1.0")
@XmlEnum
public enum HookingActionNameEnum10 {


    /**
     * The 'add system call hook' value specifies the defined action of adding a new system call hook.
     * 
     */
    @XmlEnumValue("add system call hook")
    ADD_SYSTEM_CALL_HOOK("add system call hook"),

    /**
     * Windows-specific.
     * 
     */
    @XmlEnumValue("add windows hook")
    ADD_WINDOWS_HOOK("add windows hook");
    private final String value;

    HookingActionNameEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HookingActionNameEnum10 fromValue(String v) {
        for (HookingActionNameEnum10 c: HookingActionNameEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

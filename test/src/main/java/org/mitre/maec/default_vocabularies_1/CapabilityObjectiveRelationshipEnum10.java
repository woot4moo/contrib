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
 * <p>Java class for CapabilityObjectiveRelationshipEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CapabilityObjectiveRelationshipEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="child of"/>
 *     &lt;enumeration value="parent of"/>
 *     &lt;enumeration value="incorporates"/>
 *     &lt;enumeration value="incorporated by"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CapabilityObjectiveRelationshipEnum-1.0")
@XmlEnum
public enum CapabilityObjectiveRelationshipEnum10 {


    /**
     * The 'child of' value indicates that the Objective is a child of the Objective being referenced.
     * 
     */
    @XmlEnumValue("child of")
    CHILD_OF("child of"),

    /**
     * The 'parent of' value indicates that the Objective is a parent of the Objective being referenced.
     * 
     */
    @XmlEnumValue("parent of")
    PARENT_OF("parent of"),

    /**
     * The 'incorporates' value indicates that the Objective incorporates the Objective being referenced in a supporting or enabling role.
     * 
     */
    @XmlEnumValue("incorporates")
    INCORPORATES("incorporates"),

    /**
     * The 'incorporated by' value indicates that the Objective is incorporated in a supporting or enabling role by the Objective being referenced.
     * 
     */
    @XmlEnumValue("incorporated by")
    INCORPORATED_BY("incorporated by");
    private final String value;

    CapabilityObjectiveRelationshipEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CapabilityObjectiveRelationshipEnum10 fromValue(String v) {
        for (CapabilityObjectiveRelationshipEnum10 c: CapabilityObjectiveRelationshipEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

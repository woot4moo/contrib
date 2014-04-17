//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.08 at 09:40:17 PM EDT 
//


package org.mitre.stix.default_vocabularies_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationSourceRoleEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InformationSourceRoleEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Initial Author"/>
 *     &lt;enumeration value="Content Enhancer/Refiner"/>
 *     &lt;enumeration value="Aggregator"/>
 *     &lt;enumeration value="Transformer/Translator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InformationSourceRoleEnum-1.0")
@XmlEnum
public enum InformationSourceRoleEnum10 {


    /**
     * A party acting as the initial author/creator of a set of information.
     * 
     */
    @XmlEnumValue("Initial Author")
    INITIAL_AUTHOR("Initial Author"),

    /**
     * A party that enhances or refines a preexisting set of information.
     * 
     */
    @XmlEnumValue("Content Enhancer/Refiner")
    CONTENT_ENHANCER_REFINER("Content Enhancer/Refiner"),

    /**
     * A party that aggregates multiple different sets of information into one new set of information.
     * 
     */
    @XmlEnumValue("Aggregator")
    AGGREGATOR("Aggregator"),

    /**
     * A party that transforms or translates a preexisting set of information into a different representation (e.g., translating an unstructured prose threat analysis report into STIX).
     * 
     */
    @XmlEnumValue("Transformer/Translator")
    TRANSFORMER_TRANSLATOR("Transformer/Translator");
    private final String value;

    InformationSourceRoleEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InformationSourceRoleEnum10 fromValue(String v) {
        for (InformationSourceRoleEnum10 c: InformationSourceRoleEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
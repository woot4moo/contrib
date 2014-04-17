//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.xmlschema.maec_package_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnalysisMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnalysisMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="static"/>
 *     &lt;enumeration value="dynamic"/>
 *     &lt;enumeration value="combination"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AnalysisMethodEnum")
@XmlEnum
public enum AnalysisMethodEnum {


    /**
     * The static value specifies a static malware analysis method, which is achieved by inspecting but not executing the malware instance.
     * 
     */
    @XmlEnumValue("static")
    STATIC("static"),

    /**
     * The dynamic value specifies a dynamic malware analysis method, which is achieved by executing but not inspecting the malware instance.
     * 
     */
    @XmlEnumValue("dynamic")
    DYNAMIC("dynamic"),

    /**
     * The combination value specifies a combination of dynamic and static malware analysis, achieved by both inspecting and executing the malware instance.
     * 
     */
    @XmlEnumValue("combination")
    COMBINATION("combination");
    private final String value;

    AnalysisMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnalysisMethodEnum fromValue(String v) {
        for (AnalysisMethodEnum c: AnalysisMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
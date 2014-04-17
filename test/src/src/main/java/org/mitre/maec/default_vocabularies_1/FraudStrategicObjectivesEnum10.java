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
 * <p>Java class for FraudStrategicObjectivesEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FraudStrategicObjectivesEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="perform premium rate fraud"/>
 *     &lt;enumeration value="perform click fraud"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FraudStrategicObjectivesEnum-1.0")
@XmlEnum
public enum FraudStrategicObjectivesEnum10 {


    /**
     * The 'perform premium rate fraud' value indicates that the malware instance is able to send text messages or dial phone numbers that are charged at premium rates.
     * 
     */
    @XmlEnumValue("perform premium rate fraud")
    PERFORM_PREMIUM_RATE_FRAUD("perform premium rate fraud"),

    /**
     * The 'perform click fraud' value indicates that the malware instance is able to simulate clicks on website advertisements for the purpose of revenue generation.
     * 
     */
    @XmlEnumValue("perform click fraud")
    PERFORM_CLICK_FRAUD("perform click fraud");
    private final String value;

    FraudStrategicObjectivesEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FraudStrategicObjectivesEnum10 fromValue(String v) {
        for (FraudStrategicObjectivesEnum10 c: FraudStrategicObjectivesEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

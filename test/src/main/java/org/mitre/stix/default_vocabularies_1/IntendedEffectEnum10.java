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
 * <p>Java class for IntendedEffectEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntendedEffectEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Advantage"/>
 *     &lt;enumeration value="Advantage - Economic"/>
 *     &lt;enumeration value="Advantage - Military"/>
 *     &lt;enumeration value="Advantage - Political"/>
 *     &lt;enumeration value="Theft"/>
 *     &lt;enumeration value="Theft - Intellectual Property"/>
 *     &lt;enumeration value="Theft - Credential Theft"/>
 *     &lt;enumeration value="Theft - Identity Theft"/>
 *     &lt;enumeration value="Theft - Theft of Proprietary Information"/>
 *     &lt;enumeration value="Account Takeover"/>
 *     &lt;enumeration value="Brand Damage"/>
 *     &lt;enumeration value="Competitive Advantage"/>
 *     &lt;enumeration value="Degradation of Service"/>
 *     &lt;enumeration value="Denial and Deception"/>
 *     &lt;enumeration value="Destruction"/>
 *     &lt;enumeration value="Disruption"/>
 *     &lt;enumeration value="Embarrassment"/>
 *     &lt;enumeration value="Exposure"/>
 *     &lt;enumeration value="Extortion"/>
 *     &lt;enumeration value="Fraud"/>
 *     &lt;enumeration value="Harassment"/>
 *     &lt;enumeration value="ICS Control"/>
 *     &lt;enumeration value="Traffic Diversion"/>
 *     &lt;enumeration value="Unauthorized Access"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntendedEffectEnum-1.0")
@XmlEnum
public enum IntendedEffectEnum10 {

    @XmlEnumValue("Advantage")
    ADVANTAGE("Advantage"),
    @XmlEnumValue("Advantage - Economic")
    ADVANTAGE_ECONOMIC("Advantage - Economic"),
    @XmlEnumValue("Advantage - Military")
    ADVANTAGE_MILITARY("Advantage - Military"),
    @XmlEnumValue("Advantage - Political")
    ADVANTAGE_POLITICAL("Advantage - Political"),
    @XmlEnumValue("Theft")
    THEFT("Theft"),
    @XmlEnumValue("Theft - Intellectual Property")
    THEFT_INTELLECTUAL_PROPERTY("Theft - Intellectual Property"),
    @XmlEnumValue("Theft - Credential Theft")
    THEFT_CREDENTIAL_THEFT("Theft - Credential Theft"),
    @XmlEnumValue("Theft - Identity Theft")
    THEFT_IDENTITY_THEFT("Theft - Identity Theft"),
    @XmlEnumValue("Theft - Theft of Proprietary Information")
    THEFT_THEFT_OF_PROPRIETARY_INFORMATION("Theft - Theft of Proprietary Information"),
    @XmlEnumValue("Account Takeover")
    ACCOUNT_TAKEOVER("Account Takeover"),
    @XmlEnumValue("Brand Damage")
    BRAND_DAMAGE("Brand Damage"),
    @XmlEnumValue("Competitive Advantage")
    COMPETITIVE_ADVANTAGE("Competitive Advantage"),
    @XmlEnumValue("Degradation of Service")
    DEGRADATION_OF_SERVICE("Degradation of Service"),
    @XmlEnumValue("Denial and Deception")
    DENIAL_AND_DECEPTION("Denial and Deception"),
    @XmlEnumValue("Destruction")
    DESTRUCTION("Destruction"),
    @XmlEnumValue("Disruption")
    DISRUPTION("Disruption"),
    @XmlEnumValue("Embarrassment")
    EMBARRASSMENT("Embarrassment"),
    @XmlEnumValue("Exposure")
    EXPOSURE("Exposure"),
    @XmlEnumValue("Extortion")
    EXTORTION("Extortion"),
    @XmlEnumValue("Fraud")
    FRAUD("Fraud"),
    @XmlEnumValue("Harassment")
    HARASSMENT("Harassment"),
    @XmlEnumValue("ICS Control")
    ICS_CONTROL("ICS Control"),
    @XmlEnumValue("Traffic Diversion")
    TRAFFIC_DIVERSION("Traffic Diversion"),
    @XmlEnumValue("Unauthorized Access")
    UNAUTHORIZED_ACCESS("Unauthorized Access");
    private final String value;

    IntendedEffectEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntendedEffectEnum10 fromValue(String v) {
        for (IntendedEffectEnum10 c: IntendedEffectEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
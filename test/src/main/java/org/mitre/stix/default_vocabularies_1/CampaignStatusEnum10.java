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
 * <p>Java class for CampaignStatusEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignStatusEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ongoing"/>
 *     &lt;enumeration value="Historic"/>
 *     &lt;enumeration value="Future"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignStatusEnum-1.0")
@XmlEnum
public enum CampaignStatusEnum10 {


    /**
     * This campaign is currently taking place.
     * 
     */
    @XmlEnumValue("Ongoing")
    ONGOING("Ongoing"),

    /**
     * This campaign occurred in the past and is currently not taking place.
     * 
     */
    @XmlEnumValue("Historic")
    HISTORIC("Historic"),

    /**
     * This campaign is expected to take place in the future.
     * 
     */
    @XmlEnumValue("Future")
    FUTURE("Future");
    private final String value;

    CampaignStatusEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignStatusEnum10 fromValue(String v) {
        for (CampaignStatusEnum10 c: CampaignStatusEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
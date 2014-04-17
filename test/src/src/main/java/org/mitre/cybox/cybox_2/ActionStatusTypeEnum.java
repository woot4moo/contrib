//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.08 at 09:40:17 PM EDT 
//


package org.mitre.cybox.cybox_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionStatusTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionStatusTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Fail"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Complete/Finish"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Ongoing"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionStatusTypeEnum")
@XmlEnum
public enum ActionStatusTypeEnum {


    /**
     * Specifies a cyber observable action that was successful.
     * 
     */
    @XmlEnumValue("Success")
    SUCCESS("Success"),

    /**
     * Specifies a cyber observable action that failed.
     * 
     */
    @XmlEnumValue("Fail")
    FAIL("Fail"),

    /**
     * Specifies a cyber observable action that resulted in an error.
     * 
     */
    @XmlEnumValue("Error")
    ERROR("Error"),

    /**
     * Specifies a cyber observable action that completed or finished. This action status does not specify the result of the action (e.g., Success/Error).
     * 
     */
    @XmlEnumValue("Complete/Finish")
    COMPLETE_FINISH("Complete/Finish"),

    /**
     * Specifies a cyber observable action is pending.
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * Specifies a cyber observable action that is ongoing.
     * 
     */
    @XmlEnumValue("Ongoing")
    ONGOING("Ongoing"),

    /**
     * Specifies a cyber observable action with an unknown status.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ActionStatusTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionStatusTypeEnum fromValue(String v) {
        for (ActionStatusTypeEnum c: ActionStatusTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

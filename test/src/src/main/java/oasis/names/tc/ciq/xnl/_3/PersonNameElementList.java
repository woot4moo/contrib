//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package oasis.names.tc.ciq.xnl._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonNameElementList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonNameElementList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="PrecedingTitle"/>
 *     &lt;enumeration value="Title"/>
 *     &lt;enumeration value="FirstName"/>
 *     &lt;enumeration value="MiddleName"/>
 *     &lt;enumeration value="LastName"/>
 *     &lt;enumeration value="OtherName"/>
 *     &lt;enumeration value="Alias"/>
 *     &lt;enumeration value="GenerationIdentifier"/>
 *     &lt;enumeration value="Degree"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonNameElementList")
@XmlEnum
public enum PersonNameElementList {


    /**
     * His Excellency, Honorable, etc.
     * 
     */
    @XmlEnumValue("PrecedingTitle")
    PRECEDING_TITLE("PrecedingTitle"),

    /**
     * A title signifies some sort of status, such as Mr, Miss, Ms (marriage status), or education such as Professor, PhD, Dr, etc.
     * 
     */
    @XmlEnumValue("Title")
    TITLE("Title"),

    /**
     * The most important name element by which this particular individual is identified in the group. E.g. John, Sam, Brian for Anglo-Saxon cultures.
     * 
     */
    @XmlEnumValue("FirstName")
    FIRST_NAME("FirstName"),

    /**
     * Name elements related to additional identification of the individual, such as names are parents or places.
     * 
     */
    @XmlEnumValue("MiddleName")
    MIDDLE_NAME("MiddleName"),

    /**
     * Name element that identifies the group the individual belongs to and is identified by, such as Last Name, Surname, Family Name, etc. 
     * 
     */
    @XmlEnumValue("LastName")
    LAST_NAME("LastName"),

    /**
     * Any other additional names that are not directly used to identify or call the individual, such as names of ancestors, saints, etc.
     * 
     */
    @XmlEnumValue("OtherName")
    OTHER_NAME("OtherName"),

    /**
     * A simple nick name that is commonly used as part of the name. E.g. a fancy kick-boxer can be commonly known as Bill "Storm" Bababoons, where "Storm" is obviously an alias.
     * 
     */
    @XmlEnumValue("Alias")
    ALIAS("Alias"),

    /**
     * Junior, Senior, The Second, IV,  etc.
     * 
     */
    @XmlEnumValue("GenerationIdentifier")
    GENERATION_IDENTIFIER("GenerationIdentifier"),
    @XmlEnumValue("Degree")
    DEGREE("Degree");
    private final String value;

    PersonNameElementList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonNameElementList fromValue(String v) {
        for (PersonNameElementList c: PersonNameElementList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package oasis.names.tc.ciq.xal._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalityTypeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocalityTypeList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Municipality"/>
 *     &lt;enumeration value="PostTown"/>
 *     &lt;enumeration value="Place"/>
 *     &lt;enumeration value="Suburb"/>
 *     &lt;enumeration value="Town"/>
 *     &lt;enumeration value="Village"/>
 *     &lt;enumeration value="Area"/>
 *     &lt;enumeration value="Zone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocalityTypeList")
@XmlEnum
public enum LocalityTypeList {

    @XmlEnumValue("Municipality")
    MUNICIPALITY("Municipality"),
    @XmlEnumValue("PostTown")
    POST_TOWN("PostTown"),
    @XmlEnumValue("Place")
    PLACE("Place"),
    @XmlEnumValue("Suburb")
    SUBURB("Suburb"),
    @XmlEnumValue("Town")
    TOWN("Town"),
    @XmlEnumValue("Village")
    VILLAGE("Village"),
    @XmlEnumValue("Area")
    AREA("Area"),
    @XmlEnumValue("Zone")
    ZONE("Zone");
    private final String value;

    LocalityTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocalityTypeList fromValue(String v) {
        for (LocalityTypeList c: LocalityTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

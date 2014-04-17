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
 * <p>Java class for LibraryActionNameEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LibraryActionNameEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="enumerate libraries"/>
 *     &lt;enumeration value="free library"/>
 *     &lt;enumeration value="load library"/>
 *     &lt;enumeration value="get function address"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LibraryActionNameEnum-1.0")
@XmlEnum
public enum LibraryActionNameEnum10 {


    /**
     * The 'enumerate libraries' value specifies the defined action of enumerating the libraries used by a process.
     * 
     */
    @XmlEnumValue("enumerate libraries")
    ENUMERATE_LIBRARIES("enumerate libraries"),

    /**
     * The 'free library' value specifies the defined action of freeing a library previously loaded into the address space of the calling process.
     * 
     */
    @XmlEnumValue("free library")
    FREE_LIBRARY("free library"),

    /**
     * The 'load library' value specifies the defined action of loading a library into the address space of the calling process.
     * 
     */
    @XmlEnumValue("load library")
    LOAD_LIBRARY("load library"),

    /**
     * The 'get function address' value specifies the defined action of getting the address of an exported function or variable from a library.
     * 
     */
    @XmlEnumValue("get function address")
    GET_FUNCTION_ADDRESS("get function address");
    private final String value;

    LibraryActionNameEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LibraryActionNameEnum10 fromValue(String v) {
        for (LibraryActionNameEnum10 c: LibraryActionNameEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

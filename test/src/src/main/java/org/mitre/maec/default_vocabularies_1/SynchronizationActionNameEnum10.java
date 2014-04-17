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
 * <p>Java class for SynchronizationActionNameEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SynchronizationActionNameEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="create mutex"/>
 *     &lt;enumeration value="delete mutex"/>
 *     &lt;enumeration value="open mutex"/>
 *     &lt;enumeration value="release mutex"/>
 *     &lt;enumeration value="create semaphore"/>
 *     &lt;enumeration value="delete semaphore"/>
 *     &lt;enumeration value="open semaphore"/>
 *     &lt;enumeration value="release semaphore"/>
 *     &lt;enumeration value="create event"/>
 *     &lt;enumeration value="delete event"/>
 *     &lt;enumeration value="open event"/>
 *     &lt;enumeration value="reset event"/>
 *     &lt;enumeration value="create critical section"/>
 *     &lt;enumeration value="delete critical section"/>
 *     &lt;enumeration value="open critical section"/>
 *     &lt;enumeration value="release critical section"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SynchronizationActionNameEnum-1.0")
@XmlEnum
public enum SynchronizationActionNameEnum10 {


    /**
     * The 'create mutex' value specifies the defined action of creating a new named mutex.
     * 
     */
    @XmlEnumValue("create mutex")
    CREATE_MUTEX("create mutex"),

    /**
     * The 'delete mutex' value specifies the defined action of deleting an existing named mutex.
     * 
     */
    @XmlEnumValue("delete mutex")
    DELETE_MUTEX("delete mutex"),

    /**
     * The 'open mutex' value specifies the defined action of opening an existing named mutex.
     * 
     */
    @XmlEnumValue("open mutex")
    OPEN_MUTEX("open mutex"),

    /**
     * The 'release mutex' value specifies the defined action of releasing ownership of an existing named mutex.
     * 
     */
    @XmlEnumValue("release mutex")
    RELEASE_MUTEX("release mutex"),

    /**
     * The 'create semaphore' value specifies the defined action of creating a new named semaphore.
     * 
     */
    @XmlEnumValue("create semaphore")
    CREATE_SEMAPHORE("create semaphore"),

    /**
     * The 'delete semaphore' value specifies the defined action of deleting an existing named semaphore.
     * 
     */
    @XmlEnumValue("delete semaphore")
    DELETE_SEMAPHORE("delete semaphore"),

    /**
     * The 'open semaphore' value specifies the defined action of opening an existing named semaphore.
     * 
     */
    @XmlEnumValue("open semaphore")
    OPEN_SEMAPHORE("open semaphore"),

    /**
     * The 'release semaphore' value specifies the defined action of releasing ownership of an existing named semaphore.
     * 
     */
    @XmlEnumValue("release semaphore")
    RELEASE_SEMAPHORE("release semaphore"),

    /**
     * Windows-specific.
     * 
     */
    @XmlEnumValue("create event")
    CREATE_EVENT("create event"),

    /**
     * Windows-specific.
     * 
     */
    @XmlEnumValue("delete event")
    DELETE_EVENT("delete event"),

    /**
     * Windows-specific.
     * 
     */
    @XmlEnumValue("open event")
    OPEN_EVENT("open event"),

    /**
     * Windows-specific.
     * 
     */
    @XmlEnumValue("reset event")
    RESET_EVENT("reset event"),

    /**
     * Windows-specific.
     * 
     */
    @XmlEnumValue("create critical section")
    CREATE_CRITICAL_SECTION("create critical section"),

    /**
     * Windows-specific.
     * 
     */
    @XmlEnumValue("delete critical section")
    DELETE_CRITICAL_SECTION("delete critical section"),

    /**
     * Windows-specific.
     * 
     */
    @XmlEnumValue("open critical section")
    OPEN_CRITICAL_SECTION("open critical section"),

    /**
     * Windows-specific.
     * 
     */
    @XmlEnumValue("release critical section")
    RELEASE_CRITICAL_SECTION("release critical section");
    private final String value;

    SynchronizationActionNameEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SynchronizationActionNameEnum10 fromValue(String v) {
        for (SynchronizationActionNameEnum10 c: SynchronizationActionNameEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

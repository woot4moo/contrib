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
 * <p>Java class for FileActionNameEnum-1.1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileActionNameEnum-1.1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="create file"/>
 *     &lt;enumeration value="delete file"/>
 *     &lt;enumeration value="copy file"/>
 *     &lt;enumeration value="create file symbolic link"/>
 *     &lt;enumeration value="find file"/>
 *     &lt;enumeration value="get file attributes"/>
 *     &lt;enumeration value="set file attributes"/>
 *     &lt;enumeration value="lock file"/>
 *     &lt;enumeration value="unlock file"/>
 *     &lt;enumeration value="modify file"/>
 *     &lt;enumeration value="move file"/>
 *     &lt;enumeration value="open file"/>
 *     &lt;enumeration value="read from file"/>
 *     &lt;enumeration value="write to file"/>
 *     &lt;enumeration value="rename file"/>
 *     &lt;enumeration value="create file alternate data stream"/>
 *     &lt;enumeration value="send control code to file"/>
 *     &lt;enumeration value="create file mapping"/>
 *     &lt;enumeration value="open file mapping"/>
 *     &lt;enumeration value="execute file"/>
 *     &lt;enumeration value="hide file"/>
 *     &lt;enumeration value="close file"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileActionNameEnum-1.1")
@XmlEnum
public enum FileActionNameEnum11 {


    /**
     * The 'create file' value specifies the defined action of creating a new file.
     * 
     */
    @XmlEnumValue("create file")
    CREATE_FILE("create file"),

    /**
     * The 'delete file' value specifies the defined action of deleting an existing file.
     * 
     */
    @XmlEnumValue("delete file")
    DELETE_FILE("delete file"),

    /**
     * The 'copy file' value specifies the defined action of copying an existing file from one location to another.
     * 
     */
    @XmlEnumValue("copy file")
    COPY_FILE("copy file"),

    /**
     * The 'create file symbolic link' value specifies the defined action of creating a symbolic link to an existing file.
     * 
     */
    @XmlEnumValue("create file symbolic link")
    CREATE_FILE_SYMBOLIC_LINK("create file symbolic link"),

    /**
     * The 'find file' value specifies the defined action of searching for an existing file.
     * 
     */
    @XmlEnumValue("find file")
    FIND_FILE("find file"),

    /**
     * The 'get file attributes' value specifies the defined action of getting the attributes of an existing file.
     * 
     */
    @XmlEnumValue("get file attributes")
    GET_FILE_ATTRIBUTES("get file attributes"),

    /**
     * The 'set file attributes' value specifies the defined action of setting the file attributes for an existing file.
     * 
     */
    @XmlEnumValue("set file attributes")
    SET_FILE_ATTRIBUTES("set file attributes"),

    /**
     * The 'lock file' value specifies the defined action of locking an existing file.
     * 
     */
    @XmlEnumValue("lock file")
    LOCK_FILE("lock file"),

    /**
     * The 'unlock file' value specifies the defined action of unlocking an existing file.
     * 
     */
    @XmlEnumValue("unlock file")
    UNLOCK_FILE("unlock file"),

    /**
     * The 'modify file' value specifies the defined action of modifying an existing file in some manner.
     * 
     */
    @XmlEnumValue("modify file")
    MODIFY_FILE("modify file"),

    /**
     * The 'move file' value specifies the defined action of moving an existing file from one location to another.
     * 
     */
    @XmlEnumValue("move file")
    MOVE_FILE("move file"),

    /**
     * The 'open file' value specifies the defined action of opening an existing file for reading or writing.
     * 
     */
    @XmlEnumValue("open file")
    OPEN_FILE("open file"),

    /**
     * The 'read from file' value specifies the defined action of reading from an existing file.
     * 
     */
    @XmlEnumValue("read from file")
    READ_FROM_FILE("read from file"),

    /**
     * The 'write to file' value specifies the defined action of writing to an existing file.
     * 
     */
    @XmlEnumValue("write to file")
    WRITE_TO_FILE("write to file"),

    /**
     * The 'rename file' value specifies the defined action of renaming an existing file.
     * 
     */
    @XmlEnumValue("rename file")
    RENAME_FILE("rename file"),

    /**
     * Windows-specific.
     * 
     */
    @XmlEnumValue("create file alternate data stream")
    CREATE_FILE_ALTERNATE_DATA_STREAM("create file alternate data stream"),

    /**
     * Windows-specific.
     * 
     */
    @XmlEnumValue("send control code to file")
    SEND_CONTROL_CODE_TO_FILE("send control code to file"),

    /**
     * Windows-specific.
     * 
     */
    @XmlEnumValue("create file mapping")
    CREATE_FILE_MAPPING("create file mapping"),

    /**
     * Windows-specific.
     * 
     */
    @XmlEnumValue("open file mapping")
    OPEN_FILE_MAPPING("open file mapping"),

    /**
     * The 'execute file' value specifies the defined action of executing an existing file.
     * 
     */
    @XmlEnumValue("execute file")
    EXECUTE_FILE("execute file"),

    /**
     * The 'hide file' value specifies the defined action of hiding an existing file.
     * 
     */
    @XmlEnumValue("hide file")
    HIDE_FILE("hide file"),

    /**
     * The 'close file' value specifies the defined action of closing an existing file that previously opened for reading or writing.
     * 
     */
    @XmlEnumValue("close file")
    CLOSE_FILE("close file");
    private final String value;

    FileActionNameEnum11(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileActionNameEnum11 fromValue(String v) {
        for (FileActionNameEnum11 c: FileActionNameEnum11 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

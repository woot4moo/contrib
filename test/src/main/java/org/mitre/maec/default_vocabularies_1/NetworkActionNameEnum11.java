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
 * <p>Java class for NetworkActionNameEnum-1.1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkActionNameEnum-1.1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="open port"/>
 *     &lt;enumeration value="close port"/>
 *     &lt;enumeration value="connect to ip"/>
 *     &lt;enumeration value="disconnect from ip"/>
 *     &lt;enumeration value="connect to url"/>
 *     &lt;enumeration value="connect to socket address"/>
 *     &lt;enumeration value="download file"/>
 *     &lt;enumeration value="upload file"/>
 *     &lt;enumeration value="listen on port"/>
 *     &lt;enumeration value="send email message"/>
 *     &lt;enumeration value="send icmp request"/>
 *     &lt;enumeration value="send network packet"/>
 *     &lt;enumeration value="receive network packet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetworkActionNameEnum-1.1")
@XmlEnum
public enum NetworkActionNameEnum11 {


    /**
     * The 'open port' value specifies the defined action of opening a network port.
     * 
     */
    @XmlEnumValue("open port")
    OPEN_PORT("open port"),

    /**
     * The 'close port' value specifies the defined action of closing a network port.
     * 
     */
    @XmlEnumValue("close port")
    CLOSE_PORT("close port"),

    /**
     * The 'connect to ip' value specifies the defined action of connecting to an IP address.
     * 
     */
    @XmlEnumValue("connect to ip")
    CONNECT_TO_IP("connect to ip"),

    /**
     * The 'disconnect from ip' value specifies the defined action of disconnecting from a previously established connection to an IP address.
     * 
     */
    @XmlEnumValue("disconnect from ip")
    DISCONNECT_FROM_IP("disconnect from ip"),

    /**
     * The 'connect to url' value specifies the defined action of connecting to a URL.
     * 
     */
    @XmlEnumValue("connect to url")
    CONNECT_TO_URL("connect to url"),

    /**
     * The 'connect to socket address' value specifies the defined action of connecting to a socket address, consisting of an IP address and port number.
     * 
     */
    @XmlEnumValue("connect to socket address")
    CONNECT_TO_SOCKET_ADDRESS("connect to socket address"),

    /**
     * The 'download file' value specifies the defined action of downloading a file from a remote location.
     * 
     */
    @XmlEnumValue("download file")
    DOWNLOAD_FILE("download file"),

    /**
     * The 'upload file' value specifies the defined action of uploading a file to a remote location.
     * 
     */
    @XmlEnumValue("upload file")
    UPLOAD_FILE("upload file"),

    /**
     * The 'listen on port' value specifies the defined action of listening on a specific port.
     * 
     */
    @XmlEnumValue("listen on port")
    LISTEN_ON_PORT("listen on port"),

    /**
     * The 'send email message' value specifies the defined action of sending an email message.
     * 
     */
    @XmlEnumValue("send email message")
    SEND_EMAIL_MESSAGE("send email message"),

    /**
     * The 'send icmp request' value specifies the defined action of sending an ICMP request.
     * 
     */
    @XmlEnumValue("send icmp request")
    SEND_ICMP_REQUEST("send icmp request"),

    /**
     * The 'send network packet' value specifies the defined action of sending a packet on a network.
     * 
     */
    @XmlEnumValue("send network packet")
    SEND_NETWORK_PACKET("send network packet"),

    /**
     * The 'receive network packet' value specifies the defined action of receiving a packet on a network.
     * 
     */
    @XmlEnumValue("receive network packet")
    RECEIVE_NETWORK_PACKET("receive network packet");
    private final String value;

    NetworkActionNameEnum11(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkActionNameEnum11 fromValue(String v) {
        for (NetworkActionNameEnum11 c: NetworkActionNameEnum11 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

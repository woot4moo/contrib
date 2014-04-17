//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.xmlschema.maec_bundle_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * The ActionCollectionType provides a method for characterizing collections of actions. This can be useful for organizing actions that may be related and where the exact relationship is unknown, as well as actions whose associated behavior has not yet been established.
 * 
 * <p>Java class for ActionCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://maec.mitre.org/XMLSchema/maec-bundle-4}BaseCollectionType">
 *       &lt;sequence>
 *         &lt;element name="Action_List" type="{http://maec.mitre.org/XMLSchema/maec-bundle-4}ActionListType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionCollectionType", propOrder = {
    "actionList"
})
public class ActionCollectionType
    extends BaseCollectionType
{

    @XmlElement(name = "Action_List", required = true)
    protected ActionListType actionList;
    @XmlAttribute(name = "id", required = true)
    protected QName id;

    /**
     * Gets the value of the actionList property.
     * 
     * @return
     *     possible object is
     *     {@link ActionListType }
     *     
     */
    public ActionListType getActionList() {
        return actionList;
    }

    /**
     * Sets the value of the actionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionListType }
     *     
     */
    public void setActionList(ActionListType value) {
        this.actionList = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setId(QName value) {
        this.id = value;
    }

}

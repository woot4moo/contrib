//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.xmlschema.maec_bundle_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.cybox_2.ActionReferenceType;


/**
 * The ActionReferenceListType captures a list of Action References.
 * 
 * <p>Java class for ActionReferenceListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionReferenceListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Action_Reference" type="{http://cybox.mitre.org/cybox-2}ActionReferenceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionReferenceListType", propOrder = {
    "actionReference"
})
public class ActionReferenceListType {

    @XmlElement(name = "Action_Reference", required = true)
    protected List<ActionReferenceType> actionReference;

    /**
     * Gets the value of the actionReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionReferenceType }
     * 
     * 
     */
    public List<ActionReferenceType> getActionReference() {
        if (actionReference == null) {
            actionReference = new ArrayList<ActionReferenceType>();
        }
        return this.actionReference;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package org.mitre.maec.xmlschema.maec_package_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The GroupingRelationshipListType captures a list of grouping relationships relating the Malware Subjects in a Package.
 * 
 * <p>Java class for GroupingRelationshipListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupingRelationshipListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Grouping_Relationship" type="{http://maec.mitre.org/XMLSchema/maec-package-2}GroupingRelationshipType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupingRelationshipListType", propOrder = {
    "groupingRelationship"
})
public class GroupingRelationshipListType {

    @XmlElement(name = "Grouping_Relationship", required = true)
    protected List<GroupingRelationshipType> groupingRelationship;

    /**
     * Gets the value of the groupingRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupingRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupingRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupingRelationshipType }
     * 
     * 
     */
    public List<GroupingRelationshipType> getGroupingRelationship() {
        if (groupingRelationship == null) {
            groupingRelationship = new ArrayList<GroupingRelationshipType>();
        }
        return this.groupingRelationship;
    }

}

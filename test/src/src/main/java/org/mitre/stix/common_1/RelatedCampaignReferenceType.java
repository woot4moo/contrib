//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.16 at 07:44:27 PM EDT 
//


package org.mitre.stix.common_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies or characterizes a relationship by reference to a campaign.
 * 
 * <p>Java class for RelatedCampaignReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedCampaignReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://stix.mitre.org/common-1}GenericRelationshipType">
 *       &lt;sequence>
 *         &lt;element name="Campaign" type="{http://stix.mitre.org/common-1}CampaignReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedCampaignReferenceType", propOrder = {
    "campaign"
})
public class RelatedCampaignReferenceType
    extends GenericRelationshipType
{

    @XmlElement(name = "Campaign", required = true)
    protected CampaignReferenceType campaign;

    /**
     * Gets the value of the campaign property.
     * 
     * @return
     *     possible object is
     *     {@link org.mitre.stix.common_1.CampaignReferenceType }
     *     
     */
    public CampaignReferenceType getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.mitre.stix.common_1.CampaignReferenceType }
     *     
     */
    public void setCampaign(CampaignReferenceType value) {
        this.campaign = value;
    }

}

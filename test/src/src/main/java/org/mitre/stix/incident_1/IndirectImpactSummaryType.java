//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.08 at 09:40:17 PM EDT 
//


package org.mitre.stix.incident_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.stix.common_1.ControlledVocabularyStringType;


/**
 * <p>Java class for IndirectImpactSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndirectImpactSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Loss_Of_Competitive_Advantage" type="{http://stix.mitre.org/common-1}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;element name="Brand_And_Market_Damage" type="{http://stix.mitre.org/common-1}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;element name="Increased_Operating_Costs" type="{http://stix.mitre.org/common-1}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;element name="Legal_And_Regulatory_Costs" type="{http://stix.mitre.org/common-1}ControlledVocabularyStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndirectImpactSummaryType", propOrder = {
    "lossOfCompetitiveAdvantage",
    "brandAndMarketDamage",
    "increasedOperatingCosts",
    "legalAndRegulatoryCosts"
})
public class IndirectImpactSummaryType {

    @XmlElement(name = "Loss_Of_Competitive_Advantage")
    protected ControlledVocabularyStringType lossOfCompetitiveAdvantage;
    @XmlElement(name = "Brand_And_Market_Damage")
    protected ControlledVocabularyStringType brandAndMarketDamage;
    @XmlElement(name = "Increased_Operating_Costs")
    protected ControlledVocabularyStringType increasedOperatingCosts;
    @XmlElement(name = "Legal_And_Regulatory_Costs")
    protected ControlledVocabularyStringType legalAndRegulatoryCosts;

    /**
     * Gets the value of the lossOfCompetitiveAdvantage property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getLossOfCompetitiveAdvantage() {
        return lossOfCompetitiveAdvantage;
    }

    /**
     * Sets the value of the lossOfCompetitiveAdvantage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setLossOfCompetitiveAdvantage(ControlledVocabularyStringType value) {
        this.lossOfCompetitiveAdvantage = value;
    }

    /**
     * Gets the value of the brandAndMarketDamage property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getBrandAndMarketDamage() {
        return brandAndMarketDamage;
    }

    /**
     * Sets the value of the brandAndMarketDamage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setBrandAndMarketDamage(ControlledVocabularyStringType value) {
        this.brandAndMarketDamage = value;
    }

    /**
     * Gets the value of the increasedOperatingCosts property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getIncreasedOperatingCosts() {
        return increasedOperatingCosts;
    }

    /**
     * Sets the value of the increasedOperatingCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setIncreasedOperatingCosts(ControlledVocabularyStringType value) {
        this.increasedOperatingCosts = value;
    }

    /**
     * Gets the value of the legalAndRegulatoryCosts property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getLegalAndRegulatoryCosts() {
        return legalAndRegulatoryCosts;
    }

    /**
     * Sets the value of the legalAndRegulatoryCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setLegalAndRegulatoryCosts(ControlledVocabularyStringType value) {
        this.legalAndRegulatoryCosts = value;
    }

}

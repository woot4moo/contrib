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
import org.mitre.stix.common_1.DateTimeWithPrecisionType;


/**
 * <p>Java class for TimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="First_Malicious_Action" type="{http://stix.mitre.org/common-1}DateTimeWithPrecisionType" minOccurs="0"/>
 *         &lt;element name="Initial_Compromise" type="{http://stix.mitre.org/common-1}DateTimeWithPrecisionType" minOccurs="0"/>
 *         &lt;element name="First_Data_Exfiltration" type="{http://stix.mitre.org/common-1}DateTimeWithPrecisionType" minOccurs="0"/>
 *         &lt;element name="Incident_Discovery" type="{http://stix.mitre.org/common-1}DateTimeWithPrecisionType" minOccurs="0"/>
 *         &lt;element name="Incident_Opened" type="{http://stix.mitre.org/common-1}DateTimeWithPrecisionType" minOccurs="0"/>
 *         &lt;element name="Containment_Achieved" type="{http://stix.mitre.org/common-1}DateTimeWithPrecisionType" minOccurs="0"/>
 *         &lt;element name="Restoration_Achieved" type="{http://stix.mitre.org/common-1}DateTimeWithPrecisionType" minOccurs="0"/>
 *         &lt;element name="Incident_Reported" type="{http://stix.mitre.org/common-1}DateTimeWithPrecisionType" minOccurs="0"/>
 *         &lt;element name="Incident_Closed" type="{http://stix.mitre.org/common-1}DateTimeWithPrecisionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeType", propOrder = {
    "firstMaliciousAction",
    "initialCompromise",
    "firstDataExfiltration",
    "incidentDiscovery",
    "incidentOpened",
    "containmentAchieved",
    "restorationAchieved",
    "incidentReported",
    "incidentClosed"
})
public class TimeType {

    @XmlElement(name = "First_Malicious_Action")
    protected DateTimeWithPrecisionType firstMaliciousAction;
    @XmlElement(name = "Initial_Compromise")
    protected DateTimeWithPrecisionType initialCompromise;
    @XmlElement(name = "First_Data_Exfiltration")
    protected DateTimeWithPrecisionType firstDataExfiltration;
    @XmlElement(name = "Incident_Discovery")
    protected DateTimeWithPrecisionType incidentDiscovery;
    @XmlElement(name = "Incident_Opened")
    protected DateTimeWithPrecisionType incidentOpened;
    @XmlElement(name = "Containment_Achieved")
    protected DateTimeWithPrecisionType containmentAchieved;
    @XmlElement(name = "Restoration_Achieved")
    protected DateTimeWithPrecisionType restorationAchieved;
    @XmlElement(name = "Incident_Reported")
    protected DateTimeWithPrecisionType incidentReported;
    @XmlElement(name = "Incident_Closed")
    protected DateTimeWithPrecisionType incidentClosed;

    /**
     * Gets the value of the firstMaliciousAction property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public DateTimeWithPrecisionType getFirstMaliciousAction() {
        return firstMaliciousAction;
    }

    /**
     * Sets the value of the firstMaliciousAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public void setFirstMaliciousAction(DateTimeWithPrecisionType value) {
        this.firstMaliciousAction = value;
    }

    /**
     * Gets the value of the initialCompromise property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public DateTimeWithPrecisionType getInitialCompromise() {
        return initialCompromise;
    }

    /**
     * Sets the value of the initialCompromise property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public void setInitialCompromise(DateTimeWithPrecisionType value) {
        this.initialCompromise = value;
    }

    /**
     * Gets the value of the firstDataExfiltration property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public DateTimeWithPrecisionType getFirstDataExfiltration() {
        return firstDataExfiltration;
    }

    /**
     * Sets the value of the firstDataExfiltration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public void setFirstDataExfiltration(DateTimeWithPrecisionType value) {
        this.firstDataExfiltration = value;
    }

    /**
     * Gets the value of the incidentDiscovery property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public DateTimeWithPrecisionType getIncidentDiscovery() {
        return incidentDiscovery;
    }

    /**
     * Sets the value of the incidentDiscovery property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public void setIncidentDiscovery(DateTimeWithPrecisionType value) {
        this.incidentDiscovery = value;
    }

    /**
     * Gets the value of the incidentOpened property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public DateTimeWithPrecisionType getIncidentOpened() {
        return incidentOpened;
    }

    /**
     * Sets the value of the incidentOpened property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public void setIncidentOpened(DateTimeWithPrecisionType value) {
        this.incidentOpened = value;
    }

    /**
     * Gets the value of the containmentAchieved property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public DateTimeWithPrecisionType getContainmentAchieved() {
        return containmentAchieved;
    }

    /**
     * Sets the value of the containmentAchieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public void setContainmentAchieved(DateTimeWithPrecisionType value) {
        this.containmentAchieved = value;
    }

    /**
     * Gets the value of the restorationAchieved property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public DateTimeWithPrecisionType getRestorationAchieved() {
        return restorationAchieved;
    }

    /**
     * Sets the value of the restorationAchieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public void setRestorationAchieved(DateTimeWithPrecisionType value) {
        this.restorationAchieved = value;
    }

    /**
     * Gets the value of the incidentReported property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public DateTimeWithPrecisionType getIncidentReported() {
        return incidentReported;
    }

    /**
     * Sets the value of the incidentReported property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public void setIncidentReported(DateTimeWithPrecisionType value) {
        this.incidentReported = value;
    }

    /**
     * Gets the value of the incidentClosed property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public DateTimeWithPrecisionType getIncidentClosed() {
        return incidentClosed;
    }

    /**
     * Sets the value of the incidentClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeWithPrecisionType }
     *     
     */
    public void setIncidentClosed(DateTimeWithPrecisionType value) {
        this.incidentClosed = value;
    }

}

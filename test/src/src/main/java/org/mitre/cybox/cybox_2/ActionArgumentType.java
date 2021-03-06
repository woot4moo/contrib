//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.08 at 09:40:17 PM EDT 
//


package org.mitre.cybox.cybox_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.ControlledVocabularyStringType;


/**
 * The ActionArgumentType enables the specification of a single relevant argument/parameter for this Action.
 * 
 * <p>Java class for ActionArgumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionArgumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Argument_Name" type="{http://cybox.mitre.org/common-2}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;element name="Argument_Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionArgumentType", propOrder = {
    "argumentName",
    "argumentValue"
})
public class ActionArgumentType {

    @XmlElement(name = "Argument_Name")
    protected ControlledVocabularyStringType argumentName;
    @XmlElement(name = "Argument_Value")
    protected String argumentValue;

    /**
     * Gets the value of the argumentName property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getArgumentName() {
        return argumentName;
    }

    /**
     * Sets the value of the argumentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setArgumentName(ControlledVocabularyStringType value) {
        this.argumentName = value;
    }

    /**
     * Gets the value of the argumentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgumentValue() {
        return argumentValue;
    }

    /**
     * Sets the value of the argumentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgumentValue(String value) {
        this.argumentValue = value;
    }

}

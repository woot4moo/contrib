//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.09 at 05:02:22 PM EDT 
//


package oasis.names.tc.ciq.xnal._3;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.tc.ciq.xnal._3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.tc.ciq.xnal._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostalLabel }
     * 
     */
    public PostalLabel createPostalLabel() {
        return new PostalLabel();
    }

    /**
     * Create an instance of {@link PostalLabel.Addressee }
     * 
     */
    public PostalLabel.Addressee createPostalLabelAddressee() {
        return new PostalLabel.Addressee();
    }

    /**
     * Create an instance of {@link Record }
     * 
     */
    public Record createRecord() {
        return new Record();
    }

    /**
     * Create an instance of {@link PostalLabel.Addressee.Designation }
     * 
     */
    public PostalLabel.Addressee.Designation createPostalLabelAddresseeDesignation() {
        return new PostalLabel.Addressee.Designation();
    }

    /**
     * Create an instance of {@link PostalLabel.Addressee.DependencyName }
     * 
     */
    public PostalLabel.Addressee.DependencyName createPostalLabelAddresseeDependencyName() {
        return new PostalLabel.Addressee.DependencyName();
    }

}

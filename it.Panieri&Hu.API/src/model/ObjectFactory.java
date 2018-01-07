//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.12.12 alle 11:30:01 AM CET 
//


package model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DistanceMatrixResponse }
     * 
     */
    public DistanceMatrixResponse createDistanceMatrixResponse() {
        return new DistanceMatrixResponse();
    }

    /**
     * Create an instance of {@link DistanceMatrixResponse.Row }
     * 
     */
    public DistanceMatrixResponse.Row createDistanceMatrixResponseRow() {
        return new DistanceMatrixResponse.Row();
    }

    /**
     * Create an instance of {@link DistanceMatrixResponse.Row.Element }
     * 
     */
    public DistanceMatrixResponse.Row.Element createDistanceMatrixResponseRowElement() {
        return new DistanceMatrixResponse.Row.Element();
    }

    /**
     * Create an instance of {@link DistanceMatrixResponse.Row.Element.Duration }
     * 
     */
    public DistanceMatrixResponse.Row.Element.Duration createDistanceMatrixResponseRowElementDuration() {
        return new DistanceMatrixResponse.Row.Element.Duration();
    }

    /**
     * Create an instance of {@link DistanceMatrixResponse.Row.Element.Distance }
     * 
     */
    public DistanceMatrixResponse.Row.Element.Distance createDistanceMatrixResponseRowElementDistance() {
        return new DistanceMatrixResponse.Row.Element.Distance();
    }

}

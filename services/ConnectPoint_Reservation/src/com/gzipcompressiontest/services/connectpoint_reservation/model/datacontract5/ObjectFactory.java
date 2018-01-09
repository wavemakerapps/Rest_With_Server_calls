/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract5 package. 
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

    private final static QName _ExceptionInformationExceptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Exceptions", "ExceptionInformation.Exceptions");
    private final static QName _ExceptionInformationException_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Exceptions", "ExceptionInformation.Exception");
    private final static QName _ExceptionLevels_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Exceptions", "ExceptionLevels");
    private final static QName _ExceptionInformationExceptionExceptionDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Exceptions", "ExceptionDescription");
    private final static QName _ExceptionInformationExceptionExceptionSource_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Exceptions", "ExceptionSource");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExceptionInformationException }
     * 
     */
    public ExceptionInformationException createExceptionInformationException() {
        return new ExceptionInformationException();
    }

    /**
     * Create an instance of {@link ExceptionInformationExceptions }
     * 
     */
    public ExceptionInformationExceptions createExceptionInformationExceptions() {
        return new ExceptionInformationExceptions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInformationExceptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Exceptions", name = "ExceptionInformation.Exceptions")
    public JAXBElement<ExceptionInformationExceptions> createExceptionInformationExceptions(ExceptionInformationExceptions value) {
        return new JAXBElement<ExceptionInformationExceptions>(_ExceptionInformationExceptions_QNAME, ExceptionInformationExceptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInformationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Exceptions", name = "ExceptionInformation.Exception")
    public JAXBElement<ExceptionInformationException> createExceptionInformationException(ExceptionInformationException value) {
        return new JAXBElement<ExceptionInformationException>(_ExceptionInformationException_QNAME, ExceptionInformationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionLevels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Exceptions", name = "ExceptionLevels")
    public JAXBElement<ExceptionLevels> createExceptionLevels(ExceptionLevels value) {
        return new JAXBElement<ExceptionLevels>(_ExceptionLevels_QNAME, ExceptionLevels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Exceptions", name = "ExceptionDescription", scope = ExceptionInformationException.class)
    public JAXBElement<String> createExceptionInformationExceptionExceptionDescription(String value) {
        return new JAXBElement<String>(_ExceptionInformationExceptionExceptionDescription_QNAME, String.class, ExceptionInformationException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Exceptions", name = "ExceptionSource", scope = ExceptionInformationException.class)
    public JAXBElement<String> createExceptionInformationExceptionExceptionSource(String value) {
        return new JAXBElement<String>(_ExceptionInformationExceptionExceptionSource_QNAME, String.class, ExceptionInformationException.class, value);
    }

}

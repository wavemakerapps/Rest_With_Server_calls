/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract5.ExceptionInformationException;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract6 package. 
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

    private final static QName _ArrayOfSeatInventoryResponseDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Responses", "ArrayOfSeatInventoryResponseDetails");
    private final static QName _SeatInventoryResponseDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Responses", "SeatInventoryResponseDetails");
    private final static QName _SeatInventoryResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Responses", "SeatInventoryResponse");
    private final static QName _SeatInventoryResponseDetailsFareClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Responses", "FareClass");
    private final static QName _SeatInventoryResponseExceptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Responses", "Exceptions");
    private final static QName _SeatInventoryResponseSeatInventory_QNAME = new QName("http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Responses", "seatInventory");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfSeatInventoryResponseDetails }
     * 
     */
    public ArrayOfSeatInventoryResponseDetails createArrayOfSeatInventoryResponseDetails() {
        return new ArrayOfSeatInventoryResponseDetails();
    }

    /**
     * Create an instance of {@link SeatInventoryResponseDetails }
     * 
     */
    public SeatInventoryResponseDetails createSeatInventoryResponseDetails() {
        return new SeatInventoryResponseDetails();
    }

    /**
     * Create an instance of {@link SeatInventoryResponse }
     * 
     */
    public SeatInventoryResponse createSeatInventoryResponse() {
        return new SeatInventoryResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeatInventoryResponseDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Responses", name = "ArrayOfSeatInventoryResponseDetails")
    public JAXBElement<ArrayOfSeatInventoryResponseDetails> createArrayOfSeatInventoryResponseDetails(ArrayOfSeatInventoryResponseDetails value) {
        return new JAXBElement<ArrayOfSeatInventoryResponseDetails>(_ArrayOfSeatInventoryResponseDetails_QNAME, ArrayOfSeatInventoryResponseDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatInventoryResponseDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Responses", name = "SeatInventoryResponseDetails")
    public JAXBElement<SeatInventoryResponseDetails> createSeatInventoryResponseDetails(SeatInventoryResponseDetails value) {
        return new JAXBElement<SeatInventoryResponseDetails>(_SeatInventoryResponseDetails_QNAME, SeatInventoryResponseDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatInventoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Responses", name = "SeatInventoryResponse")
    public JAXBElement<SeatInventoryResponse> createSeatInventoryResponse(SeatInventoryResponse value) {
        return new JAXBElement<SeatInventoryResponse>(_SeatInventoryResponse_QNAME, SeatInventoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Responses", name = "FareClass", scope = SeatInventoryResponseDetails.class)
    public JAXBElement<String> createSeatInventoryResponseDetailsFareClass(String value) {
        return new JAXBElement<String>(_SeatInventoryResponseDetailsFareClass_QNAME, String.class, SeatInventoryResponseDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInformationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Responses", name = "Exceptions", scope = SeatInventoryResponse.class)
    public JAXBElement<ExceptionInformationException> createSeatInventoryResponseExceptions(ExceptionInformationException value) {
        return new JAXBElement<ExceptionInformationException>(_SeatInventoryResponseExceptions_QNAME, ExceptionInformationException.class, SeatInventoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeatInventoryResponseDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Responses", name = "seatInventory", scope = SeatInventoryResponse.class)
    public JAXBElement<ArrayOfSeatInventoryResponseDetails> createSeatInventoryResponseSeatInventory(ArrayOfSeatInventoryResponseDetails value) {
        return new JAXBElement<ArrayOfSeatInventoryResponseDetails>(_SeatInventoryResponseSeatInventory_QNAME, ArrayOfSeatInventoryResponseDetails.class, SeatInventoryResponse.class, value);
    }

}

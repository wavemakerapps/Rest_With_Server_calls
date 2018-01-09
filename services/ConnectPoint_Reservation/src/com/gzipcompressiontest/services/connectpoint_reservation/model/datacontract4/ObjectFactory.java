/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.TransactionInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract4 package. 
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

    private final static QName _SeatInventoryRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", "SeatInventoryRequest");
    private final static QName _ArrayOfSeatInventoryEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", "ArrayOfSeatInventoryEntity");
    private final static QName _SeatInventoryEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", "SeatInventoryEntity");
    private final static QName _SeatInventoryEntityDepartureDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", "departureDate");
    private final static QName _SeatInventoryEntityFareClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", "fareClass");
    private final static QName _SeatInventoryRequestTransactionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", "TransactionInfo");
    private final static QName _SeatInventoryRequestSeatInventory_QNAME = new QName("http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", "seatInventory");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SeatInventoryRequest }
     * 
     */
    public SeatInventoryRequest createSeatInventoryRequest() {
        return new SeatInventoryRequest();
    }

    /**
     * Create an instance of {@link ArrayOfSeatInventoryEntity }
     * 
     */
    public ArrayOfSeatInventoryEntity createArrayOfSeatInventoryEntity() {
        return new ArrayOfSeatInventoryEntity();
    }

    /**
     * Create an instance of {@link SeatInventoryEntity }
     * 
     */
    public SeatInventoryEntity createSeatInventoryEntity() {
        return new SeatInventoryEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatInventoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", name = "SeatInventoryRequest")
    public JAXBElement<SeatInventoryRequest> createSeatInventoryRequest(SeatInventoryRequest value) {
        return new JAXBElement<SeatInventoryRequest>(_SeatInventoryRequest_QNAME, SeatInventoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeatInventoryEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", name = "ArrayOfSeatInventoryEntity")
    public JAXBElement<ArrayOfSeatInventoryEntity> createArrayOfSeatInventoryEntity(ArrayOfSeatInventoryEntity value) {
        return new JAXBElement<ArrayOfSeatInventoryEntity>(_ArrayOfSeatInventoryEntity_QNAME, ArrayOfSeatInventoryEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatInventoryEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", name = "SeatInventoryEntity")
    public JAXBElement<SeatInventoryEntity> createSeatInventoryEntity(SeatInventoryEntity value) {
        return new JAXBElement<SeatInventoryEntity>(_SeatInventoryEntity_QNAME, SeatInventoryEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", name = "departureDate", scope = SeatInventoryEntity.class)
    public JAXBElement<String> createSeatInventoryEntityDepartureDate(String value) {
        return new JAXBElement<String>(_SeatInventoryEntityDepartureDate_QNAME, String.class, SeatInventoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", name = "fareClass", scope = SeatInventoryEntity.class)
    public JAXBElement<String> createSeatInventoryEntityFareClass(String value) {
        return new JAXBElement<String>(_SeatInventoryEntityFareClass_QNAME, String.class, SeatInventoryEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", name = "TransactionInfo", scope = SeatInventoryRequest.class)
    public JAXBElement<TransactionInfo> createSeatInventoryRequestTransactionInfo(TransactionInfo value) {
        return new JAXBElement<TransactionInfo>(_SeatInventoryRequestTransactionInfo_QNAME, TransactionInfo.class, SeatInventoryRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeatInventoryEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", name = "seatInventory", scope = SeatInventoryRequest.class)
    public JAXBElement<ArrayOfSeatInventoryEntity> createSeatInventoryRequestSeatInventory(ArrayOfSeatInventoryEntity value) {
        return new JAXBElement<ArrayOfSeatInventoryEntity>(_SeatInventoryRequestSeatInventory_QNAME, ArrayOfSeatInventoryEntity.class, SeatInventoryRequest.class, value);
    }

}

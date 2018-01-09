/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract package. 
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

    private final static QName _TransactionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "TransactionInfo");
    private final static QName _CarrierCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "CarrierCode");
    private final static QName _EnumerationsPaymentMethodTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "Enumerations.PaymentMethodTypes");
    private final static QName _EnumerationsGenderTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "Enumerations.GenderTypes");
    private final static QName _ReservationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "ReservationInfo");
    private final static QName _EnumerationsSSRStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "Enumerations.SSRStatus");
    private final static QName _EnumerationsCurrencyCodeTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "Enumerations.CurrencyCodeTypes");
    private final static QName _EnumerationsImportBookingAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "Enumerations.ImportBookingAction");
    private final static QName _EnumerationsRelationshipTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "Enumerations.RelationshipTypes");
    private final static QName _ArrayOfCarrierCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "ArrayOfCarrierCode");
    private final static QName _EnumerationsContactTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "Enumerations.ContactTypes");
    private final static QName _EnumerationsReservationChannelTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "Enumerations.ReservationChannelTypes");
    private final static QName _TransactionInfoReservationChannel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "ReservationChannel");
    private final static QName _TransactionInfoIATA_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "IATA");
    private final static QName _TransactionInfoOffice_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "Office");
    private final static QName _TransactionInfoClientIPAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "ClientIPAddress");
    private final static QName _TransactionInfoChannelType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "ChannelType");
    private final static QName _TransactionInfoHistoricUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", "HistoricUserName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReservationInfo }
     * 
     */
    public ReservationInfo createReservationInfo() {
        return new ReservationInfo();
    }

    /**
     * Create an instance of {@link TransactionInfo }
     * 
     */
    public TransactionInfo createTransactionInfo() {
        return new TransactionInfo();
    }

    /**
     * Create an instance of {@link CarrierCode }
     * 
     */
    public CarrierCode createCarrierCode() {
        return new CarrierCode();
    }

    /**
     * Create an instance of {@link ArrayOfCarrierCode }
     * 
     */
    public ArrayOfCarrierCode createArrayOfCarrierCode() {
        return new ArrayOfCarrierCode();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "TransactionInfo")
    public JAXBElement<TransactionInfo> createTransactionInfo(TransactionInfo value) {
        return new JAXBElement<TransactionInfo>(_TransactionInfo_QNAME, TransactionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "CarrierCode")
    public JAXBElement<CarrierCode> createCarrierCode(CarrierCode value) {
        return new JAXBElement<CarrierCode>(_CarrierCode_QNAME, CarrierCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerationsPaymentMethodTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "Enumerations.PaymentMethodTypes")
    public JAXBElement<EnumerationsPaymentMethodTypes> createEnumerationsPaymentMethodTypes(EnumerationsPaymentMethodTypes value) {
        return new JAXBElement<EnumerationsPaymentMethodTypes>(_EnumerationsPaymentMethodTypes_QNAME, EnumerationsPaymentMethodTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerationsGenderTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "Enumerations.GenderTypes")
    public JAXBElement<EnumerationsGenderTypes> createEnumerationsGenderTypes(EnumerationsGenderTypes value) {
        return new JAXBElement<EnumerationsGenderTypes>(_EnumerationsGenderTypes_QNAME, EnumerationsGenderTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "ReservationInfo")
    public JAXBElement<ReservationInfo> createReservationInfo(ReservationInfo value) {
        return new JAXBElement<ReservationInfo>(_ReservationInfo_QNAME, ReservationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerationsSSRStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "Enumerations.SSRStatus")
    public JAXBElement<EnumerationsSSRStatus> createEnumerationsSSRStatus(EnumerationsSSRStatus value) {
        return new JAXBElement<EnumerationsSSRStatus>(_EnumerationsSSRStatus_QNAME, EnumerationsSSRStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerationsCurrencyCodeTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "Enumerations.CurrencyCodeTypes")
    public JAXBElement<EnumerationsCurrencyCodeTypes> createEnumerationsCurrencyCodeTypes(EnumerationsCurrencyCodeTypes value) {
        return new JAXBElement<EnumerationsCurrencyCodeTypes>(_EnumerationsCurrencyCodeTypes_QNAME, EnumerationsCurrencyCodeTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerationsImportBookingAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "Enumerations.ImportBookingAction")
    public JAXBElement<EnumerationsImportBookingAction> createEnumerationsImportBookingAction(EnumerationsImportBookingAction value) {
        return new JAXBElement<EnumerationsImportBookingAction>(_EnumerationsImportBookingAction_QNAME, EnumerationsImportBookingAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerationsRelationshipTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "Enumerations.RelationshipTypes")
    public JAXBElement<EnumerationsRelationshipTypes> createEnumerationsRelationshipTypes(EnumerationsRelationshipTypes value) {
        return new JAXBElement<EnumerationsRelationshipTypes>(_EnumerationsRelationshipTypes_QNAME, EnumerationsRelationshipTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCarrierCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "ArrayOfCarrierCode")
    public JAXBElement<ArrayOfCarrierCode> createArrayOfCarrierCode(ArrayOfCarrierCode value) {
        return new JAXBElement<ArrayOfCarrierCode>(_ArrayOfCarrierCode_QNAME, ArrayOfCarrierCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerationsContactTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "Enumerations.ContactTypes")
    public JAXBElement<EnumerationsContactTypes> createEnumerationsContactTypes(EnumerationsContactTypes value) {
        return new JAXBElement<EnumerationsContactTypes>(_EnumerationsContactTypes_QNAME, EnumerationsContactTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerationsReservationChannelTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "Enumerations.ReservationChannelTypes")
    public JAXBElement<EnumerationsReservationChannelTypes> createEnumerationsReservationChannelTypes(EnumerationsReservationChannelTypes value) {
        return new JAXBElement<EnumerationsReservationChannelTypes>(_EnumerationsReservationChannelTypes_QNAME, EnumerationsReservationChannelTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "ReservationChannel", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoReservationChannel(String value) {
        return new JAXBElement<String>(_TransactionInfoReservationChannel_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "IATA", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoIATA(String value) {
        return new JAXBElement<String>(_TransactionInfoIATA_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "Office", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoOffice(String value) {
        return new JAXBElement<String>(_TransactionInfoOffice_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "ClientIPAddress", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoClientIPAddress(String value) {
        return new JAXBElement<String>(_TransactionInfoClientIPAddress_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "ChannelType", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoChannelType(String value) {
        return new JAXBElement<String>(_TransactionInfoChannelType_QNAME, String.class, TransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", name = "HistoricUserName", scope = TransactionInfo.class)
    public JAXBElement<String> createTransactionInfoHistoricUserName(String value) {
        return new JAXBElement<String>(_TransactionInfoHistoricUserName_QNAME, String.class, TransactionInfo.class, value);
    }

}

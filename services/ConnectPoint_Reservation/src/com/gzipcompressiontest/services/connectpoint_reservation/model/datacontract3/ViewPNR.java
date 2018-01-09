/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract3;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.EnumerationsCurrencyCodeTypes;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract5.ExceptionInformationExceptions;


/**
 * <p>Java class for ViewPNR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewPNR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeriesNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravelGroupID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalAppID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebBookingID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionalID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PromotionalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecieptLanguageID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReservationCurrency" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}Enumerations.CurrencyCodeTypes" minOccurs="0"/>
 *         &lt;element name="ProfileID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PNRPin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BookDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReservationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TodaysDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReservationExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CorporationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasTickets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValuePackageData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManageBookingAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HistoricConfirmationNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cabin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChangeFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LogicalFlightCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActivePassengerCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BalancedReservation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReservationFulfillmentRequiredByGMT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReservationFulfillmentRequiredByODT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsInterline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCodeShare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Airlines" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfAirline" minOccurs="0"/>
 *         &lt;element name="Payments" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfPayment" minOccurs="0"/>
 *         &lt;element name="FlightGroups" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfFlightGroup" minOccurs="0"/>
 *         &lt;element name="FareGroups" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfFareGroup" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfComment" minOccurs="0"/>
 *         &lt;element name="ReservationContacts" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfReservationContact" minOccurs="0"/>
 *         &lt;element name="ContactInfos" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfContactInfo" minOccurs="0"/>
 *         &lt;element name="DocumentInfos" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfDocumentInfo" minOccurs="0"/>
 *         &lt;element name="Vouchers" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfVoucher" minOccurs="0"/>
 *         &lt;element name="Cars" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfCar" minOccurs="0"/>
 *         &lt;element name="Hotels" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfHotel" minOccurs="0"/>
 *         &lt;element name="Packages" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfPackage" minOccurs="0"/>
 *         &lt;element name="Exceptions" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Exceptions}ExceptionInformation.Exceptions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewPNR", propOrder = {
    "key",
    "seriesNumber",
    "confirmationNumber",
    "bookingAgent",
    "crsCode",
    "travelGroupID",
    "iataNumber",
    "externalAppID",
    "webBookingID",
    "promotionalID",
    "promotionalCode",
    "recieptLanguageID",
    "reservationCurrency",
    "profileID",
    "pnrPin",
    "bookDate",
    "reservationType",
    "todaysDate",
    "lastModified",
    "reservationExpirationDate",
    "corporationID",
    "securityGuid",
    "hasTickets",
    "valuePackageData",
    "userIPAddress",
    "manageBookingAgent",
    "historicConfirmationNum",
    "cabin",
    "reservationBalance",
    "changeFee",
    "logicalFlightCount",
    "activePassengerCount",
    "balancedReservation",
    "reservationFulfillmentRequiredByGMT",
    "reservationFulfillmentRequiredByODT",
    "isInterline",
    "isCodeShare",
    "airlines",
    "payments",
    "flightGroups",
    "fareGroups",
    "comments",
    "reservationContacts",
    "contactInfos",
    "documentInfos",
    "vouchers",
    "cars",
    "hotels",
    "packages",
    "exceptions"
})
public class ViewPNR {

    @XmlElementRef(name = "Key", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> key;
    @XmlElementRef(name = "SeriesNumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seriesNumber;
    @XmlElementRef(name = "ConfirmationNumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> confirmationNumber;
    @XmlElementRef(name = "BookingAgent", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingAgent;
    @XmlElementRef(name = "CRSCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crsCode;
    @XmlElement(name = "TravelGroupID")
    protected Integer travelGroupID;
    @XmlElementRef(name = "IATANumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iataNumber;
    @XmlElementRef(name = "ExternalAppID", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalAppID;
    @XmlElementRef(name = "WebBookingID", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webBookingID;
    @XmlElement(name = "PromotionalID")
    protected Integer promotionalID;
    @XmlElementRef(name = "PromotionalCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promotionalCode;
    @XmlElement(name = "RecieptLanguageID")
    protected Integer recieptLanguageID;
    @XmlElement(name = "ReservationCurrency")
    protected EnumerationsCurrencyCodeTypes reservationCurrency;
    @XmlElement(name = "ProfileID")
    protected Long profileID;
    @XmlElement(name = "PNRPin")
    protected Long pnrPin;
    @XmlElement(name = "BookDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bookDate;
    @XmlElementRef(name = "ReservationType", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reservationType;
    @XmlElement(name = "TodaysDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar todaysDate;
    @XmlElement(name = "LastModified")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlElement(name = "ReservationExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reservationExpirationDate;
    @XmlElementRef(name = "CorporationID", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corporationID;
    @XmlElementRef(name = "SecurityGuid", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> securityGuid;
    @XmlElement(name = "HasTickets")
    protected Boolean hasTickets;
    @XmlElementRef(name = "ValuePackageData", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valuePackageData;
    @XmlElementRef(name = "UserIPAddress", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userIPAddress;
    @XmlElementRef(name = "ManageBookingAgent", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manageBookingAgent;
    @XmlElementRef(name = "HistoricConfirmationNum", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> historicConfirmationNum;
    @XmlElementRef(name = "Cabin", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cabin;
    @XmlElement(name = "ReservationBalance")
    protected BigDecimal reservationBalance;
    @XmlElement(name = "ChangeFee")
    protected BigDecimal changeFee;
    @XmlElement(name = "LogicalFlightCount")
    protected Integer logicalFlightCount;
    @XmlElement(name = "ActivePassengerCount")
    protected Integer activePassengerCount;
    @XmlElement(name = "BalancedReservation")
    protected Boolean balancedReservation;
    @XmlElement(name = "ReservationFulfillmentRequiredByGMT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reservationFulfillmentRequiredByGMT;
    @XmlElement(name = "ReservationFulfillmentRequiredByODT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reservationFulfillmentRequiredByODT;
    @XmlElement(name = "IsInterline")
    protected Boolean isInterline;
    @XmlElement(name = "IsCodeShare")
    protected Boolean isCodeShare;
    @XmlElementRef(name = "Airlines", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAirline> airlines;
    @XmlElementRef(name = "Payments", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPayment> payments;
    @XmlElementRef(name = "FlightGroups", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFlightGroup> flightGroups;
    @XmlElementRef(name = "FareGroups", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFareGroup> fareGroups;
    @XmlElementRef(name = "Comments", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfComment> comments;
    @XmlElementRef(name = "ReservationContacts", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReservationContact> reservationContacts;
    @XmlElementRef(name = "ContactInfos", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfContactInfo> contactInfos;
    @XmlElementRef(name = "DocumentInfos", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDocumentInfo> documentInfos;
    @XmlElementRef(name = "Vouchers", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVoucher> vouchers;
    @XmlElementRef(name = "Cars", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCar> cars;
    @XmlElementRef(name = "Hotels", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHotel> hotels;
    @XmlElementRef(name = "Packages", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPackage> packages;
    @XmlElement(name = "Exceptions", required = true, nillable = true)
    protected ExceptionInformationExceptions exceptions;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKey(JAXBElement<String> value) {
        this.key = value;
    }

    /**
     * Gets the value of the seriesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeriesNumber() {
        return seriesNumber;
    }

    /**
     * Sets the value of the seriesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeriesNumber(JAXBElement<String> value) {
        this.seriesNumber = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConfirmationNumber(JAXBElement<String> value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the bookingAgent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookingAgent() {
        return bookingAgent;
    }

    /**
     * Sets the value of the bookingAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookingAgent(JAXBElement<String> value) {
        this.bookingAgent = value;
    }

    /**
     * Gets the value of the crsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCRSCode() {
        return crsCode;
    }

    /**
     * Sets the value of the crsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCRSCode(JAXBElement<String> value) {
        this.crsCode = value;
    }

    /**
     * Gets the value of the travelGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTravelGroupID() {
        return travelGroupID;
    }

    /**
     * Sets the value of the travelGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTravelGroupID(Integer value) {
        this.travelGroupID = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIATANumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIATANumber(JAXBElement<String> value) {
        this.iataNumber = value;
    }

    /**
     * Gets the value of the externalAppID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalAppID() {
        return externalAppID;
    }

    /**
     * Sets the value of the externalAppID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalAppID(JAXBElement<String> value) {
        this.externalAppID = value;
    }

    /**
     * Gets the value of the webBookingID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebBookingID() {
        return webBookingID;
    }

    /**
     * Sets the value of the webBookingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebBookingID(JAXBElement<String> value) {
        this.webBookingID = value;
    }

    /**
     * Gets the value of the promotionalID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPromotionalID() {
        return promotionalID;
    }

    /**
     * Sets the value of the promotionalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPromotionalID(Integer value) {
        this.promotionalID = value;
    }

    /**
     * Gets the value of the promotionalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromotionalCode() {
        return promotionalCode;
    }

    /**
     * Sets the value of the promotionalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromotionalCode(JAXBElement<String> value) {
        this.promotionalCode = value;
    }

    /**
     * Gets the value of the recieptLanguageID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecieptLanguageID() {
        return recieptLanguageID;
    }

    /**
     * Sets the value of the recieptLanguageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecieptLanguageID(Integer value) {
        this.recieptLanguageID = value;
    }

    /**
     * Gets the value of the reservationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link EnumerationsCurrencyCodeTypes }
     *     
     */
    public EnumerationsCurrencyCodeTypes getReservationCurrency() {
        return reservationCurrency;
    }

    /**
     * Sets the value of the reservationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationsCurrencyCodeTypes }
     *     
     */
    public void setReservationCurrency(EnumerationsCurrencyCodeTypes value) {
        this.reservationCurrency = value;
    }

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProfileID(Long value) {
        this.profileID = value;
    }

    /**
     * Gets the value of the pnrPin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPNRPin() {
        return pnrPin;
    }

    /**
     * Sets the value of the pnrPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPNRPin(Long value) {
        this.pnrPin = value;
    }

    /**
     * Gets the value of the bookDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookDate() {
        return bookDate;
    }

    /**
     * Sets the value of the bookDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookDate(XMLGregorianCalendar value) {
        this.bookDate = value;
    }

    /**
     * Gets the value of the reservationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReservationType() {
        return reservationType;
    }

    /**
     * Sets the value of the reservationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReservationType(JAXBElement<String> value) {
        this.reservationType = value;
    }

    /**
     * Gets the value of the todaysDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTodaysDate() {
        return todaysDate;
    }

    /**
     * Sets the value of the todaysDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTodaysDate(XMLGregorianCalendar value) {
        this.todaysDate = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the reservationExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReservationExpirationDate() {
        return reservationExpirationDate;
    }

    /**
     * Sets the value of the reservationExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReservationExpirationDate(XMLGregorianCalendar value) {
        this.reservationExpirationDate = value;
    }

    /**
     * Gets the value of the corporationID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorporationID() {
        return corporationID;
    }

    /**
     * Sets the value of the corporationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorporationID(JAXBElement<String> value) {
        this.corporationID = value;
    }

    /**
     * Gets the value of the securityGuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecurityGuid() {
        return securityGuid;
    }

    /**
     * Sets the value of the securityGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecurityGuid(JAXBElement<String> value) {
        this.securityGuid = value;
    }

    /**
     * Gets the value of the hasTickets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasTickets() {
        return hasTickets;
    }

    /**
     * Sets the value of the hasTickets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasTickets(Boolean value) {
        this.hasTickets = value;
    }

    /**
     * Gets the value of the valuePackageData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValuePackageData() {
        return valuePackageData;
    }

    /**
     * Sets the value of the valuePackageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValuePackageData(JAXBElement<String> value) {
        this.valuePackageData = value;
    }

    /**
     * Gets the value of the userIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserIPAddress() {
        return userIPAddress;
    }

    /**
     * Sets the value of the userIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserIPAddress(JAXBElement<String> value) {
        this.userIPAddress = value;
    }

    /**
     * Gets the value of the manageBookingAgent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManageBookingAgent() {
        return manageBookingAgent;
    }

    /**
     * Sets the value of the manageBookingAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManageBookingAgent(JAXBElement<String> value) {
        this.manageBookingAgent = value;
    }

    /**
     * Gets the value of the historicConfirmationNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHistoricConfirmationNum() {
        return historicConfirmationNum;
    }

    /**
     * Sets the value of the historicConfirmationNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHistoricConfirmationNum(JAXBElement<String> value) {
        this.historicConfirmationNum = value;
    }

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCabin() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCabin(JAXBElement<String> value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the reservationBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReservationBalance() {
        return reservationBalance;
    }

    /**
     * Sets the value of the reservationBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReservationBalance(BigDecimal value) {
        this.reservationBalance = value;
    }

    /**
     * Gets the value of the changeFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChangeFee() {
        return changeFee;
    }

    /**
     * Sets the value of the changeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChangeFee(BigDecimal value) {
        this.changeFee = value;
    }

    /**
     * Gets the value of the logicalFlightCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogicalFlightCount() {
        return logicalFlightCount;
    }

    /**
     * Sets the value of the logicalFlightCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogicalFlightCount(Integer value) {
        this.logicalFlightCount = value;
    }

    /**
     * Gets the value of the activePassengerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActivePassengerCount() {
        return activePassengerCount;
    }

    /**
     * Sets the value of the activePassengerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActivePassengerCount(Integer value) {
        this.activePassengerCount = value;
    }

    /**
     * Gets the value of the balancedReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalancedReservation() {
        return balancedReservation;
    }

    /**
     * Sets the value of the balancedReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalancedReservation(Boolean value) {
        this.balancedReservation = value;
    }

    /**
     * Gets the value of the reservationFulfillmentRequiredByGMT property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReservationFulfillmentRequiredByGMT() {
        return reservationFulfillmentRequiredByGMT;
    }

    /**
     * Sets the value of the reservationFulfillmentRequiredByGMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReservationFulfillmentRequiredByGMT(XMLGregorianCalendar value) {
        this.reservationFulfillmentRequiredByGMT = value;
    }

    /**
     * Gets the value of the reservationFulfillmentRequiredByODT property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReservationFulfillmentRequiredByODT() {
        return reservationFulfillmentRequiredByODT;
    }

    /**
     * Sets the value of the reservationFulfillmentRequiredByODT property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReservationFulfillmentRequiredByODT(XMLGregorianCalendar value) {
        this.reservationFulfillmentRequiredByODT = value;
    }

    /**
     * Gets the value of the isInterline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInterline() {
        return isInterline;
    }

    /**
     * Sets the value of the isInterline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInterline(Boolean value) {
        this.isInterline = value;
    }

    /**
     * Gets the value of the isCodeShare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCodeShare() {
        return isCodeShare;
    }

    /**
     * Sets the value of the isCodeShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCodeShare(Boolean value) {
        this.isCodeShare = value;
    }

    /**
     * Gets the value of the airlines property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAirline }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAirline> getAirlines() {
        return airlines;
    }

    /**
     * Sets the value of the airlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAirline }{@code >}
     *     
     */
    public void setAirlines(JAXBElement<ArrayOfAirline> value) {
        this.airlines = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPayment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPayment> getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPayment }{@code >}
     *     
     */
    public void setPayments(JAXBElement<ArrayOfPayment> value) {
        this.payments = value;
    }

    /**
     * Gets the value of the flightGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlightGroup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFlightGroup> getFlightGroups() {
        return flightGroups;
    }

    /**
     * Sets the value of the flightGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlightGroup }{@code >}
     *     
     */
    public void setFlightGroups(JAXBElement<ArrayOfFlightGroup> value) {
        this.flightGroups = value;
    }

    /**
     * Gets the value of the fareGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFareGroup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFareGroup> getFareGroups() {
        return fareGroups;
    }

    /**
     * Sets the value of the fareGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFareGroup }{@code >}
     *     
     */
    public void setFareGroups(JAXBElement<ArrayOfFareGroup> value) {
        this.fareGroups = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfComment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfComment> getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfComment }{@code >}
     *     
     */
    public void setComments(JAXBElement<ArrayOfComment> value) {
        this.comments = value;
    }

    /**
     * Gets the value of the reservationContacts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReservationContact }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReservationContact> getReservationContacts() {
        return reservationContacts;
    }

    /**
     * Sets the value of the reservationContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReservationContact }{@code >}
     *     
     */
    public void setReservationContacts(JAXBElement<ArrayOfReservationContact> value) {
        this.reservationContacts = value;
    }

    /**
     * Gets the value of the contactInfos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContactInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfContactInfo> getContactInfos() {
        return contactInfos;
    }

    /**
     * Sets the value of the contactInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContactInfo }{@code >}
     *     
     */
    public void setContactInfos(JAXBElement<ArrayOfContactInfo> value) {
        this.contactInfos = value;
    }

    /**
     * Gets the value of the documentInfos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumentInfo> getDocumentInfos() {
        return documentInfos;
    }

    /**
     * Sets the value of the documentInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentInfo }{@code >}
     *     
     */
    public void setDocumentInfos(JAXBElement<ArrayOfDocumentInfo> value) {
        this.documentInfos = value;
    }

    /**
     * Gets the value of the vouchers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVoucher }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVoucher> getVouchers() {
        return vouchers;
    }

    /**
     * Sets the value of the vouchers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVoucher }{@code >}
     *     
     */
    public void setVouchers(JAXBElement<ArrayOfVoucher> value) {
        this.vouchers = value;
    }

    /**
     * Gets the value of the cars property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCar }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCar> getCars() {
        return cars;
    }

    /**
     * Sets the value of the cars property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCar }{@code >}
     *     
     */
    public void setCars(JAXBElement<ArrayOfCar> value) {
        this.cars = value;
    }

    /**
     * Gets the value of the hotels property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHotel> getHotels() {
        return hotels;
    }

    /**
     * Sets the value of the hotels property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHotel }{@code >}
     *     
     */
    public void setHotels(JAXBElement<ArrayOfHotel> value) {
        this.hotels = value;
    }

    /**
     * Gets the value of the packages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPackage }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPackage> getPackages() {
        return packages;
    }

    /**
     * Sets the value of the packages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPackage }{@code >}
     *     
     */
    public void setPackages(JAXBElement<ArrayOfPackage> value) {
        this.packages = value;
    }

    /**
     * Gets the value of the exceptions property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionInformationExceptions }
     *     
     */
    public ExceptionInformationExceptions getExceptions() {
        return exceptions;
    }

    /**
     * Sets the value of the exceptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionInformationExceptions }
     *     
     */
    public void setExceptions(ExceptionInformationExceptions value) {
        this.exceptions = value;
    }

}

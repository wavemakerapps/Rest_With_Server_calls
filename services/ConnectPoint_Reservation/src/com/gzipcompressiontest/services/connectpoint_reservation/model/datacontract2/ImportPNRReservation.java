/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.EnumerationsCurrencyCodeTypes;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.EnumerationsImportBookingAction;


/**
 * <p>Java class for ImportPNR.Reservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportPNR.Reservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeriesNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BookingAction" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}Enumerations.ImportBookingAction"/>
 *         &lt;element name="BookingCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IATANumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExternalAppID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExternalBookingReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OriginalBookingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReservationCurrency" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}Enumerations.CurrencyCodeTypes"/>
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PromoCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RecieptLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReservationChannel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Segments" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfImportPNR.Reservation.Segment"/>
 *         &lt;element name="Persons" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfImportPNR.Reservation.Person"/>
 *         &lt;element name="Comments" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfImportPNR.Reservation.Comment"/>
 *         &lt;element name="Errors" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfImportPNR.Reservation.ImportError"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportPNR.Reservation", propOrder = {
    "seriesNumber",
    "confirmationNumber",
    "bookingAction",
    "bookingCarrier",
    "iataNumber",
    "externalAppID",
    "externalBookingReference",
    "originalBookingDate",
    "reservationCurrency",
    "user",
    "promoCode",
    "recieptLanguageCode",
    "reservationChannel",
    "segments",
    "persons",
    "comments",
    "errors"
})
public class ImportPNRReservation {

    @XmlElement(name = "SeriesNumber", required = true, nillable = true)
    protected String seriesNumber;
    @XmlElement(name = "ConfirmationNumber", required = true, nillable = true)
    protected String confirmationNumber;
    @XmlElement(name = "BookingAction", required = true)
    protected EnumerationsImportBookingAction bookingAction;
    @XmlElement(name = "BookingCarrier", required = true, nillable = true)
    protected String bookingCarrier;
    @XmlElement(name = "IATANumber", required = true, nillable = true)
    protected String iataNumber;
    @XmlElement(name = "ExternalAppID", required = true, nillable = true)
    protected String externalAppID;
    @XmlElement(name = "ExternalBookingReference", required = true, nillable = true)
    protected String externalBookingReference;
    @XmlElement(name = "OriginalBookingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalBookingDate;
    @XmlElement(name = "ReservationCurrency", required = true)
    protected EnumerationsCurrencyCodeTypes reservationCurrency;
    @XmlElement(name = "User", required = true, nillable = true)
    protected String user;
    @XmlElement(name = "PromoCode", required = true, nillable = true)
    protected String promoCode;
    @XmlElement(name = "RecieptLanguageCode", required = true, nillable = true)
    protected String recieptLanguageCode;
    @XmlElement(name = "ReservationChannel")
    protected int reservationChannel;
    @XmlElement(name = "Segments", required = true, nillable = true)
    protected ArrayOfImportPNRReservationSegment segments;
    @XmlElement(name = "Persons", required = true, nillable = true)
    protected ArrayOfImportPNRReservationPerson persons;
    @XmlElement(name = "Comments", required = true, nillable = true)
    protected ArrayOfImportPNRReservationComment comments;
    @XmlElement(name = "Errors", required = true, nillable = true)
    protected ArrayOfImportPNRReservationImportError errors;

    /**
     * Gets the value of the seriesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesNumber() {
        return seriesNumber;
    }

    /**
     * Sets the value of the seriesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesNumber(String value) {
        this.seriesNumber = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the bookingAction property.
     * 
     * @return
     *     possible object is
     *     {@link EnumerationsImportBookingAction }
     *     
     */
    public EnumerationsImportBookingAction getBookingAction() {
        return bookingAction;
    }

    /**
     * Sets the value of the bookingAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationsImportBookingAction }
     *     
     */
    public void setBookingAction(EnumerationsImportBookingAction value) {
        this.bookingAction = value;
    }

    /**
     * Gets the value of the bookingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCarrier() {
        return bookingCarrier;
    }

    /**
     * Sets the value of the bookingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCarrier(String value) {
        this.bookingCarrier = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATANumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATANumber(String value) {
        this.iataNumber = value;
    }

    /**
     * Gets the value of the externalAppID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAppID() {
        return externalAppID;
    }

    /**
     * Sets the value of the externalAppID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAppID(String value) {
        this.externalAppID = value;
    }

    /**
     * Gets the value of the externalBookingReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalBookingReference() {
        return externalBookingReference;
    }

    /**
     * Sets the value of the externalBookingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalBookingReference(String value) {
        this.externalBookingReference = value;
    }

    /**
     * Gets the value of the originalBookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalBookingDate() {
        return originalBookingDate;
    }

    /**
     * Sets the value of the originalBookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalBookingDate(XMLGregorianCalendar value) {
        this.originalBookingDate = value;
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
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the recieptLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecieptLanguageCode() {
        return recieptLanguageCode;
    }

    /**
     * Sets the value of the recieptLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecieptLanguageCode(String value) {
        this.recieptLanguageCode = value;
    }

    /**
     * Gets the value of the reservationChannel property.
     * 
     */
    public int getReservationChannel() {
        return reservationChannel;
    }

    /**
     * Sets the value of the reservationChannel property.
     * 
     */
    public void setReservationChannel(int value) {
        this.reservationChannel = value;
    }

    /**
     * Gets the value of the segments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImportPNRReservationSegment }
     *     
     */
    public ArrayOfImportPNRReservationSegment getSegments() {
        return segments;
    }

    /**
     * Sets the value of the segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImportPNRReservationSegment }
     *     
     */
    public void setSegments(ArrayOfImportPNRReservationSegment value) {
        this.segments = value;
    }

    /**
     * Gets the value of the persons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImportPNRReservationPerson }
     *     
     */
    public ArrayOfImportPNRReservationPerson getPersons() {
        return persons;
    }

    /**
     * Sets the value of the persons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImportPNRReservationPerson }
     *     
     */
    public void setPersons(ArrayOfImportPNRReservationPerson value) {
        this.persons = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImportPNRReservationComment }
     *     
     */
    public ArrayOfImportPNRReservationComment getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImportPNRReservationComment }
     *     
     */
    public void setComments(ArrayOfImportPNRReservationComment value) {
        this.comments = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImportPNRReservationImportError }
     *     
     */
    public ArrayOfImportPNRReservationImportError getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImportPNRReservationImportError }
     *     
     */
    public void setErrors(ArrayOfImportPNRReservationImportError value) {
        this.errors = value;
    }

}

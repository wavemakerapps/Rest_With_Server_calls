/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SeatAssignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatAssignment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhysicalFlightID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActualDepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduledDeparturetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ScheduledArrivaltime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BoardingPassNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Seat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RowNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldSeat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldRowNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Boarded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CheckInAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckInDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CouponStatusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BoardingSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BoardingPassPrinted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FrequentFlyerCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrequentFlyerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrequentFlyerSSRCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrequentFlyerMemberTierLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrequentFlyerMemberRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrequentFlyerNumberActionTracker" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReservationChannelID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FrequentFlyerInfoReservationChannelID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FrequentFlyerNumberLAstModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatAssignment", propOrder = {
    "key",
    "physicalFlightID",
    "actualDepartureDate",
    "flightNumber",
    "scheduledDeparturetime",
    "scheduledArrivaltime",
    "boardingPassNumber",
    "seat",
    "rowNumber",
    "gate",
    "oldSeat",
    "oldRowNumber",
    "boarded",
    "checkInAgent",
    "checkInDate",
    "couponStatusIndicator",
    "boardingSequence",
    "lastModifiedDate",
    "boardingPassPrinted",
    "frequentFlyerCarrierCode",
    "frequentFlyerNumber",
    "frequentFlyerSSRCode",
    "frequentFlyerMemberTierLevel",
    "frequentFlyerMemberRating",
    "frequentFlyerNumberActionTracker",
    "reservationChannelID",
    "frequentFlyerInfoReservationChannelID",
    "frequentFlyerNumberLAstModifiedDate"
})
public class SeatAssignment {

    @XmlElementRef(name = "Key", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> key;
    @XmlElement(name = "PhysicalFlightID")
    protected Integer physicalFlightID;
    @XmlElement(name = "ActualDepartureDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDepartureDate;
    @XmlElementRef(name = "FlightNumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightNumber;
    @XmlElement(name = "ScheduledDeparturetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDeparturetime;
    @XmlElement(name = "ScheduledArrivaltime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrivaltime;
    @XmlElement(name = "BoardingPassNumber")
    protected Integer boardingPassNumber;
    @XmlElementRef(name = "Seat", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seat;
    @XmlElement(name = "RowNumber")
    protected Integer rowNumber;
    @XmlElementRef(name = "Gate", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gate;
    @XmlElementRef(name = "OldSeat", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oldSeat;
    @XmlElement(name = "OldRowNumber")
    protected Integer oldRowNumber;
    @XmlElement(name = "Boarded")
    protected Boolean boarded;
    @XmlElementRef(name = "CheckInAgent", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> checkInAgent;
    @XmlElement(name = "CheckInDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkInDate;
    @XmlElementRef(name = "CouponStatusIndicator", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> couponStatusIndicator;
    @XmlElementRef(name = "BoardingSequence", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> boardingSequence;
    @XmlElement(name = "LastModifiedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "BoardingPassPrinted")
    protected Integer boardingPassPrinted;
    @XmlElementRef(name = "FrequentFlyerCarrierCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> frequentFlyerCarrierCode;
    @XmlElementRef(name = "FrequentFlyerNumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> frequentFlyerNumber;
    @XmlElementRef(name = "FrequentFlyerSSRCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> frequentFlyerSSRCode;
    @XmlElementRef(name = "FrequentFlyerMemberTierLevel", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> frequentFlyerMemberTierLevel;
    @XmlElementRef(name = "FrequentFlyerMemberRating", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> frequentFlyerMemberRating;
    @XmlElement(name = "FrequentFlyerNumberActionTracker")
    protected Integer frequentFlyerNumberActionTracker;
    @XmlElement(name = "ReservationChannelID")
    protected Integer reservationChannelID;
    @XmlElement(name = "FrequentFlyerInfoReservationChannelID")
    protected Integer frequentFlyerInfoReservationChannelID;
    @XmlElement(name = "FrequentFlyerNumberLAstModifiedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar frequentFlyerNumberLAstModifiedDate;

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
     * Gets the value of the physicalFlightID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhysicalFlightID() {
        return physicalFlightID;
    }

    /**
     * Sets the value of the physicalFlightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhysicalFlightID(Integer value) {
        this.physicalFlightID = value;
    }

    /**
     * Gets the value of the actualDepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDepartureDate() {
        return actualDepartureDate;
    }

    /**
     * Sets the value of the actualDepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDepartureDate(XMLGregorianCalendar value) {
        this.actualDepartureDate = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlightNumber(JAXBElement<String> value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the scheduledDeparturetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDeparturetime() {
        return scheduledDeparturetime;
    }

    /**
     * Sets the value of the scheduledDeparturetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDeparturetime(XMLGregorianCalendar value) {
        this.scheduledDeparturetime = value;
    }

    /**
     * Gets the value of the scheduledArrivaltime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledArrivaltime() {
        return scheduledArrivaltime;
    }

    /**
     * Sets the value of the scheduledArrivaltime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledArrivaltime(XMLGregorianCalendar value) {
        this.scheduledArrivaltime = value;
    }

    /**
     * Gets the value of the boardingPassNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoardingPassNumber() {
        return boardingPassNumber;
    }

    /**
     * Sets the value of the boardingPassNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoardingPassNumber(Integer value) {
        this.boardingPassNumber = value;
    }

    /**
     * Gets the value of the seat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeat() {
        return seat;
    }

    /**
     * Sets the value of the seat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeat(JAXBElement<String> value) {
        this.seat = value;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowNumber(Integer value) {
        this.rowNumber = value;
    }

    /**
     * Gets the value of the gate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGate() {
        return gate;
    }

    /**
     * Sets the value of the gate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGate(JAXBElement<String> value) {
        this.gate = value;
    }

    /**
     * Gets the value of the oldSeat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOldSeat() {
        return oldSeat;
    }

    /**
     * Sets the value of the oldSeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOldSeat(JAXBElement<String> value) {
        this.oldSeat = value;
    }

    /**
     * Gets the value of the oldRowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOldRowNumber() {
        return oldRowNumber;
    }

    /**
     * Sets the value of the oldRowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOldRowNumber(Integer value) {
        this.oldRowNumber = value;
    }

    /**
     * Gets the value of the boarded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoarded() {
        return boarded;
    }

    /**
     * Sets the value of the boarded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoarded(Boolean value) {
        this.boarded = value;
    }

    /**
     * Gets the value of the checkInAgent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckInAgent() {
        return checkInAgent;
    }

    /**
     * Sets the value of the checkInAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckInAgent(JAXBElement<String> value) {
        this.checkInAgent = value;
    }

    /**
     * Gets the value of the checkInDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckInDate() {
        return checkInDate;
    }

    /**
     * Sets the value of the checkInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckInDate(XMLGregorianCalendar value) {
        this.checkInDate = value;
    }

    /**
     * Gets the value of the couponStatusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCouponStatusIndicator() {
        return couponStatusIndicator;
    }

    /**
     * Sets the value of the couponStatusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCouponStatusIndicator(JAXBElement<String> value) {
        this.couponStatusIndicator = value;
    }

    /**
     * Gets the value of the boardingSequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBoardingSequence() {
        return boardingSequence;
    }

    /**
     * Sets the value of the boardingSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBoardingSequence(JAXBElement<String> value) {
        this.boardingSequence = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the boardingPassPrinted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoardingPassPrinted() {
        return boardingPassPrinted;
    }

    /**
     * Sets the value of the boardingPassPrinted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoardingPassPrinted(Integer value) {
        this.boardingPassPrinted = value;
    }

    /**
     * Gets the value of the frequentFlyerCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrequentFlyerCarrierCode() {
        return frequentFlyerCarrierCode;
    }

    /**
     * Sets the value of the frequentFlyerCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrequentFlyerCarrierCode(JAXBElement<String> value) {
        this.frequentFlyerCarrierCode = value;
    }

    /**
     * Gets the value of the frequentFlyerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrequentFlyerNumber() {
        return frequentFlyerNumber;
    }

    /**
     * Sets the value of the frequentFlyerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrequentFlyerNumber(JAXBElement<String> value) {
        this.frequentFlyerNumber = value;
    }

    /**
     * Gets the value of the frequentFlyerSSRCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrequentFlyerSSRCode() {
        return frequentFlyerSSRCode;
    }

    /**
     * Sets the value of the frequentFlyerSSRCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrequentFlyerSSRCode(JAXBElement<String> value) {
        this.frequentFlyerSSRCode = value;
    }

    /**
     * Gets the value of the frequentFlyerMemberTierLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrequentFlyerMemberTierLevel() {
        return frequentFlyerMemberTierLevel;
    }

    /**
     * Sets the value of the frequentFlyerMemberTierLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrequentFlyerMemberTierLevel(JAXBElement<String> value) {
        this.frequentFlyerMemberTierLevel = value;
    }

    /**
     * Gets the value of the frequentFlyerMemberRating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrequentFlyerMemberRating() {
        return frequentFlyerMemberRating;
    }

    /**
     * Sets the value of the frequentFlyerMemberRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrequentFlyerMemberRating(JAXBElement<String> value) {
        this.frequentFlyerMemberRating = value;
    }

    /**
     * Gets the value of the frequentFlyerNumberActionTracker property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrequentFlyerNumberActionTracker() {
        return frequentFlyerNumberActionTracker;
    }

    /**
     * Sets the value of the frequentFlyerNumberActionTracker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrequentFlyerNumberActionTracker(Integer value) {
        this.frequentFlyerNumberActionTracker = value;
    }

    /**
     * Gets the value of the reservationChannelID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReservationChannelID() {
        return reservationChannelID;
    }

    /**
     * Sets the value of the reservationChannelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReservationChannelID(Integer value) {
        this.reservationChannelID = value;
    }

    /**
     * Gets the value of the frequentFlyerInfoReservationChannelID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrequentFlyerInfoReservationChannelID() {
        return frequentFlyerInfoReservationChannelID;
    }

    /**
     * Sets the value of the frequentFlyerInfoReservationChannelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrequentFlyerInfoReservationChannelID(Integer value) {
        this.frequentFlyerInfoReservationChannelID = value;
    }

    /**
     * Gets the value of the frequentFlyerNumberLAstModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrequentFlyerNumberLAstModifiedDate() {
        return frequentFlyerNumberLAstModifiedDate;
    }

    /**
     * Sets the value of the frequentFlyerNumberLAstModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrequentFlyerNumberLAstModifiedDate(XMLGregorianCalendar value) {
        this.frequentFlyerNumberLAstModifiedDate = value;
    }

}

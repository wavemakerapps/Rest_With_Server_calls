/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.EnumerationsCurrencyCodeTypes;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.ReservationInfo;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.TransactionInfo;


/**
 * <p>Java class for SummaryPNR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryPNR">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}TransactionInfo">
 *       &lt;sequence>
 *         &lt;element name="ActionType" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}SummaryPNR.ActionTypes"/>
 *         &lt;element name="ReservationInfo" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}ReservationInfo"/>
 *         &lt;element name="SecurityToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CarrierCurrency" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}Enumerations.CurrencyCodeTypes"/>
 *         &lt;element name="DisplayCurrency" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}Enumerations.CurrencyCodeTypes"/>
 *         &lt;element name="IATANum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReceiptLanguageID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PromoCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExternalBookingID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}Address"/>
 *         &lt;element name="ContactInfos" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfContactInfo"/>
 *         &lt;element name="Passengers" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfPerson"/>
 *         &lt;element name="Segments" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfSegment"/>
 *         &lt;element name="Payments" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfPayment"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryPNR", propOrder = {
    "actionType",
    "reservationInfo",
    "securityToken",
    "carrierCurrency",
    "displayCurrency",
    "iataNum",
    "user",
    "receiptLanguageID",
    "promoCode",
    "externalBookingID",
    "address",
    "contactInfos",
    "passengers",
    "segments",
    "payments",
    "comment"
})
public class SummaryPNR
    extends TransactionInfo
{

    @XmlElement(name = "ActionType", required = true)
    protected SummaryPNRActionTypes actionType;
    @XmlElement(name = "ReservationInfo", required = true, nillable = true)
    protected ReservationInfo reservationInfo;
    @XmlElement(name = "SecurityToken", required = true, nillable = true)
    protected String securityToken;
    @XmlElement(name = "CarrierCurrency", required = true)
    protected EnumerationsCurrencyCodeTypes carrierCurrency;
    @XmlElement(name = "DisplayCurrency", required = true)
    protected EnumerationsCurrencyCodeTypes displayCurrency;
    @XmlElement(name = "IATANum", required = true, nillable = true)
    protected String iataNum;
    @XmlElement(name = "User", required = true, nillable = true)
    protected String user;
    @XmlElement(name = "ReceiptLanguageID", required = true, nillable = true)
    protected String receiptLanguageID;
    @XmlElement(name = "PromoCode", required = true, nillable = true)
    protected String promoCode;
    @XmlElement(name = "ExternalBookingID", required = true, nillable = true)
    protected String externalBookingID;
    @XmlElement(name = "Address", required = true, nillable = true)
    protected Address address;
    @XmlElement(name = "ContactInfos", required = true, nillable = true)
    protected ArrayOfContactInfo contactInfos;
    @XmlElement(name = "Passengers", required = true, nillable = true)
    protected ArrayOfPerson passengers;
    @XmlElement(name = "Segments", required = true, nillable = true)
    protected ArrayOfSegment segments;
    @XmlElement(name = "Payments", required = true, nillable = true)
    protected ArrayOfPayment payments;
    @XmlElementRef(name = "Comment", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryPNRActionTypes }
     *     
     */
    public SummaryPNRActionTypes getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryPNRActionTypes }
     *     
     */
    public void setActionType(SummaryPNRActionTypes value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the reservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationInfo }
     *     
     */
    public ReservationInfo getReservationInfo() {
        return reservationInfo;
    }

    /**
     * Sets the value of the reservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationInfo }
     *     
     */
    public void setReservationInfo(ReservationInfo value) {
        this.reservationInfo = value;
    }

    /**
     * Gets the value of the securityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityToken() {
        return securityToken;
    }

    /**
     * Sets the value of the securityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityToken(String value) {
        this.securityToken = value;
    }

    /**
     * Gets the value of the carrierCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link EnumerationsCurrencyCodeTypes }
     *     
     */
    public EnumerationsCurrencyCodeTypes getCarrierCurrency() {
        return carrierCurrency;
    }

    /**
     * Sets the value of the carrierCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationsCurrencyCodeTypes }
     *     
     */
    public void setCarrierCurrency(EnumerationsCurrencyCodeTypes value) {
        this.carrierCurrency = value;
    }

    /**
     * Gets the value of the displayCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link EnumerationsCurrencyCodeTypes }
     *     
     */
    public EnumerationsCurrencyCodeTypes getDisplayCurrency() {
        return displayCurrency;
    }

    /**
     * Sets the value of the displayCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationsCurrencyCodeTypes }
     *     
     */
    public void setDisplayCurrency(EnumerationsCurrencyCodeTypes value) {
        this.displayCurrency = value;
    }

    /**
     * Gets the value of the iataNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATANum() {
        return iataNum;
    }

    /**
     * Sets the value of the iataNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATANum(String value) {
        this.iataNum = value;
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
     * Gets the value of the receiptLanguageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptLanguageID() {
        return receiptLanguageID;
    }

    /**
     * Sets the value of the receiptLanguageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptLanguageID(String value) {
        this.receiptLanguageID = value;
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
     * Gets the value of the externalBookingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalBookingID() {
        return externalBookingID;
    }

    /**
     * Sets the value of the externalBookingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalBookingID(String value) {
        this.externalBookingID = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactInfo }
     *     
     */
    public ArrayOfContactInfo getContactInfos() {
        return contactInfos;
    }

    /**
     * Sets the value of the contactInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactInfo }
     *     
     */
    public void setContactInfos(ArrayOfContactInfo value) {
        this.contactInfos = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPerson }
     *     
     */
    public ArrayOfPerson getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPerson }
     *     
     */
    public void setPassengers(ArrayOfPerson value) {
        this.passengers = value;
    }

    /**
     * Gets the value of the segments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSegment }
     *     
     */
    public ArrayOfSegment getSegments() {
        return segments;
    }

    /**
     * Sets the value of the segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSegment }
     *     
     */
    public void setSegments(ArrayOfSegment value) {
        this.segments = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPayment }
     *     
     */
    public ArrayOfPayment getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPayment }
     *     
     */
    public void setPayments(ArrayOfPayment value) {
        this.payments = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
    }

}

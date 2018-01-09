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


/**
 * <p>Java class for Segment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Segment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonOrgID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FareInformationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MarketingCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StoreFrontID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RecordLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialServices" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfSpecialService"/>
 *         &lt;element name="Seats" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfSeat"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Segment", propOrder = {
    "personOrgID",
    "fareInformationID",
    "marketingCode",
    "storeFrontID",
    "recordLocator",
    "specialServices",
    "seats"
})
public class Segment {

    @XmlElement(name = "PersonOrgID")
    protected int personOrgID;
    @XmlElement(name = "FareInformationID")
    protected int fareInformationID;
    @XmlElement(name = "MarketingCode", required = true, nillable = true)
    protected String marketingCode;
    @XmlElement(name = "StoreFrontID", required = true, nillable = true)
    protected String storeFrontID;
    @XmlElementRef(name = "RecordLocator", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recordLocator;
    @XmlElement(name = "SpecialServices", required = true, nillable = true)
    protected ArrayOfSpecialService specialServices;
    @XmlElement(name = "Seats", required = true, nillable = true)
    protected ArrayOfSeat seats;

    /**
     * Gets the value of the personOrgID property.
     * 
     */
    public int getPersonOrgID() {
        return personOrgID;
    }

    /**
     * Sets the value of the personOrgID property.
     * 
     */
    public void setPersonOrgID(int value) {
        this.personOrgID = value;
    }

    /**
     * Gets the value of the fareInformationID property.
     * 
     */
    public int getFareInformationID() {
        return fareInformationID;
    }

    /**
     * Sets the value of the fareInformationID property.
     * 
     */
    public void setFareInformationID(int value) {
        this.fareInformationID = value;
    }

    /**
     * Gets the value of the marketingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCode() {
        return marketingCode;
    }

    /**
     * Sets the value of the marketingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingCode(String value) {
        this.marketingCode = value;
    }

    /**
     * Gets the value of the storeFrontID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreFrontID() {
        return storeFrontID;
    }

    /**
     * Sets the value of the storeFrontID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreFrontID(String value) {
        this.storeFrontID = value;
    }

    /**
     * Gets the value of the recordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecordLocator() {
        return recordLocator;
    }

    /**
     * Sets the value of the recordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecordLocator(JAXBElement<String> value) {
        this.recordLocator = value;
    }

    /**
     * Gets the value of the specialServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialService }
     *     
     */
    public ArrayOfSpecialService getSpecialServices() {
        return specialServices;
    }

    /**
     * Sets the value of the specialServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialService }
     *     
     */
    public void setSpecialServices(ArrayOfSpecialService value) {
        this.specialServices = value;
    }

    /**
     * Gets the value of the seats property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSeat }
     *     
     */
    public ArrayOfSeat getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSeat }
     *     
     */
    public void setSeats(ArrayOfSeat value) {
        this.seats = value;
    }

}

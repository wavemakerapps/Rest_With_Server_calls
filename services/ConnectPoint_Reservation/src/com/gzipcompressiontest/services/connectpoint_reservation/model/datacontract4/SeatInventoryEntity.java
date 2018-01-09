/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatInventoryEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatInventoryEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dayHold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fareClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="heldId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="incBooked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="incHeld" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="infBooked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="infHeld" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="logicalFlt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resChannelId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatInventoryEntity", propOrder = {
    "dayHold",
    "departureDate",
    "fareClass",
    "heldId",
    "incBooked",
    "incHeld",
    "infBooked",
    "infHeld",
    "logicalFlt",
    "resChannelId"
})
public class SeatInventoryEntity {

    protected Integer dayHold;
    @XmlElementRef(name = "departureDate", namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departureDate;
    @XmlElementRef(name = "fareClass", namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareClass;
    protected Integer heldId;
    protected Integer incBooked;
    protected Integer incHeld;
    protected Integer infBooked;
    protected Integer infHeld;
    protected Integer logicalFlt;
    protected Integer resChannelId;

    /**
     * Gets the value of the dayHold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDayHold() {
        return dayHold;
    }

    /**
     * Sets the value of the dayHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDayHold(Integer value) {
        this.dayHold = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartureDate(JAXBElement<String> value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the fareClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareClass() {
        return fareClass;
    }

    /**
     * Sets the value of the fareClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareClass(JAXBElement<String> value) {
        this.fareClass = value;
    }

    /**
     * Gets the value of the heldId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeldId() {
        return heldId;
    }

    /**
     * Sets the value of the heldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeldId(Integer value) {
        this.heldId = value;
    }

    /**
     * Gets the value of the incBooked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIncBooked() {
        return incBooked;
    }

    /**
     * Sets the value of the incBooked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIncBooked(Integer value) {
        this.incBooked = value;
    }

    /**
     * Gets the value of the incHeld property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIncHeld() {
        return incHeld;
    }

    /**
     * Sets the value of the incHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIncHeld(Integer value) {
        this.incHeld = value;
    }

    /**
     * Gets the value of the infBooked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInfBooked() {
        return infBooked;
    }

    /**
     * Sets the value of the infBooked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInfBooked(Integer value) {
        this.infBooked = value;
    }

    /**
     * Gets the value of the infHeld property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInfHeld() {
        return infHeld;
    }

    /**
     * Sets the value of the infHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInfHeld(Integer value) {
        this.infHeld = value;
    }

    /**
     * Gets the value of the logicalFlt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogicalFlt() {
        return logicalFlt;
    }

    /**
     * Sets the value of the logicalFlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogicalFlt(Integer value) {
        this.logicalFlt = value;
    }

    /**
     * Gets the value of the resChannelId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResChannelId() {
        return resChannelId;
    }

    /**
     * Sets the value of the resChannelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResChannelId(Integer value) {
        this.resChannelId = value;
    }

}

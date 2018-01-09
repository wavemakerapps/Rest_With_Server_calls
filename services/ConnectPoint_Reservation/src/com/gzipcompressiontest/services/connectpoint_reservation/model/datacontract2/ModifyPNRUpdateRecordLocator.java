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
 * <p>Java class for ModifyPNR.UpdateRecordLocator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyPNR.UpdateRecordLocator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogicalFlightKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhysicalFlightKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AirlinePersonKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyPNR.UpdateRecordLocator", propOrder = {
    "recordLocator",
    "reservationKey",
    "logicalFlightKey",
    "physicalFlightKey",
    "customerKey",
    "airlinePersonKey"
})
public class ModifyPNRUpdateRecordLocator {

    @XmlElementRef(name = "RecordLocator", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recordLocator;
    @XmlElement(name = "ReservationKey", required = true, nillable = true)
    protected String reservationKey;
    @XmlElement(name = "LogicalFlightKey", required = true, nillable = true)
    protected String logicalFlightKey;
    @XmlElement(name = "PhysicalFlightKey", required = true, nillable = true)
    protected String physicalFlightKey;
    @XmlElement(name = "CustomerKey", required = true, nillable = true)
    protected String customerKey;
    @XmlElement(name = "AirlinePersonKey", required = true, nillable = true)
    protected String airlinePersonKey;

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
     * Gets the value of the reservationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationKey() {
        return reservationKey;
    }

    /**
     * Sets the value of the reservationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationKey(String value) {
        this.reservationKey = value;
    }

    /**
     * Gets the value of the logicalFlightKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalFlightKey() {
        return logicalFlightKey;
    }

    /**
     * Sets the value of the logicalFlightKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalFlightKey(String value) {
        this.logicalFlightKey = value;
    }

    /**
     * Gets the value of the physicalFlightKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalFlightKey() {
        return physicalFlightKey;
    }

    /**
     * Sets the value of the physicalFlightKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalFlightKey(String value) {
        this.physicalFlightKey = value;
    }

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerKey(String value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the airlinePersonKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlinePersonKey() {
        return airlinePersonKey;
    }

    /**
     * Sets the value of the airlinePersonKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlinePersonKey(String value) {
        this.airlinePersonKey = value;
    }

}

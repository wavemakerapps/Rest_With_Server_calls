/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Airline complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Airline">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogicalFlight" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfLogicalFlight"/>
 *         &lt;element name="OAFlights" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfOAFlight"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Airline", propOrder = {
    "key",
    "logicalFlight",
    "oaFlights"
})
public class Airline {

    @XmlElementRef(name = "Key", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> key;
    @XmlElement(name = "LogicalFlight", required = true, nillable = true)
    protected ArrayOfLogicalFlight logicalFlight;
    @XmlElement(name = "OAFlights", required = true, nillable = true)
    protected ArrayOfOAFlight oaFlights;

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
     * Gets the value of the logicalFlight property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLogicalFlight }
     *     
     */
    public ArrayOfLogicalFlight getLogicalFlight() {
        return logicalFlight;
    }

    /**
     * Sets the value of the logicalFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLogicalFlight }
     *     
     */
    public void setLogicalFlight(ArrayOfLogicalFlight value) {
        this.logicalFlight = value;
    }

    /**
     * Gets the value of the oaFlights property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOAFlight }
     *     
     */
    public ArrayOfOAFlight getOAFlights() {
        return oaFlights;
    }

    /**
     * Sets the value of the oaFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOAFlight }
     *     
     */
    public void setOAFlights(ArrayOfOAFlight value) {
        this.oaFlights = value;
    }

}

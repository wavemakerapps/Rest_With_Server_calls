/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract5.ExceptionInformationException;


/**
 * <p>Java class for SeatInventoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatInventoryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Exceptions" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Exceptions}ExceptionInformation.Exception" minOccurs="0"/>
 *         &lt;element name="seatInventory" type="{http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Responses}ArrayOfSeatInventoryResponseDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatInventoryResponse", propOrder = {
    "exceptions",
    "seatInventory"
})
public class SeatInventoryResponse {

    @XmlElementRef(name = "Exceptions", namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Responses", type = JAXBElement.class, required = false)
    protected JAXBElement<ExceptionInformationException> exceptions;
    @XmlElementRef(name = "seatInventory", namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Responses", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSeatInventoryResponseDetails> seatInventory;

    /**
     * Gets the value of the exceptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExceptionInformationException }{@code >}
     *     
     */
    public JAXBElement<ExceptionInformationException> getExceptions() {
        return exceptions;
    }

    /**
     * Sets the value of the exceptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExceptionInformationException }{@code >}
     *     
     */
    public void setExceptions(JAXBElement<ExceptionInformationException> value) {
        this.exceptions = value;
    }

    /**
     * Gets the value of the seatInventory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeatInventoryResponseDetails }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSeatInventoryResponseDetails> getSeatInventory() {
        return seatInventory;
    }

    /**
     * Sets the value of the seatInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeatInventoryResponseDetails }{@code >}
     *     
     */
    public void setSeatInventory(JAXBElement<ArrayOfSeatInventoryResponseDetails> value) {
        this.seatInventory = value;
    }

}

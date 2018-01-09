/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.TransactionInfo;


/**
 * <p>Java class for SeatInventoryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatInventoryRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seatInventory" type="{http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests}ArrayOfSeatInventoryEntity" minOccurs="0"/>
 *         &lt;element name="TransactionInfo" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}TransactionInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatInventoryRequest", propOrder = {
    "seatInventory",
    "transactionInfo"
})
public class SeatInventoryRequest {

    @XmlElementRef(name = "seatInventory", namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSeatInventoryEntity> seatInventory;
    @XmlElementRef(name = "TransactionInfo", namespace = "http://schemas.datacontract.org/2004/07/FZ.BusinessLayer.Reservation.Requests", type = JAXBElement.class, required = false)
    protected JAXBElement<TransactionInfo> transactionInfo;

    /**
     * Gets the value of the seatInventory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeatInventoryEntity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSeatInventoryEntity> getSeatInventory() {
        return seatInventory;
    }

    /**
     * Sets the value of the seatInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeatInventoryEntity }{@code >}
     *     
     */
    public void setSeatInventory(JAXBElement<ArrayOfSeatInventoryEntity> value) {
        this.seatInventory = value;
    }

    /**
     * Gets the value of the transactionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransactionInfo }{@code >}
     *     
     */
    public JAXBElement<TransactionInfo> getTransactionInfo() {
        return transactionInfo;
    }

    /**
     * Sets the value of the transactionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransactionInfo }{@code >}
     *     
     */
    public void setTransactionInfo(JAXBElement<TransactionInfo> value) {
        this.transactionInfo = value;
    }

}

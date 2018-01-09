/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HistoryPNRRequest" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}HistoryPNR" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "historyPNRRequest"
})
@XmlRootElement(name = "HistoryPNR")
public class HistoryPNR {

    @XmlElementRef(name = "HistoryPNRRequest", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.HistoryPNR> historyPNRRequest;

    /**
     * Gets the value of the historyPNRRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.HistoryPNR }{@code >}
     *     
     */
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.HistoryPNR> getHistoryPNRRequest() {
        return historyPNRRequest;
    }

    /**
     * Sets the value of the historyPNRRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.HistoryPNR }{@code >}
     *     
     */
    public void setHistoryPNRRequest(JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.HistoryPNR> value) {
        this.historyPNRRequest = value;
    }

}

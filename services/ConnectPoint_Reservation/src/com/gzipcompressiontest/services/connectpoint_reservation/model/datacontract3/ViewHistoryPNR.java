/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewHistoryPNR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewHistoryPNR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservationsToInsertHistory" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfReservationToInsertHistory"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewHistoryPNR", propOrder = {
    "reservationsToInsertHistory"
})
public class ViewHistoryPNR {

    @XmlElement(name = "ReservationsToInsertHistory", required = true, nillable = true)
    protected ArrayOfReservationToInsertHistory reservationsToInsertHistory;

    /**
     * Gets the value of the reservationsToInsertHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReservationToInsertHistory }
     *     
     */
    public ArrayOfReservationToInsertHistory getReservationsToInsertHistory() {
        return reservationsToInsertHistory;
    }

    /**
     * Sets the value of the reservationsToInsertHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReservationToInsertHistory }
     *     
     */
    public void setReservationsToInsertHistory(ArrayOfReservationToInsertHistory value) {
        this.reservationsToInsertHistory = value;
    }

}

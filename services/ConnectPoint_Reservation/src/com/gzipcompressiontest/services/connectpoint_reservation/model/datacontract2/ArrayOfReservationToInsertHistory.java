/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfReservationToInsertHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReservationToInsertHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservationToInsertHistory" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ReservationToInsertHistory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReservationToInsertHistory", propOrder = {
    "reservationToInsertHistory"
})
public class ArrayOfReservationToInsertHistory {

    @XmlElement(name = "ReservationToInsertHistory", nillable = true)
    protected List<ReservationToInsertHistory> reservationToInsertHistory;

    /**
     * Gets the value of the reservationToInsertHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservationToInsertHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservationToInsertHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationToInsertHistory }
     * 
     * 
     */
    public List<ReservationToInsertHistory> getReservationToInsertHistory() {
        if (reservationToInsertHistory == null) {
            reservationToInsertHistory = new ArrayList<ReservationToInsertHistory>();
        }
        return this.reservationToInsertHistory;
    }

}

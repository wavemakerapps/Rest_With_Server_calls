/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.ReservationInfo;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.TransactionInfo;


/**
 * <p>Java class for RetrievePNR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrievePNR">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}TransactionInfo">
 *       &lt;sequence>
 *         &lt;element name="ActionType" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}RetrievePNR.ActionTypes"/>
 *         &lt;element name="ReservationInfo" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}ReservationInfo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievePNR", propOrder = {
    "actionType",
    "reservationInfo"
})
public class RetrievePNR
    extends TransactionInfo
{

    @XmlElement(name = "ActionType", required = true)
    protected RetrievePNRActionTypes actionType;
    @XmlElement(name = "ReservationInfo", required = true, nillable = true)
    protected ReservationInfo reservationInfo;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievePNRActionTypes }
     *     
     */
    public RetrievePNRActionTypes getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievePNRActionTypes }
     *     
     */
    public void setActionType(RetrievePNRActionTypes value) {
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

}

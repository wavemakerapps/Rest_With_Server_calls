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
 * <p>Java class for RetrieveBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveBalance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}TransactionInfo">
 *       &lt;sequence>
 *         &lt;element name="ActionType" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}RetrieveBalance.ActionTypes"/>
 *         &lt;element name="ReservationInfo" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}ReservationInfo"/>
 *         &lt;element name="MappedPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveBalance", propOrder = {
    "actionType",
    "reservationInfo",
    "mappedPayment"
})
public class RetrieveBalance
    extends TransactionInfo
{

    @XmlElement(name = "ActionType", required = true)
    protected RetrieveBalanceActionTypes actionType;
    @XmlElement(name = "ReservationInfo", required = true, nillable = true)
    protected ReservationInfo reservationInfo;
    @XmlElement(name = "MappedPayment")
    protected boolean mappedPayment;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveBalanceActionTypes }
     *     
     */
    public RetrieveBalanceActionTypes getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveBalanceActionTypes }
     *     
     */
    public void setActionType(RetrieveBalanceActionTypes value) {
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

    /**
     * Gets the value of the mappedPayment property.
     * 
     */
    public boolean isMappedPayment() {
        return mappedPayment;
    }

    /**
     * Sets the value of the mappedPayment property.
     * 
     */
    public void setMappedPayment(boolean value) {
        this.mappedPayment = value;
    }

}

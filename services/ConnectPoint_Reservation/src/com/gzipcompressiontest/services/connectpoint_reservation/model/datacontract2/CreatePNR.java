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
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract1.GlobalSharedReservationChannel;


/**
 * <p>Java class for CreatePNR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreatePNR">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}TransactionInfo">
 *       &lt;sequence>
 *         &lt;element name="ActionType" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}CreatePNR.ActionTypes"/>
 *         &lt;element name="IsPNRStatusCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReservationChannelID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReservationChannelType" type="{http://schemas.datacontract.org/2004/07/Radixx.Reservation}GlobalShared.ReservationChannel" minOccurs="0"/>
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
@XmlType(name = "CreatePNR", propOrder = {
    "actionType",
    "isPNRStatusCheck",
    "reservationChannelID",
    "reservationChannelType",
    "reservationInfo"
})
public class CreatePNR
    extends TransactionInfo
{

    @XmlElement(name = "ActionType", required = true)
    protected CreatePNRActionTypes actionType;
    @XmlElement(name = "IsPNRStatusCheck")
    protected Boolean isPNRStatusCheck;
    @XmlElement(name = "ReservationChannelID")
    protected Integer reservationChannelID;
    @XmlElement(name = "ReservationChannelType")
    protected GlobalSharedReservationChannel reservationChannelType;
    @XmlElement(name = "ReservationInfo", required = true, nillable = true)
    protected ReservationInfo reservationInfo;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link CreatePNRActionTypes }
     *     
     */
    public CreatePNRActionTypes getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatePNRActionTypes }
     *     
     */
    public void setActionType(CreatePNRActionTypes value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the isPNRStatusCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPNRStatusCheck() {
        return isPNRStatusCheck;
    }

    /**
     * Sets the value of the isPNRStatusCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPNRStatusCheck(Boolean value) {
        this.isPNRStatusCheck = value;
    }

    /**
     * Gets the value of the reservationChannelID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReservationChannelID() {
        return reservationChannelID;
    }

    /**
     * Sets the value of the reservationChannelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReservationChannelID(Integer value) {
        this.reservationChannelID = value;
    }

    /**
     * Gets the value of the reservationChannelType property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalSharedReservationChannel }
     *     
     */
    public GlobalSharedReservationChannel getReservationChannelType() {
        return reservationChannelType;
    }

    /**
     * Sets the value of the reservationChannelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalSharedReservationChannel }
     *     
     */
    public void setReservationChannelType(GlobalSharedReservationChannel value) {
        this.reservationChannelType = value;
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

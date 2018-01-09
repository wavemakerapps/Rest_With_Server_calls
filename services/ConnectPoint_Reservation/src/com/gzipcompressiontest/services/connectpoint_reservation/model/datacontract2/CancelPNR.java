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
 * <p>Java class for CancelPNR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelPNR">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}TransactionInfo">
 *       &lt;sequence>
 *         &lt;element name="ActionType" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}CancelPNR.ActionTypes"/>
 *         &lt;element name="ReservationInfo" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}ReservationInfo"/>
 *         &lt;element name="IncludeNonRefundableTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAutoCancel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPNR", propOrder = {
    "actionType",
    "reservationInfo",
    "includeNonRefundableTax",
    "isAutoCancel"
})
public class CancelPNR
    extends TransactionInfo
{

    @XmlElement(name = "ActionType", required = true)
    protected CancelPNRActionTypes actionType;
    @XmlElement(name = "ReservationInfo", required = true, nillable = true)
    protected ReservationInfo reservationInfo;
    @XmlElement(name = "IncludeNonRefundableTax")
    protected Boolean includeNonRefundableTax;
    @XmlElement(name = "IsAutoCancel")
    protected Boolean isAutoCancel;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPNRActionTypes }
     *     
     */
    public CancelPNRActionTypes getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPNRActionTypes }
     *     
     */
    public void setActionType(CancelPNRActionTypes value) {
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
     * Gets the value of the includeNonRefundableTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeNonRefundableTax() {
        return includeNonRefundableTax;
    }

    /**
     * Sets the value of the includeNonRefundableTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeNonRefundableTax(Boolean value) {
        this.includeNonRefundableTax = value;
    }

    /**
     * Gets the value of the isAutoCancel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAutoCancel() {
        return isAutoCancel;
    }

    /**
     * Sets the value of the isAutoCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAutoCancel(Boolean value) {
        this.isAutoCancel = value;
    }

}

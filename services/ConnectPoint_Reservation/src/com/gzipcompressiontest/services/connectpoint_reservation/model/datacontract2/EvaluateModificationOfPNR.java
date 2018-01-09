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
 * <p>Java class for EvaluateModificationOfPNR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EvaluateModificationOfPNR">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}TransactionInfo">
 *       &lt;sequence>
 *         &lt;element name="ReservationInfo" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}ReservationInfo"/>
 *         &lt;element name="ActionType" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}EvaluateModificationOfPNR.ActionTypes"/>
 *         &lt;element name="LogicalFlightKeyToRemove" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PersonOrgIdentifierToRemove" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvaluateModificationOfPNR", propOrder = {
    "reservationInfo",
    "actionType",
    "logicalFlightKeyToRemove",
    "personOrgIdentifierToRemove"
})
public class EvaluateModificationOfPNR
    extends TransactionInfo
{

    @XmlElement(name = "ReservationInfo", required = true, nillable = true)
    protected ReservationInfo reservationInfo;
    @XmlElement(name = "ActionType", required = true)
    protected EvaluateModificationOfPNRActionTypes actionType;
    @XmlElement(name = "LogicalFlightKeyToRemove", required = true, nillable = true)
    protected String logicalFlightKeyToRemove;
    @XmlElement(name = "PersonOrgIdentifierToRemove")
    protected int personOrgIdentifierToRemove;

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
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link EvaluateModificationOfPNRActionTypes }
     *     
     */
    public EvaluateModificationOfPNRActionTypes getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluateModificationOfPNRActionTypes }
     *     
     */
    public void setActionType(EvaluateModificationOfPNRActionTypes value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the logicalFlightKeyToRemove property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalFlightKeyToRemove() {
        return logicalFlightKeyToRemove;
    }

    /**
     * Sets the value of the logicalFlightKeyToRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalFlightKeyToRemove(String value) {
        this.logicalFlightKeyToRemove = value;
    }

    /**
     * Gets the value of the personOrgIdentifierToRemove property.
     * 
     */
    public int getPersonOrgIdentifierToRemove() {
        return personOrgIdentifierToRemove;
    }

    /**
     * Sets the value of the personOrgIdentifierToRemove property.
     * 
     */
    public void setPersonOrgIdentifierToRemove(int value) {
        this.personOrgIdentifierToRemove = value;
    }

}

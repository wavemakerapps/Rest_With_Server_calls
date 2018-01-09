/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.TransactionInfo;


/**
 * <p>Java class for ImportPNR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportPNR">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}TransactionInfo">
 *       &lt;sequence>
 *         &lt;element name="ActionType" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ImportPNR.ActionTypes"/>
 *         &lt;element name="ImportPNR" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ImportPNR.Reservation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportPNR", propOrder = {
    "actionType",
    "importPNR"
})
public class ImportPNR
    extends TransactionInfo
{

    @XmlElement(name = "ActionType", required = true)
    protected ImportPNRActionTypes actionType;
    @XmlElement(name = "ImportPNR", required = true, nillable = true)
    protected ImportPNRReservation importPNR;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link ImportPNRActionTypes }
     *     
     */
    public ImportPNRActionTypes getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportPNRActionTypes }
     *     
     */
    public void setActionType(ImportPNRActionTypes value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the importPNR property.
     * 
     * @return
     *     possible object is
     *     {@link ImportPNRReservation }
     *     
     */
    public ImportPNRReservation getImportPNR() {
        return importPNR;
    }

    /**
     * Sets the value of the importPNR property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportPNRReservation }
     *     
     */
    public void setImportPNR(ImportPNRReservation value) {
        this.importPNR = value;
    }

}

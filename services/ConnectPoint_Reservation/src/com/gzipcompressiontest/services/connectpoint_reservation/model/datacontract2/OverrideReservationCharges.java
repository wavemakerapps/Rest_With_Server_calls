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
 * <p>Java class for OverrideReservationCharges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverrideReservationCharges">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}TransactionInfo">
 *       &lt;sequence>
 *         &lt;element name="OverrideChargeDetails" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfOverrideChargeDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverrideReservationCharges", propOrder = {
    "overrideChargeDetails"
})
public class OverrideReservationCharges
    extends TransactionInfo
{

    @XmlElement(name = "OverrideChargeDetails", required = true, nillable = true)
    protected ArrayOfOverrideChargeDetail overrideChargeDetails;

    /**
     * Gets the value of the overrideChargeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOverrideChargeDetail }
     *     
     */
    public ArrayOfOverrideChargeDetail getOverrideChargeDetails() {
        return overrideChargeDetails;
    }

    /**
     * Sets the value of the overrideChargeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOverrideChargeDetail }
     *     
     */
    public void setOverrideChargeDetails(ArrayOfOverrideChargeDetail value) {
        this.overrideChargeDetails = value;
    }

}

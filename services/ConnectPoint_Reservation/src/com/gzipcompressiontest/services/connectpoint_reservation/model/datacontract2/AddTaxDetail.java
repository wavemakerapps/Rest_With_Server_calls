/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddTaxDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddTaxDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}OverrideChargeBase">
 *       &lt;sequence>
 *         &lt;element name="TaxID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddTaxDetail", propOrder = {
    "taxID"
})
public class AddTaxDetail
    extends OverrideChargeBase
{

    @XmlElement(name = "TaxID")
    protected int taxID;

    /**
     * Gets the value of the taxID property.
     * 
     */
    public int getTaxID() {
        return taxID;
    }

    /**
     * Sets the value of the taxID property.
     * 
     */
    public void setTaxID(int value) {
        this.taxID = value;
    }

}

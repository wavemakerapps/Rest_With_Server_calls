/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelPNR.ActionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelPNR.ActionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CancelReservation"/>
 *     &lt;enumeration value="RevertReservation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CancelPNR.ActionTypes")
@XmlEnum
public enum CancelPNRActionTypes {


    /**
     * <summary>Action to cancels PNR in session and applies all refunds and penalties so that consumer can make final decision whether to cancel or not</summary>
     * 
     */
    @XmlEnumValue("CancelReservation")
    CANCEL_RESERVATION("CancelReservation"),

    /**
     * <summary>Action reverts all in session work (Pre CreatePNR (SaveReservation)) back to original database loaded state</summary>
     * 
     */
    @XmlEnumValue("RevertReservation")
    REVERT_RESERVATION("RevertReservation");
    private final String value;

    CancelPNRActionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CancelPNRActionTypes fromValue(String v) {
        for (CancelPNRActionTypes c: CancelPNRActionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

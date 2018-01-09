/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoryPNR.ActionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HistoryPNR.ActionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InsertExternalReservationEventHistory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HistoryPNR.ActionTypes")
@XmlEnum
public enum HistoryPNRActionTypes {


    /**
     * <summary>Action to Insert External Reservation Event History</summary>
     * 
     */
    @XmlEnumValue("InsertExternalReservationEventHistory")
    INSERT_EXTERNAL_RESERVATION_EVENT_HISTORY("InsertExternalReservationEventHistory");
    private final String value;

    HistoryPNRActionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HistoryPNRActionTypes fromValue(String v) {
        for (HistoryPNRActionTypes c: HistoryPNRActionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

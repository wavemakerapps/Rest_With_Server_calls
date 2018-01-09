/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EvaluateModificationOfPNR.ActionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EvaluateModificationOfPNR.ActionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EvaluateRemoveFlightFromReservation"/>
 *     &lt;enumeration value="EvaluateRemovePassengerFromReservation"/>
 *     &lt;enumeration value="EvaluateCancelReservation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EvaluateModificationOfPNR.ActionTypes")
@XmlEnum
public enum EvaluateModificationOfPNRActionTypes {

    @XmlEnumValue("EvaluateRemoveFlightFromReservation")
    EVALUATE_REMOVE_FLIGHT_FROM_RESERVATION("EvaluateRemoveFlightFromReservation"),
    @XmlEnumValue("EvaluateRemovePassengerFromReservation")
    EVALUATE_REMOVE_PASSENGER_FROM_RESERVATION("EvaluateRemovePassengerFromReservation"),
    @XmlEnumValue("EvaluateCancelReservation")
    EVALUATE_CANCEL_RESERVATION("EvaluateCancelReservation");
    private final String value;

    EvaluateModificationOfPNRActionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EvaluateModificationOfPNRActionTypes fromValue(String v) {
        for (EvaluateModificationOfPNRActionTypes c: EvaluateModificationOfPNRActionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

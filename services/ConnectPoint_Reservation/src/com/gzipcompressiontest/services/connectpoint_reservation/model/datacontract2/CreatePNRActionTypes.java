/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreatePNR.ActionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreatePNR.ActionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SaveReservation"/>
 *     &lt;enumeration value="CommitSummary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreatePNR.ActionTypes")
@XmlEnum
public enum CreatePNRActionTypes {


    /**
     * <summary>Action to save changes which have been performed on a reservation</summary>
     * 
     */
    @XmlEnumValue("SaveReservation")
    SAVE_RESERVATION("SaveReservation"),

    /**
     * <summary>Action to perform final commit to the database of data that was submitted during GetSummary call</summary>
     * 
     */
    @XmlEnumValue("CommitSummary")
    COMMIT_SUMMARY("CommitSummary");
    private final String value;

    CreatePNRActionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreatePNRActionTypes fromValue(String v) {
        for (CreatePNRActionTypes c: CreatePNRActionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummaryPNR.ActionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SummaryPNR.ActionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GetSummary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SummaryPNR.ActionTypes")
@XmlEnum
public enum SummaryPNRActionTypes {


    /**
     * <summary>Action to perform a pre saved reservation and render result so that Radixx.ConnectPoint.consumer can render information to the end consumer</summary>
     * 
     */
    @XmlEnumValue("GetSummary")
    GET_SUMMARY("GetSummary");
    private final String value;

    SummaryPNRActionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SummaryPNRActionTypes fromValue(String v) {
        for (SummaryPNRActionTypes c: SummaryPNRActionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

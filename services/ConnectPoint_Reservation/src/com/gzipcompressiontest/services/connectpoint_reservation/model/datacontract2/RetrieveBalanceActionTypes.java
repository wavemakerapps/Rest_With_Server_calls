/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveBalance.ActionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RetrieveBalance.ActionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GetBalanceFromSession"/>
 *     &lt;enumeration value="GetBalanceFromDB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RetrieveBalance.ActionTypes")
@XmlEnum
public enum RetrieveBalanceActionTypes {


    /**
     * <summary>Action to retreive reservation balance from data in session</summary>
     * 
     */
    @XmlEnumValue("GetBalanceFromSession")
    GET_BALANCE_FROM_SESSION("GetBalanceFromSession"),

    /**
     * <summary>Action to retreive reservation balance fromDB</summary>
     * 
     */
    @XmlEnumValue("GetBalanceFromDB")
    GET_BALANCE_FROM_DB("GetBalanceFromDB");
    private final String value;

    RetrieveBalanceActionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RetrieveBalanceActionTypes fromValue(String v) {
        for (RetrieveBalanceActionTypes c: RetrieveBalanceActionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

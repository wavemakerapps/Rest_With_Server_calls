/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportPNR.ActionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportPNR.ActionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ImportPNR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImportPNR.ActionTypes")
@XmlEnum
public enum ImportPNRActionTypes {


    /**
     * <summary>Action to perform global pnr import operation. This action handles Creation, Modification, and cancellations on PNR's</summary>
     * 
     */
    @XmlEnumValue("ImportPNR")
    IMPORT_PNR("ImportPNR");
    private final String value;

    ImportPNRActionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportPNRActionTypes fromValue(String v) {
        for (ImportPNRActionTypes c: ImportPNRActionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

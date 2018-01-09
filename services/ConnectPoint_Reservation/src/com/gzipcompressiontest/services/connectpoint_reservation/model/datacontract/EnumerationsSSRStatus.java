/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Enumerations.SSRStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Enumerations.SSRStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HK"/>
 *     &lt;enumeration value="NN"/>
 *     &lt;enumeration value="XX"/>
 *     &lt;enumeration value="SS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Enumerations.SSRStatus")
@XmlEnum
public enum EnumerationsSSRStatus {

    HK,
    NN,
    XX,
    SS;

    public String value() {
        return name();
    }

    public static EnumerationsSSRStatus fromValue(String v) {
        return valueOf(v);
    }

}

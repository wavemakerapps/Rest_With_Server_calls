/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Enumerations.ImportBookingAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Enumerations.ImportBookingAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SystemDetermined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Enumerations.ImportBookingAction")
@XmlEnum
public enum EnumerationsImportBookingAction {

    @XmlEnumValue("SystemDetermined")
    SYSTEM_DETERMINED("SystemDetermined");
    private final String value;

    EnumerationsImportBookingAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumerationsImportBookingAction fromValue(String v) {
        for (EnumerationsImportBookingAction c: EnumerationsImportBookingAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

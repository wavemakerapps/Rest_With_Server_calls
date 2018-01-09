/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Enumerations.ReservationChannelTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Enumerations.ReservationChannelTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="WEB"/>
 *     &lt;enumeration value="GDS"/>
 *     &lt;enumeration value="TPAPI"/>
 *     &lt;enumeration value="DCS"/>
 *     &lt;enumeration value="EXT_WEB"/>
 *     &lt;enumeration value="PNRIMPORT"/>
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="MyID"/>
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Enumerations.ReservationChannelTypes")
@XmlEnum
public enum EnumerationsReservationChannelTypes {

    STANDARD("STANDARD"),
    WEB("WEB"),
    GDS("GDS"),
    TPAPI("TPAPI"),
    DCS("DCS"),
    EXT_WEB("EXT_WEB"),
    PNRIMPORT("PNRIMPORT"),
    MOBILE("MOBILE"),
    @XmlEnumValue("MyID")
    MY_ID("MyID"),
    ALL("ALL");
    private final String value;

    EnumerationsReservationChannelTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumerationsReservationChannelTypes fromValue(String v) {
        for (EnumerationsReservationChannelTypes c: EnumerationsReservationChannelTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

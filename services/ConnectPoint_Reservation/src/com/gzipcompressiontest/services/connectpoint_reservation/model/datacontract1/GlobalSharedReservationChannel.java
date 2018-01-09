/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalShared.ReservationChannel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GlobalShared.ReservationChannel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="WEB"/>
 *     &lt;enumeration value="GDS"/>
 *     &lt;enumeration value="SYNCBOX"/>
 *     &lt;enumeration value="TPAPI"/>
 *     &lt;enumeration value="INTERLINING"/>
 *     &lt;enumeration value="DCS"/>
 *     &lt;enumeration value="EXT_WEB"/>
 *     &lt;enumeration value="WSPNRGEN"/>
 *     &lt;enumeration value="OLWEBCHECKIN"/>
 *     &lt;enumeration value="PNRIMPORT"/>
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="MyID"/>
 *     &lt;enumeration value="TA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GlobalShared.ReservationChannel", namespace = "http://schemas.datacontract.org/2004/07/Radixx.Reservation")
@XmlEnum
public enum GlobalSharedReservationChannel {

    STANDARD("STANDARD"),
    WEB("WEB"),
    GDS("GDS"),
    SYNCBOX("SYNCBOX"),
    TPAPI("TPAPI"),
    INTERLINING("INTERLINING"),
    DCS("DCS"),
    EXT_WEB("EXT_WEB"),
    WSPNRGEN("WSPNRGEN"),
    OLWEBCHECKIN("OLWEBCHECKIN"),
    PNRIMPORT("PNRIMPORT"),
    MOBILE("MOBILE"),
    @XmlEnumValue("MyID")
    MY_ID("MyID"),
    TA("TA");
    private final String value;

    GlobalSharedReservationChannel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalSharedReservationChannel fromValue(String v) {
        for (GlobalSharedReservationChannel c: GlobalSharedReservationChannel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

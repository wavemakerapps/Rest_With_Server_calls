/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrievePNR.ActionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RetrievePNR.ActionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GetReservation"/>
 *     &lt;enumeration value="GetReservationViewOnly"/>
 *     &lt;enumeration value="GetReservationWithETicketInformation"/>
 *     &lt;enumeration value="GetReservationWithETicketInformationViewOnly"/>
 *     &lt;enumeration value="GetReservationFromSession"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RetrievePNR.ActionTypes")
@XmlEnum
public enum RetrievePNRActionTypes {


    /**
     * <summary>Action to retreive PNR information</summary>
     * 
     */
    @XmlEnumValue("GetReservation")
    GET_RESERVATION("GetReservation"),

    /**
     * <summary>Action to retreive PNR information Modify Functions will not be permitted</summary>
     * 
     */
    @XmlEnumValue("GetReservationViewOnly")
    GET_RESERVATION_VIEW_ONLY("GetReservationViewOnly"),

    /**
     * <summary>Action to retreive PNR information, inclusive of eticketing info</summary>
     * 
     */
    @XmlEnumValue("GetReservationWithETicketInformation")
    GET_RESERVATION_WITH_E_TICKET_INFORMATION("GetReservationWithETicketInformation"),

    /**
     * <summary>Action to retreive PNR information, inclusive of eticketing info</summary>
     * 
     */
    @XmlEnumValue("GetReservationWithETicketInformationViewOnly")
    GET_RESERVATION_WITH_E_TICKET_INFORMATION_VIEW_ONLY("GetReservationWithETicketInformationViewOnly"),

    /**
     * <summary>Action to retreive PNR information from data in session, not from the system</summary>
     * 
     */
    @XmlEnumValue("GetReservationFromSession")
    GET_RESERVATION_FROM_SESSION("GetReservationFromSession");
    private final String value;

    RetrievePNRActionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RetrievePNRActionTypes fromValue(String v) {
        for (RetrievePNRActionTypes c: RetrievePNRActionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

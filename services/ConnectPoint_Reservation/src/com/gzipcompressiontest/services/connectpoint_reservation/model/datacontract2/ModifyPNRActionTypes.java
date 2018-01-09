/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyPNR.ActionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModifyPNR.ActionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AddFlightToReservation"/>
 *     &lt;enumeration value="RemoveFlightFromReservation"/>
 *     &lt;enumeration value="ReplaceFlightOnReservation"/>
 *     &lt;enumeration value="AddPassengerToReservation"/>
 *     &lt;enumeration value="RemovePassengerFromReservation"/>
 *     &lt;enumeration value="UpdatePassengerInformationNoFee"/>
 *     &lt;enumeration value="UpdatePassengerInformationAssessFee"/>
 *     &lt;enumeration value="AddSpecialServiceToReservation"/>
 *     &lt;enumeration value="RemoveSpecialServiceFromReservation"/>
 *     &lt;enumeration value="AddContactInformation"/>
 *     &lt;enumeration value="UpdateContactInformation"/>
 *     &lt;enumeration value="AddCommentToReservation"/>
 *     &lt;enumeration value="AddEmergencyContact"/>
 *     &lt;enumeration value="UpdatePassengerSegmentRecordLocator"/>
 *     &lt;enumeration value="ChangeFlightFromReservation"/>
 *     &lt;enumeration value="ChangeFlightCabin"/>
 *     &lt;enumeration value="AddPaxToReservation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModifyPNR.ActionTypes")
@XmlEnum
public enum ModifyPNRActionTypes {


    /**
     * <summary>Action to add a flight to a reservation</summary>
     * 
     */
    @XmlEnumValue("AddFlightToReservation")
    ADD_FLIGHT_TO_RESERVATION("AddFlightToReservation"),

    /**
     * <summary>Action to remove a flight and all passengers within from a reservation</summary>
     * 
     */
    @XmlEnumValue("RemoveFlightFromReservation")
    REMOVE_FLIGHT_FROM_RESERVATION("RemoveFlightFromReservation"),

    /**
     * <summary>Action to replace a flight on a reservation</summary>
     * 
     */
    @XmlEnumValue("ReplaceFlightOnReservation")
    REPLACE_FLIGHT_ON_RESERVATION("ReplaceFlightOnReservation"),

    /**
     * <summary>Action to add a passenger to a reservation</summary>
     * 
     */
    @XmlEnumValue("AddPassengerToReservation")
    ADD_PASSENGER_TO_RESERVATION("AddPassengerToReservation"),

    /**
     * <summary>Action to remove a passenger from a reservation</summary>
     * 
     */
    @XmlEnumValue("RemovePassengerFromReservation")
    REMOVE_PASSENGER_FROM_RESERVATION("RemovePassengerFromReservation"),

    /**
     * <summary>Action to update passenger name information without a system defined fee being assessed</summary>
     * 
     */
    @XmlEnumValue("UpdatePassengerInformationNoFee")
    UPDATE_PASSENGER_INFORMATION_NO_FEE("UpdatePassengerInformationNoFee"),

    /**
     * <summary>Action to update passenger name information with a system defined fee being assessed</summary>
     * 
     */
    @XmlEnumValue("UpdatePassengerInformationAssessFee")
    UPDATE_PASSENGER_INFORMATION_ASSESS_FEE("UpdatePassengerInformationAssessFee"),

    /**
     * <summary>Action to add a special service to a reservation</summary>
     * 
     */
    @XmlEnumValue("AddSpecialServiceToReservation")
    ADD_SPECIAL_SERVICE_TO_RESERVATION("AddSpecialServiceToReservation"),

    /**
     * <summary>Action to add a special service to a reservation</summary>
     * 
     */
    @XmlEnumValue("RemoveSpecialServiceFromReservation")
    REMOVE_SPECIAL_SERVICE_FROM_RESERVATION("RemoveSpecialServiceFromReservation"),

    /**
     * <summary>Action to add contact Information</summary>
     * 
     */
    @XmlEnumValue("AddContactInformation")
    ADD_CONTACT_INFORMATION("AddContactInformation"),

    /**
     * <summary>Action to update contact Information</summary>
     * 
     */
    @XmlEnumValue("UpdateContactInformation")
    UPDATE_CONTACT_INFORMATION("UpdateContactInformation"),

    /**
     * <summary>Action to add comment to a reservation</summary>
     * 
     */
    @XmlEnumValue("AddCommentToReservation")
    ADD_COMMENT_TO_RESERVATION("AddCommentToReservation"),

    /**
     * <summary>Action to add an emergency contact to a passenger segment</summary>
     * 
     */
    @XmlEnumValue("AddEmergencyContact")
    ADD_EMERGENCY_CONTACT("AddEmergencyContact"),

    /**
     * <summary>Action to update the record loactor of a passenger segment</summary>
     * 
     */
    @XmlEnumValue("UpdatePassengerSegmentRecordLocator")
    UPDATE_PASSENGER_SEGMENT_RECORD_LOCATOR("UpdatePassengerSegmentRecordLocator"),

    /**
     * <summary>Action to change flight</summary>
     * 
     */
    @XmlEnumValue("ChangeFlightFromReservation")
    CHANGE_FLIGHT_FROM_RESERVATION("ChangeFlightFromReservation"),

    /**
     * <summary>Action to add a passenger to a reservation</summary>
     *  Created at the time of Repricer
     * 
     */
    @XmlEnumValue("ChangeFlightCabin")
    CHANGE_FLIGHT_CABIN("ChangeFlightCabin"),

    /**
     * <summary>Action to add a passenger to a reservation</summary>
     *  Created at the time of Repricer
     * 
     */
    @XmlEnumValue("AddPaxToReservation")
    ADD_PAX_TO_RESERVATION("AddPaxToReservation");
    private final String value;

    ModifyPNRActionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModifyPNRActionTypes fromValue(String v) {
        for (ModifyPNRActionTypes c: ModifyPNRActionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Enumerations.RelationshipTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Enumerations.RelationshipTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Self"/>
 *     &lt;enumeration value="Spouse"/>
 *     &lt;enumeration value="Father"/>
 *     &lt;enumeration value="Mother"/>
 *     &lt;enumeration value="Son"/>
 *     &lt;enumeration value="Daughter"/>
 *     &lt;enumeration value="GrandFather"/>
 *     &lt;enumeration value="GrandMother"/>
 *     &lt;enumeration value="Uncle"/>
 *     &lt;enumeration value="Aunt"/>
 *     &lt;enumeration value="Nephew"/>
 *     &lt;enumeration value="Niece"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Enumerations.RelationshipTypes")
@XmlEnum
public enum EnumerationsRelationshipTypes {

    @XmlEnumValue("Self")
    SELF("Self"),
    @XmlEnumValue("Spouse")
    SPOUSE("Spouse"),
    @XmlEnumValue("Father")
    FATHER("Father"),
    @XmlEnumValue("Mother")
    MOTHER("Mother"),
    @XmlEnumValue("Son")
    SON("Son"),
    @XmlEnumValue("Daughter")
    DAUGHTER("Daughter"),
    @XmlEnumValue("GrandFather")
    GRAND_FATHER("GrandFather"),
    @XmlEnumValue("GrandMother")
    GRAND_MOTHER("GrandMother"),
    @XmlEnumValue("Uncle")
    UNCLE("Uncle"),
    @XmlEnumValue("Aunt")
    AUNT("Aunt"),
    @XmlEnumValue("Nephew")
    NEPHEW("Nephew"),
    @XmlEnumValue("Niece")
    NIECE("Niece");
    private final String value;

    EnumerationsRelationshipTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumerationsRelationshipTypes fromValue(String v) {
        for (EnumerationsRelationshipTypes c: EnumerationsRelationshipTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

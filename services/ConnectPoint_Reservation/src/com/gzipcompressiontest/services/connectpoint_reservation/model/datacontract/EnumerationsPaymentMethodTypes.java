/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Enumerations.PaymentMethodTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Enumerations.PaymentMethodTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AMEX"/>
 *     &lt;enumeration value="DCLB"/>
 *     &lt;enumeration value="DSCV"/>
 *     &lt;enumeration value="MSCD"/>
 *     &lt;enumeration value="UATP"/>
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="INVC"/>
 *     &lt;enumeration value="SAPI"/>
 *     &lt;enumeration value="TKNE"/>
 *     &lt;enumeration value="CASH"/>
 *     &lt;enumeration value="CHCK"/>
 *     &lt;enumeration value="TCHK"/>
 *     &lt;enumeration value="TCKT"/>
 *     &lt;enumeration value="VCHR"/>
 *     &lt;enumeration value="PL8R"/>
 *     &lt;enumeration value="EFT"/>
 *     &lt;enumeration value="PNTS"/>
 *     &lt;enumeration value="WBSP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Enumerations.PaymentMethodTypes")
@XmlEnum
public enum EnumerationsPaymentMethodTypes {

    AMEX("AMEX"),
    DCLB("DCLB"),
    DSCV("DSCV"),
    MSCD("MSCD"),
    UATP("UATP"),
    VISA("VISA"),
    INVC("INVC"),
    SAPI("SAPI"),
    TKNE("TKNE"),
    CASH("CASH"),
    CHCK("CHCK"),
    TCHK("TCHK"),
    TCKT("TCKT"),
    VCHR("VCHR"),
    @XmlEnumValue("PL8R")
    PL_8_R("PL8R"),
    EFT("EFT"),
    PNTS("PNTS"),
    WBSP("WBSP");
    private final String value;

    EnumerationsPaymentMethodTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumerationsPaymentMethodTypes fromValue(String v) {
        for (EnumerationsPaymentMethodTypes c: EnumerationsPaymentMethodTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract5.ExceptionInformationExceptions;


/**
 * <p>Java class for ViewPNRModificationImpactCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewPNRModificationImpactCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PNRModificationImpact" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfViewPNRModificationImpact"/>
 *         &lt;element name="Exceptions" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Exceptions}ExceptionInformation.Exceptions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewPNRModificationImpactCollection", propOrder = {
    "pnrModificationImpact",
    "exceptions"
})
public class ViewPNRModificationImpactCollection {

    @XmlElement(name = "PNRModificationImpact", required = true, nillable = true)
    protected ArrayOfViewPNRModificationImpact pnrModificationImpact;
    @XmlElement(name = "Exceptions", required = true, nillable = true)
    protected ExceptionInformationExceptions exceptions;

    /**
     * Gets the value of the pnrModificationImpact property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfViewPNRModificationImpact }
     *     
     */
    public ArrayOfViewPNRModificationImpact getPNRModificationImpact() {
        return pnrModificationImpact;
    }

    /**
     * Sets the value of the pnrModificationImpact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfViewPNRModificationImpact }
     *     
     */
    public void setPNRModificationImpact(ArrayOfViewPNRModificationImpact value) {
        this.pnrModificationImpact = value;
    }

    /**
     * Gets the value of the exceptions property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionInformationExceptions }
     *     
     */
    public ExceptionInformationExceptions getExceptions() {
        return exceptions;
    }

    /**
     * Sets the value of the exceptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionInformationExceptions }
     *     
     */
    public void setExceptions(ExceptionInformationExceptions value) {
        this.exceptions = value;
    }

}

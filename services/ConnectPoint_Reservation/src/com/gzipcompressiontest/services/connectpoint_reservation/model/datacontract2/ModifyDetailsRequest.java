/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyDetailsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originDestinations" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}addPAXOriginDestinations" minOccurs="0"/>
 *         &lt;element name="paxDetails" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfaddPAX" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyDetailsRequest", propOrder = {
    "originDestinations",
    "paxDetails"
})
public class ModifyDetailsRequest {

    @XmlElementRef(name = "originDestinations", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<AddPAXOriginDestinations> originDestinations;
    @XmlElementRef(name = "paxDetails", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfaddPAX> paxDetails;

    /**
     * Gets the value of the originDestinations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddPAXOriginDestinations }{@code >}
     *     
     */
    public JAXBElement<AddPAXOriginDestinations> getOriginDestinations() {
        return originDestinations;
    }

    /**
     * Sets the value of the originDestinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddPAXOriginDestinations }{@code >}
     *     
     */
    public void setOriginDestinations(JAXBElement<AddPAXOriginDestinations> value) {
        this.originDestinations = value;
    }

    /**
     * Gets the value of the paxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfaddPAX }{@code >}
     *     
     */
    public JAXBElement<ArrayOfaddPAX> getPaxDetails() {
        return paxDetails;
    }

    /**
     * Sets the value of the paxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfaddPAX }{@code >}
     *     
     */
    public void setPaxDetails(JAXBElement<ArrayOfaddPAX> value) {
        this.paxDetails = value;
    }

}

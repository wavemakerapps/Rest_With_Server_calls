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
 * <p>Java class for addPAXOriginDestinations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addPAXOriginDestinations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originDestination" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfaddPaxOriginDestination" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPAXOriginDestinations", propOrder = {
    "originDestination"
})
public class AddPAXOriginDestinations {

    @XmlElementRef(name = "originDestination", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfaddPaxOriginDestination> originDestination;

    /**
     * Gets the value of the originDestination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfaddPaxOriginDestination }{@code >}
     *     
     */
    public JAXBElement<ArrayOfaddPaxOriginDestination> getOriginDestination() {
        return originDestination;
    }

    /**
     * Sets the value of the originDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfaddPaxOriginDestination }{@code >}
     *     
     */
    public void setOriginDestination(JAXBElement<ArrayOfaddPaxOriginDestination> value) {
        this.originDestination = value;
    }

}

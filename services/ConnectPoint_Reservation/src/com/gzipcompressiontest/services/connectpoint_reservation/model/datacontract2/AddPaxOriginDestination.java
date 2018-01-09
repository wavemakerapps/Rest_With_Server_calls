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
 * <p>Java class for addPaxOriginDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addPaxOriginDestination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oldODRef" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="oldPaxRefs" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfoldPaxRefrs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPaxOriginDestination", propOrder = {
    "oldODRef",
    "oldPaxRefs"
})
public class AddPaxOriginDestination {

    @XmlElementRef(name = "oldODRef", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> oldODRef;
    @XmlElementRef(name = "oldPaxRefs", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfoldPaxRefrs> oldPaxRefs;

    /**
     * Gets the value of the oldODRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOldODRef() {
        return oldODRef;
    }

    /**
     * Sets the value of the oldODRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOldODRef(JAXBElement<Integer> value) {
        this.oldODRef = value;
    }

    /**
     * Gets the value of the oldPaxRefs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfoldPaxRefrs }{@code >}
     *     
     */
    public JAXBElement<ArrayOfoldPaxRefrs> getOldPaxRefs() {
        return oldPaxRefs;
    }

    /**
     * Sets the value of the oldPaxRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfoldPaxRefrs }{@code >}
     *     
     */
    public void setOldPaxRefs(JAXBElement<ArrayOfoldPaxRefrs> value) {
        this.oldPaxRefs = value;
    }

}

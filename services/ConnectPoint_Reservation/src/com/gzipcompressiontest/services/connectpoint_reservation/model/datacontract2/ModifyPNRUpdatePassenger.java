/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyPNR.UpdatePassenger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyPNR.UpdatePassenger">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ModifyPNR.Person">
 *       &lt;sequence>
 *         &lt;element name="RedressNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KnownTravelerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FFNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TierID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyPNR.UpdatePassenger", propOrder = {
    "redressNumber",
    "knownTravelerNumber",
    "ffNum",
    "tierID",
    "tierName"
})
public class ModifyPNRUpdatePassenger
    extends ModifyPNRPerson
{

    @XmlElement(name = "RedressNumber", required = true, nillable = true)
    protected String redressNumber;
    @XmlElement(name = "KnownTravelerNumber", required = true, nillable = true)
    protected String knownTravelerNumber;
    @XmlElementRef(name = "FFNum", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ffNum;
    @XmlElement(name = "TierID")
    protected Integer tierID;
    @XmlElementRef(name = "TierName", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tierName;

    /**
     * Gets the value of the redressNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedressNumber() {
        return redressNumber;
    }

    /**
     * Sets the value of the redressNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedressNumber(String value) {
        this.redressNumber = value;
    }

    /**
     * Gets the value of the knownTravelerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKnownTravelerNumber() {
        return knownTravelerNumber;
    }

    /**
     * Sets the value of the knownTravelerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKnownTravelerNumber(String value) {
        this.knownTravelerNumber = value;
    }

    /**
     * Gets the value of the ffNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFFNum() {
        return ffNum;
    }

    /**
     * Sets the value of the ffNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFFNum(JAXBElement<String> value) {
        this.ffNum = value;
    }

    /**
     * Gets the value of the tierID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTierID() {
        return tierID;
    }

    /**
     * Sets the value of the tierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTierID(Integer value) {
        this.tierID = value;
    }

    /**
     * Gets the value of the tierName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTierName() {
        return tierName;
    }

    /**
     * Sets the value of the tierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTierName(JAXBElement<String> value) {
        this.tierName = value;
    }

}

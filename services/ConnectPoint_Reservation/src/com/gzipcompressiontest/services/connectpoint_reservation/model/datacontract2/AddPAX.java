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
 * <p>Java class for addPAX complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addPAX">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ModifyPNR.Person">
 *       &lt;sequence>
 *         &lt;element name="FrequentFlyerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepricerAddress" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}addPaxAddress" minOccurs="0"/>
 *         &lt;element name="TierID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactDetails" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfaddPaxContact" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPAX", propOrder = {
    "frequentFlyerNumber",
    "recordLocator",
    "repricerAddress",
    "tierID",
    "tierName",
    "contactDetails"
})
public class AddPAX
    extends ModifyPNRPerson
{

    @XmlElementRef(name = "FrequentFlyerNumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> frequentFlyerNumber;
    @XmlElementRef(name = "RecordLocator", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recordLocator;
    @XmlElementRef(name = "RepricerAddress", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<AddPaxAddress> repricerAddress;
    @XmlElement(name = "TierID")
    protected Integer tierID;
    @XmlElementRef(name = "TierName", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tierName;
    @XmlElementRef(name = "contactDetails", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfaddPaxContact> contactDetails;

    /**
     * Gets the value of the frequentFlyerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFrequentFlyerNumber() {
        return frequentFlyerNumber;
    }

    /**
     * Sets the value of the frequentFlyerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFrequentFlyerNumber(JAXBElement<String> value) {
        this.frequentFlyerNumber = value;
    }

    /**
     * Gets the value of the recordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecordLocator() {
        return recordLocator;
    }

    /**
     * Sets the value of the recordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecordLocator(JAXBElement<String> value) {
        this.recordLocator = value;
    }

    /**
     * Gets the value of the repricerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddPaxAddress }{@code >}
     *     
     */
    public JAXBElement<AddPaxAddress> getRepricerAddress() {
        return repricerAddress;
    }

    /**
     * Sets the value of the repricerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddPaxAddress }{@code >}
     *     
     */
    public void setRepricerAddress(JAXBElement<AddPaxAddress> value) {
        this.repricerAddress = value;
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

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfaddPaxContact }{@code >}
     *     
     */
    public JAXBElement<ArrayOfaddPaxContact> getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfaddPaxContact }{@code >}
     *     
     */
    public void setContactDetails(JAXBElement<ArrayOfaddPaxContact> value) {
        this.contactDetails = value;
    }

}

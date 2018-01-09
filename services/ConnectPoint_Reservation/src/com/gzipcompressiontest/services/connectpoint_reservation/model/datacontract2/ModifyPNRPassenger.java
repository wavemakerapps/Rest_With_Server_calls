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
 * <p>Java class for ModifyPNR.Passenger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyPNR.Passenger">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ModifyPNR.Person">
 *       &lt;sequence>
 *         &lt;element name="DropOffID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PickUpID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LapChildID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FrequentFlyerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelecteeStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StoreFrontID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravelsWithPersonOrgID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RedressNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KnownTravelerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RecordLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TierID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightInformations" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfModifyPNR.FlightInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyPNR.Passenger", propOrder = {
    "dropOffID",
    "pickUpID",
    "lapChildID",
    "frequentFlyerNumber",
    "selecteeStatus",
    "storeFrontID",
    "travelsWithPersonOrgID",
    "redressNumber",
    "knownTravelerNumber",
    "recordLocator",
    "tierID",
    "tierName",
    "flightInformations"
})
public class ModifyPNRPassenger
    extends ModifyPNRPerson
{

    @XmlElement(name = "DropOffID")
    protected Integer dropOffID;
    @XmlElement(name = "PickUpID")
    protected Integer pickUpID;
    @XmlElement(name = "LapChildID")
    protected Integer lapChildID;
    @XmlElementRef(name = "FrequentFlyerNumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> frequentFlyerNumber;
    @XmlElement(name = "SelecteeStatus")
    protected Integer selecteeStatus;
    @XmlElementRef(name = "StoreFrontID", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> storeFrontID;
    @XmlElement(name = "TravelsWithPersonOrgID")
    protected int travelsWithPersonOrgID;
    @XmlElement(name = "RedressNumber", required = true, nillable = true)
    protected String redressNumber;
    @XmlElement(name = "KnownTravelerNumber", required = true, nillable = true)
    protected String knownTravelerNumber;
    @XmlElementRef(name = "RecordLocator", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recordLocator;
    @XmlElement(name = "TierID")
    protected int tierID;
    @XmlElementRef(name = "TierName", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tierName;
    @XmlElementRef(name = "FlightInformations", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfModifyPNRFlightInformation> flightInformations;

    /**
     * Gets the value of the dropOffID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDropOffID() {
        return dropOffID;
    }

    /**
     * Sets the value of the dropOffID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDropOffID(Integer value) {
        this.dropOffID = value;
    }

    /**
     * Gets the value of the pickUpID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPickUpID() {
        return pickUpID;
    }

    /**
     * Sets the value of the pickUpID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPickUpID(Integer value) {
        this.pickUpID = value;
    }

    /**
     * Gets the value of the lapChildID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLapChildID() {
        return lapChildID;
    }

    /**
     * Sets the value of the lapChildID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLapChildID(Integer value) {
        this.lapChildID = value;
    }

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
     * Gets the value of the selecteeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSelecteeStatus() {
        return selecteeStatus;
    }

    /**
     * Sets the value of the selecteeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSelecteeStatus(Integer value) {
        this.selecteeStatus = value;
    }

    /**
     * Gets the value of the storeFrontID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStoreFrontID() {
        return storeFrontID;
    }

    /**
     * Sets the value of the storeFrontID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStoreFrontID(JAXBElement<String> value) {
        this.storeFrontID = value;
    }

    /**
     * Gets the value of the travelsWithPersonOrgID property.
     * 
     */
    public int getTravelsWithPersonOrgID() {
        return travelsWithPersonOrgID;
    }

    /**
     * Sets the value of the travelsWithPersonOrgID property.
     * 
     */
    public void setTravelsWithPersonOrgID(int value) {
        this.travelsWithPersonOrgID = value;
    }

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
     * Gets the value of the tierID property.
     * 
     */
    public int getTierID() {
        return tierID;
    }

    /**
     * Sets the value of the tierID property.
     * 
     */
    public void setTierID(int value) {
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
     * Gets the value of the flightInformations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfModifyPNRFlightInformation }{@code >}
     *     
     */
    public JAXBElement<ArrayOfModifyPNRFlightInformation> getFlightInformations() {
        return flightInformations;
    }

    /**
     * Sets the value of the flightInformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfModifyPNRFlightInformation }{@code >}
     *     
     */
    public void setFlightInformations(JAXBElement<ArrayOfModifyPNRFlightInformation> value) {
        this.flightInformations = value;
    }

}

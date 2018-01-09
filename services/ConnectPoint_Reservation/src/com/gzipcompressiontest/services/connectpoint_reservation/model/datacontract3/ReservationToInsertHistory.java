/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.EnumerationsReservationChannelTypes;


/**
 * <p>Java class for ReservationToInsertHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationToInsertHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpdatedPNRHistory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HistoryEventText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Passenger" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Segment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResChannel" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}Enumerations.ReservationChannelTypes"/>
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationToInsertHistory", propOrder = {
    "action",
    "updatedPNRHistory",
    "historyEventText",
    "updateDate",
    "passenger",
    "segment",
    "description",
    "user",
    "resChannel",
    "ipAddress"
})
public class ReservationToInsertHistory {

    @XmlElement(name = "Action", required = true, nillable = true)
    protected String action;
    @XmlElement(name = "UpdatedPNRHistory")
    protected boolean updatedPNRHistory;
    @XmlElementRef(name = "HistoryEventText", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> historyEventText;
    @XmlElement(name = "UpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    @XmlElement(name = "Passenger", required = true, nillable = true)
    protected String passenger;
    @XmlElement(name = "Segment", required = true, nillable = true)
    protected String segment;
    @XmlElement(name = "Description", required = true, nillable = true)
    protected String description;
    @XmlElement(name = "User", required = true, nillable = true)
    protected String user;
    @XmlElement(name = "ResChannel", required = true)
    protected EnumerationsReservationChannelTypes resChannel;
    @XmlElement(name = "IPAddress", required = true, nillable = true)
    protected String ipAddress;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the updatedPNRHistory property.
     * 
     */
    public boolean isUpdatedPNRHistory() {
        return updatedPNRHistory;
    }

    /**
     * Sets the value of the updatedPNRHistory property.
     * 
     */
    public void setUpdatedPNRHistory(boolean value) {
        this.updatedPNRHistory = value;
    }

    /**
     * Gets the value of the historyEventText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHistoryEventText() {
        return historyEventText;
    }

    /**
     * Sets the value of the historyEventText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHistoryEventText(JAXBElement<String> value) {
        this.historyEventText = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the passenger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassenger() {
        return passenger;
    }

    /**
     * Sets the value of the passenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassenger(String value) {
        this.passenger = value;
    }

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment(String value) {
        this.segment = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the resChannel property.
     * 
     * @return
     *     possible object is
     *     {@link EnumerationsReservationChannelTypes }
     *     
     */
    public EnumerationsReservationChannelTypes getResChannel() {
        return resChannel;
    }

    /**
     * Sets the value of the resChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationsReservationChannelTypes }
     *     
     */
    public void setResChannel(EnumerationsReservationChannelTypes value) {
        this.resChannel = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

}

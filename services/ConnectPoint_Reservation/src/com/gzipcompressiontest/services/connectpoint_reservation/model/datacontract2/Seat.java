/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Seat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Seat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonOrgID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LogicalFlightID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PhysicalFlightID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SeatSelected" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RowNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Seat", propOrder = {
    "personOrgID",
    "logicalFlightID",
    "physicalFlightID",
    "departureDate",
    "seatSelected",
    "rowNumber"
})
public class Seat {

    @XmlElement(name = "PersonOrgID")
    protected int personOrgID;
    @XmlElement(name = "LogicalFlightID")
    protected int logicalFlightID;
    @XmlElement(name = "PhysicalFlightID")
    protected int physicalFlightID;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "SeatSelected", required = true, nillable = true)
    protected String seatSelected;
    @XmlElement(name = "RowNumber", required = true, nillable = true)
    protected String rowNumber;

    /**
     * Gets the value of the personOrgID property.
     * 
     */
    public int getPersonOrgID() {
        return personOrgID;
    }

    /**
     * Sets the value of the personOrgID property.
     * 
     */
    public void setPersonOrgID(int value) {
        this.personOrgID = value;
    }

    /**
     * Gets the value of the logicalFlightID property.
     * 
     */
    public int getLogicalFlightID() {
        return logicalFlightID;
    }

    /**
     * Sets the value of the logicalFlightID property.
     * 
     */
    public void setLogicalFlightID(int value) {
        this.logicalFlightID = value;
    }

    /**
     * Gets the value of the physicalFlightID property.
     * 
     */
    public int getPhysicalFlightID() {
        return physicalFlightID;
    }

    /**
     * Sets the value of the physicalFlightID property.
     * 
     */
    public void setPhysicalFlightID(int value) {
        this.physicalFlightID = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the seatSelected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatSelected() {
        return seatSelected;
    }

    /**
     * Sets the value of the seatSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatSelected(String value) {
        this.seatSelected = value;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowNumber(String value) {
        this.rowNumber = value;
    }

}

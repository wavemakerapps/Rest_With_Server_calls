/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewImportPNR.Reservation.Segment.AirlinePerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewImportPNR.Reservation.Segment.AirlinePerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonOrgID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TravelsWithPersonOrgID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Charges" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfViewImportPNR.Reservation.Segment.AirlinePerson.Charge"/>
 *         &lt;element name="Seats" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfViewImportPNR.Reservation.Segment.AirlinePerson.Seat"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewImportPNR.Reservation.Segment.AirlinePerson", propOrder = {
    "personOrgID",
    "travelsWithPersonOrgID",
    "fareClass",
    "fareBasisCode",
    "charges",
    "seats"
})
public class ViewImportPNRReservationSegmentAirlinePerson {

    @XmlElement(name = "PersonOrgID")
    protected int personOrgID;
    @XmlElement(name = "TravelsWithPersonOrgID")
    protected int travelsWithPersonOrgID;
    @XmlElement(name = "FareClass", required = true, nillable = true)
    protected String fareClass;
    @XmlElement(name = "FareBasisCode", required = true, nillable = true)
    protected String fareBasisCode;
    @XmlElement(name = "Charges", required = true, nillable = true)
    protected ArrayOfViewImportPNRReservationSegmentAirlinePersonCharge charges;
    @XmlElement(name = "Seats", required = true, nillable = true)
    protected ArrayOfViewImportPNRReservationSegmentAirlinePersonSeat seats;

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
     * Gets the value of the fareClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareClass() {
        return fareClass;
    }

    /**
     * Sets the value of the fareClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareClass(String value) {
        this.fareClass = value;
    }

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfViewImportPNRReservationSegmentAirlinePersonCharge }
     *     
     */
    public ArrayOfViewImportPNRReservationSegmentAirlinePersonCharge getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfViewImportPNRReservationSegmentAirlinePersonCharge }
     *     
     */
    public void setCharges(ArrayOfViewImportPNRReservationSegmentAirlinePersonCharge value) {
        this.charges = value;
    }

    /**
     * Gets the value of the seats property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfViewImportPNRReservationSegmentAirlinePersonSeat }
     *     
     */
    public ArrayOfViewImportPNRReservationSegmentAirlinePersonSeat getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfViewImportPNRReservationSegmentAirlinePersonSeat }
     *     
     */
    public void setSeats(ArrayOfViewImportPNRReservationSegmentAirlinePersonSeat value) {
        this.seats = value;
    }

}

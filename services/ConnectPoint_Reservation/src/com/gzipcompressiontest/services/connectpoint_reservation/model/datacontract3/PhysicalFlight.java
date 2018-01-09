/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract3;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PhysicalFlight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalFlight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DestinationDefaultTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhysicalFlightID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LogicalFlightID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginDefaultTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginMetroGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationMetroGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingFlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Arrivaltime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FlightDuration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Trip" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UIDisplayValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FlightStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customers" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfCustomer" minOccurs="0"/>
 *         &lt;element name="FromTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirCraftType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirCraftDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalFlight", propOrder = {
    "key",
    "recordNumber",
    "destinationDefaultTerminal",
    "physicalFlightID",
    "logicalFlightID",
    "carrierCode",
    "carrierName",
    "flightNumber",
    "flightOrder",
    "departureDate",
    "origin",
    "originDefaultTerminal",
    "originName",
    "destination",
    "destinationName",
    "originMetroGroup",
    "destinationMetroGroup",
    "sellingCarrier",
    "operatingCarrier",
    "operatingFlightNumber",
    "departureTime",
    "arrivaltime",
    "flightDuration",
    "trip",
    "gate",
    "totalWeight",
    "uiDisplayValue",
    "active",
    "flightStatus",
    "customers",
    "fromTerminal",
    "toTerminal",
    "airCraftType",
    "airCraftDescription"
})
public class PhysicalFlight {

    @XmlElementRef(name = "Key", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> key;
    @XmlElement(name = "RecordNumber")
    protected Integer recordNumber;
    @XmlElementRef(name = "DestinationDefaultTerminal", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationDefaultTerminal;
    @XmlElement(name = "PhysicalFlightID")
    protected Integer physicalFlightID;
    @XmlElement(name = "LogicalFlightID")
    protected Integer logicalFlightID;
    @XmlElementRef(name = "CarrierCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carrierCode;
    @XmlElementRef(name = "CarrierName", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carrierName;
    @XmlElementRef(name = "FlightNumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightNumber;
    @XmlElement(name = "FlightOrder")
    protected Integer flightOrder;
    @XmlElement(name = "DepartureDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElementRef(name = "Origin", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origin;
    @XmlElementRef(name = "OriginDefaultTerminal", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originDefaultTerminal;
    @XmlElementRef(name = "OriginName", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originName;
    @XmlElementRef(name = "Destination", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destination;
    @XmlElementRef(name = "DestinationName", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationName;
    @XmlElementRef(name = "OriginMetroGroup", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originMetroGroup;
    @XmlElementRef(name = "DestinationMetroGroup", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationMetroGroup;
    @XmlElementRef(name = "SellingCarrier", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sellingCarrier;
    @XmlElementRef(name = "OperatingCarrier", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operatingCarrier;
    @XmlElementRef(name = "OperatingFlightNumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operatingFlightNumber;
    @XmlElement(name = "DepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureTime;
    @XmlElement(name = "Arrivaltime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivaltime;
    @XmlElement(name = "FlightDuration")
    protected BigDecimal flightDuration;
    @XmlElement(name = "Trip")
    protected Integer trip;
    @XmlElementRef(name = "Gate", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gate;
    @XmlElement(name = "TotalWeight")
    protected BigDecimal totalWeight;
    @XmlElement(name = "UIDisplayValue")
    protected Integer uiDisplayValue;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElementRef(name = "FlightStatus", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightStatus;
    @XmlElementRef(name = "Customers", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomer> customers;
    @XmlElementRef(name = "FromTerminal", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fromTerminal;
    @XmlElementRef(name = "ToTerminal", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> toTerminal;
    @XmlElementRef(name = "AirCraftType", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airCraftType;
    @XmlElementRef(name = "AirCraftDescription", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airCraftDescription;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKey(JAXBElement<String> value) {
        this.key = value;
    }

    /**
     * Gets the value of the recordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecordNumber() {
        return recordNumber;
    }

    /**
     * Sets the value of the recordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecordNumber(Integer value) {
        this.recordNumber = value;
    }

    /**
     * Gets the value of the destinationDefaultTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationDefaultTerminal() {
        return destinationDefaultTerminal;
    }

    /**
     * Sets the value of the destinationDefaultTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationDefaultTerminal(JAXBElement<String> value) {
        this.destinationDefaultTerminal = value;
    }

    /**
     * Gets the value of the physicalFlightID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhysicalFlightID() {
        return physicalFlightID;
    }

    /**
     * Sets the value of the physicalFlightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhysicalFlightID(Integer value) {
        this.physicalFlightID = value;
    }

    /**
     * Gets the value of the logicalFlightID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogicalFlightID() {
        return logicalFlightID;
    }

    /**
     * Sets the value of the logicalFlightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogicalFlightID(Integer value) {
        this.logicalFlightID = value;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarrierCode(JAXBElement<String> value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarrierName(JAXBElement<String> value) {
        this.carrierName = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlightNumber(JAXBElement<String> value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the flightOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightOrder() {
        return flightOrder;
    }

    /**
     * Sets the value of the flightOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightOrder(Integer value) {
        this.flightOrder = value;
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
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigin(JAXBElement<String> value) {
        this.origin = value;
    }

    /**
     * Gets the value of the originDefaultTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginDefaultTerminal() {
        return originDefaultTerminal;
    }

    /**
     * Sets the value of the originDefaultTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginDefaultTerminal(JAXBElement<String> value) {
        this.originDefaultTerminal = value;
    }

    /**
     * Gets the value of the originName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginName() {
        return originName;
    }

    /**
     * Sets the value of the originName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginName(JAXBElement<String> value) {
        this.originName = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestination(JAXBElement<String> value) {
        this.destination = value;
    }

    /**
     * Gets the value of the destinationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationName() {
        return destinationName;
    }

    /**
     * Sets the value of the destinationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationName(JAXBElement<String> value) {
        this.destinationName = value;
    }

    /**
     * Gets the value of the originMetroGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginMetroGroup() {
        return originMetroGroup;
    }

    /**
     * Sets the value of the originMetroGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginMetroGroup(JAXBElement<String> value) {
        this.originMetroGroup = value;
    }

    /**
     * Gets the value of the destinationMetroGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationMetroGroup() {
        return destinationMetroGroup;
    }

    /**
     * Sets the value of the destinationMetroGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationMetroGroup(JAXBElement<String> value) {
        this.destinationMetroGroup = value;
    }

    /**
     * Gets the value of the sellingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSellingCarrier() {
        return sellingCarrier;
    }

    /**
     * Sets the value of the sellingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSellingCarrier(JAXBElement<String> value) {
        this.sellingCarrier = value;
    }

    /**
     * Gets the value of the operatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatingCarrier(JAXBElement<String> value) {
        this.operatingCarrier = value;
    }

    /**
     * Gets the value of the operatingFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatingFlightNumber() {
        return operatingFlightNumber;
    }

    /**
     * Sets the value of the operatingFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatingFlightNumber(JAXBElement<String> value) {
        this.operatingFlightNumber = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivaltime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivaltime() {
        return arrivaltime;
    }

    /**
     * Sets the value of the arrivaltime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivaltime(XMLGregorianCalendar value) {
        this.arrivaltime = value;
    }

    /**
     * Gets the value of the flightDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlightDuration() {
        return flightDuration;
    }

    /**
     * Sets the value of the flightDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlightDuration(BigDecimal value) {
        this.flightDuration = value;
    }

    /**
     * Gets the value of the trip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrip() {
        return trip;
    }

    /**
     * Sets the value of the trip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrip(Integer value) {
        this.trip = value;
    }

    /**
     * Gets the value of the gate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGate() {
        return gate;
    }

    /**
     * Sets the value of the gate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGate(JAXBElement<String> value) {
        this.gate = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalWeight(BigDecimal value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the uiDisplayValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUIDisplayValue() {
        return uiDisplayValue;
    }

    /**
     * Sets the value of the uiDisplayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUIDisplayValue(Integer value) {
        this.uiDisplayValue = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the flightStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlightStatus() {
        return flightStatus;
    }

    /**
     * Sets the value of the flightStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlightStatus(JAXBElement<String> value) {
        this.flightStatus = value;
    }

    /**
     * Gets the value of the customers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomer> getCustomers() {
        return customers;
    }

    /**
     * Sets the value of the customers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomer }{@code >}
     *     
     */
    public void setCustomers(JAXBElement<ArrayOfCustomer> value) {
        this.customers = value;
    }

    /**
     * Gets the value of the fromTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFromTerminal() {
        return fromTerminal;
    }

    /**
     * Sets the value of the fromTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFromTerminal(JAXBElement<String> value) {
        this.fromTerminal = value;
    }

    /**
     * Gets the value of the toTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToTerminal() {
        return toTerminal;
    }

    /**
     * Sets the value of the toTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToTerminal(JAXBElement<String> value) {
        this.toTerminal = value;
    }

    /**
     * Gets the value of the airCraftType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirCraftType() {
        return airCraftType;
    }

    /**
     * Sets the value of the airCraftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirCraftType(JAXBElement<String> value) {
        this.airCraftType = value;
    }

    /**
     * Gets the value of the airCraftDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirCraftDescription() {
        return airCraftDescription;
    }

    /**
     * Sets the value of the airCraftDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirCraftDescription(JAXBElement<String> value) {
        this.airCraftDescription = value;
    }

}

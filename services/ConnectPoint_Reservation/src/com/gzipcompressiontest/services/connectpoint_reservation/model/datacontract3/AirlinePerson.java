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
 * <p>Java class for AirlinePerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlinePerson">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}Person">
 *       &lt;sequence>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FFNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecordNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecordLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalRecordNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ContactInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DropoffID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PickupID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LapChildID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FareClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebFareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareBasisSched" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ResSegStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SegSubStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SelecteeStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CheckinStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Cabin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasTickets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UIDisplayValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterlinedSegment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterlinedCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManualFare" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InventoryOverbooked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TicketCouponNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NVB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketControl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TicketControlOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketControlModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MarketingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmergencyContactID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DisclosedEmergencyContact" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CappsStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ToRecordNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FromRecordNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChangeConsent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StoreFrontID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuranceConfNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuranceTransID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RedressNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KnownTravNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPassenger" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NameChangeCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CrsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareCalcString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endorsement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareTypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FareCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeatAssignments" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfSeatAssignment" minOccurs="0"/>
 *         &lt;element name="SecondaryCRSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Charges" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfCharge" minOccurs="0"/>
 *         &lt;element name="Bags" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response}ArrayOfBaggage" minOccurs="0"/>
 *         &lt;element name="TierID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastGDSStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingRBD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryRecordLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PosOfficeOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PosUserIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PosAirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PosCrsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PosUserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PosIsoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PosIsoCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PosDutyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PosErspIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PosPointOfFirstDeparture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlinePerson", propOrder = {
    "weight",
    "ffNum",
    "paxActive",
    "recordNumber",
    "recordLocator",
    "originalRecordNumber",
    "contactInfo",
    "dropoffID",
    "pickupID",
    "lapChildID",
    "fareClassCode",
    "fareBasisCode",
    "webFareType",
    "fareBasisSched",
    "fareAmount",
    "resSegStatus",
    "segSubStatus",
    "selecteeStatus",
    "checkinStatus",
    "cabin",
    "ticketNumber",
    "hasTickets",
    "uiDisplayValue",
    "interlinedSegment",
    "interlinedCarrierCode",
    "manualFare",
    "inventoryOverbooked",
    "ticketCouponNumber",
    "nvb",
    "nva",
    "ticketControl",
    "ticketControlOwner",
    "ticketControlModifiedDate",
    "marketingCode",
    "marketingOptIn",
    "emergencyContactID",
    "disclosedEmergencyContact",
    "cappsStatus",
    "toRecordNumber",
    "fromRecordNumber",
    "changeConsent",
    "storeFrontID",
    "insuranceConfNum",
    "insuranceTransID",
    "redressNum",
    "knownTravNum",
    "primaryPassenger",
    "nameChangeCount",
    "crsCode",
    "fareCalcString",
    "endorsement",
    "fareTypeID",
    "fareCarrier",
    "ticketDesignator",
    "seatAssignments",
    "secondaryCRSCode",
    "charges",
    "bags",
    "tierID",
    "tierName",
    "lastGDSStatus",
    "operatingRBD",
    "secondaryRecordLocator",
    "posOfficeOrCityCode",
    "posUserIdentificationNumber",
    "posAirportCode",
    "posCrsCode",
    "posUserType",
    "posIsoCountryCode",
    "posIsoCurrency",
    "posDutyCode",
    "posErspIdNumber",
    "posPointOfFirstDeparture",
    "posOffice"
})
public class AirlinePerson
    extends Person
{

    @XmlElement(name = "Weight")
    protected BigDecimal weight;
    @XmlElementRef(name = "FFNum", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ffNum;
    @XmlElement(name = "PaxActive")
    protected Boolean paxActive;
    @XmlElement(name = "RecordNumber")
    protected Integer recordNumber;
    @XmlElementRef(name = "RecordLocator", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recordLocator;
    @XmlElement(name = "OriginalRecordNumber")
    protected Integer originalRecordNumber;
    @XmlElementRef(name = "ContactInfo", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactInfo;
    @XmlElement(name = "DropoffID")
    protected Integer dropoffID;
    @XmlElement(name = "PickupID")
    protected Integer pickupID;
    @XmlElement(name = "LapChildID")
    protected Integer lapChildID;
    @XmlElementRef(name = "FareClassCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareClassCode;
    @XmlElementRef(name = "FareBasisCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareBasisCode;
    @XmlElementRef(name = "WebFareType", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webFareType;
    @XmlElementRef(name = "FareBasisSched", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareBasisSched;
    @XmlElement(name = "FareAmount")
    protected BigDecimal fareAmount;
    @XmlElement(name = "ResSegStatus")
    protected Integer resSegStatus;
    @XmlElement(name = "SegSubStatus")
    protected Integer segSubStatus;
    @XmlElement(name = "SelecteeStatus")
    protected Integer selecteeStatus;
    @XmlElement(name = "CheckinStatus")
    protected Boolean checkinStatus;
    @XmlElementRef(name = "Cabin", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cabin;
    @XmlElementRef(name = "TicketNumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ticketNumber;
    @XmlElement(name = "HasTickets")
    protected Boolean hasTickets;
    @XmlElement(name = "UIDisplayValue")
    protected Integer uiDisplayValue;
    @XmlElement(name = "InterlinedSegment")
    protected Integer interlinedSegment;
    @XmlElementRef(name = "InterlinedCarrierCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interlinedCarrierCode;
    @XmlElement(name = "ManualFare")
    protected Integer manualFare;
    @XmlElement(name = "InventoryOverbooked")
    protected Integer inventoryOverbooked;
    @XmlElementRef(name = "TicketCouponNumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ticketCouponNumber;
    @XmlElementRef(name = "NVB", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nvb;
    @XmlElementRef(name = "NVA", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nva;
    @XmlElement(name = "TicketControl")
    protected Integer ticketControl;
    @XmlElementRef(name = "TicketControlOwner", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ticketControlOwner;
    @XmlElement(name = "TicketControlModifiedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ticketControlModifiedDate;
    @XmlElementRef(name = "MarketingCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketingCode;
    @XmlElement(name = "MarketingOptIn")
    protected Boolean marketingOptIn;
    @XmlElement(name = "EmergencyContactID")
    protected Integer emergencyContactID;
    @XmlElement(name = "DisclosedEmergencyContact")
    protected Integer disclosedEmergencyContact;
    @XmlElement(name = "CappsStatus")
    protected Integer cappsStatus;
    @XmlElement(name = "ToRecordNumber")
    protected Integer toRecordNumber;
    @XmlElement(name = "FromRecordNumber")
    protected Integer fromRecordNumber;
    @XmlElement(name = "ChangeConsent")
    protected Integer changeConsent;
    @XmlElementRef(name = "StoreFrontID", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> storeFrontID;
    @XmlElementRef(name = "InsuranceConfNum", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceConfNum;
    @XmlElementRef(name = "InsuranceTransID", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceTransID;
    @XmlElementRef(name = "RedressNum", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redressNum;
    @XmlElementRef(name = "KnownTravNum", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> knownTravNum;
    @XmlElement(name = "PrimaryPassenger")
    protected Boolean primaryPassenger;
    @XmlElement(name = "NameChangeCount")
    protected Integer nameChangeCount;
    @XmlElementRef(name = "CrsCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crsCode;
    @XmlElementRef(name = "FareCalcString", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareCalcString;
    @XmlElementRef(name = "Endorsement", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endorsement;
    @XmlElement(name = "FareTypeID")
    protected Integer fareTypeID;
    @XmlElementRef(name = "FareCarrier", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareCarrier;
    @XmlElementRef(name = "TicketDesignator", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ticketDesignator;
    @XmlElementRef(name = "SeatAssignments", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSeatAssignment> seatAssignments;
    @XmlElementRef(name = "SecondaryCRSCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secondaryCRSCode;
    @XmlElementRef(name = "Charges", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCharge> charges;
    @XmlElementRef(name = "Bags", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBaggage> bags;
    @XmlElement(name = "TierID")
    protected Integer tierID;
    @XmlElementRef(name = "TierName", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tierName;
    @XmlElementRef(name = "LastGDSStatus", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastGDSStatus;
    @XmlElementRef(name = "OperatingRBD", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operatingRBD;
    @XmlElementRef(name = "SecondaryRecordLocator", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secondaryRecordLocator;
    @XmlElementRef(name = "PosOfficeOrCityCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posOfficeOrCityCode;
    @XmlElementRef(name = "PosUserIdentificationNumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posUserIdentificationNumber;
    @XmlElementRef(name = "PosAirportCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posAirportCode;
    @XmlElementRef(name = "PosCrsCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posCrsCode;
    @XmlElementRef(name = "PosUserType", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posUserType;
    @XmlElementRef(name = "PosIsoCountryCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posIsoCountryCode;
    @XmlElementRef(name = "PosIsoCurrency", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posIsoCurrency;
    @XmlElementRef(name = "PosDutyCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posDutyCode;
    @XmlElementRef(name = "PosErspIdNumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posErspIdNumber;
    @XmlElementRef(name = "PosPointOfFirstDeparture", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posPointOfFirstDeparture;
    @XmlElementRef(name = "POSOffice", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> posOffice;

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
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
     * Gets the value of the paxActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaxActive() {
        return paxActive;
    }

    /**
     * Sets the value of the paxActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaxActive(Boolean value) {
        this.paxActive = value;
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
     * Gets the value of the originalRecordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOriginalRecordNumber() {
        return originalRecordNumber;
    }

    /**
     * Sets the value of the originalRecordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOriginalRecordNumber(Integer value) {
        this.originalRecordNumber = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactInfo(JAXBElement<String> value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the dropoffID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDropoffID() {
        return dropoffID;
    }

    /**
     * Sets the value of the dropoffID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDropoffID(Integer value) {
        this.dropoffID = value;
    }

    /**
     * Gets the value of the pickupID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPickupID() {
        return pickupID;
    }

    /**
     * Sets the value of the pickupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPickupID(Integer value) {
        this.pickupID = value;
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
     * Gets the value of the fareClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareClassCode() {
        return fareClassCode;
    }

    /**
     * Sets the value of the fareClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareClassCode(JAXBElement<String> value) {
        this.fareClassCode = value;
    }

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareBasisCode(JAXBElement<String> value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the webFareType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebFareType() {
        return webFareType;
    }

    /**
     * Sets the value of the webFareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebFareType(JAXBElement<String> value) {
        this.webFareType = value;
    }

    /**
     * Gets the value of the fareBasisSched property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareBasisSched() {
        return fareBasisSched;
    }

    /**
     * Sets the value of the fareBasisSched property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareBasisSched(JAXBElement<String> value) {
        this.fareBasisSched = value;
    }

    /**
     * Gets the value of the fareAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFareAmount() {
        return fareAmount;
    }

    /**
     * Sets the value of the fareAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFareAmount(BigDecimal value) {
        this.fareAmount = value;
    }

    /**
     * Gets the value of the resSegStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResSegStatus() {
        return resSegStatus;
    }

    /**
     * Sets the value of the resSegStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResSegStatus(Integer value) {
        this.resSegStatus = value;
    }

    /**
     * Gets the value of the segSubStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegSubStatus() {
        return segSubStatus;
    }

    /**
     * Sets the value of the segSubStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegSubStatus(Integer value) {
        this.segSubStatus = value;
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
     * Gets the value of the checkinStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckinStatus() {
        return checkinStatus;
    }

    /**
     * Sets the value of the checkinStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckinStatus(Boolean value) {
        this.checkinStatus = value;
    }

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCabin() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCabin(JAXBElement<String> value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTicketNumber(JAXBElement<String> value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the hasTickets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasTickets() {
        return hasTickets;
    }

    /**
     * Sets the value of the hasTickets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasTickets(Boolean value) {
        this.hasTickets = value;
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
     * Gets the value of the interlinedSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterlinedSegment() {
        return interlinedSegment;
    }

    /**
     * Sets the value of the interlinedSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterlinedSegment(Integer value) {
        this.interlinedSegment = value;
    }

    /**
     * Gets the value of the interlinedCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterlinedCarrierCode() {
        return interlinedCarrierCode;
    }

    /**
     * Sets the value of the interlinedCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterlinedCarrierCode(JAXBElement<String> value) {
        this.interlinedCarrierCode = value;
    }

    /**
     * Gets the value of the manualFare property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getManualFare() {
        return manualFare;
    }

    /**
     * Sets the value of the manualFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setManualFare(Integer value) {
        this.manualFare = value;
    }

    /**
     * Gets the value of the inventoryOverbooked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInventoryOverbooked() {
        return inventoryOverbooked;
    }

    /**
     * Sets the value of the inventoryOverbooked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInventoryOverbooked(Integer value) {
        this.inventoryOverbooked = value;
    }

    /**
     * Gets the value of the ticketCouponNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTicketCouponNumber() {
        return ticketCouponNumber;
    }

    /**
     * Sets the value of the ticketCouponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTicketCouponNumber(JAXBElement<String> value) {
        this.ticketCouponNumber = value;
    }

    /**
     * Gets the value of the nvb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNVB() {
        return nvb;
    }

    /**
     * Sets the value of the nvb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNVB(JAXBElement<String> value) {
        this.nvb = value;
    }

    /**
     * Gets the value of the nva property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNVA() {
        return nva;
    }

    /**
     * Sets the value of the nva property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNVA(JAXBElement<String> value) {
        this.nva = value;
    }

    /**
     * Gets the value of the ticketControl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTicketControl() {
        return ticketControl;
    }

    /**
     * Sets the value of the ticketControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTicketControl(Integer value) {
        this.ticketControl = value;
    }

    /**
     * Gets the value of the ticketControlOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTicketControlOwner() {
        return ticketControlOwner;
    }

    /**
     * Sets the value of the ticketControlOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTicketControlOwner(JAXBElement<String> value) {
        this.ticketControlOwner = value;
    }

    /**
     * Gets the value of the ticketControlModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketControlModifiedDate() {
        return ticketControlModifiedDate;
    }

    /**
     * Sets the value of the ticketControlModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTicketControlModifiedDate(XMLGregorianCalendar value) {
        this.ticketControlModifiedDate = value;
    }

    /**
     * Gets the value of the marketingCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingCode() {
        return marketingCode;
    }

    /**
     * Sets the value of the marketingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingCode(JAXBElement<String> value) {
        this.marketingCode = value;
    }

    /**
     * Gets the value of the marketingOptIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketingOptIn() {
        return marketingOptIn;
    }

    /**
     * Sets the value of the marketingOptIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingOptIn(Boolean value) {
        this.marketingOptIn = value;
    }

    /**
     * Gets the value of the emergencyContactID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmergencyContactID() {
        return emergencyContactID;
    }

    /**
     * Sets the value of the emergencyContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmergencyContactID(Integer value) {
        this.emergencyContactID = value;
    }

    /**
     * Gets the value of the disclosedEmergencyContact property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisclosedEmergencyContact() {
        return disclosedEmergencyContact;
    }

    /**
     * Sets the value of the disclosedEmergencyContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisclosedEmergencyContact(Integer value) {
        this.disclosedEmergencyContact = value;
    }

    /**
     * Gets the value of the cappsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCappsStatus() {
        return cappsStatus;
    }

    /**
     * Sets the value of the cappsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCappsStatus(Integer value) {
        this.cappsStatus = value;
    }

    /**
     * Gets the value of the toRecordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getToRecordNumber() {
        return toRecordNumber;
    }

    /**
     * Sets the value of the toRecordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setToRecordNumber(Integer value) {
        this.toRecordNumber = value;
    }

    /**
     * Gets the value of the fromRecordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFromRecordNumber() {
        return fromRecordNumber;
    }

    /**
     * Sets the value of the fromRecordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFromRecordNumber(Integer value) {
        this.fromRecordNumber = value;
    }

    /**
     * Gets the value of the changeConsent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChangeConsent() {
        return changeConsent;
    }

    /**
     * Sets the value of the changeConsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChangeConsent(Integer value) {
        this.changeConsent = value;
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
     * Gets the value of the insuranceConfNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceConfNum() {
        return insuranceConfNum;
    }

    /**
     * Sets the value of the insuranceConfNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceConfNum(JAXBElement<String> value) {
        this.insuranceConfNum = value;
    }

    /**
     * Gets the value of the insuranceTransID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceTransID() {
        return insuranceTransID;
    }

    /**
     * Sets the value of the insuranceTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceTransID(JAXBElement<String> value) {
        this.insuranceTransID = value;
    }

    /**
     * Gets the value of the redressNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedressNum() {
        return redressNum;
    }

    /**
     * Sets the value of the redressNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedressNum(JAXBElement<String> value) {
        this.redressNum = value;
    }

    /**
     * Gets the value of the knownTravNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKnownTravNum() {
        return knownTravNum;
    }

    /**
     * Sets the value of the knownTravNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKnownTravNum(JAXBElement<String> value) {
        this.knownTravNum = value;
    }

    /**
     * Gets the value of the primaryPassenger property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryPassenger() {
        return primaryPassenger;
    }

    /**
     * Sets the value of the primaryPassenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryPassenger(Boolean value) {
        this.primaryPassenger = value;
    }

    /**
     * Gets the value of the nameChangeCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNameChangeCount() {
        return nameChangeCount;
    }

    /**
     * Sets the value of the nameChangeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNameChangeCount(Integer value) {
        this.nameChangeCount = value;
    }

    /**
     * Gets the value of the crsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrsCode() {
        return crsCode;
    }

    /**
     * Sets the value of the crsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrsCode(JAXBElement<String> value) {
        this.crsCode = value;
    }

    /**
     * Gets the value of the fareCalcString property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareCalcString() {
        return fareCalcString;
    }

    /**
     * Sets the value of the fareCalcString property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareCalcString(JAXBElement<String> value) {
        this.fareCalcString = value;
    }

    /**
     * Gets the value of the endorsement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndorsement() {
        return endorsement;
    }

    /**
     * Sets the value of the endorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndorsement(JAXBElement<String> value) {
        this.endorsement = value;
    }

    /**
     * Gets the value of the fareTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFareTypeID() {
        return fareTypeID;
    }

    /**
     * Sets the value of the fareTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFareTypeID(Integer value) {
        this.fareTypeID = value;
    }

    /**
     * Gets the value of the fareCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareCarrier() {
        return fareCarrier;
    }

    /**
     * Sets the value of the fareCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareCarrier(JAXBElement<String> value) {
        this.fareCarrier = value;
    }

    /**
     * Gets the value of the ticketDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTicketDesignator() {
        return ticketDesignator;
    }

    /**
     * Sets the value of the ticketDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTicketDesignator(JAXBElement<String> value) {
        this.ticketDesignator = value;
    }

    /**
     * Gets the value of the seatAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeatAssignment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSeatAssignment> getSeatAssignments() {
        return seatAssignments;
    }

    /**
     * Sets the value of the seatAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeatAssignment }{@code >}
     *     
     */
    public void setSeatAssignments(JAXBElement<ArrayOfSeatAssignment> value) {
        this.seatAssignments = value;
    }

    /**
     * Gets the value of the secondaryCRSCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecondaryCRSCode() {
        return secondaryCRSCode;
    }

    /**
     * Sets the value of the secondaryCRSCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecondaryCRSCode(JAXBElement<String> value) {
        this.secondaryCRSCode = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCharge }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCharge> getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCharge }{@code >}
     *     
     */
    public void setCharges(JAXBElement<ArrayOfCharge> value) {
        this.charges = value;
    }

    /**
     * Gets the value of the bags property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBaggage }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBaggage> getBags() {
        return bags;
    }

    /**
     * Sets the value of the bags property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBaggage }{@code >}
     *     
     */
    public void setBags(JAXBElement<ArrayOfBaggage> value) {
        this.bags = value;
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
     * Gets the value of the lastGDSStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastGDSStatus() {
        return lastGDSStatus;
    }

    /**
     * Sets the value of the lastGDSStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastGDSStatus(JAXBElement<String> value) {
        this.lastGDSStatus = value;
    }

    /**
     * Gets the value of the operatingRBD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatingRBD() {
        return operatingRBD;
    }

    /**
     * Sets the value of the operatingRBD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatingRBD(JAXBElement<String> value) {
        this.operatingRBD = value;
    }

    /**
     * Gets the value of the secondaryRecordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecondaryRecordLocator() {
        return secondaryRecordLocator;
    }

    /**
     * Sets the value of the secondaryRecordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecondaryRecordLocator(JAXBElement<String> value) {
        this.secondaryRecordLocator = value;
    }

    /**
     * Gets the value of the posOfficeOrCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosOfficeOrCityCode() {
        return posOfficeOrCityCode;
    }

    /**
     * Sets the value of the posOfficeOrCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosOfficeOrCityCode(JAXBElement<String> value) {
        this.posOfficeOrCityCode = value;
    }

    /**
     * Gets the value of the posUserIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosUserIdentificationNumber() {
        return posUserIdentificationNumber;
    }

    /**
     * Sets the value of the posUserIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosUserIdentificationNumber(JAXBElement<String> value) {
        this.posUserIdentificationNumber = value;
    }

    /**
     * Gets the value of the posAirportCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosAirportCode() {
        return posAirportCode;
    }

    /**
     * Sets the value of the posAirportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosAirportCode(JAXBElement<String> value) {
        this.posAirportCode = value;
    }

    /**
     * Gets the value of the posCrsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosCrsCode() {
        return posCrsCode;
    }

    /**
     * Sets the value of the posCrsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosCrsCode(JAXBElement<String> value) {
        this.posCrsCode = value;
    }

    /**
     * Gets the value of the posUserType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosUserType() {
        return posUserType;
    }

    /**
     * Sets the value of the posUserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosUserType(JAXBElement<String> value) {
        this.posUserType = value;
    }

    /**
     * Gets the value of the posIsoCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosIsoCountryCode() {
        return posIsoCountryCode;
    }

    /**
     * Sets the value of the posIsoCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosIsoCountryCode(JAXBElement<String> value) {
        this.posIsoCountryCode = value;
    }

    /**
     * Gets the value of the posIsoCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosIsoCurrency() {
        return posIsoCurrency;
    }

    /**
     * Sets the value of the posIsoCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosIsoCurrency(JAXBElement<String> value) {
        this.posIsoCurrency = value;
    }

    /**
     * Gets the value of the posDutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosDutyCode() {
        return posDutyCode;
    }

    /**
     * Sets the value of the posDutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosDutyCode(JAXBElement<String> value) {
        this.posDutyCode = value;
    }

    /**
     * Gets the value of the posErspIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosErspIdNumber() {
        return posErspIdNumber;
    }

    /**
     * Sets the value of the posErspIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosErspIdNumber(JAXBElement<String> value) {
        this.posErspIdNumber = value;
    }

    /**
     * Gets the value of the posPointOfFirstDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPosPointOfFirstDeparture() {
        return posPointOfFirstDeparture;
    }

    /**
     * Sets the value of the posPointOfFirstDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPosPointOfFirstDeparture(JAXBElement<String> value) {
        this.posPointOfFirstDeparture = value;
    }

    /**
     * Gets the value of the posOffice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOSOffice() {
        return posOffice;
    }

    /**
     * Sets the value of the posOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOSOffice(JAXBElement<String> value) {
        this.posOffice = value;
    }

}

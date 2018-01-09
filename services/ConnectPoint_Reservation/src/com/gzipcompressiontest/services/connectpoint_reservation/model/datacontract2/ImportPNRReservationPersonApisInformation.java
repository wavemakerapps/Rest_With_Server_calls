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
 * <p>Java class for ImportPNR.Reservation.Person.ApisInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportPNR.Reservation.Person.ApisInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApisInfoIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SeriesNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RecordNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Citizenship" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResidenceCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CrewType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HomeAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HomeCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HomeState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HomePostal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HomeCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DestinationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DestinationCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DestinationState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DestinationPostal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DestinationCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Embarkation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BirthCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BirthState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BirthCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentType1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IssueCountry1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExpirationDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentType2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentNumber2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IssueCountry2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExpirationDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResultMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhysicalFlightID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActualDepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Debarkation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Arrival" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentScanned1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentScanned2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportPNR.Reservation.Person.ApisInformation", propOrder = {
    "apisInfoIndex",
    "seriesNumber",
    "confirmationNumber",
    "recordNumber",
    "lastName",
    "firstName",
    "middleName",
    "birthDate",
    "gender",
    "citizenship",
    "residenceCountry",
    "status",
    "crewType",
    "homeAddress",
    "homeCity",
    "homeState",
    "homePostal",
    "homeCountry",
    "destinationAddress",
    "destinationCity",
    "destinationState",
    "destinationPostal",
    "destinationCountry",
    "embarkation",
    "birthCity",
    "birthState",
    "birthCountry",
    "documentType1",
    "documentNumber",
    "issueCountry1",
    "expirationDate1",
    "documentType2",
    "documentNumber2",
    "issueCountry2",
    "expirationDate2",
    "resultCode",
    "resultMessage",
    "physicalFlightID",
    "actualDepartureDate",
    "flightNumber",
    "debarkation",
    "arrival",
    "documentScanned1",
    "documentScanned2"
})
public class ImportPNRReservationPersonApisInformation {

    @XmlElement(name = "ApisInfoIndex")
    protected int apisInfoIndex;
    @XmlElement(name = "SeriesNumber", required = true, nillable = true)
    protected String seriesNumber;
    @XmlElement(name = "ConfirmationNumber", required = true, nillable = true)
    protected String confirmationNumber;
    @XmlElement(name = "RecordNumber", required = true, nillable = true)
    protected String recordNumber;
    @XmlElement(name = "LastName", required = true, nillable = true)
    protected String lastName;
    @XmlElement(name = "FirstName", required = true, nillable = true)
    protected String firstName;
    @XmlElement(name = "MiddleName", required = true, nillable = true)
    protected String middleName;
    @XmlElement(name = "BirthDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "Gender", required = true, nillable = true)
    protected String gender;
    @XmlElement(name = "Citizenship", required = true, nillable = true)
    protected String citizenship;
    @XmlElement(name = "ResidenceCountry", required = true, nillable = true)
    protected String residenceCountry;
    @XmlElement(name = "Status", required = true, nillable = true)
    protected String status;
    @XmlElement(name = "CrewType", required = true, nillable = true)
    protected String crewType;
    @XmlElement(name = "HomeAddress", required = true, nillable = true)
    protected String homeAddress;
    @XmlElement(name = "HomeCity", required = true, nillable = true)
    protected String homeCity;
    @XmlElement(name = "HomeState", required = true, nillable = true)
    protected String homeState;
    @XmlElement(name = "HomePostal", required = true, nillable = true)
    protected String homePostal;
    @XmlElement(name = "HomeCountry", required = true, nillable = true)
    protected String homeCountry;
    @XmlElement(name = "DestinationAddress", required = true, nillable = true)
    protected String destinationAddress;
    @XmlElement(name = "DestinationCity", required = true, nillable = true)
    protected String destinationCity;
    @XmlElement(name = "DestinationState", required = true, nillable = true)
    protected String destinationState;
    @XmlElement(name = "DestinationPostal", required = true, nillable = true)
    protected String destinationPostal;
    @XmlElement(name = "DestinationCountry", required = true, nillable = true)
    protected String destinationCountry;
    @XmlElement(name = "Embarkation", required = true, nillable = true)
    protected String embarkation;
    @XmlElement(name = "BirthCity", required = true, nillable = true)
    protected String birthCity;
    @XmlElement(name = "BirthState", required = true, nillable = true)
    protected String birthState;
    @XmlElement(name = "BirthCountry", required = true, nillable = true)
    protected String birthCountry;
    @XmlElement(name = "DocumentType1", required = true, nillable = true)
    protected String documentType1;
    @XmlElement(name = "DocumentNumber", required = true, nillable = true)
    protected String documentNumber;
    @XmlElement(name = "IssueCountry1", required = true, nillable = true)
    protected String issueCountry1;
    @XmlElement(name = "ExpirationDate1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate1;
    @XmlElement(name = "DocumentType2", required = true, nillable = true)
    protected String documentType2;
    @XmlElement(name = "DocumentNumber2", required = true, nillable = true)
    protected String documentNumber2;
    @XmlElement(name = "IssueCountry2", required = true, nillable = true)
    protected String issueCountry2;
    @XmlElement(name = "ExpirationDate2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate2;
    @XmlElement(name = "ResultCode", required = true, nillable = true)
    protected String resultCode;
    @XmlElement(name = "ResultMessage", required = true, nillable = true)
    protected String resultMessage;
    @XmlElement(name = "PhysicalFlightID", required = true, nillable = true)
    protected String physicalFlightID;
    @XmlElement(name = "ActualDepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDepartureDate;
    @XmlElement(name = "FlightNumber", required = true, nillable = true)
    protected String flightNumber;
    @XmlElement(name = "Debarkation", required = true, nillable = true)
    protected String debarkation;
    @XmlElement(name = "Arrival", required = true, nillable = true)
    protected String arrival;
    @XmlElement(name = "DocumentScanned1", required = true, nillable = true)
    protected String documentScanned1;
    @XmlElement(name = "DocumentScanned2", required = true, nillable = true)
    protected String documentScanned2;

    /**
     * Gets the value of the apisInfoIndex property.
     * 
     */
    public int getApisInfoIndex() {
        return apisInfoIndex;
    }

    /**
     * Sets the value of the apisInfoIndex property.
     * 
     */
    public void setApisInfoIndex(int value) {
        this.apisInfoIndex = value;
    }

    /**
     * Gets the value of the seriesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesNumber() {
        return seriesNumber;
    }

    /**
     * Sets the value of the seriesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesNumber(String value) {
        this.seriesNumber = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the recordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /**
     * Sets the value of the recordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordNumber(String value) {
        this.recordNumber = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenship(String value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the residenceCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceCountry() {
        return residenceCountry;
    }

    /**
     * Sets the value of the residenceCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceCountry(String value) {
        this.residenceCountry = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the crewType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrewType() {
        return crewType;
    }

    /**
     * Sets the value of the crewType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrewType(String value) {
        this.crewType = value;
    }

    /**
     * Gets the value of the homeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * Sets the value of the homeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeAddress(String value) {
        this.homeAddress = value;
    }

    /**
     * Gets the value of the homeCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCity() {
        return homeCity;
    }

    /**
     * Sets the value of the homeCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeCity(String value) {
        this.homeCity = value;
    }

    /**
     * Gets the value of the homeState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeState() {
        return homeState;
    }

    /**
     * Sets the value of the homeState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeState(String value) {
        this.homeState = value;
    }

    /**
     * Gets the value of the homePostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePostal() {
        return homePostal;
    }

    /**
     * Sets the value of the homePostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePostal(String value) {
        this.homePostal = value;
    }

    /**
     * Gets the value of the homeCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCountry() {
        return homeCountry;
    }

    /**
     * Sets the value of the homeCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeCountry(String value) {
        this.homeCountry = value;
    }

    /**
     * Gets the value of the destinationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Sets the value of the destinationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAddress(String value) {
        this.destinationAddress = value;
    }

    /**
     * Gets the value of the destinationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCity() {
        return destinationCity;
    }

    /**
     * Sets the value of the destinationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCity(String value) {
        this.destinationCity = value;
    }

    /**
     * Gets the value of the destinationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationState() {
        return destinationState;
    }

    /**
     * Sets the value of the destinationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationState(String value) {
        this.destinationState = value;
    }

    /**
     * Gets the value of the destinationPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationPostal() {
        return destinationPostal;
    }

    /**
     * Sets the value of the destinationPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationPostal(String value) {
        this.destinationPostal = value;
    }

    /**
     * Gets the value of the destinationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /**
     * Sets the value of the destinationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountry(String value) {
        this.destinationCountry = value;
    }

    /**
     * Gets the value of the embarkation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbarkation() {
        return embarkation;
    }

    /**
     * Sets the value of the embarkation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbarkation(String value) {
        this.embarkation = value;
    }

    /**
     * Gets the value of the birthCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCity() {
        return birthCity;
    }

    /**
     * Sets the value of the birthCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCity(String value) {
        this.birthCity = value;
    }

    /**
     * Gets the value of the birthState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthState() {
        return birthState;
    }

    /**
     * Sets the value of the birthState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthState(String value) {
        this.birthState = value;
    }

    /**
     * Gets the value of the birthCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCountry() {
        return birthCountry;
    }

    /**
     * Sets the value of the birthCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCountry(String value) {
        this.birthCountry = value;
    }

    /**
     * Gets the value of the documentType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType1() {
        return documentType1;
    }

    /**
     * Sets the value of the documentType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType1(String value) {
        this.documentType1 = value;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the issueCountry1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueCountry1() {
        return issueCountry1;
    }

    /**
     * Sets the value of the issueCountry1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueCountry1(String value) {
        this.issueCountry1 = value;
    }

    /**
     * Gets the value of the expirationDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate1() {
        return expirationDate1;
    }

    /**
     * Sets the value of the expirationDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate1(XMLGregorianCalendar value) {
        this.expirationDate1 = value;
    }

    /**
     * Gets the value of the documentType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType2() {
        return documentType2;
    }

    /**
     * Sets the value of the documentType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType2(String value) {
        this.documentType2 = value;
    }

    /**
     * Gets the value of the documentNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber2() {
        return documentNumber2;
    }

    /**
     * Sets the value of the documentNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber2(String value) {
        this.documentNumber2 = value;
    }

    /**
     * Gets the value of the issueCountry2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueCountry2() {
        return issueCountry2;
    }

    /**
     * Sets the value of the issueCountry2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueCountry2(String value) {
        this.issueCountry2 = value;
    }

    /**
     * Gets the value of the expirationDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate2() {
        return expirationDate2;
    }

    /**
     * Sets the value of the expirationDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate2(XMLGregorianCalendar value) {
        this.expirationDate2 = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultMessage() {
        return resultMessage;
    }

    /**
     * Sets the value of the resultMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultMessage(String value) {
        this.resultMessage = value;
    }

    /**
     * Gets the value of the physicalFlightID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalFlightID() {
        return physicalFlightID;
    }

    /**
     * Sets the value of the physicalFlightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalFlightID(String value) {
        this.physicalFlightID = value;
    }

    /**
     * Gets the value of the actualDepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDepartureDate() {
        return actualDepartureDate;
    }

    /**
     * Sets the value of the actualDepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDepartureDate(XMLGregorianCalendar value) {
        this.actualDepartureDate = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the debarkation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebarkation() {
        return debarkation;
    }

    /**
     * Sets the value of the debarkation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebarkation(String value) {
        this.debarkation = value;
    }

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrival(String value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the documentScanned1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentScanned1() {
        return documentScanned1;
    }

    /**
     * Sets the value of the documentScanned1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentScanned1(String value) {
        this.documentScanned1 = value;
    }

    /**
     * Gets the value of the documentScanned2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentScanned2() {
        return documentScanned2;
    }

    /**
     * Sets the value of the documentScanned2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentScanned2(String value) {
        this.documentScanned2 = value;
    }

}

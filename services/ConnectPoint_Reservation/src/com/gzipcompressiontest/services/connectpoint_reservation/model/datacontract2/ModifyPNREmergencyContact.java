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
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.EnumerationsContactTypes;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.EnumerationsGenderTypes;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.EnumerationsRelationshipTypes;


/**
 * <p>Java class for ModifyPNR.EmergencyContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyPNR.EmergencyContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Gender" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}Enumerations.GenderTypes"/>
 *         &lt;element name="RelationType" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}Enumerations.RelationshipTypes"/>
 *         &lt;element name="Address" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}Address"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactType" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}Enumerations.ContactTypes"/>
 *         &lt;element name="ContactInformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DisclosedEmergencyContact" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReservationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogicalFlightKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhysicalFlightKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AirlinePersonKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyPNR.EmergencyContact", propOrder = {
    "title",
    "firstName",
    "lastName",
    "middleName",
    "age",
    "dob",
    "gender",
    "relationType",
    "address",
    "company",
    "comments",
    "contactType",
    "contactInformation",
    "disclosedEmergencyContact",
    "reservationKey",
    "logicalFlightKey",
    "physicalFlightKey",
    "customerKey",
    "airlinePersonKey"
})
public class ModifyPNREmergencyContact {

    @XmlElement(name = "Title", required = true, nillable = true)
    protected String title;
    @XmlElement(name = "FirstName", required = true, nillable = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true, nillable = true)
    protected String lastName;
    @XmlElement(name = "MiddleName", required = true, nillable = true)
    protected String middleName;
    @XmlElement(name = "Age")
    protected int age;
    @XmlElement(name = "DOB", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dob;
    @XmlElement(name = "Gender", required = true)
    protected EnumerationsGenderTypes gender;
    @XmlElement(name = "RelationType", required = true)
    protected EnumerationsRelationshipTypes relationType;
    @XmlElement(name = "Address", required = true, nillable = true)
    protected Address address;
    @XmlElement(name = "Company", required = true, nillable = true)
    protected String company;
    @XmlElement(name = "Comments", required = true, nillable = true)
    protected String comments;
    @XmlElement(name = "ContactType", required = true)
    protected EnumerationsContactTypes contactType;
    @XmlElement(name = "ContactInformation", required = true, nillable = true)
    protected String contactInformation;
    @XmlElement(name = "DisclosedEmergencyContact")
    protected boolean disclosedEmergencyContact;
    @XmlElement(name = "ReservationKey", required = true, nillable = true)
    protected String reservationKey;
    @XmlElement(name = "LogicalFlightKey", required = true, nillable = true)
    protected String logicalFlightKey;
    @XmlElement(name = "PhysicalFlightKey", required = true, nillable = true)
    protected String physicalFlightKey;
    @XmlElement(name = "CustomerKey", required = true, nillable = true)
    protected String customerKey;
    @XmlElement(name = "AirlinePersonKey", required = true, nillable = true)
    protected String airlinePersonKey;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDOB(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link EnumerationsGenderTypes }
     *     
     */
    public EnumerationsGenderTypes getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationsGenderTypes }
     *     
     */
    public void setGender(EnumerationsGenderTypes value) {
        this.gender = value;
    }

    /**
     * Gets the value of the relationType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumerationsRelationshipTypes }
     *     
     */
    public EnumerationsRelationshipTypes getRelationType() {
        return relationType;
    }

    /**
     * Sets the value of the relationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationsRelationshipTypes }
     *     
     */
    public void setRelationType(EnumerationsRelationshipTypes value) {
        this.relationType = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumerationsContactTypes }
     *     
     */
    public EnumerationsContactTypes getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationsContactTypes }
     *     
     */
    public void setContactType(EnumerationsContactTypes value) {
        this.contactType = value;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInformation(String value) {
        this.contactInformation = value;
    }

    /**
     * Gets the value of the disclosedEmergencyContact property.
     * 
     */
    public boolean isDisclosedEmergencyContact() {
        return disclosedEmergencyContact;
    }

    /**
     * Sets the value of the disclosedEmergencyContact property.
     * 
     */
    public void setDisclosedEmergencyContact(boolean value) {
        this.disclosedEmergencyContact = value;
    }

    /**
     * Gets the value of the reservationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationKey() {
        return reservationKey;
    }

    /**
     * Sets the value of the reservationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationKey(String value) {
        this.reservationKey = value;
    }

    /**
     * Gets the value of the logicalFlightKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalFlightKey() {
        return logicalFlightKey;
    }

    /**
     * Sets the value of the logicalFlightKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalFlightKey(String value) {
        this.logicalFlightKey = value;
    }

    /**
     * Gets the value of the physicalFlightKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalFlightKey() {
        return physicalFlightKey;
    }

    /**
     * Sets the value of the physicalFlightKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalFlightKey(String value) {
        this.physicalFlightKey = value;
    }

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerKey(String value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the airlinePersonKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlinePersonKey() {
        return airlinePersonKey;
    }

    /**
     * Sets the value of the airlinePersonKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlinePersonKey(String value) {
        this.airlinePersonKey = value;
    }

}

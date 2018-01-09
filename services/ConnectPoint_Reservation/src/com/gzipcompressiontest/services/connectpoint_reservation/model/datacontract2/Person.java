/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.EnumerationsGenderTypes;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.EnumerationsRelationshipTypes;


/**
 * <p>Java class for Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonOrgID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Gender" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}Enumerations.GenderTypes"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NationalityLaguageID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RelationType" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}Enumerations.RelationshipTypes"/>
 *         &lt;element name="WBCID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PTCID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PTC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TravelsWithPersonOrgID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RedressNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KnownTravelerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MarketingOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UseInventory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Address" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}Address"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Passport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IsPrimaryPassenger" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DocumentInfos" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfDocumentInfo" minOccurs="0"/>
 *         &lt;element name="ContactInfos" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfContactInfo"/>
 *         &lt;element name="FrequentFlyerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassportIssueCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassportExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "personOrgID",
    "firstName",
    "lastName",
    "middleName",
    "age",
    "dob",
    "gender",
    "title",
    "nationalityLaguageID",
    "relationType",
    "wbcid",
    "ptcid",
    "ptc",
    "travelsWithPersonOrgID",
    "redressNumber",
    "knownTravelerNumber",
    "marketingOptIn",
    "useInventory",
    "address",
    "company",
    "comments",
    "passport",
    "nationality",
    "profileId",
    "isPrimaryPassenger",
    "documentInfos",
    "contactInfos",
    "frequentFlyerNumber",
    "suffix",
    "tierName",
    "passportIssueCountry",
    "passportExpiryDate"
})
public class Person {

    @XmlElement(name = "PersonOrgID")
    protected int personOrgID;
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
    @XmlElement(name = "Gender", required = true, nillable = true)
    protected EnumerationsGenderTypes gender;
    @XmlElement(name = "Title", required = true, nillable = true)
    protected String title;
    @XmlElement(name = "NationalityLaguageID")
    protected int nationalityLaguageID;
    @XmlElement(name = "RelationType", required = true)
    protected EnumerationsRelationshipTypes relationType;
    @XmlElement(name = "WBCID")
    protected int wbcid;
    @XmlElement(name = "PTCID")
    protected int ptcid;
    @XmlElement(name = "PTC", required = true, nillable = true)
    protected String ptc;
    @XmlElement(name = "TravelsWithPersonOrgID")
    protected int travelsWithPersonOrgID;
    @XmlElement(name = "RedressNumber", required = true, nillable = true)
    protected String redressNumber;
    @XmlElement(name = "KnownTravelerNumber", required = true, nillable = true)
    protected String knownTravelerNumber;
    @XmlElement(name = "MarketingOptIn")
    protected boolean marketingOptIn;
    @XmlElement(name = "UseInventory")
    protected boolean useInventory;
    @XmlElement(name = "Address", required = true, nillable = true)
    protected Address address;
    @XmlElement(name = "Company", required = true, nillable = true)
    protected String company;
    @XmlElement(name = "Comments", required = true, nillable = true)
    protected String comments;
    @XmlElement(name = "Passport", required = true, nillable = true)
    protected String passport;
    @XmlElement(name = "Nationality", required = true, nillable = true)
    protected String nationality;
    @XmlElement(name = "ProfileId")
    protected long profileId;
    @XmlElement(name = "IsPrimaryPassenger")
    protected boolean isPrimaryPassenger;
    @XmlElementRef(name = "DocumentInfos", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDocumentInfo> documentInfos;
    @XmlElement(name = "ContactInfos", required = true, nillable = true)
    protected ArrayOfContactInfo contactInfos;
    @XmlElementRef(name = "FrequentFlyerNumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> frequentFlyerNumber;
    @XmlElementRef(name = "Suffix", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suffix;
    @XmlElementRef(name = "TierName", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tierName;
    @XmlElementRef(name = "PassportIssueCountry", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passportIssueCountry;
    @XmlElement(name = "PassportExpiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passportExpiryDate;

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
     * Gets the value of the nationalityLaguageID property.
     * 
     */
    public int getNationalityLaguageID() {
        return nationalityLaguageID;
    }

    /**
     * Sets the value of the nationalityLaguageID property.
     * 
     */
    public void setNationalityLaguageID(int value) {
        this.nationalityLaguageID = value;
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
     * Gets the value of the wbcid property.
     * 
     */
    public int getWBCID() {
        return wbcid;
    }

    /**
     * Sets the value of the wbcid property.
     * 
     */
    public void setWBCID(int value) {
        this.wbcid = value;
    }

    /**
     * Gets the value of the ptcid property.
     * 
     */
    public int getPTCID() {
        return ptcid;
    }

    /**
     * Sets the value of the ptcid property.
     * 
     */
    public void setPTCID(int value) {
        this.ptcid = value;
    }

    /**
     * Gets the value of the ptc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTC() {
        return ptc;
    }

    /**
     * Sets the value of the ptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTC(String value) {
        this.ptc = value;
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
     * Gets the value of the marketingOptIn property.
     * 
     */
    public boolean isMarketingOptIn() {
        return marketingOptIn;
    }

    /**
     * Sets the value of the marketingOptIn property.
     * 
     */
    public void setMarketingOptIn(boolean value) {
        this.marketingOptIn = value;
    }

    /**
     * Gets the value of the useInventory property.
     * 
     */
    public boolean isUseInventory() {
        return useInventory;
    }

    /**
     * Sets the value of the useInventory property.
     * 
     */
    public void setUseInventory(boolean value) {
        this.useInventory = value;
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
     * Gets the value of the passport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Sets the value of the passport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassport(String value) {
        this.passport = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the profileId property.
     * 
     */
    public long getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     */
    public void setProfileId(long value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the isPrimaryPassenger property.
     * 
     */
    public boolean isIsPrimaryPassenger() {
        return isPrimaryPassenger;
    }

    /**
     * Sets the value of the isPrimaryPassenger property.
     * 
     */
    public void setIsPrimaryPassenger(boolean value) {
        this.isPrimaryPassenger = value;
    }

    /**
     * Gets the value of the documentInfos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumentInfo> getDocumentInfos() {
        return documentInfos;
    }

    /**
     * Sets the value of the documentInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentInfo }{@code >}
     *     
     */
    public void setDocumentInfos(JAXBElement<ArrayOfDocumentInfo> value) {
        this.documentInfos = value;
    }

    /**
     * Gets the value of the contactInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactInfo }
     *     
     */
    public ArrayOfContactInfo getContactInfos() {
        return contactInfos;
    }

    /**
     * Sets the value of the contactInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactInfo }
     *     
     */
    public void setContactInfos(ArrayOfContactInfo value) {
        this.contactInfos = value;
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
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuffix(JAXBElement<String> value) {
        this.suffix = value;
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
     * Gets the value of the passportIssueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassportIssueCountry() {
        return passportIssueCountry;
    }

    /**
     * Sets the value of the passportIssueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassportIssueCountry(JAXBElement<String> value) {
        this.passportIssueCountry = value;
    }

    /**
     * Gets the value of the passportExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPassportExpiryDate() {
        return passportExpiryDate;
    }

    /**
     * Sets the value of the passportExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPassportExpiryDate(XMLGregorianCalendar value) {
        this.passportExpiryDate = value;
    }

}

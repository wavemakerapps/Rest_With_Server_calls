/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.EnumerationsContactTypes;


/**
 * <p>Java class for ContactInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonOrgID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ContactField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactType" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}Enumerations.ContactTypes"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AreaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Display" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PreferredContactMethod" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ValidatedContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfo", propOrder = {
    "contactID",
    "personOrgID",
    "contactField",
    "contactType",
    "extension",
    "countryCode",
    "areaCode",
    "phoneNumber",
    "display",
    "preferredContactMethod",
    "validatedContact"
})
@XmlSeeAlso({
    ModifyPNRAddContactInfo.class,
    ModifyPNRUpdateContactInfo.class
})
public class ContactInfo {

    @XmlElement(name = "ContactID")
    protected int contactID;
    @XmlElement(name = "PersonOrgID")
    protected int personOrgID;
    @XmlElement(name = "ContactField", required = true, nillable = true)
    protected String contactField;
    @XmlElement(name = "ContactType", required = true)
    protected EnumerationsContactTypes contactType;
    @XmlElement(name = "Extension", required = true, nillable = true)
    protected String extension;
    @XmlElement(name = "CountryCode", required = true, nillable = true)
    protected String countryCode;
    @XmlElement(name = "AreaCode", required = true, nillable = true)
    protected String areaCode;
    @XmlElement(name = "PhoneNumber", required = true, nillable = true)
    protected String phoneNumber;
    @XmlElement(name = "Display", required = true, nillable = true)
    protected String display;
    @XmlElement(name = "PreferredContactMethod")
    protected boolean preferredContactMethod;
    @XmlElement(name = "ValidatedContact")
    protected Boolean validatedContact;

    /**
     * Gets the value of the contactID property.
     * 
     */
    public int getContactID() {
        return contactID;
    }

    /**
     * Sets the value of the contactID property.
     * 
     */
    public void setContactID(int value) {
        this.contactID = value;
    }

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
     * Gets the value of the contactField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactField() {
        return contactField;
    }

    /**
     * Sets the value of the contactField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactField(String value) {
        this.contactField = value;
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
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplay(String value) {
        this.display = value;
    }

    /**
     * Gets the value of the preferredContactMethod property.
     * 
     */
    public boolean isPreferredContactMethod() {
        return preferredContactMethod;
    }

    /**
     * Sets the value of the preferredContactMethod property.
     * 
     */
    public void setPreferredContactMethod(boolean value) {
        this.preferredContactMethod = value;
    }

    /**
     * Gets the value of the validatedContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidatedContact() {
        return validatedContact;
    }

    /**
     * Sets the value of the validatedContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidatedContact(Boolean value) {
        this.validatedContact = value;
    }

}

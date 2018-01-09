/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.EnumerationsCurrencyCodeTypes;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.EnumerationsSSRStatus;


/**
 * <p>Java class for SpecialService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SSRCategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LogicalFlightID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OverrideAmount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CurrencyCode" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}Enumerations.CurrencyCodeTypes"/>
 *         &lt;element name="Commissionable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Refundable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ChargeComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PersonOrgID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PhysicalFlightID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OverrideAmtReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtPenaltyRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtIsRePriceFixed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtRePriceSourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtRePriceValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtRePriceValueReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSRStatus" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}Enumerations.SSRStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialService", propOrder = {
    "codeType",
    "serviceID",
    "ssrCategory",
    "logicalFlightID",
    "departureDate",
    "amount",
    "overrideAmount",
    "currencyCode",
    "commissionable",
    "refundable",
    "chargeComment",
    "personOrgID",
    "physicalFlightID",
    "overrideAmtReason",
    "extPenaltyRule",
    "extIsRePriceFixed",
    "extRePriceSourceName",
    "extRePriceValue",
    "extRePriceValueReason",
    "ssrStatus"
})
public class SpecialService {

    @XmlElement(name = "CodeType", required = true, nillable = true)
    protected String codeType;
    @XmlElement(name = "ServiceID")
    protected int serviceID;
    @XmlElement(name = "SSRCategory")
    protected int ssrCategory;
    @XmlElement(name = "LogicalFlightID")
    protected int logicalFlightID;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "OverrideAmount")
    protected boolean overrideAmount;
    @XmlElement(name = "CurrencyCode", required = true)
    protected EnumerationsCurrencyCodeTypes currencyCode;
    @XmlElement(name = "Commissionable")
    protected Boolean commissionable;
    @XmlElement(name = "Refundable")
    protected Boolean refundable;
    @XmlElement(name = "ChargeComment", required = true, nillable = true)
    protected String chargeComment;
    @XmlElement(name = "PersonOrgID")
    protected int personOrgID;
    @XmlElementRef(name = "PhysicalFlightID", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> physicalFlightID;
    @XmlElementRef(name = "OverrideAmtReason", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overrideAmtReason;
    @XmlElementRef(name = "ExtPenaltyRule", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extPenaltyRule;
    @XmlElementRef(name = "ExtIsRePriceFixed", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extIsRePriceFixed;
    @XmlElementRef(name = "ExtRePriceSourceName", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extRePriceSourceName;
    @XmlElementRef(name = "ExtRePriceValue", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extRePriceValue;
    @XmlElementRef(name = "ExtRePriceValueReason", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extRePriceValueReason;
    @XmlElementRef(name = "SSRStatus", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<EnumerationsSSRStatus> ssrStatus;

    /**
     * Gets the value of the codeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeType() {
        return codeType;
    }

    /**
     * Sets the value of the codeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeType(String value) {
        this.codeType = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     */
    public int getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     */
    public void setServiceID(int value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the ssrCategory property.
     * 
     */
    public int getSSRCategory() {
        return ssrCategory;
    }

    /**
     * Sets the value of the ssrCategory property.
     * 
     */
    public void setSSRCategory(int value) {
        this.ssrCategory = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the overrideAmount property.
     * 
     */
    public boolean isOverrideAmount() {
        return overrideAmount;
    }

    /**
     * Sets the value of the overrideAmount property.
     * 
     */
    public void setOverrideAmount(boolean value) {
        this.overrideAmount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link EnumerationsCurrencyCodeTypes }
     *     
     */
    public EnumerationsCurrencyCodeTypes getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationsCurrencyCodeTypes }
     *     
     */
    public void setCurrencyCode(EnumerationsCurrencyCodeTypes value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the commissionable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommissionable() {
        return commissionable;
    }

    /**
     * Sets the value of the commissionable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommissionable(Boolean value) {
        this.commissionable = value;
    }

    /**
     * Gets the value of the refundable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundable() {
        return refundable;
    }

    /**
     * Sets the value of the refundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundable(Boolean value) {
        this.refundable = value;
    }

    /**
     * Gets the value of the chargeComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeComment() {
        return chargeComment;
    }

    /**
     * Sets the value of the chargeComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeComment(String value) {
        this.chargeComment = value;
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
     * Gets the value of the physicalFlightID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPhysicalFlightID() {
        return physicalFlightID;
    }

    /**
     * Sets the value of the physicalFlightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPhysicalFlightID(JAXBElement<Integer> value) {
        this.physicalFlightID = value;
    }

    /**
     * Gets the value of the overrideAmtReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverrideAmtReason() {
        return overrideAmtReason;
    }

    /**
     * Sets the value of the overrideAmtReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverrideAmtReason(JAXBElement<String> value) {
        this.overrideAmtReason = value;
    }

    /**
     * Gets the value of the extPenaltyRule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtPenaltyRule() {
        return extPenaltyRule;
    }

    /**
     * Sets the value of the extPenaltyRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtPenaltyRule(JAXBElement<String> value) {
        this.extPenaltyRule = value;
    }

    /**
     * Gets the value of the extIsRePriceFixed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtIsRePriceFixed() {
        return extIsRePriceFixed;
    }

    /**
     * Sets the value of the extIsRePriceFixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtIsRePriceFixed(JAXBElement<String> value) {
        this.extIsRePriceFixed = value;
    }

    /**
     * Gets the value of the extRePriceSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtRePriceSourceName() {
        return extRePriceSourceName;
    }

    /**
     * Sets the value of the extRePriceSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtRePriceSourceName(JAXBElement<String> value) {
        this.extRePriceSourceName = value;
    }

    /**
     * Gets the value of the extRePriceValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtRePriceValue() {
        return extRePriceValue;
    }

    /**
     * Sets the value of the extRePriceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtRePriceValue(JAXBElement<String> value) {
        this.extRePriceValue = value;
    }

    /**
     * Gets the value of the extRePriceValueReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtRePriceValueReason() {
        return extRePriceValueReason;
    }

    /**
     * Sets the value of the extRePriceValueReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtRePriceValueReason(JAXBElement<String> value) {
        this.extRePriceValueReason = value;
    }

    /**
     * Gets the value of the ssrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnumerationsSSRStatus }{@code >}
     *     
     */
    public JAXBElement<EnumerationsSSRStatus> getSSRStatus() {
        return ssrStatus;
    }

    /**
     * Sets the value of the ssrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnumerationsSSRStatus }{@code >}
     *     
     */
    public void setSSRStatus(JAXBElement<EnumerationsSSRStatus> value) {
        this.ssrStatus = value;
    }

}

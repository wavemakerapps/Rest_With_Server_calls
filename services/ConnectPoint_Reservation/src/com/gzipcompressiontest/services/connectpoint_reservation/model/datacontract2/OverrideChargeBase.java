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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OverrideChargeBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverrideChargeBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ChargeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OriginalCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ExchangeRateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ChargeComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChargeDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OverrideReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExtPenaltyRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtIsRepriceFixed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtRepriceValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtRepriceSourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtRepriceValueReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverrideChargeBase", propOrder = {
    "amount",
    "chargeKey",
    "originalCurrency",
    "originalAmount",
    "exchangeRate",
    "exchangeRateDate",
    "chargeComment",
    "chargeDescription",
    "overrideReason",
    "extPenaltyRule",
    "extIsRepriceFixed",
    "extRepriceValue",
    "extRepriceSourceName",
    "extRepriceValueReason"
})
@XmlSeeAlso({
    AddPenaltyDetail.class,
    OverrideChargeDetail.class,
    AddTaxDetail.class
})
public class OverrideChargeBase {

    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "ChargeKey", required = true, nillable = true)
    protected String chargeKey;
    @XmlElement(name = "OriginalCurrency", required = true, nillable = true)
    protected String originalCurrency;
    @XmlElement(name = "OriginalAmount", required = true)
    protected BigDecimal originalAmount;
    @XmlElement(name = "ExchangeRate", required = true)
    protected BigDecimal exchangeRate;
    @XmlElement(name = "ExchangeRateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exchangeRateDate;
    @XmlElement(name = "ChargeComment", required = true, nillable = true)
    protected String chargeComment;
    @XmlElement(name = "ChargeDescription", required = true, nillable = true)
    protected String chargeDescription;
    @XmlElement(name = "OverrideReason", required = true, nillable = true)
    protected String overrideReason;
    @XmlElementRef(name = "ExtPenaltyRule", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extPenaltyRule;
    @XmlElementRef(name = "ExtIsRepriceFixed", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extIsRepriceFixed;
    @XmlElementRef(name = "ExtRepriceValue", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extRepriceValue;
    @XmlElementRef(name = "ExtRepriceSourceName", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extRepriceSourceName;
    @XmlElementRef(name = "ExtRepriceValueReason", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extRepriceValueReason;

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
     * Gets the value of the chargeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeKey() {
        return chargeKey;
    }

    /**
     * Sets the value of the chargeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeKey(String value) {
        this.chargeKey = value;
    }

    /**
     * Gets the value of the originalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCurrency() {
        return originalCurrency;
    }

    /**
     * Sets the value of the originalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCurrency(String value) {
        this.originalCurrency = value;
    }

    /**
     * Gets the value of the originalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Sets the value of the originalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalAmount(BigDecimal value) {
        this.originalAmount = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the exchangeRateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeRateDate() {
        return exchangeRateDate;
    }

    /**
     * Sets the value of the exchangeRateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeRateDate(XMLGregorianCalendar value) {
        this.exchangeRateDate = value;
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
     * Gets the value of the chargeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeDescription() {
        return chargeDescription;
    }

    /**
     * Sets the value of the chargeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeDescription(String value) {
        this.chargeDescription = value;
    }

    /**
     * Gets the value of the overrideReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideReason() {
        return overrideReason;
    }

    /**
     * Sets the value of the overrideReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideReason(String value) {
        this.overrideReason = value;
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
     * Gets the value of the extIsRepriceFixed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtIsRepriceFixed() {
        return extIsRepriceFixed;
    }

    /**
     * Sets the value of the extIsRepriceFixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtIsRepriceFixed(JAXBElement<String> value) {
        this.extIsRepriceFixed = value;
    }

    /**
     * Gets the value of the extRepriceValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtRepriceValue() {
        return extRepriceValue;
    }

    /**
     * Sets the value of the extRepriceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtRepriceValue(JAXBElement<String> value) {
        this.extRepriceValue = value;
    }

    /**
     * Gets the value of the extRepriceSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtRepriceSourceName() {
        return extRepriceSourceName;
    }

    /**
     * Sets the value of the extRepriceSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtRepriceSourceName(JAXBElement<String> value) {
        this.extRepriceSourceName = value;
    }

    /**
     * Gets the value of the extRepriceValueReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtRepriceValueReason() {
        return extRepriceValueReason;
    }

    /**
     * Sets the value of the extRepriceValueReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtRepriceValueReason(JAXBElement<String> value) {
        this.extRepriceValueReason = value;
    }

}

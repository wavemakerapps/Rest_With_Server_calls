/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.EnumerationsCurrencyCodeTypes;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.EnumerationsPaymentMethodTypes;


/**
 * <p>Java class for Payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservationPaymentID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CardHolder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentCurrency" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}Enumerations.CurrencyCodeTypes"/>
 *         &lt;element name="ISOCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PaymentMethod" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}Enumerations.PaymentMethodTypes"/>
 *         &lt;element name="CardNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CVCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsTACreditCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VoucherNum" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="GcxID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GcxOpt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OriginalCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ExchangeRateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PaymentComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", propOrder = {
    "reservationPaymentID",
    "companyName",
    "firstName",
    "lastName",
    "cardType",
    "cardHolder",
    "paymentCurrency",
    "isoCurrency",
    "paymentAmount",
    "paymentMethod",
    "cardNum",
    "cvCode",
    "expirationDate",
    "isTACreditCard",
    "voucherNum",
    "gcxID",
    "gcxOpt",
    "originalCurrency",
    "originalAmount",
    "exchangeRate",
    "exchangeRateDate",
    "paymentComment",
    "billingCountry"
})
public class Payment {

    @XmlElement(name = "ReservationPaymentID")
    protected int reservationPaymentID;
    @XmlElement(name = "CompanyName", required = true, nillable = true)
    protected String companyName;
    @XmlElement(name = "FirstName", required = true, nillable = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true, nillable = true)
    protected String lastName;
    @XmlElement(name = "CardType", required = true, nillable = true)
    protected String cardType;
    @XmlElement(name = "CardHolder", required = true, nillable = true)
    protected String cardHolder;
    @XmlElement(name = "PaymentCurrency", required = true)
    protected EnumerationsCurrencyCodeTypes paymentCurrency;
    @XmlElement(name = "ISOCurrency")
    protected int isoCurrency;
    @XmlElement(name = "PaymentAmount", required = true)
    protected BigDecimal paymentAmount;
    @XmlElement(name = "PaymentMethod", required = true)
    protected EnumerationsPaymentMethodTypes paymentMethod;
    @XmlElement(name = "CardNum", required = true, nillable = true)
    protected String cardNum;
    @XmlElement(name = "CVCode", required = true, nillable = true)
    protected String cvCode;
    @XmlElement(name = "ExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "IsTACreditCard")
    protected boolean isTACreditCard;
    @XmlElement(name = "VoucherNum")
    protected long voucherNum;
    @XmlElement(name = "GcxID", required = true, nillable = true)
    protected String gcxID;
    @XmlElement(name = "GcxOpt", required = true, nillable = true)
    protected String gcxOpt;
    @XmlElement(name = "OriginalCurrency", required = true, nillable = true)
    protected String originalCurrency;
    @XmlElement(name = "OriginalAmount", required = true)
    protected BigDecimal originalAmount;
    @XmlElement(name = "ExchangeRate", required = true)
    protected BigDecimal exchangeRate;
    @XmlElement(name = "ExchangeRateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exchangeRateDate;
    @XmlElement(name = "PaymentComment", required = true, nillable = true)
    protected String paymentComment;
    @XmlElement(name = "BillingCountry", required = true, nillable = true)
    protected String billingCountry;

    /**
     * Gets the value of the reservationPaymentID property.
     * 
     */
    public int getReservationPaymentID() {
        return reservationPaymentID;
    }

    /**
     * Sets the value of the reservationPaymentID property.
     * 
     */
    public void setReservationPaymentID(int value) {
        this.reservationPaymentID = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
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
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * Sets the value of the cardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolder(String value) {
        this.cardHolder = value;
    }

    /**
     * Gets the value of the paymentCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link EnumerationsCurrencyCodeTypes }
     *     
     */
    public EnumerationsCurrencyCodeTypes getPaymentCurrency() {
        return paymentCurrency;
    }

    /**
     * Sets the value of the paymentCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationsCurrencyCodeTypes }
     *     
     */
    public void setPaymentCurrency(EnumerationsCurrencyCodeTypes value) {
        this.paymentCurrency = value;
    }

    /**
     * Gets the value of the isoCurrency property.
     * 
     */
    public int getISOCurrency() {
        return isoCurrency;
    }

    /**
     * Sets the value of the isoCurrency property.
     * 
     */
    public void setISOCurrency(int value) {
        this.isoCurrency = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentAmount(BigDecimal value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link EnumerationsPaymentMethodTypes }
     *     
     */
    public EnumerationsPaymentMethodTypes getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationsPaymentMethodTypes }
     *     
     */
    public void setPaymentMethod(EnumerationsPaymentMethodTypes value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the cardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * Sets the value of the cardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNum(String value) {
        this.cardNum = value;
    }

    /**
     * Gets the value of the cvCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVCode() {
        return cvCode;
    }

    /**
     * Sets the value of the cvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVCode(String value) {
        this.cvCode = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the isTACreditCard property.
     * 
     */
    public boolean isIsTACreditCard() {
        return isTACreditCard;
    }

    /**
     * Sets the value of the isTACreditCard property.
     * 
     */
    public void setIsTACreditCard(boolean value) {
        this.isTACreditCard = value;
    }

    /**
     * Gets the value of the voucherNum property.
     * 
     */
    public long getVoucherNum() {
        return voucherNum;
    }

    /**
     * Sets the value of the voucherNum property.
     * 
     */
    public void setVoucherNum(long value) {
        this.voucherNum = value;
    }

    /**
     * Gets the value of the gcxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGcxID() {
        return gcxID;
    }

    /**
     * Sets the value of the gcxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGcxID(String value) {
        this.gcxID = value;
    }

    /**
     * Gets the value of the gcxOpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGcxOpt() {
        return gcxOpt;
    }

    /**
     * Sets the value of the gcxOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGcxOpt(String value) {
        this.gcxOpt = value;
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
     * Gets the value of the paymentComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentComment() {
        return paymentComment;
    }

    /**
     * Sets the value of the paymentComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentComment(String value) {
        this.paymentComment = value;
    }

    /**
     * Gets the value of the billingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCountry() {
        return billingCountry;
    }

    /**
     * Sets the value of the billingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCountry(String value) {
        this.billingCountry = value;
    }

}

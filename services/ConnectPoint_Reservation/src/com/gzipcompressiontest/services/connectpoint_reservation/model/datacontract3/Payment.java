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
 * <p>Java class for Payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationPaymentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CardHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CVCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Authorizationcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerminalID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrencyPaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionIndicator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SettlementBatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VoucherNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FFNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Miles" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExchangeRateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DocumentReceivedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatchProcessStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BatchProcessExtracted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TicketCouponNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATCANDateProcessed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TicketType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GcxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GcxOptOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GcxExported" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GcxExportedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OriginalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IATANum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonOrgID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Postal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DatePaid" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardVerification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrossAmtResCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GrossAmtPayCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetAmtResCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CommissionDeductedResCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CommissionDeductedPayCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RptNetFrmResCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RptCommissionFromResCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RptCommissionFromPayCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalRefundResCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalRefundRptCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalRefundPayCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RedeemedVoucherAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPaymentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentReservationChannelID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AncillaryData01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AncillaryData02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AncillaryData03" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AncillaryData04" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AncillaryData05" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthenticationByPassed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "key",
    "reservationPaymentID",
    "cardHolder",
    "paymentAmount",
    "expirationDate",
    "cardNumber",
    "cvCode",
    "authorizationcode",
    "terminalID",
    "currencyPaid",
    "checkNumber",
    "reference",
    "result",
    "transactionID",
    "valueCode",
    "transactionIndicator",
    "settlementBatch",
    "authorizedAmount",
    "voucherNumber",
    "ffNumber",
    "miles",
    "paymentComment",
    "baseCurrency",
    "baseAmount",
    "exchangeRate",
    "exchangeRateDate",
    "documentReceivedBy",
    "batchProcessStart",
    "batchProcessExtracted",
    "ticketCouponNumber",
    "atcanDateProcessed",
    "ticketType",
    "gcxID",
    "gcxOptOption",
    "gcxExported",
    "gcxExportedDate",
    "originalCurrency",
    "originalAmount",
    "iataNum",
    "processorID",
    "merchantID",
    "processorName",
    "originalPaymentMethod",
    "transactionStatus",
    "responseMessage",
    "responseCode",
    "personOrgID",
    "firstName",
    "lastName",
    "companyName",
    "address",
    "address2",
    "city",
    "state",
    "postal",
    "country",
    "paymentMethod",
    "datePaid",
    "userData",
    "cardVerification",
    "grossAmtResCurrency",
    "grossAmtPayCurrency",
    "netAmtResCurrency",
    "commissionDeductedResCurrency",
    "commissionDeductedPayCurrency",
    "rptNetFrmResCurrency",
    "rptCommissionFromResCurrency",
    "rptCommissionFromPayCurrency",
    "totalRefundResCurrency",
    "totalRefundRptCurrency",
    "totalRefundPayCurrency",
    "redeemedVoucherAmount",
    "userID",
    "originalPaymentID",
    "paymentReservationChannelID",
    "ancillaryData01",
    "ancillaryData02",
    "ancillaryData03",
    "ancillaryData04",
    "ancillaryData05",
    "authenticationByPassed"
})
public class Payment {

    @XmlElementRef(name = "Key", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> key;
    @XmlElement(name = "ReservationPaymentID")
    protected Integer reservationPaymentID;
    @XmlElementRef(name = "CardHolder", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardHolder;
    @XmlElement(name = "PaymentAmount")
    protected BigDecimal paymentAmount;
    @XmlElement(name = "ExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElementRef(name = "CardNumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardNumber;
    @XmlElementRef(name = "CVCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cvCode;
    @XmlElementRef(name = "Authorizationcode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authorizationcode;
    @XmlElement(name = "TerminalID")
    protected Integer terminalID;
    @XmlElementRef(name = "CurrencyPaid", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyPaid;
    @XmlElement(name = "CheckNumber")
    protected Integer checkNumber;
    @XmlElementRef(name = "Reference", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reference;
    @XmlElementRef(name = "Result", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> result;
    @XmlElementRef(name = "TransactionID", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionID;
    @XmlElementRef(name = "ValueCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valueCode;
    @XmlElement(name = "TransactionIndicator")
    protected Integer transactionIndicator;
    @XmlElementRef(name = "SettlementBatch", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> settlementBatch;
    @XmlElement(name = "AuthorizedAmount")
    protected BigDecimal authorizedAmount;
    @XmlElement(name = "VoucherNumber")
    protected Integer voucherNumber;
    @XmlElementRef(name = "FFNumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ffNumber;
    @XmlElement(name = "Miles")
    protected Integer miles;
    @XmlElementRef(name = "PaymentComment", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentComment;
    @XmlElementRef(name = "BaseCurrency", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> baseCurrency;
    @XmlElement(name = "BaseAmount")
    protected BigDecimal baseAmount;
    @XmlElement(name = "ExchangeRate")
    protected BigDecimal exchangeRate;
    @XmlElement(name = "ExchangeRateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exchangeRateDate;
    @XmlElementRef(name = "DocumentReceivedBy", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentReceivedBy;
    @XmlElement(name = "BatchProcessStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar batchProcessStart;
    @XmlElement(name = "BatchProcessExtracted")
    protected Integer batchProcessExtracted;
    @XmlElementRef(name = "TicketCouponNumber", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ticketCouponNumber;
    @XmlElement(name = "ATCANDateProcessed")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar atcanDateProcessed;
    @XmlElementRef(name = "TicketType", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ticketType;
    @XmlElementRef(name = "GcxID", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gcxID;
    @XmlElementRef(name = "GcxOptOption", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gcxOptOption;
    @XmlElement(name = "GcxExported")
    protected Integer gcxExported;
    @XmlElement(name = "GcxExportedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gcxExportedDate;
    @XmlElementRef(name = "OriginalCurrency", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalCurrency;
    @XmlElement(name = "OriginalAmount")
    protected BigDecimal originalAmount;
    @XmlElementRef(name = "IATANum", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iataNum;
    @XmlElementRef(name = "ProcessorID", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> processorID;
    @XmlElementRef(name = "MerchantID", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> merchantID;
    @XmlElementRef(name = "ProcessorName", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> processorName;
    @XmlElementRef(name = "OriginalPaymentMethod", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalPaymentMethod;
    @XmlElement(name = "TransactionStatus")
    protected Integer transactionStatus;
    @XmlElementRef(name = "ResponseMessage", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseMessage;
    @XmlElementRef(name = "ResponseCode", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseCode;
    @XmlElement(name = "PersonOrgID")
    protected Integer personOrgID;
    @XmlElementRef(name = "FirstName", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "LastName", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "CompanyName", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyName;
    @XmlElementRef(name = "Address", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address;
    @XmlElementRef(name = "Address2", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address2;
    @XmlElementRef(name = "City", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "State", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "Postal", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postal;
    @XmlElementRef(name = "Country", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "PaymentMethod", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentMethod;
    @XmlElement(name = "DatePaid")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePaid;
    @XmlElementRef(name = "UserData", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userData;
    @XmlElementRef(name = "CardVerification", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardVerification;
    @XmlElement(name = "GrossAmtResCurrency")
    protected BigDecimal grossAmtResCurrency;
    @XmlElement(name = "GrossAmtPayCurrency")
    protected BigDecimal grossAmtPayCurrency;
    @XmlElement(name = "NetAmtResCurrency")
    protected BigDecimal netAmtResCurrency;
    @XmlElement(name = "CommissionDeductedResCurrency")
    protected BigDecimal commissionDeductedResCurrency;
    @XmlElement(name = "CommissionDeductedPayCurrency")
    protected BigDecimal commissionDeductedPayCurrency;
    @XmlElement(name = "RptNetFrmResCurrency")
    protected BigDecimal rptNetFrmResCurrency;
    @XmlElement(name = "RptCommissionFromResCurrency")
    protected BigDecimal rptCommissionFromResCurrency;
    @XmlElement(name = "RptCommissionFromPayCurrency")
    protected BigDecimal rptCommissionFromPayCurrency;
    @XmlElement(name = "TotalRefundResCurrency")
    protected BigDecimal totalRefundResCurrency;
    @XmlElement(name = "TotalRefundRptCurrency")
    protected BigDecimal totalRefundRptCurrency;
    @XmlElement(name = "TotalRefundPayCurrency")
    protected BigDecimal totalRefundPayCurrency;
    @XmlElement(name = "RedeemedVoucherAmount")
    protected BigDecimal redeemedVoucherAmount;
    @XmlElementRef(name = "UserID", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userID;
    @XmlElement(name = "OriginalPaymentID")
    protected Integer originalPaymentID;
    @XmlElement(name = "PaymentReservationChannelID")
    protected Integer paymentReservationChannelID;
    @XmlElementRef(name = "AncillaryData01", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ancillaryData01;
    @XmlElementRef(name = "AncillaryData02", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ancillaryData02;
    @XmlElementRef(name = "AncillaryData03", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ancillaryData03;
    @XmlElementRef(name = "AncillaryData04", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ancillaryData04;
    @XmlElementRef(name = "AncillaryData05", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ancillaryData05;
    @XmlElement(name = "AuthenticationByPassed")
    protected Boolean authenticationByPassed;

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
     * Gets the value of the reservationPaymentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReservationPaymentID() {
        return reservationPaymentID;
    }

    /**
     * Sets the value of the reservationPaymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReservationPaymentID(Integer value) {
        this.reservationPaymentID = value;
    }

    /**
     * Gets the value of the cardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardHolder() {
        return cardHolder;
    }

    /**
     * Sets the value of the cardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardHolder(JAXBElement<String> value) {
        this.cardHolder = value;
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
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardNumber(JAXBElement<String> value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cvCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCVCode() {
        return cvCode;
    }

    /**
     * Sets the value of the cvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCVCode(JAXBElement<String> value) {
        this.cvCode = value;
    }

    /**
     * Gets the value of the authorizationcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthorizationcode() {
        return authorizationcode;
    }

    /**
     * Sets the value of the authorizationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthorizationcode(JAXBElement<String> value) {
        this.authorizationcode = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTerminalID(Integer value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the currencyPaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyPaid() {
        return currencyPaid;
    }

    /**
     * Sets the value of the currencyPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyPaid(JAXBElement<String> value) {
        this.currencyPaid = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCheckNumber(Integer value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReference(JAXBElement<String> value) {
        this.reference = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResult(JAXBElement<String> value) {
        this.result = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionID(JAXBElement<String> value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the valueCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValueCode() {
        return valueCode;
    }

    /**
     * Sets the value of the valueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValueCode(JAXBElement<String> value) {
        this.valueCode = value;
    }

    /**
     * Gets the value of the transactionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransactionIndicator() {
        return transactionIndicator;
    }

    /**
     * Sets the value of the transactionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransactionIndicator(Integer value) {
        this.transactionIndicator = value;
    }

    /**
     * Gets the value of the settlementBatch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSettlementBatch() {
        return settlementBatch;
    }

    /**
     * Sets the value of the settlementBatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSettlementBatch(JAXBElement<String> value) {
        this.settlementBatch = value;
    }

    /**
     * Gets the value of the authorizedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthorizedAmount() {
        return authorizedAmount;
    }

    /**
     * Sets the value of the authorizedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthorizedAmount(BigDecimal value) {
        this.authorizedAmount = value;
    }

    /**
     * Gets the value of the voucherNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVoucherNumber() {
        return voucherNumber;
    }

    /**
     * Sets the value of the voucherNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVoucherNumber(Integer value) {
        this.voucherNumber = value;
    }

    /**
     * Gets the value of the ffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFFNumber() {
        return ffNumber;
    }

    /**
     * Sets the value of the ffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFFNumber(JAXBElement<String> value) {
        this.ffNumber = value;
    }

    /**
     * Gets the value of the miles property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMiles() {
        return miles;
    }

    /**
     * Sets the value of the miles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMiles(Integer value) {
        this.miles = value;
    }

    /**
     * Gets the value of the paymentComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentComment() {
        return paymentComment;
    }

    /**
     * Sets the value of the paymentComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentComment(JAXBElement<String> value) {
        this.paymentComment = value;
    }

    /**
     * Gets the value of the baseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Sets the value of the baseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseCurrency(JAXBElement<String> value) {
        this.baseCurrency = value;
    }

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseAmount(BigDecimal value) {
        this.baseAmount = value;
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
     * Gets the value of the documentReceivedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentReceivedBy() {
        return documentReceivedBy;
    }

    /**
     * Sets the value of the documentReceivedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentReceivedBy(JAXBElement<String> value) {
        this.documentReceivedBy = value;
    }

    /**
     * Gets the value of the batchProcessStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBatchProcessStart() {
        return batchProcessStart;
    }

    /**
     * Sets the value of the batchProcessStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBatchProcessStart(XMLGregorianCalendar value) {
        this.batchProcessStart = value;
    }

    /**
     * Gets the value of the batchProcessExtracted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchProcessExtracted() {
        return batchProcessExtracted;
    }

    /**
     * Sets the value of the batchProcessExtracted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBatchProcessExtracted(Integer value) {
        this.batchProcessExtracted = value;
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
     * Gets the value of the atcanDateProcessed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getATCANDateProcessed() {
        return atcanDateProcessed;
    }

    /**
     * Sets the value of the atcanDateProcessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setATCANDateProcessed(XMLGregorianCalendar value) {
        this.atcanDateProcessed = value;
    }

    /**
     * Gets the value of the ticketType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTicketType(JAXBElement<String> value) {
        this.ticketType = value;
    }

    /**
     * Gets the value of the gcxID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGcxID() {
        return gcxID;
    }

    /**
     * Sets the value of the gcxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGcxID(JAXBElement<String> value) {
        this.gcxID = value;
    }

    /**
     * Gets the value of the gcxOptOption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGcxOptOption() {
        return gcxOptOption;
    }

    /**
     * Sets the value of the gcxOptOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGcxOptOption(JAXBElement<String> value) {
        this.gcxOptOption = value;
    }

    /**
     * Gets the value of the gcxExported property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGcxExported() {
        return gcxExported;
    }

    /**
     * Sets the value of the gcxExported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGcxExported(Integer value) {
        this.gcxExported = value;
    }

    /**
     * Gets the value of the gcxExportedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGcxExportedDate() {
        return gcxExportedDate;
    }

    /**
     * Sets the value of the gcxExportedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGcxExportedDate(XMLGregorianCalendar value) {
        this.gcxExportedDate = value;
    }

    /**
     * Gets the value of the originalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalCurrency() {
        return originalCurrency;
    }

    /**
     * Sets the value of the originalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalCurrency(JAXBElement<String> value) {
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
     * Gets the value of the iataNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIATANum() {
        return iataNum;
    }

    /**
     * Sets the value of the iataNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIATANum(JAXBElement<String> value) {
        this.iataNum = value;
    }

    /**
     * Gets the value of the processorID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcessorID() {
        return processorID;
    }

    /**
     * Sets the value of the processorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcessorID(JAXBElement<String> value) {
        this.processorID = value;
    }

    /**
     * Gets the value of the merchantID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMerchantID(JAXBElement<String> value) {
        this.merchantID = value;
    }

    /**
     * Gets the value of the processorName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcessorName() {
        return processorName;
    }

    /**
     * Sets the value of the processorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcessorName(JAXBElement<String> value) {
        this.processorName = value;
    }

    /**
     * Gets the value of the originalPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalPaymentMethod() {
        return originalPaymentMethod;
    }

    /**
     * Sets the value of the originalPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalPaymentMethod(JAXBElement<String> value) {
        this.originalPaymentMethod = value;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransactionStatus(Integer value) {
        this.transactionStatus = value;
    }

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseMessage(JAXBElement<String> value) {
        this.responseMessage = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseCode(JAXBElement<String> value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the personOrgID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPersonOrgID() {
        return personOrgID;
    }

    /**
     * Sets the value of the personOrgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersonOrgID(Integer value) {
        this.personOrgID = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyName(JAXBElement<String> value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress(JAXBElement<String> value) {
        this.address = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress2(JAXBElement<String> value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = value;
    }

    /**
     * Gets the value of the postal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostal() {
        return postal;
    }

    /**
     * Sets the value of the postal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostal(JAXBElement<String> value) {
        this.postal = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentMethod(JAXBElement<String> value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the datePaid property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePaid() {
        return datePaid;
    }

    /**
     * Sets the value of the datePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePaid(XMLGregorianCalendar value) {
        this.datePaid = value;
    }

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserData(JAXBElement<String> value) {
        this.userData = value;
    }

    /**
     * Gets the value of the cardVerification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardVerification() {
        return cardVerification;
    }

    /**
     * Sets the value of the cardVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardVerification(JAXBElement<String> value) {
        this.cardVerification = value;
    }

    /**
     * Gets the value of the grossAmtResCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossAmtResCurrency() {
        return grossAmtResCurrency;
    }

    /**
     * Sets the value of the grossAmtResCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossAmtResCurrency(BigDecimal value) {
        this.grossAmtResCurrency = value;
    }

    /**
     * Gets the value of the grossAmtPayCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossAmtPayCurrency() {
        return grossAmtPayCurrency;
    }

    /**
     * Sets the value of the grossAmtPayCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossAmtPayCurrency(BigDecimal value) {
        this.grossAmtPayCurrency = value;
    }

    /**
     * Gets the value of the netAmtResCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmtResCurrency() {
        return netAmtResCurrency;
    }

    /**
     * Sets the value of the netAmtResCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmtResCurrency(BigDecimal value) {
        this.netAmtResCurrency = value;
    }

    /**
     * Gets the value of the commissionDeductedResCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionDeductedResCurrency() {
        return commissionDeductedResCurrency;
    }

    /**
     * Sets the value of the commissionDeductedResCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionDeductedResCurrency(BigDecimal value) {
        this.commissionDeductedResCurrency = value;
    }

    /**
     * Gets the value of the commissionDeductedPayCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionDeductedPayCurrency() {
        return commissionDeductedPayCurrency;
    }

    /**
     * Sets the value of the commissionDeductedPayCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionDeductedPayCurrency(BigDecimal value) {
        this.commissionDeductedPayCurrency = value;
    }

    /**
     * Gets the value of the rptNetFrmResCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRptNetFrmResCurrency() {
        return rptNetFrmResCurrency;
    }

    /**
     * Sets the value of the rptNetFrmResCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRptNetFrmResCurrency(BigDecimal value) {
        this.rptNetFrmResCurrency = value;
    }

    /**
     * Gets the value of the rptCommissionFromResCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRptCommissionFromResCurrency() {
        return rptCommissionFromResCurrency;
    }

    /**
     * Sets the value of the rptCommissionFromResCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRptCommissionFromResCurrency(BigDecimal value) {
        this.rptCommissionFromResCurrency = value;
    }

    /**
     * Gets the value of the rptCommissionFromPayCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRptCommissionFromPayCurrency() {
        return rptCommissionFromPayCurrency;
    }

    /**
     * Sets the value of the rptCommissionFromPayCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRptCommissionFromPayCurrency(BigDecimal value) {
        this.rptCommissionFromPayCurrency = value;
    }

    /**
     * Gets the value of the totalRefundResCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalRefundResCurrency() {
        return totalRefundResCurrency;
    }

    /**
     * Sets the value of the totalRefundResCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalRefundResCurrency(BigDecimal value) {
        this.totalRefundResCurrency = value;
    }

    /**
     * Gets the value of the totalRefundRptCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalRefundRptCurrency() {
        return totalRefundRptCurrency;
    }

    /**
     * Sets the value of the totalRefundRptCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalRefundRptCurrency(BigDecimal value) {
        this.totalRefundRptCurrency = value;
    }

    /**
     * Gets the value of the totalRefundPayCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalRefundPayCurrency() {
        return totalRefundPayCurrency;
    }

    /**
     * Sets the value of the totalRefundPayCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalRefundPayCurrency(BigDecimal value) {
        this.totalRefundPayCurrency = value;
    }

    /**
     * Gets the value of the redeemedVoucherAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedeemedVoucherAmount() {
        return redeemedVoucherAmount;
    }

    /**
     * Sets the value of the redeemedVoucherAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRedeemedVoucherAmount(BigDecimal value) {
        this.redeemedVoucherAmount = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserID(JAXBElement<String> value) {
        this.userID = value;
    }

    /**
     * Gets the value of the originalPaymentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOriginalPaymentID() {
        return originalPaymentID;
    }

    /**
     * Sets the value of the originalPaymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOriginalPaymentID(Integer value) {
        this.originalPaymentID = value;
    }

    /**
     * Gets the value of the paymentReservationChannelID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentReservationChannelID() {
        return paymentReservationChannelID;
    }

    /**
     * Sets the value of the paymentReservationChannelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentReservationChannelID(Integer value) {
        this.paymentReservationChannelID = value;
    }

    /**
     * Gets the value of the ancillaryData01 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAncillaryData01() {
        return ancillaryData01;
    }

    /**
     * Sets the value of the ancillaryData01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAncillaryData01(JAXBElement<String> value) {
        this.ancillaryData01 = value;
    }

    /**
     * Gets the value of the ancillaryData02 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAncillaryData02() {
        return ancillaryData02;
    }

    /**
     * Sets the value of the ancillaryData02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAncillaryData02(JAXBElement<String> value) {
        this.ancillaryData02 = value;
    }

    /**
     * Gets the value of the ancillaryData03 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAncillaryData03() {
        return ancillaryData03;
    }

    /**
     * Sets the value of the ancillaryData03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAncillaryData03(JAXBElement<String> value) {
        this.ancillaryData03 = value;
    }

    /**
     * Gets the value of the ancillaryData04 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAncillaryData04() {
        return ancillaryData04;
    }

    /**
     * Sets the value of the ancillaryData04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAncillaryData04(JAXBElement<String> value) {
        this.ancillaryData04 = value;
    }

    /**
     * Gets the value of the ancillaryData05 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAncillaryData05() {
        return ancillaryData05;
    }

    /**
     * Sets the value of the ancillaryData05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAncillaryData05(JAXBElement<String> value) {
        this.ancillaryData05 = value;
    }

    /**
     * Gets the value of the authenticationByPassed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthenticationByPassed() {
        return authenticationByPassed;
    }

    /**
     * Sets the value of the authenticationByPassed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthenticationByPassed(Boolean value) {
        this.authenticationByPassed = value;
    }

}

/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.AddPenalty;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.AddTax;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.EvaluateModificationOfPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.HistoryPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ImportPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ModifyPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.OverrideReservationCharges;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.RetrieveBalance;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.RetrievePNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.SummaryPNR;


/**
 * <p>Java class for TransactionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecurityGUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CarrierCodes" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}ArrayOfCarrierCode"/>
 *         &lt;element name="ClientIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HistoricUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChannelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionInfo", propOrder = {
    "securityGUID",
    "carrierCodes",
    "clientIPAddress",
    "historicUserName",
    "channelType",
    "reservationChannel",
    "office",
    "iata"
})
@XmlSeeAlso({
    AddPenalty.class,
    ImportPNR.class,
    HistoryPNR.class,
    EvaluateModificationOfPNR.class,
    OverrideReservationCharges.class,
    CreatePNR.class,
    RetrieveBalance.class,
    RetrievePNR.class,
    SummaryPNR.class,
    ModifyPNR.class,
    CancelPNR.class,
    AddTax.class
})
public class TransactionInfo {

    @XmlElement(name = "SecurityGUID", required = true, nillable = true)
    protected String securityGUID;
    @XmlElement(name = "CarrierCodes", required = true, nillable = true)
    protected ArrayOfCarrierCode carrierCodes;
    @XmlElementRef(name = "ClientIPAddress", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientIPAddress;
    @XmlElementRef(name = "HistoricUserName", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> historicUserName;
    @XmlElementRef(name = "ChannelType", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> channelType;
    @XmlElementRef(name = "ReservationChannel", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reservationChannel;
    @XmlElementRef(name = "Office", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> office;
    @XmlElementRef(name = "IATA", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iata;

    /**
     * Gets the value of the securityGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityGUID() {
        return securityGUID;
    }

    /**
     * Sets the value of the securityGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityGUID(String value) {
        this.securityGUID = value;
    }

    /**
     * Gets the value of the carrierCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCarrierCode }
     *     
     */
    public ArrayOfCarrierCode getCarrierCodes() {
        return carrierCodes;
    }

    /**
     * Sets the value of the carrierCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCarrierCode }
     *     
     */
    public void setCarrierCodes(ArrayOfCarrierCode value) {
        this.carrierCodes = value;
    }

    /**
     * Gets the value of the clientIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientIPAddress() {
        return clientIPAddress;
    }

    /**
     * Sets the value of the clientIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientIPAddress(JAXBElement<String> value) {
        this.clientIPAddress = value;
    }

    /**
     * Gets the value of the historicUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHistoricUserName() {
        return historicUserName;
    }

    /**
     * Sets the value of the historicUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHistoricUserName(JAXBElement<String> value) {
        this.historicUserName = value;
    }

    /**
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChannelType(JAXBElement<String> value) {
        this.channelType = value;
    }

    /**
     * Gets the value of the reservationChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReservationChannel() {
        return reservationChannel;
    }

    /**
     * Sets the value of the reservationChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReservationChannel(JAXBElement<String> value) {
        this.reservationChannel = value;
    }

    /**
     * Gets the value of the office property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOffice() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOffice(JAXBElement<String> value) {
        this.office = value;
    }

    /**
     * Gets the value of the iata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIATA() {
        return iata;
    }

    /**
     * Sets the value of the iata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIATA(JAXBElement<String> value) {
        this.iata = value;
    }

}

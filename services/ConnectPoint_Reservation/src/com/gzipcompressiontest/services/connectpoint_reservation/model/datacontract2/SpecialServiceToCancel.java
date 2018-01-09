/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialServiceToCancel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialServiceToCancel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogicalFlightKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhysicalFlightKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AirlinePersonKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChargeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialServiceToCancel", propOrder = {
    "airlineKey",
    "logicalFlightKey",
    "physicalFlightKey",
    "customerKey",
    "airlinePersonKey",
    "chargeKey",
    "comment"
})
public class SpecialServiceToCancel {

    @XmlElement(name = "AirlineKey", required = true, nillable = true)
    protected String airlineKey;
    @XmlElement(name = "LogicalFlightKey", required = true, nillable = true)
    protected String logicalFlightKey;
    @XmlElement(name = "PhysicalFlightKey", required = true, nillable = true)
    protected String physicalFlightKey;
    @XmlElement(name = "CustomerKey", required = true, nillable = true)
    protected String customerKey;
    @XmlElement(name = "AirlinePersonKey", required = true, nillable = true)
    protected String airlinePersonKey;
    @XmlElement(name = "ChargeKey", required = true, nillable = true)
    protected String chargeKey;
    @XmlElement(name = "Comment", required = true, nillable = true)
    protected String comment;

    /**
     * Gets the value of the airlineKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineKey() {
        return airlineKey;
    }

    /**
     * Sets the value of the airlineKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineKey(String value) {
        this.airlineKey = value;
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
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}

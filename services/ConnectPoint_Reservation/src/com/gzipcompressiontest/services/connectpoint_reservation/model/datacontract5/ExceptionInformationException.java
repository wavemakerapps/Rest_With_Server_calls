/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionInformation.Exception complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExceptionInformation.Exception">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExceptionCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExceptionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExceptionSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExceptionLevel" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Exceptions}ExceptionLevels" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionInformation.Exception", propOrder = {
    "exceptionCode",
    "exceptionDescription",
    "exceptionSource",
    "exceptionLevel"
})
public class ExceptionInformationException {

    @XmlElement(name = "ExceptionCode")
    protected Integer exceptionCode;
    @XmlElementRef(name = "ExceptionDescription", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Exceptions", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exceptionDescription;
    @XmlElementRef(name = "ExceptionSource", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Exceptions", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exceptionSource;
    @XmlElement(name = "ExceptionLevel")
    protected ExceptionLevels exceptionLevel;

    /**
     * Gets the value of the exceptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExceptionCode() {
        return exceptionCode;
    }

    /**
     * Sets the value of the exceptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExceptionCode(Integer value) {
        this.exceptionCode = value;
    }

    /**
     * Gets the value of the exceptionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExceptionDescription() {
        return exceptionDescription;
    }

    /**
     * Sets the value of the exceptionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExceptionDescription(JAXBElement<String> value) {
        this.exceptionDescription = value;
    }

    /**
     * Gets the value of the exceptionSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExceptionSource() {
        return exceptionSource;
    }

    /**
     * Sets the value of the exceptionSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExceptionSource(JAXBElement<String> value) {
        this.exceptionSource = value;
    }

    /**
     * Gets the value of the exceptionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionLevels }
     *     
     */
    public ExceptionLevels getExceptionLevel() {
        return exceptionLevel;
    }

    /**
     * Sets the value of the exceptionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionLevels }
     *     
     */
    public void setExceptionLevel(ExceptionLevels value) {
        this.exceptionLevel = value;
    }

}

/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.ReservationInfo;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.TransactionInfo;


/**
 * <p>Java class for ModifyPNR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyPNR">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}TransactionInfo">
 *       &lt;sequence>
 *         &lt;element name="ActionType" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ModifyPNR.ActionTypes"/>
 *         &lt;element name="ReservationInfo" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Request}ReservationInfo"/>
 *         &lt;element name="FareInformationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LogicalFlightKeyToReplace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogicalFlightKeyToRemove" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PersonOrgIdentifierToRemove" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PassengersToAdd" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfModifyPNR.Passenger"/>
 *         &lt;element name="PassengersToUpdate" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfModifyPNR.UpdatePassenger"/>
 *         &lt;element name="SpecialServices" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfSpecialService"/>
 *         &lt;element name="SpecialServicesToCancel" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfSpecialServiceToCancel"/>
 *         &lt;element name="ContactInformationToAdd" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfModifyPNR.AddContactInfo"/>
 *         &lt;element name="ContactInformationToUpdate" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfModifyPNR.UpdateContactInfo"/>
 *         &lt;element name="CommentToAdd" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}Comment"/>
 *         &lt;element name="EmergencyContactsToAddToSegments" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfModifyPNR.EmergencyContact" minOccurs="0"/>
 *         &lt;element name="PassengerSegmentsToUpdateRecordLocator" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ArrayOfModifyPNR.UpdateRecordLocator" minOccurs="0"/>
 *         &lt;element name="ChangeFlightFromReservation" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ModifyPNR.OriginDestinations" minOccurs="0"/>
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PointOfSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxToAdd" type="{http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request}ModifyPNR.modifyCPRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyPNR", propOrder = {
    "actionType",
    "reservationInfo",
    "fareInformationID",
    "logicalFlightKeyToReplace",
    "logicalFlightKeyToRemove",
    "personOrgIdentifierToRemove",
    "passengersToAdd",
    "passengersToUpdate",
    "specialServices",
    "specialServicesToCancel",
    "contactInformationToAdd",
    "contactInformationToUpdate",
    "commentToAdd",
    "emergencyContactsToAddToSegments",
    "passengerSegmentsToUpdateRecordLocator",
    "changeFlightFromReservation",
    "channel",
    "subChannel",
    "pointOfSale",
    "currency",
    "paxToAdd"
})
public class ModifyPNR
    extends TransactionInfo
{

    @XmlElement(name = "ActionType", required = true)
    protected ModifyPNRActionTypes actionType;
    @XmlElement(name = "ReservationInfo", required = true, nillable = true)
    protected ReservationInfo reservationInfo;
    @XmlElement(name = "FareInformationID")
    protected int fareInformationID;
    @XmlElement(name = "LogicalFlightKeyToReplace", required = true, nillable = true)
    protected String logicalFlightKeyToReplace;
    @XmlElement(name = "LogicalFlightKeyToRemove", required = true, nillable = true)
    protected String logicalFlightKeyToRemove;
    @XmlElement(name = "PersonOrgIdentifierToRemove")
    protected int personOrgIdentifierToRemove;
    @XmlElement(name = "PassengersToAdd", required = true, nillable = true)
    protected ArrayOfModifyPNRPassenger passengersToAdd;
    @XmlElement(name = "PassengersToUpdate", required = true, nillable = true)
    protected ArrayOfModifyPNRUpdatePassenger passengersToUpdate;
    @XmlElement(name = "SpecialServices", required = true, nillable = true)
    protected ArrayOfSpecialService specialServices;
    @XmlElement(name = "SpecialServicesToCancel", required = true, nillable = true)
    protected ArrayOfSpecialServiceToCancel specialServicesToCancel;
    @XmlElement(name = "ContactInformationToAdd", required = true, nillable = true)
    protected ArrayOfModifyPNRAddContactInfo contactInformationToAdd;
    @XmlElement(name = "ContactInformationToUpdate", required = true, nillable = true)
    protected ArrayOfModifyPNRUpdateContactInfo contactInformationToUpdate;
    @XmlElement(name = "CommentToAdd", required = true, nillable = true)
    protected Comment commentToAdd;
    @XmlElementRef(name = "EmergencyContactsToAddToSegments", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfModifyPNREmergencyContact> emergencyContactsToAddToSegments;
    @XmlElementRef(name = "PassengerSegmentsToUpdateRecordLocator", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfModifyPNRUpdateRecordLocator> passengerSegmentsToUpdateRecordLocator;
    @XmlElementRef(name = "ChangeFlightFromReservation", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<ModifyPNROriginDestinations> changeFlightFromReservation;
    @XmlElementRef(name = "Channel", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> channel;
    @XmlElementRef(name = "SubChannel", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subChannel;
    @XmlElementRef(name = "PointOfSale", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pointOfSale;
    @XmlElementRef(name = "Currency", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;
    @XmlElementRef(name = "PaxToAdd", namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", type = JAXBElement.class, required = false)
    protected JAXBElement<ModifyPNRModifyCPRequest> paxToAdd;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyPNRActionTypes }
     *     
     */
    public ModifyPNRActionTypes getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyPNRActionTypes }
     *     
     */
    public void setActionType(ModifyPNRActionTypes value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the reservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationInfo }
     *     
     */
    public ReservationInfo getReservationInfo() {
        return reservationInfo;
    }

    /**
     * Sets the value of the reservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationInfo }
     *     
     */
    public void setReservationInfo(ReservationInfo value) {
        this.reservationInfo = value;
    }

    /**
     * Gets the value of the fareInformationID property.
     * 
     */
    public int getFareInformationID() {
        return fareInformationID;
    }

    /**
     * Sets the value of the fareInformationID property.
     * 
     */
    public void setFareInformationID(int value) {
        this.fareInformationID = value;
    }

    /**
     * Gets the value of the logicalFlightKeyToReplace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalFlightKeyToReplace() {
        return logicalFlightKeyToReplace;
    }

    /**
     * Sets the value of the logicalFlightKeyToReplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalFlightKeyToReplace(String value) {
        this.logicalFlightKeyToReplace = value;
    }

    /**
     * Gets the value of the logicalFlightKeyToRemove property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalFlightKeyToRemove() {
        return logicalFlightKeyToRemove;
    }

    /**
     * Sets the value of the logicalFlightKeyToRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalFlightKeyToRemove(String value) {
        this.logicalFlightKeyToRemove = value;
    }

    /**
     * Gets the value of the personOrgIdentifierToRemove property.
     * 
     */
    public int getPersonOrgIdentifierToRemove() {
        return personOrgIdentifierToRemove;
    }

    /**
     * Sets the value of the personOrgIdentifierToRemove property.
     * 
     */
    public void setPersonOrgIdentifierToRemove(int value) {
        this.personOrgIdentifierToRemove = value;
    }

    /**
     * Gets the value of the passengersToAdd property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModifyPNRPassenger }
     *     
     */
    public ArrayOfModifyPNRPassenger getPassengersToAdd() {
        return passengersToAdd;
    }

    /**
     * Sets the value of the passengersToAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModifyPNRPassenger }
     *     
     */
    public void setPassengersToAdd(ArrayOfModifyPNRPassenger value) {
        this.passengersToAdd = value;
    }

    /**
     * Gets the value of the passengersToUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModifyPNRUpdatePassenger }
     *     
     */
    public ArrayOfModifyPNRUpdatePassenger getPassengersToUpdate() {
        return passengersToUpdate;
    }

    /**
     * Sets the value of the passengersToUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModifyPNRUpdatePassenger }
     *     
     */
    public void setPassengersToUpdate(ArrayOfModifyPNRUpdatePassenger value) {
        this.passengersToUpdate = value;
    }

    /**
     * Gets the value of the specialServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialService }
     *     
     */
    public ArrayOfSpecialService getSpecialServices() {
        return specialServices;
    }

    /**
     * Sets the value of the specialServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialService }
     *     
     */
    public void setSpecialServices(ArrayOfSpecialService value) {
        this.specialServices = value;
    }

    /**
     * Gets the value of the specialServicesToCancel property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialServiceToCancel }
     *     
     */
    public ArrayOfSpecialServiceToCancel getSpecialServicesToCancel() {
        return specialServicesToCancel;
    }

    /**
     * Sets the value of the specialServicesToCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialServiceToCancel }
     *     
     */
    public void setSpecialServicesToCancel(ArrayOfSpecialServiceToCancel value) {
        this.specialServicesToCancel = value;
    }

    /**
     * Gets the value of the contactInformationToAdd property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModifyPNRAddContactInfo }
     *     
     */
    public ArrayOfModifyPNRAddContactInfo getContactInformationToAdd() {
        return contactInformationToAdd;
    }

    /**
     * Sets the value of the contactInformationToAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModifyPNRAddContactInfo }
     *     
     */
    public void setContactInformationToAdd(ArrayOfModifyPNRAddContactInfo value) {
        this.contactInformationToAdd = value;
    }

    /**
     * Gets the value of the contactInformationToUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModifyPNRUpdateContactInfo }
     *     
     */
    public ArrayOfModifyPNRUpdateContactInfo getContactInformationToUpdate() {
        return contactInformationToUpdate;
    }

    /**
     * Sets the value of the contactInformationToUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModifyPNRUpdateContactInfo }
     *     
     */
    public void setContactInformationToUpdate(ArrayOfModifyPNRUpdateContactInfo value) {
        this.contactInformationToUpdate = value;
    }

    /**
     * Gets the value of the commentToAdd property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getCommentToAdd() {
        return commentToAdd;
    }

    /**
     * Sets the value of the commentToAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setCommentToAdd(Comment value) {
        this.commentToAdd = value;
    }

    /**
     * Gets the value of the emergencyContactsToAddToSegments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfModifyPNREmergencyContact }{@code >}
     *     
     */
    public JAXBElement<ArrayOfModifyPNREmergencyContact> getEmergencyContactsToAddToSegments() {
        return emergencyContactsToAddToSegments;
    }

    /**
     * Sets the value of the emergencyContactsToAddToSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfModifyPNREmergencyContact }{@code >}
     *     
     */
    public void setEmergencyContactsToAddToSegments(JAXBElement<ArrayOfModifyPNREmergencyContact> value) {
        this.emergencyContactsToAddToSegments = value;
    }

    /**
     * Gets the value of the passengerSegmentsToUpdateRecordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfModifyPNRUpdateRecordLocator }{@code >}
     *     
     */
    public JAXBElement<ArrayOfModifyPNRUpdateRecordLocator> getPassengerSegmentsToUpdateRecordLocator() {
        return passengerSegmentsToUpdateRecordLocator;
    }

    /**
     * Sets the value of the passengerSegmentsToUpdateRecordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfModifyPNRUpdateRecordLocator }{@code >}
     *     
     */
    public void setPassengerSegmentsToUpdateRecordLocator(JAXBElement<ArrayOfModifyPNRUpdateRecordLocator> value) {
        this.passengerSegmentsToUpdateRecordLocator = value;
    }

    /**
     * Gets the value of the changeFlightFromReservation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ModifyPNROriginDestinations }{@code >}
     *     
     */
    public JAXBElement<ModifyPNROriginDestinations> getChangeFlightFromReservation() {
        return changeFlightFromReservation;
    }

    /**
     * Sets the value of the changeFlightFromReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ModifyPNROriginDestinations }{@code >}
     *     
     */
    public void setChangeFlightFromReservation(JAXBElement<ModifyPNROriginDestinations> value) {
        this.changeFlightFromReservation = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChannel(JAXBElement<String> value) {
        this.channel = value;
    }

    /**
     * Gets the value of the subChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubChannel() {
        return subChannel;
    }

    /**
     * Sets the value of the subChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubChannel(JAXBElement<String> value) {
        this.subChannel = value;
    }

    /**
     * Gets the value of the pointOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPointOfSale(JAXBElement<String> value) {
        this.pointOfSale = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrency(JAXBElement<String> value) {
        this.currency = value;
    }

    /**
     * Gets the value of the paxToAdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ModifyPNRModifyCPRequest }{@code >}
     *     
     */
    public JAXBElement<ModifyPNRModifyCPRequest> getPaxToAdd() {
        return paxToAdd;
    }

    /**
     * Sets the value of the paxToAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ModifyPNRModifyCPRequest }{@code >}
     *     
     */
    public void setPaxToAdd(JAXBElement<ModifyPNRModifyCPRequest> value) {
        this.paxToAdd = value;
    }

}

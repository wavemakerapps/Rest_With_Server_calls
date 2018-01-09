/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract.EnumerationsSSRStatus;
import com.gzipcompressiontest.services.connectpoint_reservation.model.microsoft.ArrayOfint;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfAddTaxDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfAddTaxDetail");
    private final static QName _ModifyPNRUpdateContactInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ModifyPNR.UpdateContactInfo");
    private final static QName _ArrayOfImportPNRReservationSegmentAirlinePersonCharge_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfImportPNR.Reservation.Segment.AirlinePerson.Charge");
    private final static QName _CreatePNR_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "CreatePNR");
    private final static QName _ArrayOfContactInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfContactInfo");
    private final static QName _ArrayOfModifyPNRUpdateRecordLocator_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfModifyPNR.UpdateRecordLocator");
    private final static QName _SummaryPNRActionTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "SummaryPNR.ActionTypes");
    private final static QName _AddPaxContact_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "addPaxContact");
    private final static QName _ImportPNRReservationPerson_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ImportPNR.Reservation.Person");
    private final static QName _OverrideReservationCharges_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "OverrideReservationCharges");
    private final static QName _ImportPNRReservationImportError_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ImportPNR.Reservation.ImportError");
    private final static QName _EvaluateModificationOfPNRActionTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "EvaluateModificationOfPNR.ActionTypes");
    private final static QName _ModifyPNRFlightInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ModifyPNR.FlightInformation");
    private final static QName _ArrayOfOverrideChargeDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfOverrideChargeDetail");
    private final static QName _HistoryPNR_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "HistoryPNR");
    private final static QName _ArrayOfModifyPNRPassenger_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfModifyPNR.Passenger");
    private final static QName _ArrayOfModifyPNROriginDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfModifyPNR.OriginDestination");
    private final static QName _Seat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "Seat");
    private final static QName _ArrayOfaddPaxContact_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfaddPaxContact");
    private final static QName _ModifyDetailsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ModifyDetailsRequest");
    private final static QName _CreatePNRActionTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "CreatePNR.ActionTypes");
    private final static QName _ModifyPNRPassenger_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ModifyPNR.Passenger");
    private final static QName _ArrayOfSeat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfSeat");
    private final static QName _CancelPNR_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "CancelPNR");
    private final static QName _AddTaxDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "AddTaxDetail");
    private final static QName _ArrayOfImportPNRReservationPerson_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfImportPNR.Reservation.Person");
    private final static QName _ArrayOfImportPNRReservationSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfImportPNR.Reservation.Segment");
    private final static QName _ArrayOfModifyPNREmergencyContact_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfModifyPNR.EmergencyContact");
    private final static QName _ImportPNRReservationSegmentAirlinePerson_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ImportPNR.Reservation.Segment.AirlinePerson");
    private final static QName _ArrayOfSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfSegment");
    private final static QName _ModifyPNRUpdatePassenger_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ModifyPNR.UpdatePassenger");
    private final static QName _ArrayOfModifyPNROldPaxRef_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfModifyPNR.OldPaxRef");
    private final static QName _ImportPNRActionTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ImportPNR.ActionTypes");
    private final static QName _ModifyPNROldPaxRef_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ModifyPNR.OldPaxRef");
    private final static QName _SummaryPNR_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "SummaryPNR");
    private final static QName _RetrievePNR_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "RetrievePNR");
    private final static QName _CancelPNRActionTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "CancelPNR.ActionTypes");
    private final static QName _AddPAXOriginDestinations_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "addPAXOriginDestinations");
    private final static QName _ArrayOfaddPaxOriginDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfaddPaxOriginDestination");
    private final static QName _ModifyPNR_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ModifyPNR");
    private final static QName _ModifyPNREmergencyContact_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ModifyPNR.EmergencyContact");
    private final static QName _HistoryPNRActionTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "HistoryPNR.ActionTypes");
    private final static QName _ImportPNRReservationSegmentAirlinePersonSeat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ImportPNR.Reservation.Segment.AirlinePerson.Seat");
    private final static QName _ArrayOfPayment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfPayment");
    private final static QName _ModifyPNRActionTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ModifyPNR.ActionTypes");
    private final static QName _ArrayOfImportPNRReservationSegmentAirlinePerson_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfImportPNR.Reservation.Segment.AirlinePerson");
    private final static QName _ArrayOfSpecialServiceToCancel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfSpecialServiceToCancel");
    private final static QName _RetrieveBalance_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "RetrieveBalance");
    private final static QName _ArrayOfModifyPNRAddContactInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfModifyPNR.AddContactInfo");
    private final static QName _ModifyPNROriginDestinations_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ModifyPNR.OriginDestinations");
    private final static QName _ImportPNRReservationPersonApisInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ImportPNR.Reservation.Person.ApisInformation");
    private final static QName _ArrayOfImportPNRReservationComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfImportPNR.Reservation.Comment");
    private final static QName _ArrayOfModifyPNRFlightInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfModifyPNR.FlightInformation");
    private final static QName _DocumentInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "DocumentInfo");
    private final static QName _AddPAX_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "addPAX");
    private final static QName _RetrieveBalanceActionTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "RetrieveBalance.ActionTypes");
    private final static QName _ModifyPNRUpdateRecordLocator_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ModifyPNR.UpdateRecordLocator");
    private final static QName _AddPaxOriginDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "addPaxOriginDestination");
    private final static QName _AddPaxAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "addPaxAddress");
    private final static QName _EvaluateModificationOfPNR_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "EvaluateModificationOfPNR");
    private final static QName _ImportPNR_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ImportPNR");
    private final static QName _ArrayOfImportPNRReservationPersonApisInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfImportPNR.Reservation.Person.ApisInformation");
    private final static QName _ModifyPNROriginDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ModifyPNR.OriginDestination");
    private final static QName _ImportPNRReservation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ImportPNR.Reservation");
    private final static QName _Person_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "Person");
    private final static QName _ModifyPNRPerson_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ModifyPNR.Person");
    private final static QName _AddPenaltyDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "AddPenaltyDetail");
    private final static QName _ArrayOfModifyPNRUpdatePassenger_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfModifyPNR.UpdatePassenger");
    private final static QName _ArrayOfDocumentInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfDocumentInfo");
    private final static QName _ModifyPNRAddContactInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ModifyPNR.AddContactInfo");
    private final static QName _Address_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "Address");
    private final static QName _OldPaxRefrs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "oldPaxRefrs");
    private final static QName _ContactInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ContactInfo");
    private final static QName _ImportPNRReservationSegmentAirlinePersonCharge_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ImportPNR.Reservation.Segment.AirlinePerson.Charge");
    private final static QName _AddPenalty_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "AddPenalty");
    private final static QName _Comment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "Comment");
    private final static QName _ArrayOfaddPAX_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfaddPAX");
    private final static QName _ImportPNRReservationSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ImportPNR.Reservation.Segment");
    private final static QName _ArrayOfModifyPNRUpdateContactInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfModifyPNR.UpdateContactInfo");
    private final static QName _ArrayOfImportPNRReservationSegmentAirlinePersonSeat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfImportPNR.Reservation.Segment.AirlinePerson.Seat");
    private final static QName _AddTax_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "AddTax");
    private final static QName _ArrayOfAddPenaltyDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfAddPenaltyDetail");
    private final static QName _ImportPNRReservationComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ImportPNR.Reservation.Comment");
    private final static QName _Segment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "Segment");
    private final static QName _ArrayOfoldPaxRefrs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfoldPaxRefrs");
    private final static QName _ArrayOfSpecialService_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfSpecialService");
    private final static QName _OverrideChargeDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "OverrideChargeDetail");
    private final static QName _ReservationToInsertHistory_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ReservationToInsertHistory");
    private final static QName _ArrayOfReservationToInsertHistory_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfReservationToInsertHistory");
    private final static QName _SpecialServiceToCancel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "SpecialServiceToCancel");
    private final static QName _ArrayOfImportPNRReservationImportError_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfImportPNR.Reservation.ImportError");
    private final static QName _Payment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "Payment");
    private final static QName _OverrideChargeBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "OverrideChargeBase");
    private final static QName _ArrayOfPerson_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ArrayOfPerson");
    private final static QName _ModifyPNRModifyCPRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ModifyPNR.modifyCPRequest");
    private final static QName _RetrievePNRActionTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "RetrievePNR.ActionTypes");
    private final static QName _SpecialService_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "SpecialService");
    private final static QName _ModifyPNRModifyCPRequestModifyDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "modifyDetails");
    private final static QName _AddPaxAddressPostal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "postal");
    private final static QName _AddPaxAddressState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "state");
    private final static QName _AddPaxAddressCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "country");
    private final static QName _AddPaxAddressAddress2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "address2");
    private final static QName _AddPaxAddressCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "city");
    private final static QName _AddPaxAddressAddress1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "address1");
    private final static QName _ModifyPNRUpdateRecordLocatorRecordLocator_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "RecordLocator");
    private final static QName _ReservationToInsertHistoryHistoryEventText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "HistoryEventText");
    private final static QName _ReservationToInsertHistoryPassenger_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "Passenger");
    private final static QName _ModifyPNRChangeFlightFromReservation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ChangeFlightFromReservation");
    private final static QName _ModifyPNRPaxToAdd_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "PaxToAdd");
    private final static QName _ModifyPNRSubChannel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "SubChannel");
    private final static QName _ModifyPNREmergencyContactsToAddToSegments_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "EmergencyContactsToAddToSegments");
    private final static QName _ModifyPNRPassengerSegmentsToUpdateRecordLocator_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "PassengerSegmentsToUpdateRecordLocator");
    private final static QName _ModifyPNRPointOfSale_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "PointOfSale");
    private final static QName _ModifyPNRChannel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "Channel");
    private final static QName _ModifyPNRCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "Currency");
    private final static QName _AddPenaltyPenaltyDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "PenaltyDetails");
    private final static QName _DocumentInfoIssuingCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "IssuingCountry");
    private final static QName _DocumentInfoDocType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "DocType");
    private final static QName _DocumentInfoExpiryDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ExpiryDate");
    private final static QName _DocumentInfoDocNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "DocNumber");
    private final static QName _PersonTierName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "TierName");
    private final static QName _PersonFrequentFlyerNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "FrequentFlyerNumber");
    private final static QName _PersonPassportIssueCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "PassportIssueCountry");
    private final static QName _PersonDocumentInfos_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "DocumentInfos");
    private final static QName _PersonSuffix_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "Suffix");
    private final static QName _SpecialServiceExtPenaltyRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ExtPenaltyRule");
    private final static QName _SpecialServiceExtIsRePriceFixed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ExtIsRePriceFixed");
    private final static QName _SpecialServiceExtRePriceValueReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ExtRePriceValueReason");
    private final static QName _SpecialServiceOverrideAmtReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "OverrideAmtReason");
    private final static QName _SpecialServiceExtRePriceValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ExtRePriceValue");
    private final static QName _SpecialServicePhysicalFlightID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "PhysicalFlightID");
    private final static QName _SpecialServiceExtRePriceSourceName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ExtRePriceSourceName");
    private final static QName _SpecialServiceSSRStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "SSRStatus");
    private final static QName _AddTaxTaxDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "TaxDetails");
    private final static QName _AddPAXRepricerAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "RepricerAddress");
    private final static QName _AddPAXContactDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "contactDetails");
    private final static QName _ModifyPNROriginDestinationOldPaxRefs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "OldPaxRefs");
    private final static QName _ModifyPNROriginDestinationOldODRef_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "OldODRef");
    private final static QName _ModifyPNRPassengerStoreFrontID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "StoreFrontID");
    private final static QName _ModifyPNRPassengerFlightInformations_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "FlightInformations");
    private final static QName _ModifyPNROriginDestinationsOriginDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "OriginDestination");
    private final static QName _AddPaxOriginDestinationOldODRef_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "oldODRef");
    private final static QName _AddPaxOriginDestinationOldPaxRefs_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "oldPaxRefs");
    private final static QName _ModifyPNRUpdatePassengerFFNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "FFNum");
    private final static QName _AddPAXOriginDestinationsOriginDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "originDestination");
    private final static QName _OldPaxRefrsOldPaxRef_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "oldPaxRef");
    private final static QName _ModifyDetailsRequestOriginDestinations_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "originDestinations");
    private final static QName _ModifyDetailsRequestPaxDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "paxDetails");
    private final static QName _HistoryPNRReservationsToInsertHistory_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ReservationsToInsertHistory");
    private final static QName _ModifyPNROldPaxRefOldPaxRef_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "OldPaxRef");
    private final static QName _OverrideChargeBaseExtRepriceValueReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ExtRepriceValueReason");
    private final static QName _OverrideChargeBaseExtIsRepriceFixed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ExtIsRepriceFixed");
    private final static QName _OverrideChargeBaseExtRepriceValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ExtRepriceValue");
    private final static QName _OverrideChargeBaseExtRepriceSourceName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "ExtRepriceSourceName");
    private final static QName _AddPaxContactType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "type");
    private final static QName _AddPaxContactContact_QNAME = new QName("http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", "contact");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Seat }
     * 
     */
    public Seat createSeat() {
        return new Seat();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ArrayOfaddPaxContact }
     * 
     */
    public ArrayOfaddPaxContact createArrayOfaddPaxContact() {
        return new ArrayOfaddPaxContact();
    }

    /**
     * Create an instance of {@link OldPaxRefrs }
     * 
     */
    public OldPaxRefrs createOldPaxRefrs() {
        return new OldPaxRefrs();
    }

    /**
     * Create an instance of {@link ArrayOfModifyPNRUpdatePassenger }
     * 
     */
    public ArrayOfModifyPNRUpdatePassenger createArrayOfModifyPNRUpdatePassenger() {
        return new ArrayOfModifyPNRUpdatePassenger();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentInfo }
     * 
     */
    public ArrayOfDocumentInfo createArrayOfDocumentInfo() {
        return new ArrayOfDocumentInfo();
    }

    /**
     * Create an instance of {@link ModifyPNRAddContactInfo }
     * 
     */
    public ModifyPNRAddContactInfo createModifyPNRAddContactInfo() {
        return new ModifyPNRAddContactInfo();
    }

    /**
     * Create an instance of {@link ModifyPNRPassenger }
     * 
     */
    public ModifyPNRPassenger createModifyPNRPassenger() {
        return new ModifyPNRPassenger();
    }

    /**
     * Create an instance of {@link ImportPNRReservationSegmentAirlinePersonCharge }
     * 
     */
    public ImportPNRReservationSegmentAirlinePersonCharge createImportPNRReservationSegmentAirlinePersonCharge() {
        return new ImportPNRReservationSegmentAirlinePersonCharge();
    }

    /**
     * Create an instance of {@link AddPenalty }
     * 
     */
    public AddPenalty createAddPenalty() {
        return new AddPenalty();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link ModifyDetailsRequest }
     * 
     */
    public ModifyDetailsRequest createModifyDetailsRequest() {
        return new ModifyDetailsRequest();
    }

    /**
     * Create an instance of {@link ModifyPNRFlightInformation }
     * 
     */
    public ModifyPNRFlightInformation createModifyPNRFlightInformation() {
        return new ModifyPNRFlightInformation();
    }

    /**
     * Create an instance of {@link ArrayOfOverrideChargeDetail }
     * 
     */
    public ArrayOfOverrideChargeDetail createArrayOfOverrideChargeDetail() {
        return new ArrayOfOverrideChargeDetail();
    }

    /**
     * Create an instance of {@link ImportPNR }
     * 
     */
    public ImportPNR createImportPNR() {
        return new ImportPNR();
    }

    /**
     * Create an instance of {@link ArrayOfImportPNRReservationPersonApisInformation }
     * 
     */
    public ArrayOfImportPNRReservationPersonApisInformation createArrayOfImportPNRReservationPersonApisInformation() {
        return new ArrayOfImportPNRReservationPersonApisInformation();
    }

    /**
     * Create an instance of {@link ModifyPNROriginDestination }
     * 
     */
    public ModifyPNROriginDestination createModifyPNROriginDestination() {
        return new ModifyPNROriginDestination();
    }

    /**
     * Create an instance of {@link ModifyPNRPerson }
     * 
     */
    public ModifyPNRPerson createModifyPNRPerson() {
        return new ModifyPNRPerson();
    }

    /**
     * Create an instance of {@link AddPenaltyDetail }
     * 
     */
    public AddPenaltyDetail createAddPenaltyDetail() {
        return new AddPenaltyDetail();
    }

    /**
     * Create an instance of {@link ImportPNRReservation }
     * 
     */
    public ImportPNRReservation createImportPNRReservation() {
        return new ImportPNRReservation();
    }

    /**
     * Create an instance of {@link HistoryPNR }
     * 
     */
    public HistoryPNR createHistoryPNR() {
        return new HistoryPNR();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link ArrayOfModifyPNRPassenger }
     * 
     */
    public ArrayOfModifyPNRPassenger createArrayOfModifyPNRPassenger() {
        return new ArrayOfModifyPNRPassenger();
    }

    /**
     * Create an instance of {@link ArrayOfModifyPNROriginDestination }
     * 
     */
    public ArrayOfModifyPNROriginDestination createArrayOfModifyPNROriginDestination() {
        return new ArrayOfModifyPNROriginDestination();
    }

    /**
     * Create an instance of {@link AddPaxContact }
     * 
     */
    public AddPaxContact createAddPaxContact() {
        return new AddPaxContact();
    }

    /**
     * Create an instance of {@link ModifyPNRUpdateRecordLocator }
     * 
     */
    public ModifyPNRUpdateRecordLocator createModifyPNRUpdateRecordLocator() {
        return new ModifyPNRUpdateRecordLocator();
    }

    /**
     * Create an instance of {@link AddPaxOriginDestination }
     * 
     */
    public AddPaxOriginDestination createAddPaxOriginDestination() {
        return new AddPaxOriginDestination();
    }

    /**
     * Create an instance of {@link AddPaxAddress }
     * 
     */
    public AddPaxAddress createAddPaxAddress() {
        return new AddPaxAddress();
    }

    /**
     * Create an instance of {@link EvaluateModificationOfPNR }
     * 
     */
    public EvaluateModificationOfPNR createEvaluateModificationOfPNR() {
        return new EvaluateModificationOfPNR();
    }

    /**
     * Create an instance of {@link ImportPNRReservationImportError }
     * 
     */
    public ImportPNRReservationImportError createImportPNRReservationImportError() {
        return new ImportPNRReservationImportError();
    }

    /**
     * Create an instance of {@link ImportPNRReservationPerson }
     * 
     */
    public ImportPNRReservationPerson createImportPNRReservationPerson() {
        return new ImportPNRReservationPerson();
    }

    /**
     * Create an instance of {@link OverrideReservationCharges }
     * 
     */
    public OverrideReservationCharges createOverrideReservationCharges() {
        return new OverrideReservationCharges();
    }

    /**
     * Create an instance of {@link ArrayOfImportPNRReservationSegmentAirlinePersonCharge }
     * 
     */
    public ArrayOfImportPNRReservationSegmentAirlinePersonCharge createArrayOfImportPNRReservationSegmentAirlinePersonCharge() {
        return new ArrayOfImportPNRReservationSegmentAirlinePersonCharge();
    }

    /**
     * Create an instance of {@link CreatePNR }
     * 
     */
    public CreatePNR createCreatePNR() {
        return new CreatePNR();
    }

    /**
     * Create an instance of {@link ArrayOfAddTaxDetail }
     * 
     */
    public ArrayOfAddTaxDetail createArrayOfAddTaxDetail() {
        return new ArrayOfAddTaxDetail();
    }

    /**
     * Create an instance of {@link ModifyPNRUpdateContactInfo }
     * 
     */
    public ModifyPNRUpdateContactInfo createModifyPNRUpdateContactInfo() {
        return new ModifyPNRUpdateContactInfo();
    }

    /**
     * Create an instance of {@link ArrayOfModifyPNRUpdateRecordLocator }
     * 
     */
    public ArrayOfModifyPNRUpdateRecordLocator createArrayOfModifyPNRUpdateRecordLocator() {
        return new ArrayOfModifyPNRUpdateRecordLocator();
    }

    /**
     * Create an instance of {@link AddPAX }
     * 
     */
    public AddPAX createAddPAX() {
        return new AddPAX();
    }

    /**
     * Create an instance of {@link ArrayOfContactInfo }
     * 
     */
    public ArrayOfContactInfo createArrayOfContactInfo() {
        return new ArrayOfContactInfo();
    }

    /**
     * Create an instance of {@link DocumentInfo }
     * 
     */
    public DocumentInfo createDocumentInfo() {
        return new DocumentInfo();
    }

    /**
     * Create an instance of {@link ArrayOfPerson }
     * 
     */
    public ArrayOfPerson createArrayOfPerson() {
        return new ArrayOfPerson();
    }

    /**
     * Create an instance of {@link ModifyPNRModifyCPRequest }
     * 
     */
    public ModifyPNRModifyCPRequest createModifyPNRModifyCPRequest() {
        return new ModifyPNRModifyCPRequest();
    }

    /**
     * Create an instance of {@link ArrayOfModifyPNRAddContactInfo }
     * 
     */
    public ArrayOfModifyPNRAddContactInfo createArrayOfModifyPNRAddContactInfo() {
        return new ArrayOfModifyPNRAddContactInfo();
    }

    /**
     * Create an instance of {@link ModifyPNROriginDestinations }
     * 
     */
    public ModifyPNROriginDestinations createModifyPNROriginDestinations() {
        return new ModifyPNROriginDestinations();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialServiceToCancel }
     * 
     */
    public ArrayOfSpecialServiceToCancel createArrayOfSpecialServiceToCancel() {
        return new ArrayOfSpecialServiceToCancel();
    }

    /**
     * Create an instance of {@link RetrieveBalance }
     * 
     */
    public RetrieveBalance createRetrieveBalance() {
        return new RetrieveBalance();
    }

    /**
     * Create an instance of {@link ArrayOfImportPNRReservationComment }
     * 
     */
    public ArrayOfImportPNRReservationComment createArrayOfImportPNRReservationComment() {
        return new ArrayOfImportPNRReservationComment();
    }

    /**
     * Create an instance of {@link ArrayOfModifyPNRFlightInformation }
     * 
     */
    public ArrayOfModifyPNRFlightInformation createArrayOfModifyPNRFlightInformation() {
        return new ArrayOfModifyPNRFlightInformation();
    }

    /**
     * Create an instance of {@link SpecialService }
     * 
     */
    public SpecialService createSpecialService() {
        return new SpecialService();
    }

    /**
     * Create an instance of {@link ImportPNRReservationPersonApisInformation }
     * 
     */
    public ImportPNRReservationPersonApisInformation createImportPNRReservationPersonApisInformation() {
        return new ImportPNRReservationPersonApisInformation();
    }

    /**
     * Create an instance of {@link ArrayOfReservationToInsertHistory }
     * 
     */
    public ArrayOfReservationToInsertHistory createArrayOfReservationToInsertHistory() {
        return new ArrayOfReservationToInsertHistory();
    }

    /**
     * Create an instance of {@link ModifyPNREmergencyContact }
     * 
     */
    public ModifyPNREmergencyContact createModifyPNREmergencyContact() {
        return new ModifyPNREmergencyContact();
    }

    /**
     * Create an instance of {@link ReservationToInsertHistory }
     * 
     */
    public ReservationToInsertHistory createReservationToInsertHistory() {
        return new ReservationToInsertHistory();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link OverrideChargeBase }
     * 
     */
    public OverrideChargeBase createOverrideChargeBase() {
        return new OverrideChargeBase();
    }

    /**
     * Create an instance of {@link ArrayOfImportPNRReservationSegmentAirlinePerson }
     * 
     */
    public ArrayOfImportPNRReservationSegmentAirlinePerson createArrayOfImportPNRReservationSegmentAirlinePerson() {
        return new ArrayOfImportPNRReservationSegmentAirlinePerson();
    }

    /**
     * Create an instance of {@link SpecialServiceToCancel }
     * 
     */
    public SpecialServiceToCancel createSpecialServiceToCancel() {
        return new SpecialServiceToCancel();
    }

    /**
     * Create an instance of {@link ImportPNRReservationSegmentAirlinePersonSeat }
     * 
     */
    public ImportPNRReservationSegmentAirlinePersonSeat createImportPNRReservationSegmentAirlinePersonSeat() {
        return new ImportPNRReservationSegmentAirlinePersonSeat();
    }

    /**
     * Create an instance of {@link ArrayOfImportPNRReservationImportError }
     * 
     */
    public ArrayOfImportPNRReservationImportError createArrayOfImportPNRReservationImportError() {
        return new ArrayOfImportPNRReservationImportError();
    }

    /**
     * Create an instance of {@link ArrayOfPayment }
     * 
     */
    public ArrayOfPayment createArrayOfPayment() {
        return new ArrayOfPayment();
    }

    /**
     * Create an instance of {@link RetrievePNR }
     * 
     */
    public RetrievePNR createRetrievePNR() {
        return new RetrievePNR();
    }

    /**
     * Create an instance of {@link ArrayOfoldPaxRefrs }
     * 
     */
    public ArrayOfoldPaxRefrs createArrayOfoldPaxRefrs() {
        return new ArrayOfoldPaxRefrs();
    }

    /**
     * Create an instance of {@link ImportPNRReservationComment }
     * 
     */
    public ImportPNRReservationComment createImportPNRReservationComment() {
        return new ImportPNRReservationComment();
    }

    /**
     * Create an instance of {@link ArrayOfModifyPNROldPaxRef }
     * 
     */
    public ArrayOfModifyPNROldPaxRef createArrayOfModifyPNROldPaxRef() {
        return new ArrayOfModifyPNROldPaxRef();
    }

    /**
     * Create an instance of {@link ModifyPNROldPaxRef }
     * 
     */
    public ModifyPNROldPaxRef createModifyPNROldPaxRef() {
        return new ModifyPNROldPaxRef();
    }

    /**
     * Create an instance of {@link SummaryPNR }
     * 
     */
    public SummaryPNR createSummaryPNR() {
        return new SummaryPNR();
    }

    /**
     * Create an instance of {@link Segment }
     * 
     */
    public Segment createSegment() {
        return new Segment();
    }

    /**
     * Create an instance of {@link AddPAXOriginDestinations }
     * 
     */
    public AddPAXOriginDestinations createAddPAXOriginDestinations() {
        return new AddPAXOriginDestinations();
    }

    /**
     * Create an instance of {@link ArrayOfaddPaxOriginDestination }
     * 
     */
    public ArrayOfaddPaxOriginDestination createArrayOfaddPaxOriginDestination() {
        return new ArrayOfaddPaxOriginDestination();
    }

    /**
     * Create an instance of {@link ModifyPNR }
     * 
     */
    public ModifyPNR createModifyPNR() {
        return new ModifyPNR();
    }

    /**
     * Create an instance of {@link OverrideChargeDetail }
     * 
     */
    public OverrideChargeDetail createOverrideChargeDetail() {
        return new OverrideChargeDetail();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialService }
     * 
     */
    public ArrayOfSpecialService createArrayOfSpecialService() {
        return new ArrayOfSpecialService();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link ArrayOfSeat }
     * 
     */
    public ArrayOfSeat createArrayOfSeat() {
        return new ArrayOfSeat();
    }

    /**
     * Create an instance of {@link CancelPNR }
     * 
     */
    public CancelPNR createCancelPNR() {
        return new CancelPNR();
    }

    /**
     * Create an instance of {@link ArrayOfaddPAX }
     * 
     */
    public ArrayOfaddPAX createArrayOfaddPAX() {
        return new ArrayOfaddPAX();
    }

    /**
     * Create an instance of {@link ImportPNRReservationSegment }
     * 
     */
    public ImportPNRReservationSegment createImportPNRReservationSegment() {
        return new ImportPNRReservationSegment();
    }

    /**
     * Create an instance of {@link AddTax }
     * 
     */
    public AddTax createAddTax() {
        return new AddTax();
    }

    /**
     * Create an instance of {@link ImportPNRReservationSegmentAirlinePerson }
     * 
     */
    public ImportPNRReservationSegmentAirlinePerson createImportPNRReservationSegmentAirlinePerson() {
        return new ImportPNRReservationSegmentAirlinePerson();
    }

    /**
     * Create an instance of {@link ArrayOfAddPenaltyDetail }
     * 
     */
    public ArrayOfAddPenaltyDetail createArrayOfAddPenaltyDetail() {
        return new ArrayOfAddPenaltyDetail();
    }

    /**
     * Create an instance of {@link ArrayOfSegment }
     * 
     */
    public ArrayOfSegment createArrayOfSegment() {
        return new ArrayOfSegment();
    }

    /**
     * Create an instance of {@link ModifyPNRUpdatePassenger }
     * 
     */
    public ModifyPNRUpdatePassenger createModifyPNRUpdatePassenger() {
        return new ModifyPNRUpdatePassenger();
    }

    /**
     * Create an instance of {@link AddTaxDetail }
     * 
     */
    public AddTaxDetail createAddTaxDetail() {
        return new AddTaxDetail();
    }

    /**
     * Create an instance of {@link ArrayOfModifyPNRUpdateContactInfo }
     * 
     */
    public ArrayOfModifyPNRUpdateContactInfo createArrayOfModifyPNRUpdateContactInfo() {
        return new ArrayOfModifyPNRUpdateContactInfo();
    }

    /**
     * Create an instance of {@link ArrayOfImportPNRReservationPerson }
     * 
     */
    public ArrayOfImportPNRReservationPerson createArrayOfImportPNRReservationPerson() {
        return new ArrayOfImportPNRReservationPerson();
    }

    /**
     * Create an instance of {@link ArrayOfImportPNRReservationSegment }
     * 
     */
    public ArrayOfImportPNRReservationSegment createArrayOfImportPNRReservationSegment() {
        return new ArrayOfImportPNRReservationSegment();
    }

    /**
     * Create an instance of {@link ArrayOfImportPNRReservationSegmentAirlinePersonSeat }
     * 
     */
    public ArrayOfImportPNRReservationSegmentAirlinePersonSeat createArrayOfImportPNRReservationSegmentAirlinePersonSeat() {
        return new ArrayOfImportPNRReservationSegmentAirlinePersonSeat();
    }

    /**
     * Create an instance of {@link ArrayOfModifyPNREmergencyContact }
     * 
     */
    public ArrayOfModifyPNREmergencyContact createArrayOfModifyPNREmergencyContact() {
        return new ArrayOfModifyPNREmergencyContact();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddTaxDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfAddTaxDetail")
    public JAXBElement<ArrayOfAddTaxDetail> createArrayOfAddTaxDetail(ArrayOfAddTaxDetail value) {
        return new JAXBElement<ArrayOfAddTaxDetail>(_ArrayOfAddTaxDetail_QNAME, ArrayOfAddTaxDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPNRUpdateContactInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ModifyPNR.UpdateContactInfo")
    public JAXBElement<ModifyPNRUpdateContactInfo> createModifyPNRUpdateContactInfo(ModifyPNRUpdateContactInfo value) {
        return new JAXBElement<ModifyPNRUpdateContactInfo>(_ModifyPNRUpdateContactInfo_QNAME, ModifyPNRUpdateContactInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImportPNRReservationSegmentAirlinePersonCharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfImportPNR.Reservation.Segment.AirlinePerson.Charge")
    public JAXBElement<ArrayOfImportPNRReservationSegmentAirlinePersonCharge> createArrayOfImportPNRReservationSegmentAirlinePersonCharge(ArrayOfImportPNRReservationSegmentAirlinePersonCharge value) {
        return new JAXBElement<ArrayOfImportPNRReservationSegmentAirlinePersonCharge>(_ArrayOfImportPNRReservationSegmentAirlinePersonCharge_QNAME, ArrayOfImportPNRReservationSegmentAirlinePersonCharge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "CreatePNR")
    public JAXBElement<CreatePNR> createCreatePNR(CreatePNR value) {
        return new JAXBElement<CreatePNR>(_CreatePNR_QNAME, CreatePNR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContactInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfContactInfo")
    public JAXBElement<ArrayOfContactInfo> createArrayOfContactInfo(ArrayOfContactInfo value) {
        return new JAXBElement<ArrayOfContactInfo>(_ArrayOfContactInfo_QNAME, ArrayOfContactInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModifyPNRUpdateRecordLocator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfModifyPNR.UpdateRecordLocator")
    public JAXBElement<ArrayOfModifyPNRUpdateRecordLocator> createArrayOfModifyPNRUpdateRecordLocator(ArrayOfModifyPNRUpdateRecordLocator value) {
        return new JAXBElement<ArrayOfModifyPNRUpdateRecordLocator>(_ArrayOfModifyPNRUpdateRecordLocator_QNAME, ArrayOfModifyPNRUpdateRecordLocator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummaryPNRActionTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "SummaryPNR.ActionTypes")
    public JAXBElement<SummaryPNRActionTypes> createSummaryPNRActionTypes(SummaryPNRActionTypes value) {
        return new JAXBElement<SummaryPNRActionTypes>(_SummaryPNRActionTypes_QNAME, SummaryPNRActionTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPaxContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "addPaxContact")
    public JAXBElement<AddPaxContact> createAddPaxContact(AddPaxContact value) {
        return new JAXBElement<AddPaxContact>(_AddPaxContact_QNAME, AddPaxContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportPNRReservationPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ImportPNR.Reservation.Person")
    public JAXBElement<ImportPNRReservationPerson> createImportPNRReservationPerson(ImportPNRReservationPerson value) {
        return new JAXBElement<ImportPNRReservationPerson>(_ImportPNRReservationPerson_QNAME, ImportPNRReservationPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OverrideReservationCharges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "OverrideReservationCharges")
    public JAXBElement<OverrideReservationCharges> createOverrideReservationCharges(OverrideReservationCharges value) {
        return new JAXBElement<OverrideReservationCharges>(_OverrideReservationCharges_QNAME, OverrideReservationCharges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportPNRReservationImportError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ImportPNR.Reservation.ImportError")
    public JAXBElement<ImportPNRReservationImportError> createImportPNRReservationImportError(ImportPNRReservationImportError value) {
        return new JAXBElement<ImportPNRReservationImportError>(_ImportPNRReservationImportError_QNAME, ImportPNRReservationImportError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateModificationOfPNRActionTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "EvaluateModificationOfPNR.ActionTypes")
    public JAXBElement<EvaluateModificationOfPNRActionTypes> createEvaluateModificationOfPNRActionTypes(EvaluateModificationOfPNRActionTypes value) {
        return new JAXBElement<EvaluateModificationOfPNRActionTypes>(_EvaluateModificationOfPNRActionTypes_QNAME, EvaluateModificationOfPNRActionTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPNRFlightInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ModifyPNR.FlightInformation")
    public JAXBElement<ModifyPNRFlightInformation> createModifyPNRFlightInformation(ModifyPNRFlightInformation value) {
        return new JAXBElement<ModifyPNRFlightInformation>(_ModifyPNRFlightInformation_QNAME, ModifyPNRFlightInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOverrideChargeDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfOverrideChargeDetail")
    public JAXBElement<ArrayOfOverrideChargeDetail> createArrayOfOverrideChargeDetail(ArrayOfOverrideChargeDetail value) {
        return new JAXBElement<ArrayOfOverrideChargeDetail>(_ArrayOfOverrideChargeDetail_QNAME, ArrayOfOverrideChargeDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "HistoryPNR")
    public JAXBElement<HistoryPNR> createHistoryPNR(HistoryPNR value) {
        return new JAXBElement<HistoryPNR>(_HistoryPNR_QNAME, HistoryPNR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModifyPNRPassenger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfModifyPNR.Passenger")
    public JAXBElement<ArrayOfModifyPNRPassenger> createArrayOfModifyPNRPassenger(ArrayOfModifyPNRPassenger value) {
        return new JAXBElement<ArrayOfModifyPNRPassenger>(_ArrayOfModifyPNRPassenger_QNAME, ArrayOfModifyPNRPassenger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModifyPNROriginDestination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfModifyPNR.OriginDestination")
    public JAXBElement<ArrayOfModifyPNROriginDestination> createArrayOfModifyPNROriginDestination(ArrayOfModifyPNROriginDestination value) {
        return new JAXBElement<ArrayOfModifyPNROriginDestination>(_ArrayOfModifyPNROriginDestination_QNAME, ArrayOfModifyPNROriginDestination.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Seat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "Seat")
    public JAXBElement<Seat> createSeat(Seat value) {
        return new JAXBElement<Seat>(_Seat_QNAME, Seat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfaddPaxContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfaddPaxContact")
    public JAXBElement<ArrayOfaddPaxContact> createArrayOfaddPaxContact(ArrayOfaddPaxContact value) {
        return new JAXBElement<ArrayOfaddPaxContact>(_ArrayOfaddPaxContact_QNAME, ArrayOfaddPaxContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ModifyDetailsRequest")
    public JAXBElement<ModifyDetailsRequest> createModifyDetailsRequest(ModifyDetailsRequest value) {
        return new JAXBElement<ModifyDetailsRequest>(_ModifyDetailsRequest_QNAME, ModifyDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePNRActionTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "CreatePNR.ActionTypes")
    public JAXBElement<CreatePNRActionTypes> createCreatePNRActionTypes(CreatePNRActionTypes value) {
        return new JAXBElement<CreatePNRActionTypes>(_CreatePNRActionTypes_QNAME, CreatePNRActionTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPNRPassenger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ModifyPNR.Passenger")
    public JAXBElement<ModifyPNRPassenger> createModifyPNRPassenger(ModifyPNRPassenger value) {
        return new JAXBElement<ModifyPNRPassenger>(_ModifyPNRPassenger_QNAME, ModifyPNRPassenger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfSeat")
    public JAXBElement<ArrayOfSeat> createArrayOfSeat(ArrayOfSeat value) {
        return new JAXBElement<ArrayOfSeat>(_ArrayOfSeat_QNAME, ArrayOfSeat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "CancelPNR")
    public JAXBElement<CancelPNR> createCancelPNR(CancelPNR value) {
        return new JAXBElement<CancelPNR>(_CancelPNR_QNAME, CancelPNR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTaxDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "AddTaxDetail")
    public JAXBElement<AddTaxDetail> createAddTaxDetail(AddTaxDetail value) {
        return new JAXBElement<AddTaxDetail>(_AddTaxDetail_QNAME, AddTaxDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImportPNRReservationPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfImportPNR.Reservation.Person")
    public JAXBElement<ArrayOfImportPNRReservationPerson> createArrayOfImportPNRReservationPerson(ArrayOfImportPNRReservationPerson value) {
        return new JAXBElement<ArrayOfImportPNRReservationPerson>(_ArrayOfImportPNRReservationPerson_QNAME, ArrayOfImportPNRReservationPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImportPNRReservationSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfImportPNR.Reservation.Segment")
    public JAXBElement<ArrayOfImportPNRReservationSegment> createArrayOfImportPNRReservationSegment(ArrayOfImportPNRReservationSegment value) {
        return new JAXBElement<ArrayOfImportPNRReservationSegment>(_ArrayOfImportPNRReservationSegment_QNAME, ArrayOfImportPNRReservationSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModifyPNREmergencyContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfModifyPNR.EmergencyContact")
    public JAXBElement<ArrayOfModifyPNREmergencyContact> createArrayOfModifyPNREmergencyContact(ArrayOfModifyPNREmergencyContact value) {
        return new JAXBElement<ArrayOfModifyPNREmergencyContact>(_ArrayOfModifyPNREmergencyContact_QNAME, ArrayOfModifyPNREmergencyContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportPNRReservationSegmentAirlinePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ImportPNR.Reservation.Segment.AirlinePerson")
    public JAXBElement<ImportPNRReservationSegmentAirlinePerson> createImportPNRReservationSegmentAirlinePerson(ImportPNRReservationSegmentAirlinePerson value) {
        return new JAXBElement<ImportPNRReservationSegmentAirlinePerson>(_ImportPNRReservationSegmentAirlinePerson_QNAME, ImportPNRReservationSegmentAirlinePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfSegment")
    public JAXBElement<ArrayOfSegment> createArrayOfSegment(ArrayOfSegment value) {
        return new JAXBElement<ArrayOfSegment>(_ArrayOfSegment_QNAME, ArrayOfSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPNRUpdatePassenger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ModifyPNR.UpdatePassenger")
    public JAXBElement<ModifyPNRUpdatePassenger> createModifyPNRUpdatePassenger(ModifyPNRUpdatePassenger value) {
        return new JAXBElement<ModifyPNRUpdatePassenger>(_ModifyPNRUpdatePassenger_QNAME, ModifyPNRUpdatePassenger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModifyPNROldPaxRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfModifyPNR.OldPaxRef")
    public JAXBElement<ArrayOfModifyPNROldPaxRef> createArrayOfModifyPNROldPaxRef(ArrayOfModifyPNROldPaxRef value) {
        return new JAXBElement<ArrayOfModifyPNROldPaxRef>(_ArrayOfModifyPNROldPaxRef_QNAME, ArrayOfModifyPNROldPaxRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportPNRActionTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ImportPNR.ActionTypes")
    public JAXBElement<ImportPNRActionTypes> createImportPNRActionTypes(ImportPNRActionTypes value) {
        return new JAXBElement<ImportPNRActionTypes>(_ImportPNRActionTypes_QNAME, ImportPNRActionTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPNROldPaxRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ModifyPNR.OldPaxRef")
    public JAXBElement<ModifyPNROldPaxRef> createModifyPNROldPaxRef(ModifyPNROldPaxRef value) {
        return new JAXBElement<ModifyPNROldPaxRef>(_ModifyPNROldPaxRef_QNAME, ModifyPNROldPaxRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummaryPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "SummaryPNR")
    public JAXBElement<SummaryPNR> createSummaryPNR(SummaryPNR value) {
        return new JAXBElement<SummaryPNR>(_SummaryPNR_QNAME, SummaryPNR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "RetrievePNR")
    public JAXBElement<RetrievePNR> createRetrievePNR(RetrievePNR value) {
        return new JAXBElement<RetrievePNR>(_RetrievePNR_QNAME, RetrievePNR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPNRActionTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "CancelPNR.ActionTypes")
    public JAXBElement<CancelPNRActionTypes> createCancelPNRActionTypes(CancelPNRActionTypes value) {
        return new JAXBElement<CancelPNRActionTypes>(_CancelPNRActionTypes_QNAME, CancelPNRActionTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPAXOriginDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "addPAXOriginDestinations")
    public JAXBElement<AddPAXOriginDestinations> createAddPAXOriginDestinations(AddPAXOriginDestinations value) {
        return new JAXBElement<AddPAXOriginDestinations>(_AddPAXOriginDestinations_QNAME, AddPAXOriginDestinations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfaddPaxOriginDestination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfaddPaxOriginDestination")
    public JAXBElement<ArrayOfaddPaxOriginDestination> createArrayOfaddPaxOriginDestination(ArrayOfaddPaxOriginDestination value) {
        return new JAXBElement<ArrayOfaddPaxOriginDestination>(_ArrayOfaddPaxOriginDestination_QNAME, ArrayOfaddPaxOriginDestination.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ModifyPNR")
    public JAXBElement<ModifyPNR> createModifyPNR(ModifyPNR value) {
        return new JAXBElement<ModifyPNR>(_ModifyPNR_QNAME, ModifyPNR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPNREmergencyContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ModifyPNR.EmergencyContact")
    public JAXBElement<ModifyPNREmergencyContact> createModifyPNREmergencyContact(ModifyPNREmergencyContact value) {
        return new JAXBElement<ModifyPNREmergencyContact>(_ModifyPNREmergencyContact_QNAME, ModifyPNREmergencyContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryPNRActionTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "HistoryPNR.ActionTypes")
    public JAXBElement<HistoryPNRActionTypes> createHistoryPNRActionTypes(HistoryPNRActionTypes value) {
        return new JAXBElement<HistoryPNRActionTypes>(_HistoryPNRActionTypes_QNAME, HistoryPNRActionTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportPNRReservationSegmentAirlinePersonSeat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ImportPNR.Reservation.Segment.AirlinePerson.Seat")
    public JAXBElement<ImportPNRReservationSegmentAirlinePersonSeat> createImportPNRReservationSegmentAirlinePersonSeat(ImportPNRReservationSegmentAirlinePersonSeat value) {
        return new JAXBElement<ImportPNRReservationSegmentAirlinePersonSeat>(_ImportPNRReservationSegmentAirlinePersonSeat_QNAME, ImportPNRReservationSegmentAirlinePersonSeat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfPayment")
    public JAXBElement<ArrayOfPayment> createArrayOfPayment(ArrayOfPayment value) {
        return new JAXBElement<ArrayOfPayment>(_ArrayOfPayment_QNAME, ArrayOfPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPNRActionTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ModifyPNR.ActionTypes")
    public JAXBElement<ModifyPNRActionTypes> createModifyPNRActionTypes(ModifyPNRActionTypes value) {
        return new JAXBElement<ModifyPNRActionTypes>(_ModifyPNRActionTypes_QNAME, ModifyPNRActionTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImportPNRReservationSegmentAirlinePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfImportPNR.Reservation.Segment.AirlinePerson")
    public JAXBElement<ArrayOfImportPNRReservationSegmentAirlinePerson> createArrayOfImportPNRReservationSegmentAirlinePerson(ArrayOfImportPNRReservationSegmentAirlinePerson value) {
        return new JAXBElement<ArrayOfImportPNRReservationSegmentAirlinePerson>(_ArrayOfImportPNRReservationSegmentAirlinePerson_QNAME, ArrayOfImportPNRReservationSegmentAirlinePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialServiceToCancel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfSpecialServiceToCancel")
    public JAXBElement<ArrayOfSpecialServiceToCancel> createArrayOfSpecialServiceToCancel(ArrayOfSpecialServiceToCancel value) {
        return new JAXBElement<ArrayOfSpecialServiceToCancel>(_ArrayOfSpecialServiceToCancel_QNAME, ArrayOfSpecialServiceToCancel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "RetrieveBalance")
    public JAXBElement<RetrieveBalance> createRetrieveBalance(RetrieveBalance value) {
        return new JAXBElement<RetrieveBalance>(_RetrieveBalance_QNAME, RetrieveBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModifyPNRAddContactInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfModifyPNR.AddContactInfo")
    public JAXBElement<ArrayOfModifyPNRAddContactInfo> createArrayOfModifyPNRAddContactInfo(ArrayOfModifyPNRAddContactInfo value) {
        return new JAXBElement<ArrayOfModifyPNRAddContactInfo>(_ArrayOfModifyPNRAddContactInfo_QNAME, ArrayOfModifyPNRAddContactInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPNROriginDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ModifyPNR.OriginDestinations")
    public JAXBElement<ModifyPNROriginDestinations> createModifyPNROriginDestinations(ModifyPNROriginDestinations value) {
        return new JAXBElement<ModifyPNROriginDestinations>(_ModifyPNROriginDestinations_QNAME, ModifyPNROriginDestinations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportPNRReservationPersonApisInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ImportPNR.Reservation.Person.ApisInformation")
    public JAXBElement<ImportPNRReservationPersonApisInformation> createImportPNRReservationPersonApisInformation(ImportPNRReservationPersonApisInformation value) {
        return new JAXBElement<ImportPNRReservationPersonApisInformation>(_ImportPNRReservationPersonApisInformation_QNAME, ImportPNRReservationPersonApisInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImportPNRReservationComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfImportPNR.Reservation.Comment")
    public JAXBElement<ArrayOfImportPNRReservationComment> createArrayOfImportPNRReservationComment(ArrayOfImportPNRReservationComment value) {
        return new JAXBElement<ArrayOfImportPNRReservationComment>(_ArrayOfImportPNRReservationComment_QNAME, ArrayOfImportPNRReservationComment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModifyPNRFlightInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfModifyPNR.FlightInformation")
    public JAXBElement<ArrayOfModifyPNRFlightInformation> createArrayOfModifyPNRFlightInformation(ArrayOfModifyPNRFlightInformation value) {
        return new JAXBElement<ArrayOfModifyPNRFlightInformation>(_ArrayOfModifyPNRFlightInformation_QNAME, ArrayOfModifyPNRFlightInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "DocumentInfo")
    public JAXBElement<DocumentInfo> createDocumentInfo(DocumentInfo value) {
        return new JAXBElement<DocumentInfo>(_DocumentInfo_QNAME, DocumentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPAX }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "addPAX")
    public JAXBElement<AddPAX> createAddPAX(AddPAX value) {
        return new JAXBElement<AddPAX>(_AddPAX_QNAME, AddPAX.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveBalanceActionTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "RetrieveBalance.ActionTypes")
    public JAXBElement<RetrieveBalanceActionTypes> createRetrieveBalanceActionTypes(RetrieveBalanceActionTypes value) {
        return new JAXBElement<RetrieveBalanceActionTypes>(_RetrieveBalanceActionTypes_QNAME, RetrieveBalanceActionTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPNRUpdateRecordLocator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ModifyPNR.UpdateRecordLocator")
    public JAXBElement<ModifyPNRUpdateRecordLocator> createModifyPNRUpdateRecordLocator(ModifyPNRUpdateRecordLocator value) {
        return new JAXBElement<ModifyPNRUpdateRecordLocator>(_ModifyPNRUpdateRecordLocator_QNAME, ModifyPNRUpdateRecordLocator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPaxOriginDestination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "addPaxOriginDestination")
    public JAXBElement<AddPaxOriginDestination> createAddPaxOriginDestination(AddPaxOriginDestination value) {
        return new JAXBElement<AddPaxOriginDestination>(_AddPaxOriginDestination_QNAME, AddPaxOriginDestination.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPaxAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "addPaxAddress")
    public JAXBElement<AddPaxAddress> createAddPaxAddress(AddPaxAddress value) {
        return new JAXBElement<AddPaxAddress>(_AddPaxAddress_QNAME, AddPaxAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateModificationOfPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "EvaluateModificationOfPNR")
    public JAXBElement<EvaluateModificationOfPNR> createEvaluateModificationOfPNR(EvaluateModificationOfPNR value) {
        return new JAXBElement<EvaluateModificationOfPNR>(_EvaluateModificationOfPNR_QNAME, EvaluateModificationOfPNR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ImportPNR")
    public JAXBElement<ImportPNR> createImportPNR(ImportPNR value) {
        return new JAXBElement<ImportPNR>(_ImportPNR_QNAME, ImportPNR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImportPNRReservationPersonApisInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfImportPNR.Reservation.Person.ApisInformation")
    public JAXBElement<ArrayOfImportPNRReservationPersonApisInformation> createArrayOfImportPNRReservationPersonApisInformation(ArrayOfImportPNRReservationPersonApisInformation value) {
        return new JAXBElement<ArrayOfImportPNRReservationPersonApisInformation>(_ArrayOfImportPNRReservationPersonApisInformation_QNAME, ArrayOfImportPNRReservationPersonApisInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPNROriginDestination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ModifyPNR.OriginDestination")
    public JAXBElement<ModifyPNROriginDestination> createModifyPNROriginDestination(ModifyPNROriginDestination value) {
        return new JAXBElement<ModifyPNROriginDestination>(_ModifyPNROriginDestination_QNAME, ModifyPNROriginDestination.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportPNRReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ImportPNR.Reservation")
    public JAXBElement<ImportPNRReservation> createImportPNRReservation(ImportPNRReservation value) {
        return new JAXBElement<ImportPNRReservation>(_ImportPNRReservation_QNAME, ImportPNRReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "Person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPNRPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ModifyPNR.Person")
    public JAXBElement<ModifyPNRPerson> createModifyPNRPerson(ModifyPNRPerson value) {
        return new JAXBElement<ModifyPNRPerson>(_ModifyPNRPerson_QNAME, ModifyPNRPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPenaltyDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "AddPenaltyDetail")
    public JAXBElement<AddPenaltyDetail> createAddPenaltyDetail(AddPenaltyDetail value) {
        return new JAXBElement<AddPenaltyDetail>(_AddPenaltyDetail_QNAME, AddPenaltyDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModifyPNRUpdatePassenger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfModifyPNR.UpdatePassenger")
    public JAXBElement<ArrayOfModifyPNRUpdatePassenger> createArrayOfModifyPNRUpdatePassenger(ArrayOfModifyPNRUpdatePassenger value) {
        return new JAXBElement<ArrayOfModifyPNRUpdatePassenger>(_ArrayOfModifyPNRUpdatePassenger_QNAME, ArrayOfModifyPNRUpdatePassenger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfDocumentInfo")
    public JAXBElement<ArrayOfDocumentInfo> createArrayOfDocumentInfo(ArrayOfDocumentInfo value) {
        return new JAXBElement<ArrayOfDocumentInfo>(_ArrayOfDocumentInfo_QNAME, ArrayOfDocumentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPNRAddContactInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ModifyPNR.AddContactInfo")
    public JAXBElement<ModifyPNRAddContactInfo> createModifyPNRAddContactInfo(ModifyPNRAddContactInfo value) {
        return new JAXBElement<ModifyPNRAddContactInfo>(_ModifyPNRAddContactInfo_QNAME, ModifyPNRAddContactInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "Address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OldPaxRefrs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "oldPaxRefrs")
    public JAXBElement<OldPaxRefrs> createOldPaxRefrs(OldPaxRefrs value) {
        return new JAXBElement<OldPaxRefrs>(_OldPaxRefrs_QNAME, OldPaxRefrs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ContactInfo")
    public JAXBElement<ContactInfo> createContactInfo(ContactInfo value) {
        return new JAXBElement<ContactInfo>(_ContactInfo_QNAME, ContactInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportPNRReservationSegmentAirlinePersonCharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ImportPNR.Reservation.Segment.AirlinePerson.Charge")
    public JAXBElement<ImportPNRReservationSegmentAirlinePersonCharge> createImportPNRReservationSegmentAirlinePersonCharge(ImportPNRReservationSegmentAirlinePersonCharge value) {
        return new JAXBElement<ImportPNRReservationSegmentAirlinePersonCharge>(_ImportPNRReservationSegmentAirlinePersonCharge_QNAME, ImportPNRReservationSegmentAirlinePersonCharge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPenalty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "AddPenalty")
    public JAXBElement<AddPenalty> createAddPenalty(AddPenalty value) {
        return new JAXBElement<AddPenalty>(_AddPenalty_QNAME, AddPenalty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Comment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "Comment")
    public JAXBElement<Comment> createComment(Comment value) {
        return new JAXBElement<Comment>(_Comment_QNAME, Comment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfaddPAX }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfaddPAX")
    public JAXBElement<ArrayOfaddPAX> createArrayOfaddPAX(ArrayOfaddPAX value) {
        return new JAXBElement<ArrayOfaddPAX>(_ArrayOfaddPAX_QNAME, ArrayOfaddPAX.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportPNRReservationSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ImportPNR.Reservation.Segment")
    public JAXBElement<ImportPNRReservationSegment> createImportPNRReservationSegment(ImportPNRReservationSegment value) {
        return new JAXBElement<ImportPNRReservationSegment>(_ImportPNRReservationSegment_QNAME, ImportPNRReservationSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModifyPNRUpdateContactInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfModifyPNR.UpdateContactInfo")
    public JAXBElement<ArrayOfModifyPNRUpdateContactInfo> createArrayOfModifyPNRUpdateContactInfo(ArrayOfModifyPNRUpdateContactInfo value) {
        return new JAXBElement<ArrayOfModifyPNRUpdateContactInfo>(_ArrayOfModifyPNRUpdateContactInfo_QNAME, ArrayOfModifyPNRUpdateContactInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImportPNRReservationSegmentAirlinePersonSeat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfImportPNR.Reservation.Segment.AirlinePerson.Seat")
    public JAXBElement<ArrayOfImportPNRReservationSegmentAirlinePersonSeat> createArrayOfImportPNRReservationSegmentAirlinePersonSeat(ArrayOfImportPNRReservationSegmentAirlinePersonSeat value) {
        return new JAXBElement<ArrayOfImportPNRReservationSegmentAirlinePersonSeat>(_ArrayOfImportPNRReservationSegmentAirlinePersonSeat_QNAME, ArrayOfImportPNRReservationSegmentAirlinePersonSeat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTax }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "AddTax")
    public JAXBElement<AddTax> createAddTax(AddTax value) {
        return new JAXBElement<AddTax>(_AddTax_QNAME, AddTax.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddPenaltyDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfAddPenaltyDetail")
    public JAXBElement<ArrayOfAddPenaltyDetail> createArrayOfAddPenaltyDetail(ArrayOfAddPenaltyDetail value) {
        return new JAXBElement<ArrayOfAddPenaltyDetail>(_ArrayOfAddPenaltyDetail_QNAME, ArrayOfAddPenaltyDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportPNRReservationComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ImportPNR.Reservation.Comment")
    public JAXBElement<ImportPNRReservationComment> createImportPNRReservationComment(ImportPNRReservationComment value) {
        return new JAXBElement<ImportPNRReservationComment>(_ImportPNRReservationComment_QNAME, ImportPNRReservationComment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Segment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "Segment")
    public JAXBElement<Segment> createSegment(Segment value) {
        return new JAXBElement<Segment>(_Segment_QNAME, Segment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfoldPaxRefrs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfoldPaxRefrs")
    public JAXBElement<ArrayOfoldPaxRefrs> createArrayOfoldPaxRefrs(ArrayOfoldPaxRefrs value) {
        return new JAXBElement<ArrayOfoldPaxRefrs>(_ArrayOfoldPaxRefrs_QNAME, ArrayOfoldPaxRefrs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfSpecialService")
    public JAXBElement<ArrayOfSpecialService> createArrayOfSpecialService(ArrayOfSpecialService value) {
        return new JAXBElement<ArrayOfSpecialService>(_ArrayOfSpecialService_QNAME, ArrayOfSpecialService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OverrideChargeDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "OverrideChargeDetail")
    public JAXBElement<OverrideChargeDetail> createOverrideChargeDetail(OverrideChargeDetail value) {
        return new JAXBElement<OverrideChargeDetail>(_OverrideChargeDetail_QNAME, OverrideChargeDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationToInsertHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ReservationToInsertHistory")
    public JAXBElement<ReservationToInsertHistory> createReservationToInsertHistory(ReservationToInsertHistory value) {
        return new JAXBElement<ReservationToInsertHistory>(_ReservationToInsertHistory_QNAME, ReservationToInsertHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReservationToInsertHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfReservationToInsertHistory")
    public JAXBElement<ArrayOfReservationToInsertHistory> createArrayOfReservationToInsertHistory(ArrayOfReservationToInsertHistory value) {
        return new JAXBElement<ArrayOfReservationToInsertHistory>(_ArrayOfReservationToInsertHistory_QNAME, ArrayOfReservationToInsertHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialServiceToCancel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "SpecialServiceToCancel")
    public JAXBElement<SpecialServiceToCancel> createSpecialServiceToCancel(SpecialServiceToCancel value) {
        return new JAXBElement<SpecialServiceToCancel>(_SpecialServiceToCancel_QNAME, SpecialServiceToCancel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImportPNRReservationImportError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfImportPNR.Reservation.ImportError")
    public JAXBElement<ArrayOfImportPNRReservationImportError> createArrayOfImportPNRReservationImportError(ArrayOfImportPNRReservationImportError value) {
        return new JAXBElement<ArrayOfImportPNRReservationImportError>(_ArrayOfImportPNRReservationImportError_QNAME, ArrayOfImportPNRReservationImportError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Payment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "Payment")
    public JAXBElement<Payment> createPayment(Payment value) {
        return new JAXBElement<Payment>(_Payment_QNAME, Payment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OverrideChargeBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "OverrideChargeBase")
    public JAXBElement<OverrideChargeBase> createOverrideChargeBase(OverrideChargeBase value) {
        return new JAXBElement<OverrideChargeBase>(_OverrideChargeBase_QNAME, OverrideChargeBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ArrayOfPerson")
    public JAXBElement<ArrayOfPerson> createArrayOfPerson(ArrayOfPerson value) {
        return new JAXBElement<ArrayOfPerson>(_ArrayOfPerson_QNAME, ArrayOfPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPNRModifyCPRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ModifyPNR.modifyCPRequest")
    public JAXBElement<ModifyPNRModifyCPRequest> createModifyPNRModifyCPRequest(ModifyPNRModifyCPRequest value) {
        return new JAXBElement<ModifyPNRModifyCPRequest>(_ModifyPNRModifyCPRequest_QNAME, ModifyPNRModifyCPRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePNRActionTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "RetrievePNR.ActionTypes")
    public JAXBElement<RetrievePNRActionTypes> createRetrievePNRActionTypes(RetrievePNRActionTypes value) {
        return new JAXBElement<RetrievePNRActionTypes>(_RetrievePNRActionTypes_QNAME, RetrievePNRActionTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "SpecialService")
    public JAXBElement<SpecialService> createSpecialService(SpecialService value) {
        return new JAXBElement<SpecialService>(_SpecialService_QNAME, SpecialService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "modifyDetails", scope = ModifyPNRModifyCPRequest.class)
    public JAXBElement<ModifyDetailsRequest> createModifyPNRModifyCPRequestModifyDetails(ModifyDetailsRequest value) {
        return new JAXBElement<ModifyDetailsRequest>(_ModifyPNRModifyCPRequestModifyDetails_QNAME, ModifyDetailsRequest.class, ModifyPNRModifyCPRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "postal", scope = AddPaxAddress.class)
    public JAXBElement<String> createAddPaxAddressPostal(String value) {
        return new JAXBElement<String>(_AddPaxAddressPostal_QNAME, String.class, AddPaxAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "state", scope = AddPaxAddress.class)
    public JAXBElement<String> createAddPaxAddressState(String value) {
        return new JAXBElement<String>(_AddPaxAddressState_QNAME, String.class, AddPaxAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "country", scope = AddPaxAddress.class)
    public JAXBElement<String> createAddPaxAddressCountry(String value) {
        return new JAXBElement<String>(_AddPaxAddressCountry_QNAME, String.class, AddPaxAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "address2", scope = AddPaxAddress.class)
    public JAXBElement<String> createAddPaxAddressAddress2(String value) {
        return new JAXBElement<String>(_AddPaxAddressAddress2_QNAME, String.class, AddPaxAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "city", scope = AddPaxAddress.class)
    public JAXBElement<String> createAddPaxAddressCity(String value) {
        return new JAXBElement<String>(_AddPaxAddressCity_QNAME, String.class, AddPaxAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "address1", scope = AddPaxAddress.class)
    public JAXBElement<String> createAddPaxAddressAddress1(String value) {
        return new JAXBElement<String>(_AddPaxAddressAddress1_QNAME, String.class, AddPaxAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "RecordLocator", scope = ModifyPNRUpdateRecordLocator.class)
    public JAXBElement<String> createModifyPNRUpdateRecordLocatorRecordLocator(String value) {
        return new JAXBElement<String>(_ModifyPNRUpdateRecordLocatorRecordLocator_QNAME, String.class, ModifyPNRUpdateRecordLocator.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "HistoryEventText", scope = ReservationToInsertHistory.class)
    public JAXBElement<String> createReservationToInsertHistoryHistoryEventText(String value) {
        return new JAXBElement<String>(_ReservationToInsertHistoryHistoryEventText_QNAME, String.class, ReservationToInsertHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "Passenger", scope = ReservationToInsertHistory.class)
    public JAXBElement<String> createReservationToInsertHistoryPassenger(String value) {
        return new JAXBElement<String>(_ReservationToInsertHistoryPassenger_QNAME, String.class, ReservationToInsertHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "Segment", scope = ReservationToInsertHistory.class)
    public JAXBElement<String> createReservationToInsertHistorySegment(String value) {
        return new JAXBElement<String>(_Segment_QNAME, String.class, ReservationToInsertHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPNROriginDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ChangeFlightFromReservation", scope = ModifyPNR.class)
    public JAXBElement<ModifyPNROriginDestinations> createModifyPNRChangeFlightFromReservation(ModifyPNROriginDestinations value) {
        return new JAXBElement<ModifyPNROriginDestinations>(_ModifyPNRChangeFlightFromReservation_QNAME, ModifyPNROriginDestinations.class, ModifyPNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPNRModifyCPRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "PaxToAdd", scope = ModifyPNR.class)
    public JAXBElement<ModifyPNRModifyCPRequest> createModifyPNRPaxToAdd(ModifyPNRModifyCPRequest value) {
        return new JAXBElement<ModifyPNRModifyCPRequest>(_ModifyPNRPaxToAdd_QNAME, ModifyPNRModifyCPRequest.class, ModifyPNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "SubChannel", scope = ModifyPNR.class)
    public JAXBElement<String> createModifyPNRSubChannel(String value) {
        return new JAXBElement<String>(_ModifyPNRSubChannel_QNAME, String.class, ModifyPNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModifyPNREmergencyContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "EmergencyContactsToAddToSegments", scope = ModifyPNR.class)
    public JAXBElement<ArrayOfModifyPNREmergencyContact> createModifyPNREmergencyContactsToAddToSegments(ArrayOfModifyPNREmergencyContact value) {
        return new JAXBElement<ArrayOfModifyPNREmergencyContact>(_ModifyPNREmergencyContactsToAddToSegments_QNAME, ArrayOfModifyPNREmergencyContact.class, ModifyPNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModifyPNRUpdateRecordLocator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "PassengerSegmentsToUpdateRecordLocator", scope = ModifyPNR.class)
    public JAXBElement<ArrayOfModifyPNRUpdateRecordLocator> createModifyPNRPassengerSegmentsToUpdateRecordLocator(ArrayOfModifyPNRUpdateRecordLocator value) {
        return new JAXBElement<ArrayOfModifyPNRUpdateRecordLocator>(_ModifyPNRPassengerSegmentsToUpdateRecordLocator_QNAME, ArrayOfModifyPNRUpdateRecordLocator.class, ModifyPNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "PointOfSale", scope = ModifyPNR.class)
    public JAXBElement<String> createModifyPNRPointOfSale(String value) {
        return new JAXBElement<String>(_ModifyPNRPointOfSale_QNAME, String.class, ModifyPNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "Channel", scope = ModifyPNR.class)
    public JAXBElement<String> createModifyPNRChannel(String value) {
        return new JAXBElement<String>(_ModifyPNRChannel_QNAME, String.class, ModifyPNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "Currency", scope = ModifyPNR.class)
    public JAXBElement<String> createModifyPNRCurrency(String value) {
        return new JAXBElement<String>(_ModifyPNRCurrency_QNAME, String.class, ModifyPNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddPenaltyDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "PenaltyDetails", scope = AddPenalty.class)
    public JAXBElement<ArrayOfAddPenaltyDetail> createAddPenaltyPenaltyDetails(ArrayOfAddPenaltyDetail value) {
        return new JAXBElement<ArrayOfAddPenaltyDetail>(_AddPenaltyPenaltyDetails_QNAME, ArrayOfAddPenaltyDetail.class, AddPenalty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "RecordLocator", scope = Segment.class)
    public JAXBElement<String> createSegmentRecordLocator(String value) {
        return new JAXBElement<String>(_ModifyPNRUpdateRecordLocatorRecordLocator_QNAME, String.class, Segment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "IssuingCountry", scope = DocumentInfo.class)
    public JAXBElement<String> createDocumentInfoIssuingCountry(String value) {
        return new JAXBElement<String>(_DocumentInfoIssuingCountry_QNAME, String.class, DocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "DocType", scope = DocumentInfo.class)
    public JAXBElement<String> createDocumentInfoDocType(String value) {
        return new JAXBElement<String>(_DocumentInfoDocType_QNAME, String.class, DocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ExpiryDate", scope = DocumentInfo.class)
    public JAXBElement<String> createDocumentInfoExpiryDate(String value) {
        return new JAXBElement<String>(_DocumentInfoExpiryDate_QNAME, String.class, DocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "DocNumber", scope = DocumentInfo.class)
    public JAXBElement<String> createDocumentInfoDocNumber(String value) {
        return new JAXBElement<String>(_DocumentInfoDocNumber_QNAME, String.class, DocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "TierName", scope = Person.class)
    public JAXBElement<String> createPersonTierName(String value) {
        return new JAXBElement<String>(_PersonTierName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "FrequentFlyerNumber", scope = Person.class)
    public JAXBElement<String> createPersonFrequentFlyerNumber(String value) {
        return new JAXBElement<String>(_PersonFrequentFlyerNumber_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "PassportIssueCountry", scope = Person.class)
    public JAXBElement<String> createPersonPassportIssueCountry(String value) {
        return new JAXBElement<String>(_PersonPassportIssueCountry_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "DocumentInfos", scope = Person.class)
    public JAXBElement<ArrayOfDocumentInfo> createPersonDocumentInfos(ArrayOfDocumentInfo value) {
        return new JAXBElement<ArrayOfDocumentInfo>(_PersonDocumentInfos_QNAME, ArrayOfDocumentInfo.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "Suffix", scope = Person.class)
    public JAXBElement<String> createPersonSuffix(String value) {
        return new JAXBElement<String>(_PersonSuffix_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ExtPenaltyRule", scope = SpecialService.class)
    public JAXBElement<String> createSpecialServiceExtPenaltyRule(String value) {
        return new JAXBElement<String>(_SpecialServiceExtPenaltyRule_QNAME, String.class, SpecialService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ExtIsRePriceFixed", scope = SpecialService.class)
    public JAXBElement<String> createSpecialServiceExtIsRePriceFixed(String value) {
        return new JAXBElement<String>(_SpecialServiceExtIsRePriceFixed_QNAME, String.class, SpecialService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ExtRePriceValueReason", scope = SpecialService.class)
    public JAXBElement<String> createSpecialServiceExtRePriceValueReason(String value) {
        return new JAXBElement<String>(_SpecialServiceExtRePriceValueReason_QNAME, String.class, SpecialService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "OverrideAmtReason", scope = SpecialService.class)
    public JAXBElement<String> createSpecialServiceOverrideAmtReason(String value) {
        return new JAXBElement<String>(_SpecialServiceOverrideAmtReason_QNAME, String.class, SpecialService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ExtRePriceValue", scope = SpecialService.class)
    public JAXBElement<String> createSpecialServiceExtRePriceValue(String value) {
        return new JAXBElement<String>(_SpecialServiceExtRePriceValue_QNAME, String.class, SpecialService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "PhysicalFlightID", scope = SpecialService.class)
    public JAXBElement<Integer> createSpecialServicePhysicalFlightID(Integer value) {
        return new JAXBElement<Integer>(_SpecialServicePhysicalFlightID_QNAME, Integer.class, SpecialService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ExtRePriceSourceName", scope = SpecialService.class)
    public JAXBElement<String> createSpecialServiceExtRePriceSourceName(String value) {
        return new JAXBElement<String>(_SpecialServiceExtRePriceSourceName_QNAME, String.class, SpecialService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerationsSSRStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "SSRStatus", scope = SpecialService.class)
    public JAXBElement<EnumerationsSSRStatus> createSpecialServiceSSRStatus(EnumerationsSSRStatus value) {
        return new JAXBElement<EnumerationsSSRStatus>(_SpecialServiceSSRStatus_QNAME, EnumerationsSSRStatus.class, SpecialService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "Comment", scope = SummaryPNR.class)
    public JAXBElement<String> createSummaryPNRComment(String value) {
        return new JAXBElement<String>(_Comment_QNAME, String.class, SummaryPNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddTaxDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "TaxDetails", scope = AddTax.class)
    public JAXBElement<ArrayOfAddTaxDetail> createAddTaxTaxDetails(ArrayOfAddTaxDetail value) {
        return new JAXBElement<ArrayOfAddTaxDetail>(_AddTaxTaxDetails_QNAME, ArrayOfAddTaxDetail.class, AddTax.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "TierName", scope = AddPAX.class)
    public JAXBElement<String> createAddPAXTierName(String value) {
        return new JAXBElement<String>(_PersonTierName_QNAME, String.class, AddPAX.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPaxAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "RepricerAddress", scope = AddPAX.class)
    public JAXBElement<AddPaxAddress> createAddPAXRepricerAddress(AddPaxAddress value) {
        return new JAXBElement<AddPaxAddress>(_AddPAXRepricerAddress_QNAME, AddPaxAddress.class, AddPAX.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "FrequentFlyerNumber", scope = AddPAX.class)
    public JAXBElement<String> createAddPAXFrequentFlyerNumber(String value) {
        return new JAXBElement<String>(_PersonFrequentFlyerNumber_QNAME, String.class, AddPAX.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfaddPaxContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "contactDetails", scope = AddPAX.class)
    public JAXBElement<ArrayOfaddPaxContact> createAddPAXContactDetails(ArrayOfaddPaxContact value) {
        return new JAXBElement<ArrayOfaddPaxContact>(_AddPAXContactDetails_QNAME, ArrayOfaddPaxContact.class, AddPAX.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "RecordLocator", scope = AddPAX.class)
    public JAXBElement<String> createAddPAXRecordLocator(String value) {
        return new JAXBElement<String>(_ModifyPNRUpdateRecordLocatorRecordLocator_QNAME, String.class, AddPAX.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModifyPNROldPaxRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "OldPaxRefs", scope = ModifyPNROriginDestination.class)
    public JAXBElement<ArrayOfModifyPNROldPaxRef> createModifyPNROriginDestinationOldPaxRefs(ArrayOfModifyPNROldPaxRef value) {
        return new JAXBElement<ArrayOfModifyPNROldPaxRef>(_ModifyPNROriginDestinationOldPaxRefs_QNAME, ArrayOfModifyPNROldPaxRef.class, ModifyPNROriginDestination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "OldODRef", scope = ModifyPNROriginDestination.class)
    public JAXBElement<String> createModifyPNROriginDestinationOldODRef(String value) {
        return new JAXBElement<String>(_ModifyPNROriginDestinationOldODRef_QNAME, String.class, ModifyPNROriginDestination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "TierName", scope = ModifyPNRPassenger.class)
    public JAXBElement<String> createModifyPNRPassengerTierName(String value) {
        return new JAXBElement<String>(_PersonTierName_QNAME, String.class, ModifyPNRPassenger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "FrequentFlyerNumber", scope = ModifyPNRPassenger.class)
    public JAXBElement<String> createModifyPNRPassengerFrequentFlyerNumber(String value) {
        return new JAXBElement<String>(_PersonFrequentFlyerNumber_QNAME, String.class, ModifyPNRPassenger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "StoreFrontID", scope = ModifyPNRPassenger.class)
    public JAXBElement<String> createModifyPNRPassengerStoreFrontID(String value) {
        return new JAXBElement<String>(_ModifyPNRPassengerStoreFrontID_QNAME, String.class, ModifyPNRPassenger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "RecordLocator", scope = ModifyPNRPassenger.class)
    public JAXBElement<String> createModifyPNRPassengerRecordLocator(String value) {
        return new JAXBElement<String>(_ModifyPNRUpdateRecordLocatorRecordLocator_QNAME, String.class, ModifyPNRPassenger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModifyPNRFlightInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "FlightInformations", scope = ModifyPNRPassenger.class)
    public JAXBElement<ArrayOfModifyPNRFlightInformation> createModifyPNRPassengerFlightInformations(ArrayOfModifyPNRFlightInformation value) {
        return new JAXBElement<ArrayOfModifyPNRFlightInformation>(_ModifyPNRPassengerFlightInformations_QNAME, ArrayOfModifyPNRFlightInformation.class, ModifyPNRPassenger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModifyPNROriginDestination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "OriginDestination", scope = ModifyPNROriginDestinations.class)
    public JAXBElement<ArrayOfModifyPNROriginDestination> createModifyPNROriginDestinationsOriginDestination(ArrayOfModifyPNROriginDestination value) {
        return new JAXBElement<ArrayOfModifyPNROriginDestination>(_ModifyPNROriginDestinationsOriginDestination_QNAME, ArrayOfModifyPNROriginDestination.class, ModifyPNROriginDestinations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "oldODRef", scope = AddPaxOriginDestination.class)
    public JAXBElement<Integer> createAddPaxOriginDestinationOldODRef(Integer value) {
        return new JAXBElement<Integer>(_AddPaxOriginDestinationOldODRef_QNAME, Integer.class, AddPaxOriginDestination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfoldPaxRefrs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "oldPaxRefs", scope = AddPaxOriginDestination.class)
    public JAXBElement<ArrayOfoldPaxRefrs> createAddPaxOriginDestinationOldPaxRefs(ArrayOfoldPaxRefrs value) {
        return new JAXBElement<ArrayOfoldPaxRefrs>(_AddPaxOriginDestinationOldPaxRefs_QNAME, ArrayOfoldPaxRefrs.class, AddPaxOriginDestination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "TierName", scope = ModifyPNRUpdatePassenger.class)
    public JAXBElement<String> createModifyPNRUpdatePassengerTierName(String value) {
        return new JAXBElement<String>(_PersonTierName_QNAME, String.class, ModifyPNRUpdatePassenger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "FFNum", scope = ModifyPNRUpdatePassenger.class)
    public JAXBElement<String> createModifyPNRUpdatePassengerFFNum(String value) {
        return new JAXBElement<String>(_ModifyPNRUpdatePassengerFFNum_QNAME, String.class, ModifyPNRUpdatePassenger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfaddPaxOriginDestination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "originDestination", scope = AddPAXOriginDestinations.class)
    public JAXBElement<ArrayOfaddPaxOriginDestination> createAddPAXOriginDestinationsOriginDestination(ArrayOfaddPaxOriginDestination value) {
        return new JAXBElement<ArrayOfaddPaxOriginDestination>(_AddPAXOriginDestinationsOriginDestination_QNAME, ArrayOfaddPaxOriginDestination.class, AddPAXOriginDestinations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "oldPaxRef", scope = OldPaxRefrs.class)
    public JAXBElement<ArrayOfint> createOldPaxRefrsOldPaxRef(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_OldPaxRefrsOldPaxRef_QNAME, ArrayOfint.class, OldPaxRefrs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "RecordLocator", scope = ImportPNRReservationSegmentAirlinePerson.class)
    public JAXBElement<String> createImportPNRReservationSegmentAirlinePersonRecordLocator(String value) {
        return new JAXBElement<String>(_ModifyPNRUpdateRecordLocatorRecordLocator_QNAME, String.class, ImportPNRReservationSegmentAirlinePerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPAXOriginDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "originDestinations", scope = ModifyDetailsRequest.class)
    public JAXBElement<AddPAXOriginDestinations> createModifyDetailsRequestOriginDestinations(AddPAXOriginDestinations value) {
        return new JAXBElement<AddPAXOriginDestinations>(_ModifyDetailsRequestOriginDestinations_QNAME, AddPAXOriginDestinations.class, ModifyDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfaddPAX }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "paxDetails", scope = ModifyDetailsRequest.class)
    public JAXBElement<ArrayOfaddPAX> createModifyDetailsRequestPaxDetails(ArrayOfaddPAX value) {
        return new JAXBElement<ArrayOfaddPAX>(_ModifyDetailsRequestPaxDetails_QNAME, ArrayOfaddPAX.class, ModifyDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReservationToInsertHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ReservationsToInsertHistory", scope = HistoryPNR.class)
    public JAXBElement<ArrayOfReservationToInsertHistory> createHistoryPNRReservationsToInsertHistory(ArrayOfReservationToInsertHistory value) {
        return new JAXBElement<ArrayOfReservationToInsertHistory>(_HistoryPNRReservationsToInsertHistory_QNAME, ArrayOfReservationToInsertHistory.class, HistoryPNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "OldPaxRef", scope = ModifyPNROldPaxRef.class)
    public JAXBElement<ArrayOfint> createModifyPNROldPaxRefOldPaxRef(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ModifyPNROldPaxRefOldPaxRef_QNAME, ArrayOfint.class, ModifyPNROldPaxRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ExtRepriceValueReason", scope = OverrideChargeBase.class)
    public JAXBElement<String> createOverrideChargeBaseExtRepriceValueReason(String value) {
        return new JAXBElement<String>(_OverrideChargeBaseExtRepriceValueReason_QNAME, String.class, OverrideChargeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ExtPenaltyRule", scope = OverrideChargeBase.class)
    public JAXBElement<String> createOverrideChargeBaseExtPenaltyRule(String value) {
        return new JAXBElement<String>(_SpecialServiceExtPenaltyRule_QNAME, String.class, OverrideChargeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ExtIsRepriceFixed", scope = OverrideChargeBase.class)
    public JAXBElement<String> createOverrideChargeBaseExtIsRepriceFixed(String value) {
        return new JAXBElement<String>(_OverrideChargeBaseExtIsRepriceFixed_QNAME, String.class, OverrideChargeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ExtRepriceValue", scope = OverrideChargeBase.class)
    public JAXBElement<String> createOverrideChargeBaseExtRepriceValue(String value) {
        return new JAXBElement<String>(_OverrideChargeBaseExtRepriceValue_QNAME, String.class, OverrideChargeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "ExtRepriceSourceName", scope = OverrideChargeBase.class)
    public JAXBElement<String> createOverrideChargeBaseExtRepriceSourceName(String value) {
        return new JAXBElement<String>(_OverrideChargeBaseExtRepriceSourceName_QNAME, String.class, OverrideChargeBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "type", scope = AddPaxContact.class)
    public JAXBElement<String> createAddPaxContactType(String value) {
        return new JAXBElement<String>(_AddPaxContactType_QNAME, String.class, AddPaxContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Radixx.ConnectPoint.Reservation.Request", name = "contact", scope = AddPaxContact.class)
    public JAXBElement<String> createAddPaxContactContact(String value) {
        return new JAXBElement<String>(_AddPaxContactContact_QNAME, String.class, AddPaxContact.class, value);
    }

}

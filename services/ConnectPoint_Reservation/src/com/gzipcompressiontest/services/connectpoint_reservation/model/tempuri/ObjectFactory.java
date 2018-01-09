/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.AddPenalty;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.AddTax;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.RetrieveBalance;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract3.RetrieveBalanceResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract3.ViewHistoryPNRCollection;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract3.ViewImportPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract3.ViewPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract3.ViewPNRModificationImpactCollection;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract4.SeatInventoryRequest;
import com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract6.SeatInventoryResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri package. 
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

    private final static QName _SummaryPNRResponseSummaryPNRResult_QNAME = new QName("http://tempuri.org/", "SummaryPNRResult");
    private final static QName _HoldInventoryResponseHoldInventoryResult_QNAME = new QName("http://tempuri.org/", "HoldInventoryResult");
    private final static QName _OverBookResponseOverBookResult_QNAME = new QName("http://tempuri.org/", "OverBookResult");
    private final static QName _SummaryPNRExtSummaryPnrRequest_QNAME = new QName("http://tempuri.org/", "SummaryPnrRequest");
    private final static QName _CreatePNRFFPResponseCreatePNRFFPResult_QNAME = new QName("http://tempuri.org/", "CreatePNRFFPResult");
    private final static QName _EvaluateModificationOfPNRResponseEvaluateModificationOfPNRResult_QNAME = new QName("http://tempuri.org/", "EvaluateModificationOfPNRResult");
    private final static QName _ModifyPNRModifyPnrRequest_QNAME = new QName("http://tempuri.org/", "ModifyPnrRequest");
    private final static QName _SetApisInfoSeriesNum_QNAME = new QName("http://tempuri.org/", "SeriesNum");
    private final static QName _SetApisInfoConfirmationNum_QNAME = new QName("http://tempuri.org/", "ConfirmationNum");
    private final static QName _SetApisInfoSessionKey_QNAME = new QName("http://tempuri.org/", "SessionKey");
    private final static QName _SetApisInfoCheckinAgent_QNAME = new QName("http://tempuri.org/", "CheckinAgent");
    private final static QName _SetApisInfoApisInfoXML_QNAME = new QName("http://tempuri.org/", "ApisInfoXML");
    private final static QName _GetReservationBalanceRetrieveBalanceRequest_QNAME = new QName("http://tempuri.org/", "RetrieveBalanceRequest");
    private final static QName _OverrideReservationChargesOverrideReservationChargesRequest_QNAME = new QName("http://tempuri.org/", "OverrideReservationChargesRequest");
    private final static QName _ModifyPNRResponseModifyPNRResult_QNAME = new QName("http://tempuri.org/", "ModifyPNRResult");
    private final static QName _RetrievePNRRetrievePnrRequest_QNAME = new QName("http://tempuri.org/", "RetrievePnrRequest");
    private final static QName _ImportPNRImportPNRRequest_QNAME = new QName("http://tempuri.org/", "ImportPNRRequest");
    private final static QName _AddTaxesAddTaxRequest_QNAME = new QName("http://tempuri.org/", "AddTaxRequest");
    private final static QName _GetReservationBalanceResponseGetReservationBalanceResult_QNAME = new QName("http://tempuri.org/", "GetReservationBalanceResult");
    private final static QName _CreatePNRFFPCreatePnrRequest_QNAME = new QName("http://tempuri.org/", "CreatePnrRequest");
    private final static QName _GetApisInfoResponseGetApisInfoResult_QNAME = new QName("http://tempuri.org/", "GetApisInfoResult");
    private final static QName _SummaryPNRExtResponseSummaryPNRExtResult_QNAME = new QName("http://tempuri.org/", "SummaryPNRExtResult");
    private final static QName _OverrideReservationChargesResponseOverrideReservationChargesResult_QNAME = new QName("http://tempuri.org/", "OverrideReservationChargesResult");
    private final static QName _GetReservationResponseGetReservationResult_QNAME = new QName("http://tempuri.org/", "GetReservationResult");
    private final static QName _ReleaseInventorySeatInventoryRequest_QNAME = new QName("http://tempuri.org/", "seatInventoryRequest");
    private final static QName _CancelPNRCancelPnrRequest_QNAME = new QName("http://tempuri.org/", "CancelPnrRequest");
    private final static QName _CancelPNRResponseCancelPNRResult_QNAME = new QName("http://tempuri.org/", "CancelPNRResult");
    private final static QName _HistoryPNRHistoryPNRRequest_QNAME = new QName("http://tempuri.org/", "HistoryPNRRequest");
    private final static QName _ImportPNRResponseImportPNRResult_QNAME = new QName("http://tempuri.org/", "ImportPNRResult");
    private final static QName _CancelPNRFFPAutoCancelResponseCancelPNRFFPAutoCancelResult_QNAME = new QName("http://tempuri.org/", "CancelPNRFFPAutoCancelResult");
    private final static QName _AddPenaltiesAddPenaltyRequest_QNAME = new QName("http://tempuri.org/", "AddPenaltyRequest");
    private final static QName _CancelPNRFFPAllTaxesResponseCancelPNRFFPAllTaxesResult_QNAME = new QName("http://tempuri.org/", "CancelPNRFFPAllTaxesResult");
    private final static QName _SetApisInfoResponseSetApisInfoResult_QNAME = new QName("http://tempuri.org/", "SetApisInfoResult");
    private final static QName _AddPenaltiesResponseAddPenaltiesResult_QNAME = new QName("http://tempuri.org/", "AddPenaltiesResult");
    private final static QName _ModifyPNRFFPResponseModifyPNRFFPResult_QNAME = new QName("http://tempuri.org/", "ModifyPNRFFPResult");
    private final static QName _ReleaseInventoryResponseReleaseInventoryResult_QNAME = new QName("http://tempuri.org/", "ReleaseInventoryResult");
    private final static QName _AddTaxesResponseAddTaxesResult_QNAME = new QName("http://tempuri.org/", "AddTaxesResult");
    private final static QName _EvaluateModificationOfPNREvaluateModificationOfPNRRequest_QNAME = new QName("http://tempuri.org/", "EvaluateModificationOfPNRRequest");
    private final static QName _CancelPNRFFPResponseCancelPNRFFPResult_QNAME = new QName("http://tempuri.org/", "CancelPNRFFPResult");
    private final static QName _CreatePNRExtResponseCreatePNRExtResult_QNAME = new QName("http://tempuri.org/", "CreatePNRExtResult");
    private final static QName _RetrievePNRResponseRetrievePNRResult_QNAME = new QName("http://tempuri.org/", "RetrievePNRResult");
    private final static QName _CreatePNRResponseCreatePNRResult_QNAME = new QName("http://tempuri.org/", "CreatePNRResult");
    private final static QName _HistoryPNRResponseHistoryPNRResult_QNAME = new QName("http://tempuri.org/", "HistoryPNRResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReleaseInventoryResponse }
     * 
     */
    public ReleaseInventoryResponse createReleaseInventoryResponse() {
        return new ReleaseInventoryResponse();
    }

    /**
     * Create an instance of {@link CreatePNRFFP }
     * 
     */
    public CreatePNRFFP createCreatePNRFFP() {
        return new CreatePNRFFP();
    }

    /**
     * Create an instance of {@link SummaryPNRResponse }
     * 
     */
    public SummaryPNRResponse createSummaryPNRResponse() {
        return new SummaryPNRResponse();
    }

    /**
     * Create an instance of {@link ModifyPNRFFPResponse }
     * 
     */
    public ModifyPNRFFPResponse createModifyPNRFFPResponse() {
        return new ModifyPNRFFPResponse();
    }

    /**
     * Create an instance of {@link GetApisInfoResponse }
     * 
     */
    public GetApisInfoResponse createGetApisInfoResponse() {
        return new GetApisInfoResponse();
    }

    /**
     * Create an instance of {@link CancelPNRFFP }
     * 
     */
    public CancelPNRFFP createCancelPNRFFP() {
        return new CancelPNRFFP();
    }

    /**
     * Create an instance of {@link ModifyPNRFFP }
     * 
     */
    public ModifyPNRFFP createModifyPNRFFP() {
        return new ModifyPNRFFP();
    }

    /**
     * Create an instance of {@link AddPenalties }
     * 
     */
    public AddPenalties createAddPenalties() {
        return new AddPenalties();
    }

    /**
     * Create an instance of {@link AddTaxes }
     * 
     */
    public AddTaxes createAddTaxes() {
        return new AddTaxes();
    }

    /**
     * Create an instance of {@link CreatePNRResponse }
     * 
     */
    public CreatePNRResponse createCreatePNRResponse() {
        return new CreatePNRResponse();
    }

    /**
     * Create an instance of {@link CreatePNRExt }
     * 
     */
    public CreatePNRExt createCreatePNRExt() {
        return new CreatePNRExt();
    }

    /**
     * Create an instance of {@link EvaluateModificationOfPNRResponse }
     * 
     */
    public EvaluateModificationOfPNRResponse createEvaluateModificationOfPNRResponse() {
        return new EvaluateModificationOfPNRResponse();
    }

    /**
     * Create an instance of {@link ReleaseInventory }
     * 
     */
    public ReleaseInventory createReleaseInventory() {
        return new ReleaseInventory();
    }

    /**
     * Create an instance of {@link CancelPNRResponse }
     * 
     */
    public CancelPNRResponse createCancelPNRResponse() {
        return new CancelPNRResponse();
    }

    /**
     * Create an instance of {@link CancelPNRFFPAutoCancel }
     * 
     */
    public CancelPNRFFPAutoCancel createCancelPNRFFPAutoCancel() {
        return new CancelPNRFFPAutoCancel();
    }

    /**
     * Create an instance of {@link OverBook }
     * 
     */
    public OverBook createOverBook() {
        return new OverBook();
    }

    /**
     * Create an instance of {@link OverBookResponse }
     * 
     */
    public OverBookResponse createOverBookResponse() {
        return new OverBookResponse();
    }

    /**
     * Create an instance of {@link SetApisInfoResponse }
     * 
     */
    public SetApisInfoResponse createSetApisInfoResponse() {
        return new SetApisInfoResponse();
    }

    /**
     * Create an instance of {@link com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ImportPNR }
     * 
     */
    public com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ImportPNR createImportPNR() {
        return new com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ImportPNR();
    }

    /**
     * Create an instance of {@link GetReservationBalance }
     * 
     */
    public GetReservationBalance createGetReservationBalance() {
        return new GetReservationBalance();
    }

    /**
     * Create an instance of {@link HoldInventory }
     * 
     */
    public HoldInventory createHoldInventory() {
        return new HoldInventory();
    }

    /**
     * Create an instance of {@link AddPenaltiesResponse }
     * 
     */
    public AddPenaltiesResponse createAddPenaltiesResponse() {
        return new AddPenaltiesResponse();
    }

    /**
     * Create an instance of {@link com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.HistoryPNR }
     * 
     */
    public com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.HistoryPNR createHistoryPNR() {
        return new com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.HistoryPNR();
    }

    /**
     * Create an instance of {@link SummaryPNRExt }
     * 
     */
    public SummaryPNRExt createSummaryPNRExt() {
        return new SummaryPNRExt();
    }

    /**
     * Create an instance of {@link OverrideReservationChargesResponse }
     * 
     */
    public OverrideReservationChargesResponse createOverrideReservationChargesResponse() {
        return new OverrideReservationChargesResponse();
    }

    /**
     * Create an instance of {@link com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.RetrievePNR }
     * 
     */
    public com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.RetrievePNR createRetrievePNR() {
        return new com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.RetrievePNR();
    }

    /**
     * Create an instance of {@link GetReservation }
     * 
     */
    public GetReservation createGetReservation() {
        return new GetReservation();
    }

    /**
     * Create an instance of {@link RetrievePNRResponse }
     * 
     */
    public RetrievePNRResponse createRetrievePNRResponse() {
        return new RetrievePNRResponse();
    }

    /**
     * Create an instance of {@link CancelPNRFFPAllTaxesResponse }
     * 
     */
    public CancelPNRFFPAllTaxesResponse createCancelPNRFFPAllTaxesResponse() {
        return new CancelPNRFFPAllTaxesResponse();
    }

    /**
     * Create an instance of {@link GetApisInfo }
     * 
     */
    public GetApisInfo createGetApisInfo() {
        return new GetApisInfo();
    }

    /**
     * Create an instance of {@link com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SummaryPNR }
     * 
     */
    public com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SummaryPNR createSummaryPNR() {
        return new com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SummaryPNR();
    }

    /**
     * Create an instance of {@link com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.EvaluateModificationOfPNR }
     * 
     */
    public com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.EvaluateModificationOfPNR createEvaluateModificationOfPNR() {
        return new com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.EvaluateModificationOfPNR();
    }

    /**
     * Create an instance of {@link SummaryPNRExtResponse }
     * 
     */
    public SummaryPNRExtResponse createSummaryPNRExtResponse() {
        return new SummaryPNRExtResponse();
    }

    /**
     * Create an instance of {@link com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ModifyPNR }
     * 
     */
    public com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ModifyPNR createModifyPNR() {
        return new com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ModifyPNR();
    }

    /**
     * Create an instance of {@link AddTaxesResponse }
     * 
     */
    public AddTaxesResponse createAddTaxesResponse() {
        return new AddTaxesResponse();
    }

    /**
     * Create an instance of {@link com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.OverrideReservationCharges }
     * 
     */
    public com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.OverrideReservationCharges createOverrideReservationCharges() {
        return new com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.OverrideReservationCharges();
    }

    /**
     * Create an instance of {@link ModifyPNRResponse }
     * 
     */
    public ModifyPNRResponse createModifyPNRResponse() {
        return new ModifyPNRResponse();
    }

    /**
     * Create an instance of {@link CancelPNRFFPAllTaxes }
     * 
     */
    public CancelPNRFFPAllTaxes createCancelPNRFFPAllTaxes() {
        return new CancelPNRFFPAllTaxes();
    }

    /**
     * Create an instance of {@link GetReservationBalanceResponse }
     * 
     */
    public GetReservationBalanceResponse createGetReservationBalanceResponse() {
        return new GetReservationBalanceResponse();
    }

    /**
     * Create an instance of {@link com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNR }
     * 
     */
    public com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNR createCancelPNR() {
        return new com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNR();
    }

    /**
     * Create an instance of {@link GetReservationResponse }
     * 
     */
    public GetReservationResponse createGetReservationResponse() {
        return new GetReservationResponse();
    }

    /**
     * Create an instance of {@link com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNR }
     * 
     */
    public com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNR createCreatePNR() {
        return new com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNR();
    }

    /**
     * Create an instance of {@link SetApisInfo }
     * 
     */
    public SetApisInfo createSetApisInfo() {
        return new SetApisInfo();
    }

    /**
     * Create an instance of {@link CancelPNRFFPAutoCancelResponse }
     * 
     */
    public CancelPNRFFPAutoCancelResponse createCancelPNRFFPAutoCancelResponse() {
        return new CancelPNRFFPAutoCancelResponse();
    }

    /**
     * Create an instance of {@link CancelPNRFFPResponse }
     * 
     */
    public CancelPNRFFPResponse createCancelPNRFFPResponse() {
        return new CancelPNRFFPResponse();
    }

    /**
     * Create an instance of {@link ImportPNRResponse }
     * 
     */
    public ImportPNRResponse createImportPNRResponse() {
        return new ImportPNRResponse();
    }

    /**
     * Create an instance of {@link HistoryPNRResponse }
     * 
     */
    public HistoryPNRResponse createHistoryPNRResponse() {
        return new HistoryPNRResponse();
    }

    /**
     * Create an instance of {@link CreatePNRFFPResponse }
     * 
     */
    public CreatePNRFFPResponse createCreatePNRFFPResponse() {
        return new CreatePNRFFPResponse();
    }

    /**
     * Create an instance of {@link CreatePNRExtResponse }
     * 
     */
    public CreatePNRExtResponse createCreatePNRExtResponse() {
        return new CreatePNRExtResponse();
    }

    /**
     * Create an instance of {@link HoldInventoryResponse }
     * 
     */
    public HoldInventoryResponse createHoldInventoryResponse() {
        return new HoldInventoryResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SummaryPNRResult", scope = SummaryPNRResponse.class)
    public JAXBElement<ViewPNR> createSummaryPNRResponseSummaryPNRResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_SummaryPNRResponseSummaryPNRResult_QNAME, ViewPNR.class, SummaryPNRResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatInventoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "HoldInventoryResult", scope = HoldInventoryResponse.class)
    public JAXBElement<SeatInventoryResponse> createHoldInventoryResponseHoldInventoryResult(SeatInventoryResponse value) {
        return new JAXBElement<SeatInventoryResponse>(_HoldInventoryResponseHoldInventoryResult_QNAME, SeatInventoryResponse.class, HoldInventoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OverBookResult", scope = OverBookResponse.class)
    public JAXBElement<ViewPNR> createOverBookResponseOverBookResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_OverBookResponseOverBookResult_QNAME, ViewPNR.class, OverBookResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.SummaryPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SummaryPnrRequest", scope = SummaryPNRExt.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.SummaryPNR> createSummaryPNRExtSummaryPnrRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.SummaryPNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.SummaryPNR>(_SummaryPNRExtSummaryPnrRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.SummaryPNR.class, SummaryPNRExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreatePNRFFPResult", scope = CreatePNRFFPResponse.class)
    public JAXBElement<ViewPNR> createCreatePNRFFPResponseCreatePNRFFPResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_CreatePNRFFPResponseCreatePNRFFPResult_QNAME, ViewPNR.class, CreatePNRFFPResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNRModificationImpactCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EvaluateModificationOfPNRResult", scope = EvaluateModificationOfPNRResponse.class)
    public JAXBElement<ViewPNRModificationImpactCollection> createEvaluateModificationOfPNRResponseEvaluateModificationOfPNRResult(ViewPNRModificationImpactCollection value) {
        return new JAXBElement<ViewPNRModificationImpactCollection>(_EvaluateModificationOfPNRResponseEvaluateModificationOfPNRResult_QNAME, ViewPNRModificationImpactCollection.class, EvaluateModificationOfPNRResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ModifyPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ModifyPnrRequest", scope = com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ModifyPNR.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ModifyPNR> createModifyPNRModifyPnrRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ModifyPNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ModifyPNR>(_ModifyPNRModifyPnrRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ModifyPNR.class, com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ModifyPNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SeriesNum", scope = SetApisInfo.class)
    public JAXBElement<String> createSetApisInfoSeriesNum(String value) {
        return new JAXBElement<String>(_SetApisInfoSeriesNum_QNAME, String.class, SetApisInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConfirmationNum", scope = SetApisInfo.class)
    public JAXBElement<String> createSetApisInfoConfirmationNum(String value) {
        return new JAXBElement<String>(_SetApisInfoConfirmationNum_QNAME, String.class, SetApisInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionKey", scope = SetApisInfo.class)
    public JAXBElement<String> createSetApisInfoSessionKey(String value) {
        return new JAXBElement<String>(_SetApisInfoSessionKey_QNAME, String.class, SetApisInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CheckinAgent", scope = SetApisInfo.class)
    public JAXBElement<String> createSetApisInfoCheckinAgent(String value) {
        return new JAXBElement<String>(_SetApisInfoCheckinAgent_QNAME, String.class, SetApisInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ApisInfoXML", scope = SetApisInfo.class)
    public JAXBElement<String> createSetApisInfoApisInfoXML(String value) {
        return new JAXBElement<String>(_SetApisInfoApisInfoXML_QNAME, String.class, SetApisInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetrieveBalanceRequest", scope = GetReservationBalance.class)
    public JAXBElement<RetrieveBalance> createGetReservationBalanceRetrieveBalanceRequest(RetrieveBalance value) {
        return new JAXBElement<RetrieveBalance>(_GetReservationBalanceRetrieveBalanceRequest_QNAME, RetrieveBalance.class, GetReservationBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ModifyPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ModifyPnrRequest", scope = ModifyPNRFFP.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ModifyPNR> createModifyPNRFFPModifyPnrRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ModifyPNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ModifyPNR>(_ModifyPNRModifyPnrRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ModifyPNR.class, ModifyPNRFFP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.OverrideReservationCharges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OverrideReservationChargesRequest", scope = com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.OverrideReservationCharges.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.OverrideReservationCharges> createOverrideReservationChargesOverrideReservationChargesRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.OverrideReservationCharges value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.OverrideReservationCharges>(_OverrideReservationChargesOverrideReservationChargesRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.OverrideReservationCharges.class, com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.OverrideReservationCharges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ModifyPNRResult", scope = ModifyPNRResponse.class)
    public JAXBElement<ViewPNR> createModifyPNRResponseModifyPNRResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_ModifyPNRResponseModifyPNRResult_QNAME, ViewPNR.class, ModifyPNRResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.RetrievePNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetrievePnrRequest", scope = com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.RetrievePNR.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.RetrievePNR> createRetrievePNRRetrievePnrRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.RetrievePNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.RetrievePNR>(_RetrievePNRRetrievePnrRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.RetrievePNR.class, com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.RetrievePNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ImportPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ImportPNRRequest", scope = com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ImportPNR.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ImportPNR> createImportPNRImportPNRRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ImportPNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ImportPNR>(_ImportPNRImportPNRRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.ImportPNR.class, com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ImportPNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTax }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddTaxRequest", scope = AddTaxes.class)
    public JAXBElement<AddTax> createAddTaxesAddTaxRequest(AddTax value) {
        return new JAXBElement<AddTax>(_AddTaxesAddTaxRequest_QNAME, AddTax.class, AddTaxes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetReservationBalanceResult", scope = GetReservationBalanceResponse.class)
    public JAXBElement<RetrieveBalanceResponse> createGetReservationBalanceResponseGetReservationBalanceResult(RetrieveBalanceResponse value) {
        return new JAXBElement<RetrieveBalanceResponse>(_GetReservationBalanceResponseGetReservationBalanceResult_QNAME, RetrieveBalanceResponse.class, GetReservationBalanceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreatePnrRequest", scope = CreatePNRFFP.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR> createCreatePNRFFPCreatePnrRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR>(_CreatePNRFFPCreatePnrRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR.class, CreatePNRFFP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetApisInfoResult", scope = GetApisInfoResponse.class)
    public JAXBElement<String> createGetApisInfoResponseGetApisInfoResult(String value) {
        return new JAXBElement<String>(_GetApisInfoResponseGetApisInfoResult_QNAME, String.class, GetApisInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.SummaryPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SummaryPnrRequest", scope = com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SummaryPNR.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.SummaryPNR> createSummaryPNRSummaryPnrRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.SummaryPNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.SummaryPNR>(_SummaryPNRExtSummaryPnrRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.SummaryPNR.class, com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SummaryPNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SummaryPNRExtResult", scope = SummaryPNRExtResponse.class)
    public JAXBElement<ViewPNR> createSummaryPNRExtResponseSummaryPNRExtResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_SummaryPNRExtResponseSummaryPNRExtResult_QNAME, ViewPNR.class, SummaryPNRExtResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OverrideReservationChargesResult", scope = OverrideReservationChargesResponse.class)
    public JAXBElement<ViewPNR> createOverrideReservationChargesResponseOverrideReservationChargesResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_OverrideReservationChargesResponseOverrideReservationChargesResult_QNAME, ViewPNR.class, OverrideReservationChargesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetReservationResult", scope = GetReservationResponse.class)
    public JAXBElement<ViewPNR> createGetReservationResponseGetReservationResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_GetReservationResponseGetReservationResult_QNAME, ViewPNR.class, GetReservationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatInventoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "seatInventoryRequest", scope = ReleaseInventory.class)
    public JAXBElement<SeatInventoryRequest> createReleaseInventorySeatInventoryRequest(SeatInventoryRequest value) {
        return new JAXBElement<SeatInventoryRequest>(_ReleaseInventorySeatInventoryRequest_QNAME, SeatInventoryRequest.class, ReleaseInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CancelPnrRequest", scope = com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNR.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR> createCancelPNRCancelPnrRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR>(_CancelPNRCancelPnrRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR.class, com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SeriesNum", scope = GetApisInfo.class)
    public JAXBElement<String> createGetApisInfoSeriesNum(String value) {
        return new JAXBElement<String>(_SetApisInfoSeriesNum_QNAME, String.class, GetApisInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConfirmationNum", scope = GetApisInfo.class)
    public JAXBElement<String> createGetApisInfoConfirmationNum(String value) {
        return new JAXBElement<String>(_SetApisInfoConfirmationNum_QNAME, String.class, GetApisInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SessionKey", scope = GetApisInfo.class)
    public JAXBElement<String> createGetApisInfoSessionKey(String value) {
        return new JAXBElement<String>(_SetApisInfoSessionKey_QNAME, String.class, GetApisInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CancelPNRResult", scope = CancelPNRResponse.class)
    public JAXBElement<ViewPNR> createCancelPNRResponseCancelPNRResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_CancelPNRResponseCancelPNRResult_QNAME, ViewPNR.class, CancelPNRResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CancelPnrRequest", scope = CancelPNRFFPAutoCancel.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR> createCancelPNRFFPAutoCancelCancelPnrRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR>(_CancelPNRCancelPnrRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR.class, CancelPNRFFPAutoCancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreatePnrRequest", scope = OverBook.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR> createOverBookCreatePnrRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR>(_CreatePNRFFPCreatePnrRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR.class, OverBook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatInventoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "seatInventoryRequest", scope = HoldInventory.class)
    public JAXBElement<SeatInventoryRequest> createHoldInventorySeatInventoryRequest(SeatInventoryRequest value) {
        return new JAXBElement<SeatInventoryRequest>(_ReleaseInventorySeatInventoryRequest_QNAME, SeatInventoryRequest.class, HoldInventory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.HistoryPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "HistoryPNRRequest", scope = com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.HistoryPNR.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.HistoryPNR> createHistoryPNRHistoryPNRRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.HistoryPNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.HistoryPNR>(_HistoryPNRHistoryPNRRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.HistoryPNR.class, com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.HistoryPNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewImportPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ImportPNRResult", scope = ImportPNRResponse.class)
    public JAXBElement<ViewImportPNR> createImportPNRResponseImportPNRResult(ViewImportPNR value) {
        return new JAXBElement<ViewImportPNR>(_ImportPNRResponseImportPNRResult_QNAME, ViewImportPNR.class, ImportPNRResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CancelPNRFFPAutoCancelResult", scope = CancelPNRFFPAutoCancelResponse.class)
    public JAXBElement<ViewPNR> createCancelPNRFFPAutoCancelResponseCancelPNRFFPAutoCancelResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_CancelPNRFFPAutoCancelResponseCancelPNRFFPAutoCancelResult_QNAME, ViewPNR.class, CancelPNRFFPAutoCancelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPenalty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddPenaltyRequest", scope = AddPenalties.class)
    public JAXBElement<AddPenalty> createAddPenaltiesAddPenaltyRequest(AddPenalty value) {
        return new JAXBElement<AddPenalty>(_AddPenaltiesAddPenaltyRequest_QNAME, AddPenalty.class, AddPenalties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreatePnrRequest", scope = CreatePNRExt.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR> createCreatePNRExtCreatePnrRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR>(_CreatePNRFFPCreatePnrRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR.class, CreatePNRExt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CancelPNRFFPAllTaxesResult", scope = CancelPNRFFPAllTaxesResponse.class)
    public JAXBElement<ViewPNR> createCancelPNRFFPAllTaxesResponseCancelPNRFFPAllTaxesResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_CancelPNRFFPAllTaxesResponseCancelPNRFFPAllTaxesResult_QNAME, ViewPNR.class, CancelPNRFFPAllTaxesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CancelPnrRequest", scope = CancelPNRFFPAllTaxes.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR> createCancelPNRFFPAllTaxesCancelPnrRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR>(_CancelPNRCancelPnrRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR.class, CancelPNRFFPAllTaxes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SetApisInfoResult", scope = SetApisInfoResponse.class)
    public JAXBElement<String> createSetApisInfoResponseSetApisInfoResult(String value) {
        return new JAXBElement<String>(_SetApisInfoResponseSetApisInfoResult_QNAME, String.class, SetApisInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreatePnrRequest", scope = com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNR.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR> createCreatePNRCreatePnrRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR>(_CreatePNRFFPCreatePnrRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CreatePNR.class, com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddPenaltiesResult", scope = AddPenaltiesResponse.class)
    public JAXBElement<ViewPNR> createAddPenaltiesResponseAddPenaltiesResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_AddPenaltiesResponseAddPenaltiesResult_QNAME, ViewPNR.class, AddPenaltiesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.RetrievePNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetrievePnrRequest", scope = GetReservation.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.RetrievePNR> createGetReservationRetrievePnrRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.RetrievePNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.RetrievePNR>(_RetrievePNRRetrievePnrRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.RetrievePNR.class, GetReservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ModifyPNRFFPResult", scope = ModifyPNRFFPResponse.class)
    public JAXBElement<ViewPNR> createModifyPNRFFPResponseModifyPNRFFPResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_ModifyPNRFFPResponseModifyPNRFFPResult_QNAME, ViewPNR.class, ModifyPNRFFPResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatInventoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReleaseInventoryResult", scope = ReleaseInventoryResponse.class)
    public JAXBElement<SeatInventoryResponse> createReleaseInventoryResponseReleaseInventoryResult(SeatInventoryResponse value) {
        return new JAXBElement<SeatInventoryResponse>(_ReleaseInventoryResponseReleaseInventoryResult_QNAME, SeatInventoryResponse.class, ReleaseInventoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddTaxesResult", scope = AddTaxesResponse.class)
    public JAXBElement<ViewPNR> createAddTaxesResponseAddTaxesResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_AddTaxesResponseAddTaxesResult_QNAME, ViewPNR.class, AddTaxesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.EvaluateModificationOfPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EvaluateModificationOfPNRRequest", scope = com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.EvaluateModificationOfPNR.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.EvaluateModificationOfPNR> createEvaluateModificationOfPNREvaluateModificationOfPNRRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.EvaluateModificationOfPNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.EvaluateModificationOfPNR>(_EvaluateModificationOfPNREvaluateModificationOfPNRRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.EvaluateModificationOfPNR.class, com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.EvaluateModificationOfPNR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CancelPnrRequest", scope = CancelPNRFFP.class)
    public JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR> createCancelPNRFFPCancelPnrRequest(com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR value) {
        return new JAXBElement<com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR>(_CancelPNRCancelPnrRequest_QNAME, com.gzipcompressiontest.services.connectpoint_reservation.model.datacontract2.CancelPNR.class, CancelPNRFFP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CancelPNRFFPResult", scope = CancelPNRFFPResponse.class)
    public JAXBElement<ViewPNR> createCancelPNRFFPResponseCancelPNRFFPResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_CancelPNRFFPResponseCancelPNRFFPResult_QNAME, ViewPNR.class, CancelPNRFFPResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreatePNRExtResult", scope = CreatePNRExtResponse.class)
    public JAXBElement<ViewPNR> createCreatePNRExtResponseCreatePNRExtResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_CreatePNRExtResponseCreatePNRExtResult_QNAME, ViewPNR.class, CreatePNRExtResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetrievePNRResult", scope = RetrievePNRResponse.class)
    public JAXBElement<ViewPNR> createRetrievePNRResponseRetrievePNRResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_RetrievePNRResponseRetrievePNRResult_QNAME, ViewPNR.class, RetrievePNRResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPNR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreatePNRResult", scope = CreatePNRResponse.class)
    public JAXBElement<ViewPNR> createCreatePNRResponseCreatePNRResult(ViewPNR value) {
        return new JAXBElement<ViewPNR>(_CreatePNRResponseCreatePNRResult_QNAME, ViewPNR.class, CreatePNRResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewHistoryPNRCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "HistoryPNRResult", scope = HistoryPNRResponse.class)
    public JAXBElement<ViewHistoryPNRCollection> createHistoryPNRResponseHistoryPNRResult(ViewHistoryPNRCollection value) {
        return new JAXBElement<ViewHistoryPNRCollection>(_HistoryPNRResponseHistoryPNRResult_QNAME, ViewHistoryPNRCollection.class, HistoryPNRResponse.class, value);
    }

}

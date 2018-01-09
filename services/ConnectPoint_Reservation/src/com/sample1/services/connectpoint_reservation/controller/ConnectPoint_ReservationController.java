/**
 * This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.
 */
package com.sample1.services.connectpoint_reservation.controller;

import com.sample1.services.connectpoint_reservation.services.ConnectPoint_ReservationService;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.AddPenalties;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.AddPenaltiesResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.AddTaxes;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.AddTaxesResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNRResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNRFFP;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNRFFPResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNRFFPAllTaxes;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNRFFPAllTaxesResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNRFFPAutoCancel;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNRFFPAutoCancelResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNRResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNRExt;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNRExtResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNRFFP;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNRFFPResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.EvaluateModificationOfPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.EvaluateModificationOfPNRResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.GetApisInfo;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.GetApisInfoResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.GetReservation;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.GetReservationResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.GetReservationBalance;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.GetReservationBalanceResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.HistoryPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.HistoryPNRResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.HoldInventory;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.HoldInventoryResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ImportPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ImportPNRResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ModifyPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ModifyPNRResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ModifyPNRFFP;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ModifyPNRFFPResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.OverBook;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.OverBookResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.OverrideReservationCharges;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.OverrideReservationChargesResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ReleaseInventory;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ReleaseInventoryResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.RetrievePNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.RetrievePNRResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SetApisInfo;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SetApisInfoResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SummaryPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SummaryPNRResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SummaryPNRExt;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SummaryPNRExtResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/connectPoint_Reservation")
public class ConnectPoint_ReservationController {

    @Autowired
    private ConnectPoint_ReservationService connectPoint_ReservationService;

    @RequestMapping(value = "/penalties", method = RequestMethod.POST)
    public AddPenaltiesResponse addPenalties(@RequestBody AddPenalties parameters) {
        return connectPoint_ReservationService.addPenalties(parameters);
    }

    @RequestMapping(value = "/taxes", method = RequestMethod.POST)
    public AddTaxesResponse addTaxes(@RequestBody AddTaxes parameters) {
        return connectPoint_ReservationService.addTaxes(parameters);
    }

    @RequestMapping(value = "/cancelPNR", method = RequestMethod.POST)
    public CancelPNRResponse cancelPNR(@RequestBody CancelPNR parameters) {
        return connectPoint_ReservationService.cancelPNR(parameters);
    }

    @RequestMapping(value = "/cancelPNRFFP", method = RequestMethod.POST)
    public CancelPNRFFPResponse cancelPNRFFP(@RequestBody CancelPNRFFP parameters) {
        return connectPoint_ReservationService.cancelPNRFFP(parameters);
    }

    @RequestMapping(value = "/cancelPNRFFPAllTaxes", method = RequestMethod.POST)
    public CancelPNRFFPAllTaxesResponse cancelPNRFFPAllTaxes(@RequestBody CancelPNRFFPAllTaxes parameters) {
        return connectPoint_ReservationService.cancelPNRFFPAllTaxes(parameters);
    }

    @RequestMapping(value = "/cancelPNRFFPAutoCancel", method = RequestMethod.POST)
    public CancelPNRFFPAutoCancelResponse cancelPNRFFPAutoCancel(@RequestBody CancelPNRFFPAutoCancel parameters) {
        return connectPoint_ReservationService.cancelPNRFFPAutoCancel(parameters);
    }

    @RequestMapping(value = "/pNR", method = RequestMethod.POST)
    public CreatePNRResponse createPNR(@RequestBody CreatePNR parameters) {
        return connectPoint_ReservationService.createPNR(parameters);
    }

    @RequestMapping(value = "/pNRExt", method = RequestMethod.POST)
    public CreatePNRExtResponse createPNRExt(@RequestBody CreatePNRExt parameters) {
        return connectPoint_ReservationService.createPNRExt(parameters);
    }

    @RequestMapping(value = "/pNRFFp", method = RequestMethod.POST)
    public CreatePNRFFPResponse createPNRFFP(@RequestBody CreatePNRFFP parameters) {
        return connectPoint_ReservationService.createPNRFFP(parameters);
    }

    @RequestMapping(value = "/evaluateModificationOfPNR", method = RequestMethod.POST)
    public EvaluateModificationOfPNRResponse evaluateModificationOfPNR(@RequestBody EvaluateModificationOfPNR parameters) {
        return connectPoint_ReservationService.evaluateModificationOfPNR(parameters);
    }

    @RequestMapping(value = "/apisInfo", method = RequestMethod.POST)
    public GetApisInfoResponse getApisInfo(@RequestBody GetApisInfo parameters) {
        return connectPoint_ReservationService.getApisInfo(parameters);
    }

    @RequestMapping(value = "/reservation", method = RequestMethod.POST)
    public GetReservationResponse getReservation(@RequestBody GetReservation parameters) {
        return connectPoint_ReservationService.getReservation(parameters);
    }

    @RequestMapping(value = "/reservationBalance", method = RequestMethod.POST)
    public GetReservationBalanceResponse getReservationBalance(@RequestBody GetReservationBalance parameters) {
        return connectPoint_ReservationService.getReservationBalance(parameters);
    }

    @RequestMapping(value = "/historyPNR", method = RequestMethod.POST)
    public HistoryPNRResponse historyPNR(@RequestBody HistoryPNR parameters) {
        return connectPoint_ReservationService.historyPNR(parameters);
    }

    @RequestMapping(value = "/holdInventory", method = RequestMethod.POST)
    public HoldInventoryResponse holdInventory(@RequestBody HoldInventory parameters) {
        return connectPoint_ReservationService.holdInventory(parameters);
    }

    @RequestMapping(value = "/importPNR", method = RequestMethod.POST)
    public ImportPNRResponse importPNR(@RequestBody ImportPNR parameters) {
        return connectPoint_ReservationService.importPNR(parameters);
    }

    @RequestMapping(value = "/modifyPNR", method = RequestMethod.POST)
    public ModifyPNRResponse modifyPNR(@RequestBody ModifyPNR parameters) {
        return connectPoint_ReservationService.modifyPNR(parameters);
    }

    @RequestMapping(value = "/modifyPNRFFP", method = RequestMethod.POST)
    public ModifyPNRFFPResponse modifyPNRFFP(@RequestBody ModifyPNRFFP parameters) {
        return connectPoint_ReservationService.modifyPNRFFP(parameters);
    }

    @RequestMapping(value = "/overBook", method = RequestMethod.POST)
    public OverBookResponse overBook(@RequestBody OverBook parameters) {
        return connectPoint_ReservationService.overBook(parameters);
    }

    @RequestMapping(value = "/overrideReservationCharges", method = RequestMethod.POST)
    public OverrideReservationChargesResponse overrideReservationCharges(@RequestBody OverrideReservationCharges parameters) {
        return connectPoint_ReservationService.overrideReservationCharges(parameters);
    }

    @RequestMapping(value = "/releaseInventory", method = RequestMethod.POST)
    public ReleaseInventoryResponse releaseInventory(@RequestBody ReleaseInventory parameters) {
        return connectPoint_ReservationService.releaseInventory(parameters);
    }

    @RequestMapping(value = "/retrievePNR", method = RequestMethod.POST)
    public RetrievePNRResponse retrievePNR(@RequestBody RetrievePNR parameters) {
        return connectPoint_ReservationService.retrievePNR(parameters);
    }

    @RequestMapping(value = "/apisInfo", method = RequestMethod.PUT)
    public SetApisInfoResponse setApisInfo(@RequestBody SetApisInfo parameters) {
        return connectPoint_ReservationService.setApisInfo(parameters);
    }

    @RequestMapping(value = "/summaryPNR", method = RequestMethod.POST)
    public SummaryPNRResponse summaryPNR(@RequestBody SummaryPNR parameters) {
        return connectPoint_ReservationService.summaryPNR(parameters);
    }

    @RequestMapping(value = "/summaryPNRExt", method = RequestMethod.POST)
    public SummaryPNRExtResponse summaryPNRExt(@RequestBody SummaryPNRExt parameters) {
        return connectPoint_ReservationService.summaryPNRExt(parameters);
    }
}

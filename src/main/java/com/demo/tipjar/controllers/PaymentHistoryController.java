package com.demo.tipjar.controllers;

import com.demo.tipjar.entities.PaymentHistory;
import com.demo.tipjar.services.PaymentHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentHistoryController {

    @Autowired
    private PaymentHistoryService paymentHistoryService;

    @RequestMapping(value = "/savePayment", method = RequestMethod.POST)
    public @ResponseBody PaymentHistory savePaymentHistory(@RequestBody PaymentHistory paymentHistory) {
        return this.paymentHistoryService.savePaymentHistory(paymentHistory);
    }

    @RequestMapping(value = "/getPayments", method = RequestMethod.POST)
    public @ResponseBody List<PaymentHistory> getAllPaymentHistories() {
        return this.paymentHistoryService.getAllPaymentHistories();
    }

    @RequestMapping(value = "/getLatestPayment", method = RequestMethod.POST)
    public PaymentHistory getLatestPayment() {
        return this.paymentHistoryService.getLatestPayment();
    }

}

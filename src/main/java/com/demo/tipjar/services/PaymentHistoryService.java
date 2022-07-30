package com.demo.tipjar.services;

import com.demo.tipjar.entities.PaymentHistory;

import java.util.List;

public interface PaymentHistoryService {

    PaymentHistory savePaymentHistory(PaymentHistory paymentHistory);

    List<PaymentHistory> getAllPaymentHistories();

    PaymentHistory getLatestPayment();

}

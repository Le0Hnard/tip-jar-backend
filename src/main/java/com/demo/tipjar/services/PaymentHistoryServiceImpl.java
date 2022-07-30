package com.demo.tipjar.services;

import com.demo.tipjar.entities.PaymentHistory;
import com.demo.tipjar.repositories.PaymentHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentHistoryServiceImpl implements PaymentHistoryService {

    @Autowired
    private PaymentHistoryRepository paymentHistoryRepository;

    @Override
    public PaymentHistory savePaymentHistory(PaymentHistory paymentHistory) {
        double tipPercentage = paymentHistory.getTipPercentage() / 100.0;
        double totalTip = Math.round((tipPercentage * paymentHistory.getAmount()) * 100.00) / 100.00;
        double tipPerPerson = Math.round((totalTip / paymentHistory.getNumOfPeople()) * 100.00) / 100.00;

        paymentHistory.setTotalTip(totalTip);
        paymentHistory.setTipPerPerson(tipPerPerson);

        return this.paymentHistoryRepository.save(paymentHistory);
    }

    @Override
    public List<PaymentHistory> getAllPaymentHistories() {
        return (List<PaymentHistory>) this.paymentHistoryRepository.findAll();
    }

}

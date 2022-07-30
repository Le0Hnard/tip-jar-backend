package com.demo.tipjar.services;

import com.demo.tipjar.entities.PaymentHistory;
import com.demo.tipjar.repositories.PaymentHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentHistoryServiceImpl implements PaymentHistoryService {

    @Autowired
    private PaymentHistoryRepository paymentHistoryRepository;

    @Override
    public PaymentHistory savePaymentHistory(PaymentHistory paymentHistory) {
        double tipPercentage = paymentHistory.getTipPercentage() / 100.0;
        double totalTip = tipPercentage * paymentHistory.getAmount();
        double tipPerPerson = totalTip / paymentHistory.getNumOfPeople();

        paymentHistory.setTotalTip(totalTip);
        paymentHistory.setTipPerPerson(tipPerPerson);

        return this.paymentHistoryRepository.save(paymentHistory);
    }

}

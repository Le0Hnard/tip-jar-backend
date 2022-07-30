package com.demo.tipjar.controllers;

import com.demo.tipjar.entities.PaymentHistory;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentHistoryController {

    @RequestMapping(value = "/savePayment", method = RequestMethod.POST)
    public @ResponseBody PaymentHistory savePaymentHistory(@RequestBody PaymentHistory paymentHistory) {
        return null;
    }

}

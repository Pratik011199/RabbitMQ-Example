package com.pratik.controller;

import com.pratik.dto.PaymentRequestDTO;
import com.pratik.dto.PaytmRequest;
import com.pratik.publisher.PaytmPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
public class PaytmController {

    @Autowired
    private PaytmPublisher publisher;

    @PostMapping("/mq/pay")
    public String  payUsingUPI(@RequestBody PaytmRequest<PaymentRequestDTO> paytmRequest){
        PaymentRequestDTO paymentRequestDTO = paytmRequest.getPayload();
        publisher.doPaymentTransaction(paymentRequestDTO);
        return "payment request in progress";
    }
}

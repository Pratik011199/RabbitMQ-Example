package com.pratik.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pratik.config.MessagingConfig;
import com.pratik.dto.PaymentRequestDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PaytmClientApp3 {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void processPaymentRequest(PaymentRequestDTO paymentRequestDTO) {
        try {
            System.out.println("consumer (3) consumes" + new ObjectMapper().writeValueAsString(paymentRequestDTO));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

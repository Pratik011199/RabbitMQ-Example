package com.pratik.publisher;

import com.pratik.config.MessagingConfig;
import com.pratik.dto.PaymentRequestDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class PaytmPublisher {

    @Autowired
    public RabbitTemplate template;

    public void doPaymentTransaction(PaymentRequestDTO paymentRequestDTO){
        paymentRequestDTO.setTransactionId(UUID.randomUUID().toString());
        paymentRequestDTO.setTransactionDate(new Date());
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY,paymentRequestDTO);
    }
}

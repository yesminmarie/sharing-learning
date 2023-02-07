package io.github.yesminmarie.payment.application.service;

import io.github.yesminmarie.payment.application.port.in.PaymentUseCase;
import io.github.yesminmarie.payment.domain.entities.Payment;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class PaymentUseCaseImpl implements PaymentUseCase {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    @Override
    public void sendPayment(Payment payment) {
        log.info("Receiving payment request {}", payment);
        log.info("Sending payment to tipoic", payment);
        payment.setId(UUID.randomUUID());
        kafkaTemplate.send("payment-topic", payment);
    }
}

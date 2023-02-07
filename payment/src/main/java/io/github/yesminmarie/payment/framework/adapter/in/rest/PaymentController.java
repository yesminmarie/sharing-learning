package io.github.yesminmarie.payment.framework.adapter.in.rest;

import io.github.yesminmarie.payment.application.port.in.PaymentUseCase;
import io.github.yesminmarie.payment.domain.entities.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

    private final PaymentUseCase paymentUseCase;

    @PostMapping
    public ResponseEntity<Payment> create(@RequestBody Payment payment){
        paymentUseCase.sendPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

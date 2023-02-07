package io.github.yesminmarie.payment.application.port.in;

import io.github.yesminmarie.payment.domain.entities.Payment;

public interface PaymentUseCase {
    void sendPayment(Payment payment);
}

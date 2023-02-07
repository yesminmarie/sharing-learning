package io.github.yesminmarie.payment.domain.entities;

import io.github.yesminmarie.payment.domain.enums.PaymentMethod;
import io.github.yesminmarie.payment.domain.enums.PaymentStatus;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class Payment implements Serializable {

    private UUID id;
    private String courseId;
    private String userId;
    private PaymentStatus status;
    private PaymentMethod paymentMethod;
}

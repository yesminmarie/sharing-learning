package io.github.yesminmarie.enrollment.listener;

import io.github.yesminmarie.enrollment.domain.Enrollment;
import io.github.yesminmarie.enrollment.domain.Payment;
import io.github.yesminmarie.enrollment.service.EnrollmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Log4j2
@Component
@RequiredArgsConstructor
public class JsonListener {

    private final EnrollmentService enrollmentService;

    @KafkaListener(topics = "payment-topic", groupId = "enrollment-group", containerFactory = "jsonContainerFactory")
    public void createEnrollment(@Payload Payment payment) {
        log.info("Payment received {} ", payment.toString());
        enrollmentService.createEnrollment(payment);
    }
}

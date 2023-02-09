package io.github.yesminmarie.enrollment.service;

import io.github.yesminmarie.enrollment.domain.Enrollment;
import io.github.yesminmarie.enrollment.domain.Payment;

public interface EnrollmentService {
    void createEnrollment(Payment payment);
}

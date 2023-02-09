package io.github.yesminmarie.enrollment.service.impl;

import io.github.yesminmarie.enrollment.domain.Enrollment;
import io.github.yesminmarie.enrollment.domain.Payment;
import io.github.yesminmarie.enrollment.repository.EnrollmentRepository;
import io.github.yesminmarie.enrollment.service.EnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EnrollmentServiceImpl implements EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;
    @Override
    public void createEnrollment(Payment payment) {
        if(payment.getStatus().equals("CONFIRMED")){
            Enrollment enrollment = new Enrollment();
            enrollment.setId(UUID.randomUUID().toString());
            enrollment.setCourseId(payment.getCourseId());
            enrollment.setUserId(payment.getCourseId());
            enrollmentRepository.save(enrollment);
        }
    }
}

package io.github.yesminmarie.enrollment.repository;

import io.github.yesminmarie.enrollment.domain.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EnrollmentRepository extends JpaRepository<Enrollment, String> {
}

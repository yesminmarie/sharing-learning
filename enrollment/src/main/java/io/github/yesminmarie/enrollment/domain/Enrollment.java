package io.github.yesminmarie.enrollment.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Enrollment {

    @Id
    private String id;
    private String courseId;
    private String userId;
}

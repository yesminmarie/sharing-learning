package io.github.yesminmarie.courses.domain.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Document
public class Course {

    @Id
    private String id;

    @Indexed(unique = true)
    private UUID courseId;

    private String name;
    private String instructor;
    private Integer duration;
    private BigDecimal price;
}

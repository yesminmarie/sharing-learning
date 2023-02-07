package io.github.yesminmarie.courses.domain.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CourseRequest {
    private String name;
    private String instructor;
    private Integer duration;
    private BigDecimal price;
}

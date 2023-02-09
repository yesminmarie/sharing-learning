package io.github.yesminmarie.enrollment.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

@Data
@ToString
public class Payment implements Serializable {

    private UUID id;
    private String courseId;
    private String userId;
    private String status;
    private String paymentMethod;
}

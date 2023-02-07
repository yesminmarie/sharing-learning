package io.github.yesminmarie.courses.application.port.in;

import io.github.yesminmarie.courses.domain.dto.CourseRequest;
import io.github.yesminmarie.courses.domain.dto.CourseResponse;

public interface CourseUseCase {
    CourseResponse create(CourseRequest courseRequest);
}

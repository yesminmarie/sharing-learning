package io.github.yesminmarie.courses.framework.adapter.in.rest;

import io.github.yesminmarie.courses.application.port.in.CourseUseCase;
import io.github.yesminmarie.courses.domain.dto.CourseRequest;
import io.github.yesminmarie.courses.domain.dto.CourseResponse;
import io.github.yesminmarie.courses.domain.entities.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseUseCase courseUseCase;
    @PostMapping
    public ResponseEntity<CourseResponse> create(@RequestBody CourseRequest courseRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(courseUseCase.create(courseRequest));
    }
}

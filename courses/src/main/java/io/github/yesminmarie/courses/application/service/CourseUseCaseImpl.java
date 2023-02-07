package io.github.yesminmarie.courses.application.service;

import io.github.yesminmarie.courses.application.port.in.CourseUseCase;
import io.github.yesminmarie.courses.application.port.out.CourseRepository;
import io.github.yesminmarie.courses.domain.dto.CourseRequest;
import io.github.yesminmarie.courses.domain.dto.CourseResponse;
import io.github.yesminmarie.courses.domain.entities.Course;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CourseUseCaseImpl implements CourseUseCase {

    private final CourseRepository courseRepository;
    private final ModelMapper modelMapper;
    @Override
    public CourseResponse create(CourseRequest courseRequest) {

        Course course = modelMapper.map(courseRequest, Course.class);
        course.setCourseId(UUID.randomUUID());
        courseRepository.save(course);

        return modelMapper.map(course, CourseResponse.class);

    }
}

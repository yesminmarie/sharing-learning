package io.github.yesminmarie.courses.application.port.out;

import io.github.yesminmarie.courses.domain.entities.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface CourseRepository extends MongoRepository<Course, UUID> {
}

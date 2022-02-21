package com.bilgeadam.instructorcourseapp.repository;

import com.bilgeadam.instructorcourseapp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}

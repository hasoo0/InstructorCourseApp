package com.bilgeadam.instructorcourseapp.repository;

import com.bilgeadam.instructorcourseapp.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor,Long> {
}

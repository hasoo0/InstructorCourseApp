package com.bilgeadam.instructorcourseapp;

import com.bilgeadam.instructorcourseapp.entity.Course;
import com.bilgeadam.instructorcourseapp.entity.Instructor;
import com.bilgeadam.instructorcourseapp.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class InstructorCourseAppApplication implements CommandLineRunner {

    @Autowired
    public InstructorRepository instructorRepository;

    public static void main(String[] args) {
        SpringApplication.run(InstructorCourseAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Instructor instructor = new Instructor();
        instructor.setFirstName("Ugur");
        instructor.setLastName("Sahin");
        instructor.setEmail("ugursahin@gmail.com");



        Course course1 = new Course();
        course1.setTitle("Molekuler Biyoloji");

        Course course2 =new Course();
        course2.setTitle("asilanma");

        Course course3 = new Course();
        course3.setTitle("genetik");

        course1.setInstructor(instructor);
        course2.setInstructor(instructor);
        course3.setInstructor(instructor);


       instructor.getCourses().add(course1);
       instructor.getCourses().add(course2);
       instructor.getCourses().add(course3);
        instructorRepository.save(instructor);


        instructor.setFirstName("alex");
        instructor.setLastName("desouza");

        instructorRepository.save(instructor);

    }
}

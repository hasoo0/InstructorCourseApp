package com.bilgeadam.instructorcourseapp.entity;


import com.bilgeadam.instructorcourseapp.audit.AuditModel;
import lombok.Data;


import javax.persistence.*;

@Entity
@Data
public class Course extends AuditModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;
}

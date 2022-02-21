package com.bilgeadam.instructorcourseapp.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Instructor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String email;

    @OneToMany(mappedBy = "instructor",cascade = CascadeType.ALL)
    private List<Course> courses = new ArrayList<>();

}

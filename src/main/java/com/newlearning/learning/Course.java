package com.newlearning.learning;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.jdi.CharValue;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;

@Data
@Entity
@Table(name = "course", schema = "learning")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Integer courseId;

    @Column(name="course_code")
    private String courseCode;

    @Column(name="course_description")
    private String courseDescription;

    @Column(name = "credits")
    private Integer credits;

    @ManyToOne
    @JoinColumn(name = "id")
    private Student student;

}



package com.newlearning.learning;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {

    private Integer id;

    private List<CourseModel> courses;

    private String firstName;

    private String lastName;

    private int phoneNumber;

    private String homeAddress;

    private int semister;

    private String collegeSemister;

    private String email;

    private LocalDate dateOfBirth;

    private String citizen;
}

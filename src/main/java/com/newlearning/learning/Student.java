package com.newlearning.learning;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "student", schema = "learning")

public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name = "course")
    private String courseName;

    @Column(name="phone_number")
    private int phoneNumber;

    @Column(name="home_address")
    private String homeAddress;

    @Column(name="semister")
    private int semister;

    @Column(name="college_address")
    private String collegeSemister;

    @Column(name="email")
    private String email;

    @Column(name="date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name="citizen")
    private String citizen;





}


package com.newlearning.learning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseModel {

    private Integer courseId;

    private String courseCode;

    private String courseDescription;

    private Integer credits;

    private Student student;
}

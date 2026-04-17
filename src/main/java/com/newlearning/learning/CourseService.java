package com.newlearning.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourseDetails(Course course) {
        return courseRepository.save(course);
    }
}

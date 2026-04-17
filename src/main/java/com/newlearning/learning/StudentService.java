package com.newlearning.learning;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public User getUserDetails(String id) {
        User sai = new User();
        sai.setId(Integer.parseInt(id));
        sai.setName("Sai");
        sai.setCourse("MSCS");
        sai.setAcademicYear(2026);
        return sai;
    }

    public List<Student> getStudentsDetails() {
        return studentRepository.findAll();

    }

    @Transactional
    public Student putStudentDetails(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentDetail(int id){
        return studentRepository.findById(id);
    }
    public Student getStudDetail(int id ){
        return studentRepository.findById(id);
    }

    @Transactional
    public Student removeStudentDetails(int id){
         return studentRepository.removeById(id);
    }

    public Student updateStudentDetails(Student student){
        return studentRepository.save(student);

    }


}




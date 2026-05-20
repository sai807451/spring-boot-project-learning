package com.newlearning.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
        public List<Student> getStudents() {
        return studentService.getStudentsDetails();
    }


    @PostMapping
    public StudentModel saveStudent(@RequestBody StudentModel studentModel){
        return studentService.putStudentDetails(studentModel);
    }



        @GetMapping
        public StudentModel getStudent ( @RequestParam int id){
            return studentService.getStudentDetail(id);
        }


        @GetMapping("/{id}")
        public StudentModel getstudent ( @PathVariable(value = "id") int id){
            return studentService.getStudDetail(id);

        }

        @DeleteMapping("/{id}")
        public Student removeStudent ( @PathVariable int id){
            return studentService.removeStudentDetails(id);
        }

        @PutMapping
        public Student updateStudent (@RequestBody Student student) {
            return studentService.updateStudentDetails(student);
        }

//    @PostMapping
//    public List<Student> updateStudentCourse (@RequestBody List<Student> students) {
//        return studentService.updateStudentCourseDetails(students);
//    }
}


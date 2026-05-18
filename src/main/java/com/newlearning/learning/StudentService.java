package com.newlearning.learning;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {


    @Autowired
    private CourseRepository courseRepository;

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
    public StudentModel putStudentDetails(StudentModel studentModel) {
        Student student = new Student();
        student.setFirstName(studentModel.getFirstName());
        student.setLastName(studentModel.getHomeAddress());
        student.setPhoneNumber(studentModel.getPhoneNumber());
        student.setEmail(studentModel.getEmail());
        student.setCitizen(studentModel.getCitizen());
        student.setSemister(studentModel.getSemister());
        student.setId(studentModel.getId());


        //convert studentmodel to student entity

        //save student entity, which returns student entity with id


        //get coursemodel list from student model
        //loop coursemodel list and convert to Course entity
        //save course list
        student = studentRepository.save(student);

        List<CourseModel> courseModels = studentModel.getCourses();
        List<Course> courses = new ArrayList<>();
        for (CourseModel courseModel : courseModels) {
            Course course = new Course();
            course.setCourseCode(courseModel.getCourseCode());
            course.setCourseDescription(courseModel.getCourseDescription());
            course.setCredits(courseModel.getCredits());
            course.setCourseId(courseModel.getCourseId());
//            course.setStudent(student);
            courses.add(course);

             courses=courseRepository.saveAll(courses);
//            course = (Course) courseRepository.saveAll(courses);


        }

    return null;}

    public StudentModel getStudentDetail(int id){
        Student student = studentRepository.findById(id);

        StudentModel studentModel = new StudentModel();
        studentModel.setId(student.getId());
        //studentModel.setCitizen(student.getCitizen());
        studentModel.setFirstName(student.getFirstName());
        studentModel.setEmail(student.getEmail());
        studentModel.setCollegeSemister(student.getCollegeSemister());
        studentModel.setLastName(student.getLastName());
        studentModel.setDateOfBirth(student.getDateOfBirth());
        studentModel.setPhoneNumber(student.getPhoneNumber());
        studentModel.setHomeAddress(student.getHomeAddress());

        List<Course> courses = student.getCourses();
        List<CourseModel> courseModels = new ArrayList<>();
        for(Course course : courses) {
            CourseModel courseModel = new CourseModel();
            courseModel.setCourseId(course.getCourseId());
            courseModel.setCourseCode(course.getCourseCode());
            courseModel.setCourseDescription(course.getCourseDescription());
            courseModel.setCredits(course.getCredits());
            courseModels.add(courseModel);
        }
        studentModel.setCourses(courseModels);
        return studentModel;
    }

    public StudentModel getStudDetail(int id ){
        Student student = studentRepository.findById(id);

        StudentModel studentModel= new StudentModel();
        studentModel.setFirstName(student.getFirstName());
        studentModel.setLastName(student.getLastName());
        studentModel.setCitizen(student.getCitizen());
        studentModel.setHomeAddress(student.getHomeAddress());
        studentModel.setHomeAddress(student.getHomeAddress());
        studentModel.setPhoneNumber(student.getPhoneNumber());
        studentModel.setCollegeSemister(student.getCollegeSemister());

        List<Course> courses = student.getCourses();
        List<CourseModel> courseModels = new ArrayList<> ();
        for(Course course : courses){
            CourseModel courseModel =new CourseModel();
            courseModel.setCourseId(course.getCourseId());
            courseModel.setCourseDescription(course.getCourseDescription());
            courseModel.setCredits(course.getCredits());
            courseModels.add(courseModel);
        }
        studentModel.setCourses(courseModels);
        return studentModel;

    }

    @Transactional
    public Student removeStudentDetails(int id){
         return studentRepository.removeById(id);
    }

    public Student updateStudentDetails(Student student){
        return studentRepository.save(student);
        }




    public List<Student> updateStudentCourseDetails(List<Student> students) {
            return studentRepository.saveAll(students);
        }
    }





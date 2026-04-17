package com.newlearning.learning;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;
import org.w3c.dom.Text;

@Data
@Entity
@Table(name = "course", schema = "learning")
public class Course {

    @Column( name="id")
    private Integer id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Text courseId;

    @Column(name="course_code")
    private Integer courseCode;

    @Column(name="course_description")
    private String courseDescription;

    @Column(name = "credits")
    private Integer credits;

}



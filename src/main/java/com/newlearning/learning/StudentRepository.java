package com.newlearning.learning;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findById(int id);

    Student removeById(int id);

    Student findByFirstNameAndLastNameAndSemisterBetween(String firstName, String lastName, int startSemister, int endSemister);

    @Query(value = "select s from Student s where s.firstName like %:firstName")
    Student findByNames(@Param("firstName") String firstName);

    @Query(value = "select s.semister from learning.student as s where s.first_name = ?", nativeQuery = true)
    int findByNamesAndAddresses(@Param("firstName") String firstName);



    //CRUD - Create Read Update Delete
}

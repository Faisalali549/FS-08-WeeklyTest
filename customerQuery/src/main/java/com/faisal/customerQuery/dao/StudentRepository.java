package com.faisal.customerQuery.dao;

import com.faisal.customerQuery.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

   List<Student> findByFirstName(String firstName);

   @Query(value = "Select * from Student where status = 1", nativeQuery = true)
    List<Student> findByActive(boolean active);


    List<Student> findByFirstNameAndLastName(String firstname, String lastname);

    Student findDistinctByLastNameAndFirstName(String lastname, String firstname);

    List<Student> findByAgeLessThan(int age);

}

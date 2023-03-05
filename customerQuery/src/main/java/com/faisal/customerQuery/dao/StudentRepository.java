package com.faisal.customerQuery.dao;

import com.faisal.customerQuery.model.Student;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("SELECT * FROM tbl_Student where first_name = firstName")
    List<Student> findByFirstName(String firstName);

    List<Student> findByActive(boolean active);

//    List<Student> findAllStudent(boolean active);
//
//    List<Student> findByFirstNameAndLastName(String firstname, String lastname);
//
//    Student findDistinctByLastNameAndFirstName(String lastname, String firstname);
//
//    List<Student> findByAgeLessThan(int age);
//
//    List<Student> findByStartDateBefore(Date date);

}

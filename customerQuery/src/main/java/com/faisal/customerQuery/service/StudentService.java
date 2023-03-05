package com.faisal.customerQuery.service;

import com.faisal.customerQuery.dao.StudentRepository;
import com.faisal.customerQuery.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;
    public List<Student> findByFirstName(String name) {
        List<Student> students = repository.findByFirstName(name);
        return students;
    }

    public List<Student> findAllStudent(boolean active) {
        return repository.findByActive(true);
    }

    public List<Student> findByFirstNameAndLastName(String firstName, String lastName) {
        return repository.findByFirstNameAndLastName(firstName, lastName);
    }

    public Student findDistinctByLastNameAndFirstName(String lastName, String firstName) {
        return repository.findDistinctByLastNameAndFirstName(lastName, firstName);
    }

    public List<Student> findByAgeLessThan(int age) {
        return repository.findByAgeLessThan(age);
    }

    public int saveStudent(Student student) {
        Student student1 = repository.save(student);
        return student1.getId();
    }
}

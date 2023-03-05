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

    public List<Student> findAllStudent() {
        return repository.findByActive(true);
    }
}

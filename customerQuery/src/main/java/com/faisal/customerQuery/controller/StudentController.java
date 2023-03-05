package com.faisal.customerQuery.controller;

import com.faisal.customerQuery.model.Student;
import com.faisal.customerQuery.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService service;


    @GetMapping("/name")
    public List<Student> findByFirstName(@RequestParam(value = "firstName",required = true )String name) {
        List<Student> studentList = service.findByFirstName(name);
        return studentList;
    }
    @GetMapping("/findAll")
    List<Student> findAll() {
        return service.findAllStudent();
    }

}

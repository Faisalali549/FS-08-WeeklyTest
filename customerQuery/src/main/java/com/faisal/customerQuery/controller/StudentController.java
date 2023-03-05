package com.faisal.customerQuery.controller;

import com.faisal.customerQuery.model.Student;
import com.faisal.customerQuery.service.StudentService;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService service;

    @PostMapping("/create-student")
    public ResponseEntity<String> saveStudent(@RequestBody String studentData){
        JSONObject jsonObject = new JSONObject(studentData);

        JSONObject error = validateStudent(jsonObject);
        if (error.isEmpty()){
            Student student = setStudent(jsonObject);
            int id =  service.saveStudent(student);
            return new ResponseEntity<>("Student saved with id " + id, HttpStatus.ACCEPTED);
        }else {
            return new ResponseEntity<>(error.toString(), HttpStatus.BAD_GATEWAY);
        }

    }

    private Student setStudent(JSONObject jsonObject) {
        Student student = new Student();

        student.setFirstName(jsonObject.getString("firstName"));
        student.setLastName(jsonObject.getString("lastName"));
        student.setAge(jsonObject.getInt("age"));
        student.setActive(jsonObject.getBoolean("active"));

        Timestamp curr=new Timestamp(System.currentTimeMillis());
        student.setStartDate(curr);

        return student;
    }

    private JSONObject validateStudent(JSONObject jsonObject) {
        JSONObject error=new JSONObject();
        if(!jsonObject.has("firstName")){
            error.put("firstName","missing parameter !");
        }
        if(!jsonObject.has("lastName")){
            error.put("lastName","missing parameter !");
        }
        if(!jsonObject.has("age")){
            error.put("age","missing parameter !");
        }
        if(!jsonObject.has("active")){
            error.put("active","missing parameter !");
        }
        return error;
    }


    @GetMapping("/name")
    public List<Student> findByFirstName(@RequestParam(value = "firstName",required = true )String name) {
        List<Student> studentList = service.findByFirstName(name);
        return studentList;
    }
    @GetMapping("/findAll")
    public List<Student> findAll(boolean active) {
        return service.findAllStudent(active);
    }
    @GetMapping("/findByFirstnameAndLastname")
    public List<Student> findByFirstNameAndLastname(@RequestParam(value = "firstName", required = true) String firstName, @RequestParam
            (value = "lastName", required = true) String lastName) {
        List<Student> students = service.findByFirstNameAndLastName(firstName, lastName);
        return students;
    }
    @GetMapping("/findDistinct")
    public Student findDistinct(@RequestParam(value = "lastName", required = true) String firstName, @RequestParam
            (value = "firstName", required = true) String lastName) {
        Student student = service.findDistinctByLastNameAndFirstName(lastName, firstName);
        return student;
    }

    @GetMapping("/findByAgeLessThan")
    public List<Student> findByAge(@RequestParam(value = "age", required = true) int age) {
        List<Student> students = service.findByAgeLessThan(age);
        return students;
    }

}

<<<<<<< HEAD
package com.example.universityEventManagement.service;

import com.example.universityEventManagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class StudentService {
    private static ArrayList<Student> student=new ArrayList<>();
    private static int count = 0;


    static {
        student.add(new Student(++count,"Faisal","Ali",24,"Computer Science"));
        student.add(new Student(++count,"Ramiz","Raza",25,"Petroleum"));
        student.add(new Student(++count,"Ankit","Singh",23,"Civil"));

    }

    public static Student getStudent(int id) {
        for(int i=0 ; i<student.size() ; i++){
            if(student.get(i).getStudentId()==id){
                return student.get(i);
            }
        }
        return null;
    }


    public String addStudent(Student newStudent) {
        if(student.add(newStudent)){
            return "Student Added Successfully";
        }else{
            return "Student Not Added";
        }
    }

    public List<Student> getAllStudent() {
        return student;
    }
    public Student findStudentDepartment(String dept){
        for(int i=0 ; i<student.size() ; i++){
            if(student.get(i).getDepartment().equals(dept)){
                return student.get(i);
            }
        }
        return null;
    }
    public Student findStudent(int id){
        for(int i=0 ; i<student.size() ; i++){
            if(student.get(i).getStudentId()==id){
                return student.get(i);
            }
        }
        return null;
    }


    public String updateStudentDepartment(Student newStudentDept, String departments) {
        Student st=findStudentDepartment(departments);
        st.setDepartment(newStudentDept.getDepartment());
        return "Updated Successfully";
    }

    public String deleteStudent(int id) {
        Student st=findStudent(id);
        if(student.remove(st)){
            return "deleted";
        }else{
            return "Student Not Found";
        }
    }
}
=======
package com.example.universityEventManagement.service;

import com.example.universityEventManagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class StudentService {
    private static ArrayList<Student> student=new ArrayList<>();
    private static int count = 0;


    static {
        student.add(new Student(++count,"Faisal","Ali",24,"Computer Science"));
        student.add(new Student(++count,"Ramiz","Raza",25,"Petroleum"));
        student.add(new Student(++count,"Ankit","Singh",23,"Civil"));

    }

    public static Student getStudent(int id) {
        for(int i=0 ; i<student.size() ; i++){
            if(student.get(i).getStudentId()==id){
                return student.get(i);
            }
        }
        return null;
    }


    public String addStudent(Student newStudent) {
        if(student.add(newStudent)){
            return "Student Added Successfully";
        }else{
            return "Student Not Added";
        }
    }

    public List<Student> getAllStudent() {
        return student;
    }
    public Student findStudentDepartment(String dept){
        for(int i=0 ; i<student.size() ; i++){
            if(student.get(i).getDepartment().equals(dept)){
                return student.get(i);
            }
        }
        return null;
    }
    public Student findStudent(int id){
        for(int i=0 ; i<student.size() ; i++){
            if(student.get(i).getStudentId()==id){
                return student.get(i);
            }
        }
        return null;
    }


    public String updateStudentDepartment(Student newStudentDept, String departements) {
        Student st=findStudentDepartment(departements);
        st.setDepartment(newStudentDept.getDepartment());
        return "Updated Successfully";
    }

    public String deleteStudent(int id) {
        Student st=findStudent(id);
        if(student.remove(st)){
            return "deleted";
        }else{
            return "Student Not Found";
        }
    }
}
>>>>>>> b8a4edad8d92aee6c0691373c4ff47bb81246d5f

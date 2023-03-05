package com.example.studentPortal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "course_tbl")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
    List<Student> students = new ArrayList<>();
}

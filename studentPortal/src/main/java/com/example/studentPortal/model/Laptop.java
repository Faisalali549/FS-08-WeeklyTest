package com.example.studentPortal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "laptop_tbl")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String name;
    private String brand;
    private String price;
    @OneToOne(fetch = FetchType.LAZY)
    private Student student;
}

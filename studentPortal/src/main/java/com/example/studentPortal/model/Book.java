package com.example.studentPortal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Book_tbl")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Id;
    private String title;
    private String author;
    private String description;
    private String price;

    @ManyToOne
    private Student student;
}

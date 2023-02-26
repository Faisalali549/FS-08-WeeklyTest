package com.example.studentPortal.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;
}

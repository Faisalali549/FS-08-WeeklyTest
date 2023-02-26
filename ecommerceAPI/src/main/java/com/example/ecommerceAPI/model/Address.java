package com.example.ecommerceAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.SecureRandom;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "add_tbl")
public class Address {
    @Id
    @Column(name = "add_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    @Column(name = "name")
    private String name;

    @Column(name = "landmark")
    private String landmark;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "state")
    private String state;

    @JoinColumn(name = "user_Id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User userId;
}

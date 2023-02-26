package com.example.ecommerceAPI.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "order_tbl")
public class Order {
    @Id
    @Column(name = "order_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @JoinColumn(name = "user_Id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User userId;
    @JoinColumn(name = "product_Id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Product productId;

    @JoinColumn(name = "add_Id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Address addressId;
    @Column(name = "product_Qty")
    private int productQuantity;

}

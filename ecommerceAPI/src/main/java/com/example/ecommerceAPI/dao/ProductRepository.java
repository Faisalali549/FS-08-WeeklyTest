package com.example.ecommerceAPI.dao;

import com.example.ecommerceAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

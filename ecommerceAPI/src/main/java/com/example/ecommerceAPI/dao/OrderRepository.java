package com.example.ecommerceAPI.dao;

import com.example.ecommerceAPI.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}

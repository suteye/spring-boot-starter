package com.example.demomysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demomysql.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{
    
}

package com.example.demomysql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demomysql.model.Order;
import com.example.demomysql.repository.OrderRepository;

@Service
@Transactional
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> listAllOrder() {
        return orderRepository.findAll();
    }

    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

    public Order getOrder(int id) {
        return orderRepository.findById(id).get();
    }

    public void deleteOrder(int id) {
        orderRepository.deleteById(id);
    }
}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.broker.producer.TopicProducer;
import com.example.demo.model.Order;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    private final TopicProducer topicProducer;
    
    @Autowired
    private OrderService orderService;

    public OrderController(TopicProducer topicProducer) {
        this.topicProducer = topicProducer;
    }

    @GetMapping("/") 
    public List<Order> getAllOrders() {
        try{
            return orderService.getAllOrders();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error in OrderController.getAllOrders()");
            return null;
        }
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> getOrderById(@PathVariable Integer id) {
        try{
            return ResponseEntity.ok(orderService.getOrderById(id));
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error in OrderController.getOrderById()");
            return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<?> saveOrder(@RequestBody Order order) {
        try{
            orderService.saveOrder(order);
            topicProducer.sendMessage(order);
            return new ResponseEntity<>("Create Purchase Order successfully",HttpStatus.CREATED);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error in OrderController.saveOrder()");
            return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateOrder(@PathVariable Integer id, @RequestBody Order order) {
        try{
            Order existingOrder = orderService.getOrderById(id);
            order.setId(existingOrder.getId());
            orderService.saveOrder(order);
            return new ResponseEntity<>("Update Purchase Order successfully",HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error in OrderController.updateOrder()");
            return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteOrderById(@PathVariable Integer id) {
        try{
            orderService.deleteOrderById(id);
            return new ResponseEntity<>("Delete Purchase Order successfully",HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error in OrderController.deleteOrderById()");
            return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}

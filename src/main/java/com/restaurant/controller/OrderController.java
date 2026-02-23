package com.restaurant.controller;

import com.restaurant.entity.Order;
import com.restaurant.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    // Place Order
    @PostMapping("/place")
    public Order placeOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    // Get Order History by Email
    @GetMapping("/history/{email}")
    public List<Order> getOrderHistory(@PathVariable String email) {
        return orderRepository.findByCustomerEmail(email);
    }
}

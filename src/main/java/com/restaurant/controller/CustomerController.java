package com.restaurant.controller;

import java.util.Optional;
import java.util.List;

import com.restaurant.entity.Customer;
import com.restaurant.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    // ✅ REGISTER
    @PostMapping("/register")
    public String register(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return "Customer registered successfully!";
    }

    // ✅ LOGIN
    @PostMapping("/login")
    public String login(@RequestBody Customer customer) {

        Optional<Customer> existing =
                customerRepository.findByEmail(customer.getEmail());

        if (existing.isPresent() &&
            existing.get().getPassword().equals(customer.getPassword())) {

            return "Login successful!";
        } else {
            return "Invalid credentials!";
        }
    }

    // ✅ GET ALL CUSTOMERS
    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}

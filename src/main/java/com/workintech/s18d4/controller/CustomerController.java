package com.workintech.s18d4.controller;


import com.workintech.s18d4.dto.CustomerResponse;
import com.workintech.s18d4.entity.Customer;
import com.workintech.s18d4.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // Tüm müşterileri döner
    @GetMapping
    public List<Customer> getAll() {
        return customerService.findAll();
    }

    // Belirli bir müşteri ID'sine göre müşteri döner
    @GetMapping("/{id}")
    public Customer get(@PathVariable Long id) {
        return customerService.find(id);
    }

    // Yeni bir müşteri oluşturur
    @PostMapping
    public CustomerResponse save(@RequestBody Customer customer) {
        Customer saved = this.customerService.save(customer);
        return new CustomerResponse(saved.getId(), saved.getEmail(), saved.getSalary());
    }


}
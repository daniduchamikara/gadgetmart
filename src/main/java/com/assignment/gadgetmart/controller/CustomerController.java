package com.assignment.gadgetmart.controller;

import com.assignment.gadgetmart.domain.model.Customer;
import com.assignment.gadgetmart.domain.model.User;
import com.assignment.gadgetmart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Dani
 */
@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;
    
    @PostMapping("/register-customer")
    public int registerCustomer(@RequestBody Customer customer){
        return customerService.registerCustomer(customer);
    }
    
    @PutMapping("/updated-customer")
    public int updatedCustomer(@RequestBody Customer customer){
        return customerService.updatedCustomer(customer);
    }
    
    @GetMapping("/get-customer")
    public Customer getCustomer(@PathVariable String email){
        return customerService.getCustomer(email);
    }

    @PostMapping(path = "/login")
    public User loginUser(@RequestBody User data) {return customerService.loginUser(data);}

    @PostMapping("/register-user")
    public int registerCustomer(@RequestBody User user){
        return customerService.registerUser(user);
    }

}

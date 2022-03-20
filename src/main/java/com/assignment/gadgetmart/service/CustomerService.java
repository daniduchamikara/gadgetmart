package com.assignment.gadgetmart.service;

import com.assignment.gadgetmart.domain.model.Customer;
import com.assignment.gadgetmart.domain.model.User;

/**
 * @author Dani
 */
public interface CustomerService {
    int registerCustomer(Customer customer);
    int registerUser(User user);
    int updatedCustomer(Customer customer);
    Customer getCustomer(String email);
    public User loginUser(User data);
    
}

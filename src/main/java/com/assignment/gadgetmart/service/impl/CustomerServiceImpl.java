package com.assignment.gadgetmart.service.impl;

import com.assignment.gadgetmart.domain.model.Customer;
import com.assignment.gadgetmart.domain.model.User;
import com.assignment.gadgetmart.repository.CustomerRepository;
import com.assignment.gadgetmart.repository.UserRepositary;
import com.assignment.gadgetmart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dani
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    UserRepositary userRepositary;
    
    @Override
    public int registerCustomer(Customer customer) {
        Customer res=customerRepository.save(customer);
        System.out.println(res);
        return 1;
    }

    @Override
    public int registerUser(User user) {
        userRepositary.save(user);
        return 1;
    }

    @Override
    public int updatedCustomer(Customer customer) {
//        return customerRepository.updatedCustomer(customer);
        return 0;
    }

    @Override
    public Customer getCustomer(String email) {
//        return customerRepository.getCustomer(email);
        return null;
    }

    @Override
    public User loginUser(User data) {
//        return customerRepository.loginUser(data);
        User user= userRepositary.findByEmailAndPassword(data.getEmail(),data.getPassword());
        return user;
    }
}

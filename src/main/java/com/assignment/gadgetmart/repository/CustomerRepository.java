package com.assignment.gadgetmart.repository;

import com.assignment.gadgetmart.domain.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dani
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    
//    int registerCustomer(Customer customer);
//    int updatedCustomer(Customer customer);
//    Customer getCustomer(String email);
//    public User loginUser(User data);
}

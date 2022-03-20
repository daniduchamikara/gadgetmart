package com.assignment.gadgetmart.repository;

import com.assignment.gadgetmart.domain.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dani
 */
@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

}

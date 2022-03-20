package com.assignment.gadgetmart.repository;

import com.assignment.gadgetmart.domain.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepositary extends JpaRepository<OrderDetail,Integer> {

     public OrderDetail findByOrderId(int id);
}

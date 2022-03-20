package com.assignment.gadgetmart.service;

import com.assignment.gadgetmart.domain.dto.OrderDto;
import com.assignment.gadgetmart.domain.model.Order;

import java.util.List;

/**
 * @author Dani
 */
public interface OrderServer {
    Order placeOrder(OrderDto orderDto);
    List<OrderDto> getAllOrders(String email);
}

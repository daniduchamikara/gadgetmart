package com.assignment.gadgetmart.controller;

import com.assignment.gadgetmart.domain.dto.OrderDto;
import com.assignment.gadgetmart.domain.model.Order;
import com.assignment.gadgetmart.service.OrderServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Dani
 */
@RestController
@CrossOrigin
@RequestMapping("/Order")
public class OrderController {
    
    @Autowired
    private OrderServer orderServer;
    
    @PostMapping("/place-order")
    public Order placeOrder(@RequestBody OrderDto order){
        return orderServer.placeOrder(order);
    }
    
    @GetMapping("/get-all-orders")
    public List<OrderDto> getAllOrders(String email){
        return orderServer.getAllOrders(email);
    }

    @GetMapping("/get-all-orders-by-email/email")
    public List<OrderDto> getAllOrdersByEmail(@PathVariable String email){
        return orderServer.getAllOrders(email);
    }
}

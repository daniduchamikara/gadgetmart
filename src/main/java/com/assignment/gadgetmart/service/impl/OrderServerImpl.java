package com.assignment.gadgetmart.service.impl;

import com.assignment.gadgetmart.domain.dto.OrderDetailDto;
import com.assignment.gadgetmart.domain.dto.OrderDto;
import com.assignment.gadgetmart.domain.model.Order;
import com.assignment.gadgetmart.domain.model.OrderDetail;
import com.assignment.gadgetmart.repository.OrderDetailRepositary;
import com.assignment.gadgetmart.repository.OrderRepository;
import com.assignment.gadgetmart.service.OrderServer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Dani
 */
@Service
public class OrderServerImpl implements OrderServer {

    OrderRepository orderRepository;
    OrderDetailRepositary orderDetailRepositary;

    public OrderServerImpl(OrderRepository orderRepository, OrderDetailRepositary orderDetailRepositary) {
        this.orderRepository = orderRepository;
        this.orderDetailRepositary = orderDetailRepositary;
    }

    @Override
    public Order placeOrder(OrderDto orderDto) {
        Order order = new Order();
        OrderDetail orderDetail=new OrderDetail();

        order.setStatus("1");
        order.setDate(orderDto.getDate());
        order.setAmount(orderDto.getAmount());
        order.setAddressLine1(orderDto.getAddressLine1());
        order.setAddressLine2(orderDto.getAddressLine2());
        order.setAddressLine3(orderDto.getAddressLine3());
        order.setMobile(orderDto.getMobile());
        order.setEmail(orderDto.getEmail());

        Order orderres=orderRepository.save(order);
        for (OrderDetailDto orderDetailDto : orderDto.getOrderDetail())
        {
            orderDetail.setCustomer(orderDto.getCustomer().getCustomerId());
            orderDetail.setOrderId(String.valueOf(orderres.getOrderId()));
            orderDetail.setDate(new Date());
            orderDetail.setQty(orderDetailDto.getQty());
            orderDetail.setProductId(orderDetailDto.getProduct().getId());
            orderDetail.setAmount(Double.parseDouble(orderDetailDto.getAmount()));
            orderDetailRepositary.save(orderDetail);
        }

        return order;
    }

    @Override
    public List<OrderDto> getAllOrders(String email) {
        List<Order> ordeList= orderRepository.findAll();

        List<OrderDto> orderDtoList=new ArrayList<>();
        for (Order order : ordeList) {
            OrderDto orderDto=new OrderDto();
            orderDto.setOrderId(order.getOrderId());
            orderDto.setAmount(order.getAmount());
            orderDto.setDate(order.getDate());
            orderDto.setEmail(order.getEmail());
            orderDtoList.add(orderDto);
        }

        return orderDtoList;
    }
}

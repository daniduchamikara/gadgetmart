package com.assignment.gadgetmart.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderDetailDto {
    String amount;
    String itemId;
    String orderDetailId;
    String qty;
    ProductDto product;
}

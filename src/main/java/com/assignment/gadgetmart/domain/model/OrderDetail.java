package com.assignment.gadgetmart.domain.model;

import com.assignment.gadgetmart.domain.model.Product;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Dani
 */
@Data
@Entity
@Table(name = "OrderDetail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderDetailId;
    private String customer;
    private String orderId;
    private String productId;
    private String qty;
    private double amount;
    private Date date;
}

package com.assignment.gadgetmart.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * @author Dani
 */
@Data
@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private String date;
    private double amount;
    private String status;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String mobile;
    private String email;
}

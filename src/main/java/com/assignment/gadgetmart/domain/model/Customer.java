package com.assignment.gadgetmart.domain.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Dani
 */
@Data
@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String name;
    private String address;
    private String email;
}

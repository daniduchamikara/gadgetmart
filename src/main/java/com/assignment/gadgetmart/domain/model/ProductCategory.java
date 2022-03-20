package com.assignment.gadgetmart.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ProductCat")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;

}

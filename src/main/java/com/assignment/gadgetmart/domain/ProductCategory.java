package com.assignment.gadgetmart.domain;

import lombok.Data;

/**
 * @author Dani
 */
@Data
public class ProductCategory {
    private String id;
    private String name;
    private String createUser;
    private String status;
    private String categoryImage;
}

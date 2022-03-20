package com.assignment.gadgetmart.domain.dto;

import com.assignment.gadgetmart.domain.ProductImage;
import com.assignment.gadgetmart.domain.model.ProductCategory;
import lombok.Data;

import java.util.List;

/**
 * @author Dani on 7/4/2020 9:46 PM
 */
@Data
public class ProductMapDto {
    private String id;
    private String name;
    private String description;
    private long qtyOnHand;
    private double unitPrice;
    private String create_user_id;
    private String statusId;
    private ProductCategory product_category;
    private List<ProductImage> productImageList;
   
}

package com.assignment.gadgetmart.service;

import com.assignment.gadgetmart.domain.model.Product;
import com.assignment.gadgetmart.domain.model.ProductCategory;

import java.util.List;

/**
 * @author Dani
 */
public interface ProductService {
    
    List<Product> getProductList();
    List<Product> getProductsByCategory(String categoryId);
    List<Product> getProductsByName(String name);
    List<ProductCategory> getAllCategory();
}

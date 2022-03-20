package com.assignment.gadgetmart.connector;

import com.assignment.gadgetmart.domain.model.Product;

import java.util.List;

/**
 * @author Dani
 */
public interface Connector {
    
    List<Product> getAllProduct();
    
}

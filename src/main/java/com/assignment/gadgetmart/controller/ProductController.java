package com.assignment.gadgetmart.controller;



import com.assignment.gadgetmart.domain.model.Product;
import com.assignment.gadgetmart.domain.model.ProductCategory;
import com.assignment.gadgetmart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Dani
 */
@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {
    
    @Autowired
    ProductService productService;
    
    @GetMapping("/product-list")
    public List<Product> getProductList(){
        return productService.getProductList();
    }
    
    @GetMapping("/products-by-category/{categoryId}")
    public List<Product> getProductsByCategory(@PathVariable String categoryId){
        return productService.getProductsByCategory(categoryId);
    }


    @GetMapping("/products-by-name/{name}")
    public List<Product> getProductsByName(@PathVariable String name){
        return productService.getProductsByName(name);
    }


    @GetMapping("/get-all-cat")
    public List<ProductCategory> getAllCategory(){
        return productService.getAllCategory();
    }

}

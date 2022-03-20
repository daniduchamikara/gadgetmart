package com.assignment.gadgetmart.service.impl;

import com.assignment.gadgetmart.domain.model.ProductCategory;
import com.assignment.gadgetmart.repository.ProductCategoryRepository;
import com.assignment.gadgetmart.service.ProductCategoryService;

import java.util.List;

public class ProductCategoryServiceImpl implements ProductCategoryService {
    ProductCategoryRepository productCategoryRepository;

    public ProductCategoryServiceImpl(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }

    @Override
    public List<ProductCategory> getAllCategory() {
        return productCategoryRepository.findAll();
    }
}

package com.assignment.gadgetmart.repository;

import com.assignment.gadgetmart.domain.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
}

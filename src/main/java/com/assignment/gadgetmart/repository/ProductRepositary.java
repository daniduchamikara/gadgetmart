package com.assignment.gadgetmart.repository;

import com.assignment.gadgetmart.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepositary extends JpaRepository<Product,Integer> {

    List<Product> findByProductCat(String cat);
    List<Product> findByName(String name);
}

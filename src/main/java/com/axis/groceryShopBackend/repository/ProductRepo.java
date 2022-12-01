package com.axis.groceryShopBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.groceryShopBackend.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}

package com.axis.groceryShopBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.groceryShopBackend.entity.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer>{
	
	Category findByCategoryName(String categoryName);

}

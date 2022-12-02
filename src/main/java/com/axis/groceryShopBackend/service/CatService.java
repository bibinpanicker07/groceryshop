package com.axis.groceryShopBackend.service;

import java.util.List;
import java.util.Optional;



import com.axis.groceryShopBackend.entity.Category;


public interface CatService {
	

	
	public void createCategory(Category category);
	public Category readCategory(String categoryName);
	public Optional<Category> readCategory(Integer categoryId);
	public void updateCategory(Integer categoryID, Category newCategory);
	public void deleteCategory(String categoryName);
	public List<Category> listCategories();
	

}

package com.axis.groceryShopBackend.service;

import org.springframework.stereotype.Service;

import com.axis.groceryShopBackend.entity.Category;
import com.axis.groceryShopBackend.repository.CategoryRepo;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class CategoryService {

	private final CategoryRepo categoryrepository;

	public CategoryService(CategoryRepo categoryrepository) {
		this.categoryrepository = categoryrepository;
	}

	public List<Category> listCategories() {
		return categoryrepository.findAll();
	}

	public void createCategory(Category category) {
		categoryrepository.save(category);
	}

	public Category readCategory(String categoryName) {
		return categoryrepository.findByCategoryName(categoryName);
	}

	public Optional<Category> readCategory(Integer categoryId) {
		return categoryrepository.findById(categoryId);
	}

	public void updateCategory(Integer categoryID, Category newCategory) {
		Category category = categoryrepository.findById(categoryID).get();
		category.setCategoryName(newCategory.getCategoryName());
		category.setDescription(newCategory.getDescription());
		//category.setProducts(newCategory.getProducts());
		category.setImageUrl(newCategory.getImageUrl());

		categoryrepository.save(category);
	}
	
	public void deleteCategory(String categoryName) {
		categoryrepository.deleteById(categoryrepository.findByCategoryName(categoryName).getId());
		
	}
}

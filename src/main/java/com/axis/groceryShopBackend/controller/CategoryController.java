package com.axis.groceryShopBackend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.axis.groceryShopBackend.entity.Category;
import com.axis.groceryShopBackend.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired 
	CategoryService categoryService;
	
	@GetMapping("/")
    public ResponseEntity<List<Category>> getCategories() {
        List<Category> body = categoryService.listCategories();
        return new ResponseEntity<List<Category>>(body, HttpStatus.OK);
    }
	@GetMapping("/{categoryName}")
	public ResponseEntity<Category> getCategoryByName(@PathVariable String categoryName) {
		Category body=categoryService.readCategory(categoryName);
		return new ResponseEntity<Category>(body, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> createCategory(@RequestBody Category category) {
		categoryService.createCategory(category);
		return new ResponseEntity<String>("Category Addeed Successfully",HttpStatus.OK);
	}
	
	@DeleteMapping("/{categoryName}")
	public ResponseEntity<String> deleteCategoryByName(@PathVariable String categoryName){
		categoryService.deleteCategory(categoryName);
		return new ResponseEntity<String>("Category with ID: "+categoryName+" deleted",HttpStatus.OK);
	}
		
	
	@PostMapping("/update/{categoryID}")
	public ResponseEntity<String> updateCategory(@PathVariable("categoryID") Integer categoryID, @Valid @RequestBody Category category) {
		// Check to see if the category exists.
		if (categoryID==category.getId()) {
			// If the category exists then update it.
			categoryService.updateCategory(categoryID, category);
			return new ResponseEntity<String>("Category updated successfully", HttpStatus.OK);
		}

		// If the category doesn't exist then return a response of unsuccessful.
		return new ResponseEntity<String>("category does not exist", HttpStatus.NOT_FOUND);
	}
	

}

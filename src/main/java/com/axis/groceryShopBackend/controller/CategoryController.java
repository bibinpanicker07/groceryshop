package com.axis.groceryShopBackend.controller;

import java.util.List;
import java.util.Optional;

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
import com.axis.groceryShopBackend.service.CatService;




@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired 
	CatService categoryService;
	
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
		Optional<Category> categoryOpt = Optional.ofNullable((categoryService.readCategory(category.getCategoryName())));
		if(!categoryOpt.isPresent())
			return new ResponseEntity<String>("category already exists", HttpStatus.CONFLICT);
		categoryService.createCategory(category);
		return new ResponseEntity<String>("Category Created Successfully",HttpStatus.OK);
	}
	
	@DeleteMapping("/{categoryName}")
	public ResponseEntity<String> deleteCategoryByName(@PathVariable String categoryName){
		categoryService.deleteCategory(categoryName);
		return new ResponseEntity<String>("Category with ID: "+categoryName+" deleted",HttpStatus.OK);
	}
		
	
	@PostMapping("/update/{categoryID}")
	public ResponseEntity<String> updateCategory(@PathVariable("categoryID") Integer categoryID, @Valid @RequestBody Category category) {
		
		Optional<Category> categoryOpt = categoryService.readCategory(categoryID);
		if(categoryOpt.isPresent()) {
			categoryService.updateCategory(categoryID, category);
			return new ResponseEntity<String>("updated the category", HttpStatus.OK);
		}
		return new ResponseEntity<String>("category does not exist", HttpStatus.NOT_FOUND);
	}
	

}

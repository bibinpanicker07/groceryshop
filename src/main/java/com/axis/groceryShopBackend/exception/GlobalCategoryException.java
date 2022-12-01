package com.axis.groceryShopBackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalCategoryException {

	@ExceptionHandler(value = CategoryNotFoundException.class)
	public ResponseEntity<String> CategoryNotFoundExceptionHandler(CategoryNotFoundException ex){
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	
}

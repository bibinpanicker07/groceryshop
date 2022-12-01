package com.axis.groceryShopBackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalProductException {

	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<String> ProductNotFoundExceptionHandler(ProductNotFoundException ex){
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	
}

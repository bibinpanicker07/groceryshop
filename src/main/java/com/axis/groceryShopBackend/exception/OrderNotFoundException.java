package com.axis.groceryShopBackend.exception;

public class OrderNotFoundException extends IllegalArgumentException{
	public OrderNotFoundException(String msg) {
        super(msg);
    }
}

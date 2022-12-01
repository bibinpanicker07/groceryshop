package com.axis.groceryShopBackend.entity;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date createdDate;
	//private Product product;
	//private User user;
	 private int quantity;
	 
	 
	 
	 
	public Cart() {
		super();
	}
	
	
	public Cart(Integer id, Date createdDate, int quantity) {
		super();
		this.id = id;
		this.createdDate = createdDate;
		this.quantity = quantity;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}

package com.axis.groceryShopBackend.entity;

import java.util.Date;


import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
public class OrderItem {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    private @NotNull int quantity;
	    private @NotNull double price;
	    private Date createdDate;

	    @ManyToOne
	    @JsonIgnore
	    @JoinColumn(name = "order_id", referencedColumnName = "id")
	    private Order order;

		public OrderItem() {
			super();
		}

		public OrderItem(Integer id, @NotNull int quantity, @NotNull double price, Date createdDate, Order order) {
			super();
			this.id = id;
			this.quantity = quantity;
			this.price = price;
			this.createdDate = createdDate;
			this.order = order;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public Date getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}

		public Order getOrder() {
			return order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}

		@Override
		public String toString() {
			return "OrderItem [id=" + id + ", quantity=" + quantity + ", price=" + price + ", createdDate="
					+ createdDate + ", order=" + order + "]";
		}

//	    @OneToOne
//	    @JoinColumn(name = "product_id", referencedColumnName = "id")
//	    private Product product;
	    
	    
	    
	    
}

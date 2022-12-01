package com.axis.groceryShopBackend.entity;

import java.util.Date;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="orders")
public class Order {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;


	    @Column(name = "created_date")
	    private Date createdDate;

	    @Column(name = "total_price")
	    private Double totalPrice;

	    @Column(name = "session_id")
	    private String sessionId;

	    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
	    private List<OrderItem> orderItems;

		public Order() {
			super();
		}

		public Order(Integer id, Date createdDate, Double totalPrice, String sessionId, List<OrderItem> orderItems) {
			super();
			this.id = id;
			this.createdDate = createdDate;
			this.totalPrice = totalPrice;
			this.sessionId = sessionId;
			this.orderItems = orderItems;
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

		public Double getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(Double totalPrice) {
			this.totalPrice = totalPrice;
		}

		public String getSessionId() {
			return sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public List<OrderItem> getOrderItems() {
			return orderItems;
		}

		public void setOrderItems(List<OrderItem> orderItems) {
			this.orderItems = orderItems;
		}

		@Override
		public String toString() {
			return "Order [id=" + id + ", createdDate=" + createdDate + ", totalPrice=" + totalPrice + ", sessionId="
					+ sessionId + ", orderItems=" + orderItems + "]";
		}

//	    @ManyToOne()
//	    @JsonIgnore
//	    @JoinColumn(name = "user_id", referencedColumnName = "id")
//	    private User user;
	    
	    
}

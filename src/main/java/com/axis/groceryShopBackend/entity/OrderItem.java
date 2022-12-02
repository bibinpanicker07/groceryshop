//package com.axis.groceryShopBackend.entity;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToOne;
//
//import javax.validation.constraints.NotNull;
//import java.util.Date;
//
//@Entity
//
//public class OrderItem {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//
//    private @NotNull int quantity;
//
//    private @NotNull double price;
//
//
//    private Date createdDate;
//
//    @ManyToOne
//    @JsonIgnore
//    private Order order;
//
//    @OneToOne
//    private Product product;
//
//    public OrderItem(){}
//
//    public OrderItem(Order order, @NotNull Product product, @NotNull int quantity, @NotNull double price) {
//        this.product = product;
//        this.quantity = quantity;
//        this.price = price;
//        this.order= order;
//        this.createdDate = new Date();
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public Date getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Date createdDate) {
//        this.createdDate = createdDate;
//    }
//
//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }
//}

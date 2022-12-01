package com.axis.groceryShopBackend.service;

import java.util.List;

import org.hibernate.Session;

import com.axis.groceryShopBackend.entity.Order;

public interface OrderInterface {
	
	//void placeOrder(User user, String sessionId);
	//List<Order> listOrders(User user);
	Order getOrder(Integer orderId);
}

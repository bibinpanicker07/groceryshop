package com.axis.groceryShopBackend.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.groceryShopBackend.entity.OrderItem;
import com.axis.groceryShopBackend.repository.OrderItemRepo;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class OrderItemServiceImpl implements OrderItemInterface{
	@Autowired
    private OrderItemRepo orderItemsRepository;
	@Override
	public void addOrderedProducts(OrderItem orderItem) {
		// TODO Auto-generated method stub
		orderItemsRepository.save(orderItem);
	}

}

package com.axis.groceryShopBackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.groceryShopBackend.entity.Order;



@Repository
public interface OrderRepo extends JpaRepository<Order, Integer>{
	//List<Order> findAllByUserOrderByCreatedDateDesc(User user);
}

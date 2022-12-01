package com.axis.groceryShopBackend.service;



import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.groceryShopBackend.entity.Order;
import com.axis.groceryShopBackend.exception.OrderNotFoundException;
import com.axis.groceryShopBackend.repository.OrderItemRepo;
import com.axis.groceryShopBackend.repository.OrderRepo;


import jakarta.transaction.Transactional;
@Service
@Transactional
public class OrderServieImpl implements OrderInterface {

//    @Autowired
//    private CartService cartService;

    @Autowired
    OrderRepo orderRepository;

    @Autowired
    OrderItemRepo orderItemsRepository;

	@Override
	public Order getOrder(Integer orderId) throws OrderNotFoundException {
		// TODO Auto-generated method stub
		 Optional<Order> order = orderRepository.findById(orderId);
	        if (order.isPresent()) {
	            return order.get();
	        }
	        throw new OrderNotFoundException("Order not found");
	    }
	
//	 public List<Order> listOrders(User user) {
//	        return orderRepository.findAllByUserOrderByCreatedDateDesc(user);
//	    }
	
	
//	public void placeOrder(User user, String sessionId) {
//       
//
//       
//
//        // create the order and save it
//        Order newOrder = new Order();
//        newOrder.setCreatedDate(new Date());
//        newOrder.setSessionId(sessionId);
//        newOrder.setUser(user);
//       
//        orderRepository.save(newOrder);
//
//        //
//        //cartService.deleteUserCartItems(user);
//    }

}

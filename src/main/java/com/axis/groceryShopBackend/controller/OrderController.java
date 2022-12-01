package com.axis.groceryShopBackend.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.groceryShopBackend.service.OrderInterface;



@RestController
@RequestMapping("/order")
public class OrderController {
	 @Autowired
	    private OrderInterface orderService;

	    


	  

}

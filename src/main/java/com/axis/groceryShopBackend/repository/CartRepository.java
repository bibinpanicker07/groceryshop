package com.axis.groceryShopBackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.groceryShopBackend.entity.Cart;



@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

    //List<Cart> findAllByUserOrderByCreatedDateDesc(User user);

    //List<Cart> deleteByUser(User user);

}

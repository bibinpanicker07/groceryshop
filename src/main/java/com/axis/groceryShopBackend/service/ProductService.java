package com.axis.groceryShopBackend.service;

import java.util.List;

import com.axis.groceryShopBackend.entity.Product;



public interface ProductService {
	
	Product getProductById(Integer productID);
	List<Product> getAllProducts();
	void saveProduct(Product product);
	void updateProduct(Integer productID,Product updatedProduct);
	void deleteProductById(Integer ProductID);
	

}

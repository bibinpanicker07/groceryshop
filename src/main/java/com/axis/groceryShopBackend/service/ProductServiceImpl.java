package com.axis.groceryShopBackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.axis.groceryShopBackend.entity.Product;
import com.axis.groceryShopBackend.exception.ProductNotFoundException;
import com.axis.groceryShopBackend.repository.ProductRepo;

public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepo productRepo;

	@Override
	public Product getProductById(Integer productID) {
		Optional<Product> carOpt = productRepo.findById(productID);
		if(!carOpt.isPresent())
			throw new ProductNotFoundException("Product with ID : "+productID+" not found.");
		return carOpt.get();
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		productRepo.save(product);
	}

	@Override
	public void updateProduct(Integer productID, Product updatedProduct) {
		// TODO Auto-generated method stub
		productRepo.save(updatedProduct);
	}

	@Override
	public void deleteProductById(Integer ProductID) {
		// TODO Auto-generated method stub
		productRepo.deleteById(ProductID);
		
	}

}

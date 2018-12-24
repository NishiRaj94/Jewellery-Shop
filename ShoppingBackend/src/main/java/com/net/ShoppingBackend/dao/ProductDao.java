package com.net.ShoppingBackend.dao;


import java.util.List;

import com.net.ShoppingBackend.model.Product;


public interface ProductDao {
	public boolean addProduct(Product product);
	public List<Product> listAllProduct();
	  boolean updateProduct(Product product);
	  boolean deleteProduct(String productId);
	 public  Product getProduct(String productId);
	   public List<Product> getproductByCategory(String cat_id);
}

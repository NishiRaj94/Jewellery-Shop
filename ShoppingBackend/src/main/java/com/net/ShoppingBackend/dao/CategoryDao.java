package com.net.ShoppingBackend.dao;

import java.util.List;

import com.net.ShoppingBackend.model.Category;

public interface CategoryDao {

	 boolean addCategory(Category category);
	List<Category> listAllCategory();
	 boolean updateCategory(Category category);
 boolean deleteCategory(String cat_id);
	 Category getCategory(String cat_id);
}

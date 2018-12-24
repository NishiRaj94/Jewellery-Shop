package com.net.ShoppingBackend.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.net.ShoppingBackend.model.Category;
import com.net.ShoppingBackend.model.Product;
@Repository("categoryDao")
@Transactional

public class CategoryDaoImpl implements CategoryDao {

@Autowired
SessionFactory sessionFactory;

public boolean addCategory(Category category) { 
		Session s=sessionFactory.getCurrentSession();
		category.setCat_id(category.getCategoryName());
		s.persist(category);
		return true;
	}

	public List<Category> listAllCategory() {
		Session s=sessionFactory.getCurrentSession();
		Query q= s.createQuery("from Category");
		List<Category> List=(List<Category>)q.getResultList();
		return List;
	}

	public boolean updateCategory(Category category) {
		sessionFactory.getCurrentSession().update(category);
        return true;
	}
	public boolean deleteCategory(String cat_id) {
		Session s=sessionFactory.getCurrentSession();
		 s.delete(getCategory(cat_id));	
		return true;
}

	 public Category getCategory(String cat_id) {
		 Session s=sessionFactory.getCurrentSession();
	Category category=(Category) s.get(Category.class, cat_id);
	return category;

	} 
	
	}


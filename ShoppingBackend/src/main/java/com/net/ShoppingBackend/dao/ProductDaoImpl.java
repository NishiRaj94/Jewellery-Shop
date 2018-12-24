package com.net.ShoppingBackend.dao;

import java.util.List;


import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.net.ShoppingBackend.model.Product;



@Repository("productDao")
@Transactional

public class ProductDaoImpl implements ProductDao {
	@Autowired
	SessionFactory sessionFactory;
	

	public boolean addProduct(Product product) {
		Session s=sessionFactory.getCurrentSession();
		s.save(product);
			return true;
		}
		
	public boolean updateProduct(Product product) {

		Session s=sessionFactory.getCurrentSession();
		s.update(product);	
		// TODO Auto-generated method stub
		return true;
	}
	

	public boolean deleteProduct(String productId) {

		Session s=sessionFactory.getCurrentSession();
		s.delete(getProduct((productId)));	
		return true;
		// TODO Auto-generated method stub
		
	}


	public Product getProduct(String productId) {

		Session s=sessionFactory.getCurrentSession();
		Product product=(Product) s.get(Product.class,productId);
		return product;
		
	}
	public List<Product> listAllProduct() {

		Session s=sessionFactory.getCurrentSession();
	Query q= s.createQuery("from Product");
	List<Product> List=(List<Product>)q.getResultList();
	return List;
	
	}
	
	
	 public List<Product> getproductByCategory(String cat_id)
	 {
		 return (List<Product>)sessionFactory.getCurrentSession().createQuery("from Product").list();
	 }

}




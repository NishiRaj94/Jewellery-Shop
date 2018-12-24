package com.net.ShoppingBackend.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.net.ShoppingBackend.model.Category;
import com.net.ShoppingBackend.model.Supplier;
import com.net.ShoppingBackend.model.User;

@Repository("userDao")
@Transactional
public class UserDaoImpl implements UserDao {
@Autowired

private SessionFactory sessionFactory;
	
	public boolean addUser(User user) {
	
		Session s=sessionFactory.getCurrentSession();
		user.getBillingAddress().setUser(user);
		user.getShippingAddress().setUser(user);
		user.setU_username(user.getU_firstname());
		s.persist(s);
		s.persist(user.getBillingAddress());
		s.persist(user.getShippingAddress());
		return true;
	
	
	}

	
	public List<User> list() {

		Session s=sessionFactory.getCurrentSession();
	Query q= s.createQuery("from Suplier");
	List<User> list=q.getResultList();
	return list;
	}

		// TODO Auto-generated method stub



	public boolean delete(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

}

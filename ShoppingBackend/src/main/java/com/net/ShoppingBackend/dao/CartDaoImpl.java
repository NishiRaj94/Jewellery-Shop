/*package com.net.ShoppingBackend.dao;

import java.util.List;

import javax.management.Query;
import javax.transaction.Transactional;
import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.hibernate.query.QueryProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.net.ShoppingBackend.model.Cart;
@Repository("cartDao")
@Transactional
public class CartDaoImpl implements CartDao {

	@Autowired
	SessionFactory sessionFactory;
	public List<Cart> listAllCart() {
	Session s=(Session) sessionFactory.getCurrentSession();
	Query query= s.createQuery("from Cart");
		List<Cart> List=(List<Cart>)query.getResultList();
		return List;
	}

	@Override
	public boolean addCart(Cart cart) {

		org.hibernate.Session s=sessionFactory.getCurrentSession();
		cart.setId(cart.getU_username());
		s.persist(cart);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCart(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cart getCart(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
*/

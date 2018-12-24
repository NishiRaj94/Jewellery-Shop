package com.net.ShoppingBackend.dao;
import java.util.List;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.net.ShoppingBackend.model.Supplier;
@Repository("suplierDao")
@Transactional
public class SuplierDaoImpl implements SuplierDao {
	@Autowired
	SessionFactory sessionFactory;
		
	public boolean addSuplier(Supplier suplier) {
		Session s=sessionFactory.getCurrentSession();
		suplier.setSuplierId(suplier.getSuplierName());
		s.persist(suplier);
		return true;
	}

	public List<Supplier> listAllSuplier() {
		
		Session s=sessionFactory.getCurrentSession();
	Query q= s.createQuery("from Supplier");
	List<Supplier> list=(List<Supplier>)q.getResultList();
	return list;
	}
	
	public boolean updateSuplier(Supplier suplier) {
		Session s=sessionFactory.getCurrentSession();
		s.update(suplier);	
		
		return true;
	}


	public boolean deleteSuplier(String suplierId) {
		Session s=sessionFactory.getCurrentSession();
		s.delete(getSuplier(suplierId));	
		return true;
		 
	
	}

		public Supplier getSuplier(String suplierId) {
		Session s=sessionFactory.getCurrentSession();
		Supplier suplier=(Supplier) s.get(Supplier.class,  suplierId);
		return suplier;

		
	}		
	
}

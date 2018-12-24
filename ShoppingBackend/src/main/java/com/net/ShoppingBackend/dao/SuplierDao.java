package com.net.ShoppingBackend.dao;
import java.util.List;
import com.net.ShoppingBackend.model.Supplier;

public interface SuplierDao {
	boolean addSuplier(Supplier suplier);
	List<Supplier> listAllSuplier();
	boolean updateSuplier(Supplier suplier);
	boolean deleteSuplier(String suplierId);
	Supplier getSuplier(String suplierId);
}

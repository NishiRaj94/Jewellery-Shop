package com.net.ShoppingBackend.dao;

import java.util.List;

import com.net.ShoppingBackend.model.User;

public interface UserDao {
	boolean addUser(User user);
	List<User> list();
	boolean delete(int userId);

}


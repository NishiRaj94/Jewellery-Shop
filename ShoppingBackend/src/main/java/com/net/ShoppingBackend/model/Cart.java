package com.net.ShoppingBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Entity
@Component

public class Cart {
@Id
private int id;
private String username;

@Column(name = "product_name")
private String productName;
private int quantity;

private long price;
private int u_username;
@ManyToOne
@JoinColumn(name = "u_userId", nullable = false, updatable = false, insertable = false)
private User user;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
public int getU_username() {
	return u_username;
}
public void setU_username(int u_username) {
	this.u_username = u_username;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}

}

package com.net.ShoppingBackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="C_User")
public class User {
	@Id
	
	private int u_userId;
	 private String u_username;
	 private String u_password;
	 private String u_firstname;
	 private String u_lastname;
	 private String u_email;
	 private int u_phone;
	 private int u_address;
	 @OneToOne
	 @JoinColumn(name="shippingId")
	 ShippingAddress shippingAddress;
	 @OneToOne
	 @JoinColumn(name="billingId")
	 BillingAddress billingAddress;
	 
	public int getU_userId() {
		return u_userId;
	}
	public void setU_userId(int u_userId) {
		this.u_userId = u_userId;
	}
	public String getU_username() {
		return u_username;
	}
	public void setU_username(String u_username) {
		this.u_username = u_username;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public String getU_firstname() {
		return u_firstname;
	}
	public void setU_firstname(String u_firstname) {
		this.u_firstname = u_firstname;
	}
	public String getU_lastname() {
		return u_lastname;
	}
	public void setU_lastname(String u_lastname) {
		this.u_lastname = u_lastname;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public int getU_phone() {
		return u_phone;
	}
	public void setU_phone(int u_phone) {
		this.u_phone = u_phone;
	}
	public int getU_address() {
		return u_address;
	}
	public void setU_address(int u_address) {
		this.u_address = u_address;
	}
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public BillingAddress getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}
	
	

}

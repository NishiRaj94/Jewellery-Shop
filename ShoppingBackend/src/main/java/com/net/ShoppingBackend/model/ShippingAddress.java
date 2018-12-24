package com.net.ShoppingBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class ShippingAddress {
	@Id
	@Column(unique=true)
	private int shippingId;
	private String apartNo;
	private String streetName;
	private String city;
	private String state;
	@OneToOne
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getShippingId() {
		return shippingId;
	}
	public void setShippingId(int shippingId) {
		this.shippingId = shippingId;
	}
	public String getApartNo() {
		return apartNo;
	}
	public void setApartNo(String apartNo) {
		this.apartNo = apartNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public float getPincode() {
		return pincode;
	}
	public void setPincode(float pincode) {
		this.pincode = pincode;
	}
	private float pincode;
	

}

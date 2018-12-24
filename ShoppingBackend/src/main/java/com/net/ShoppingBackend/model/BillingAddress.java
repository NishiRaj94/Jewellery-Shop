package com.net.ShoppingBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity
@Component

public class BillingAddress {
	@Id
	@Column(unique=true)
private int billingId;
private String apartNo;
private String flatNo;
private String City;
private String state;
private String pincode;
@OneToOne
private User user;



public int getBillingId() {
	return billingId;
}
public void setBillingId(int billingId) {
	this.billingId = billingId;
}
public String getApartNo() {
	return apartNo;
}
public void setApartNo(String apartNo) {
	this.apartNo = apartNo;
}
public String getFlatNo() {
	return flatNo;
}
public void setFlatNo(String flatNo) {
	this.flatNo = flatNo;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}


}

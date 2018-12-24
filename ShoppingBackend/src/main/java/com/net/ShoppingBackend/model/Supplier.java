package com.net.ShoppingBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component

public class Supplier {
	@Id
	private String suplierId;
	private String suplierName;
	private String  supLocation;
	public String getSuplierName() {
		return suplierName;
	}	
	public void setSuplierName(String suplierName) {
		this.suplierName = suplierName;
	}
	
	public String getSuplierId() {
		return suplierId;
	}
	public void setSuplierId(String suplierId) {
		this.suplierId = suplierId;
	}
	public String getSupLocation() {
		return supLocation;
	}
	public void setSupLocation(String supLocation) {
		this.supLocation = supLocation;
	}
	
	
	}
	
	
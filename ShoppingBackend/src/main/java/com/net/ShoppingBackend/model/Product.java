package com.net.ShoppingBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


@Entity
@Component
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="productseq")
	@SequenceGenerator(name="productseq", sequenceName="product_seq")
	private int productId;
	private String cat_id;
@ManyToOne
@JoinColumn(name="cat_id",insertable=false,nullable=false,updatable=false)
private Category category;


public String getCat_id() {
	return cat_id;
}
public void setCat_id(String cat_id) {
	this.cat_id = cat_id;
}
private String productName;
private String productDescp;
private int quantity;
private long price;
@Transient
private MultipartFile file;
public MultipartFile getFile() {
	return file;
}
public void setFile(MultipartFile file) {
	this.file = file;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}

public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDescp() {
	return productDescp;
}
public void setProductDescp(String productDescp) {
	this.productDescp = productDescp;
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
}

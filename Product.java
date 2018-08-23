package com.srinath.pojo;

import java.beans.Transient;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
@Component
@Repository
@Entity
@Table(name="productdata")
public class Product 
{
	@Id
private int productId;
@Column
private String productName;
@Column
private int productPrice;

@javax.persistence.Transient
private MultipartFile productImage;

public MultipartFile getProductImage() {
	return productImage;
}
public void setProductImage(MultipartFile productImage) {
	this.productImage = productImage;
}
public int getProductPrice() {
	return productPrice;
}
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}

}

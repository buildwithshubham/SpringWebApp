package com.shubham.SpringBootWebApp.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private int prodId;
	private String ProdName;
	private int price;
	
	
	public Product() {
	
	}
	
	public Product(int prodId, String prodName, int price) {
		super();
		this.prodId = prodId;
		ProdName = prodName;
		this.price = price;
	}
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", ProdName=" + ProdName + ", price=" + price + "]";
	}
	
	
	
	

}

package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 * @author Akansha Shah
 * @Creation_date 25th Sep 2019 4.44PM
 * @Modification_date 11th Oct 2019 10.51AM
 * @Version 3.0
 * @Copyright Zensar Technologies. All rights reserved
 * @description It is a persistant class It represent databse table Product It
 *              is POJO class
 */
@Component
@Entity
public class Product {
	@Id
	@Column(name = "product_id")
	private int productId;
	private String name;
	private String brand;
	private float price;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String name, String brand, float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

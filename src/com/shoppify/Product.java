package com.shoppify;

public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	private int productQuantityAvailable;

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

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantityAvailable() {
		return productQuantityAvailable;
	}

	public void setProductQuantityAvailable(int productQuantityAvailable) {
		this.productQuantityAvailable = productQuantityAvailable;
	}

	Product(int productId, String productName, double productPrice, int productQuantityAvailable) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantityAvailable = productQuantityAvailable;
	}

	void viewProducts() {
		System.out.println(
				+productId + "	" + productName + "		" + productPrice + "		" + productQuantityAvailable);
	}
}
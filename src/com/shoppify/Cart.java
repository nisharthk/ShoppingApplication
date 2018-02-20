package com.shoppify;

public class Cart {

	private int totalItems;
	private double totalToPay;
	private int quantityNeeded;

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public double getTotalToPay() {
		return totalToPay;
	}

	public void setTotalToPay(double totalToPay) {
		this.totalToPay = totalToPay;
	}

	public void removeFromCart() {

	}

	public int getQuantityNeeded() {
		return quantityNeeded;
	}

	public int setQuantityNeeded(int quantityNeeded) {
		this.quantityNeeded = quantityNeeded;
		return quantityNeeded;
	}

	public String toString() {
		return "totalItems " + "totalToPay " + "quantityNeeded";
	}
}
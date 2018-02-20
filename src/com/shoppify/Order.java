package com.shoppify;

public class Order {
	private int orderId;
	private String paymentType;
	private double amountPaid;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public String setPaymentType(String paymentType) {
		this.paymentType = paymentType;
		return paymentType;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String toString() {
		return "orderId " + "paymentType " + "amountPaid";
	}
}
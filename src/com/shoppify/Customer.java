package com.shoppify;

public class Customer {

	private String customerEmail;
	private String customerPassword;
	private String customerMobileNumber;
	private String customerShippingAddress;

	public String getCustomerEmail() {
		return customerEmail;
	}

	public String setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
		return customerEmail;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public String setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
		return customerPassword;
	}

	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public String setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
		return customerMobileNumber;
	}

	public String getCustomerShippingAddress() {
		return customerShippingAddress;
	}

	public String setCustomerShippingAddress(String customerShippingAddress) {
		this.customerShippingAddress = customerShippingAddress;
		return customerShippingAddress;
	}
}
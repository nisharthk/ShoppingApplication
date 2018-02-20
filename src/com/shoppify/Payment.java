package com.shoppify;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Payment extends Shoppify {
	public static void payViaCashOnDelivery() {
		orderObj.setOrderId(1);
		System.out.println("Enter Shipping Address");
		String addressToShip = input.next();
		customerObj.setCustomerShippingAddress(addressToShip);
		orderObj.setPaymentType("Cash On Delivery");
		System.out.println("Press 1 to confirm the order / Press any other key to cancel");
		confirmOrder();
		user.applicationExit();
		CartCheckout.addItemToCart();
	}

	public static void payViaNetBanking() {
		orderObj.setOrderId(1);
		System.out.println("Enter NetBanking Login id");
		String nbLogin = input.next();
		String login = "abc@nb";
		if (login.equals(nbLogin)) {
			System.out.println("Enter NetBanking Password");
		} else {
			System.out.println("Please enter correct login id");
			makeOrder();
		}
		String nbPass = input.next();
		String password = "abc@nb";
		if (password.equals(nbPass)) {
			System.out.println("Enter transaction Password");
		} else {
			System.out.println("Please enter correct password");
			makeOrder();
		}
		String tpass = input.next();
		String transactionPassword = "abc@nb";
		if (transactionPassword.equals(tpass)) {
			System.out.println("Enter Shipping Address");
		} else {
			System.out.println("Please enter correct transaction password");
			makeOrder();
		}
		String addressToShipNB = input.next();
		customerObj.setCustomerShippingAddress(addressToShipNB);
		orderObj.setPaymentType("Netbanking");
		System.out.println("Press 1 to confirm the order / Press any other key to cancel");
		confirmOrder();
		user.applicationExit();
		CartCheckout.addItemToCart();
	}

	public static void payViaDebitCard() {
		orderObj.setOrderId(1);
		System.out.println("Enter CardHolder Name: ");
		@SuppressWarnings("unused")
		String cardHolderName = input.next();
		System.out.println("Enter Card Number: ");
		String cardNumber = input.next().toString();
		if (cardNumber.length() != 16) {
			System.out.println("Please enter valid card number containing 16 digits!\n");
			makeOrder();
		}
		System.out.println("Enter validity (mmyy): ");
		String validity = input.next();
		if (validity.length() != 4) {
			System.out.println("Please enter validity correctly containing 4 digits!\n");
			makeOrder();
		}
		System.out.println("Enter CVV: ");
		String cardCVV = input.next();
		if (cardCVV.length() != 3) {
			System.out.println("Please enter CVV correctly containing 3 digits!\n");
			makeOrder();
		}
		System.out.println("Enter Shipping Address");
		String addressToShipDB = input.next();
		customerObj.setCustomerShippingAddress(addressToShipDB);
		orderObj.setPaymentType("Debit Card");
		System.out.println("Press 1 to confirm the order / Press any other key to cancel");
		confirmOrder();
		user.applicationExit();
		CartCheckout.addItemToCart();
	}
	
	public static void confirmOrder() {
		DateTimeFormatter dateTimeformatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.now();
		String confirmOrder = input.next();
		if (confirmOrder.equals("1"))
			System.out.println("	Successfully ordered product on Shoppify\n");
		else
			makeOrder();
		System.out.println("\nDate: "+dateTimeformatter.format(localDate)+"\nOrder Id: " + orderObj.getOrderId() + "\nPayment Method: " + orderObj.getPaymentType()
				+ "\nShipped Address: " + customerObj.getCustomerShippingAddress());
		System.out.println("\n Your Product will be delivered by "+dateTimeformatter.format(localDate.plusDays(5))+" through eCart Courier Service");
		System.out.println("\nTo order another product press any key / Type 'exit' to exit Shoppify");
	}
}
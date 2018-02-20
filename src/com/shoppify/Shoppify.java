package com.shoppify;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shoppify {
	static Scanner input = new Scanner(System.in);
	static Customer customerObj = new Customer();
	static Product p0, p1, p2, p3, p4, p5, p6, p7, p8, p9;
	static Order orderObj = new Order();
	static UserValidation user=new UserValidation();
	static String email = "", password = "";
	final static String eMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	final static String pass_REGEX = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

	public static void main(String[] args) {
		System.out.println("\n-----   Welcome to Shoppify Application   -----");
		System.out.println("\nChoose an Option from below: ");
		int switchOption = 0;
		if (switchOption < 4) {
			System.out.println("1. View items on Shoppify");
			System.out.println("2. Login on Shoppify");
			System.out.println("3. Register on Shoppify\n");
			System.out.print("Choose an option: ");
			Scanner in = new Scanner(System.in);
			try {
				switchOption = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("please enter valid option!!");
				main(null);
			}
			switch (switchOption) {
			case 1:
				viewProducts();
				break;
			case 2:
				login();
				break;
			case 3:
				register();
				break;
			default:
				System.out.println("Please enter valid option!\n");
				main(null);
				break;
			}
		} else {
			System.out.println("Please enter valid option!\n");
			main(null);
		}
	}

	public static void viewProducts() {
		Store.viewStore();
		login();
	}

	public static void login() {
		System.out.println("\n	Login into Shoppify to buy a product");
		System.out.print("\nEnter email: ");
		email = customerObj.setCustomerEmail(input.nextLine());
		System.out.print("\nEnter password: ");
		password=customerObj.setCustomerPassword(input.nextLine());
		user.authenticateLogin(customerObj.getCustomerEmail(),customerObj.getCustomerPassword());
	}

	public static void register() {
		String mobile="",shipAddress="";
		System.out.println("\n--- Register on Shoppify ---\n");
		System.out.print("Enter email: ");
		email = customerObj.setCustomerEmail(input.nextLine());
		System.out.print("\nEnter password: ");
		password = customerObj.setCustomerPassword(input.nextLine());
		System.out.print("\nEnter Mobile Number: ");
		mobile=customerObj.setCustomerMobileNumber(input.next());
		System.out.print("\nEnter Shipping Address: ");
		shipAddress=customerObj.setCustomerShippingAddress(input.next());
		user.validateRegisteration(email,password,mobile,shipAddress);
	}

	public void checkout() {
		CartCheckout.addItemToCart();
	}

	public static void makeOrder() {
		int switchOption = 0;
		if (switchOption < 4) {
			System.out.println("1. Cash On Delivery");
			System.out.println("2. NetBanking");
			System.out.println("3. Debit\n");
			System.out.print("Choose an option: ");
			Scanner in = new Scanner(System.in);
			try {
				switchOption = in.nextInt();
				if (switchOption == 1) {
					Payment.payViaCashOnDelivery();
				} else if (switchOption == 2) {
					Payment.payViaNetBanking();
				} else if (switchOption == 3) {
					Payment.payViaDebitCard();
				} else {
					System.out.println("Please enter valid option!\n");
					makeOrder();
				}
			} catch (InputMismatchException e) {
				System.out.println("please enter valid option!!");
				makeOrder();
			}
		}
	}
}
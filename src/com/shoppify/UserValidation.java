package com.shoppify;

public class UserValidation extends Shoppify {

	static String eMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	static String pass_REGEX = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

	public void authenticateLogin(String email,String password) {
		if (!email.matches(eMAIL_REGEX)) {
			System.out.println("please enter valid email (Eg. abc@abc.abc)");
			login();
		}
		if (email.equalsIgnoreCase("abc@shoppify.com")
				&& password.equals("Nish123#")) {
			System.out.println("\n	Login Successful!!\n");
			System.out.println("Welcome " + customerObj.getCustomerEmail() + " to Shoppify!\n");
			Store.viewStore();
			CartCheckout.addItemToCart();
		} else {
			System.out.println("\nInvalid email or Password! Try again!");
			login();
		}
	}

	public void validateRegisteration(String email,String password,String mobile,String shipAddress) {
		if (!email.matches(eMAIL_REGEX)) {
			System.out.println("please enter valid email (Eg. abc@abc.abc)");
			register();
		}
		if (!password.matches(pass_REGEX)) {
			System.out.println(
					"please enter valid password(Containing atleast one Capital,one Small letter,one Number and a special charater in total of 6 to 20 digits");
			register();
		}
		if (email.isEmpty() || password.isEmpty()
				|| mobile.isEmpty()
				|| shipAddress.isEmpty()) {
			System.out.println("\nPlease enter data into all fields! Try again!\n");
			register();
		} else {
			System.out.println("\n	Registeration Successful!!\n");
			System.out.println("Welcome " + customerObj.getCustomerEmail() + " to Shoppify!");
			Store.viewStore();
			System.out.println("\nTo add a product to cart press any key / Type 'exit' to exit Shoppify");
			applicationExit();
			CartCheckout.addItemToCart();
		}
	}

	public void applicationExit() {
		String exit = input.next();
		if (exit.equals("exit"))
			System.exit(0);
	}
}

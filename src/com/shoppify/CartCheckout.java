package com.shoppify;

public class CartCheckout extends Shoppify {
	public static void addItemToCart() {
		Cart cartObj=new Cart();
		System.out.println("\n	Add items to Cart");
		System.out.print("Enter the product Id: ");
		int productId = input.nextInt();
		if (productId == p1.getProductId()) {
			System.out.println("Id\tItem_Name\t\tItem_Price\tQuantity_Available\n");
			System.out.println(+p1.getProductId() + "\t" + p1.getProductName() + "\t" + p1.getProductPrice() + "\t\t"
					+ p1.getProductQuantityAvailable());
			System.out.print("\nEnter the quantity needed: ");
			int quantityNeeded = cartObj.setQuantityNeeded(input.nextInt());
			if (p1.getProductQuantityAvailable() < quantityNeeded) {
				System.out.println("Only " + p1.getProductQuantityAvailable() + " Available");
				addItemToCart();
			} else {
				int updatedQuantity = p1.getProductQuantityAvailable() - quantityNeeded;
				p1.setProductQuantityAvailable(updatedQuantity);
				orderObj.setAmountPaid(cartObj.getTotalToPay());
				cartObj.setTotalToPay(p1.getProductPrice() * quantityNeeded);
				System.out.println("Item Added to Cart\n");
				System.out.println("	Viewing Cart");
				System.out.println("Item_Name		Item_Price\tQuantity_Needed\t Total_Price\n");
				System.out.println(p1.getProductName() + "\t" + p1.getProductPrice() + "\t	" + quantityNeeded + "\t  "
						+ cartObj.getTotalToPay() + "\n");
				String choice = "";
				System.out.println("press 1 to Order / press any other key to cancel");
				choice = input.next();
				if (choice.equals("1")) {
					makeOrder();
					System.out.println("\nProduct Ordered: " + p1.getProductName() + "\nQuantity Ordered: "
							+ quantityNeeded + "\nTotal Paid: " + cartObj.getTotalToPay());
					System.out.println(
							"\n Your Product will be delivered by Feb 19th,2018 through eCart Courier Service");
					System.out.println("\nTo add a product to cart press any key / Type 'exit' to exit Shoppify");
					user.applicationExit();
					addItemToCart();
				} else
					addItemToCart();
			}
		} else if (productId == p2.getProductId()) {
			System.out.println("Id 	Item_Name			Item_Price	Quantity_Available\n");
			System.out.println(+p2.getProductId() + "	" + p2.getProductName() + "		" + p2.getProductPrice()
					+ "			" + p2.getProductQuantityAvailable());
			System.out.print("\nEnter the quantity needed: ");
			int quantityNeeded = cartObj.setQuantityNeeded(input.nextInt());
			if (p2.getProductQuantityAvailable() < quantityNeeded) {
				System.out.println("Only " + p2.getProductQuantityAvailable() + " Available");
				addItemToCart();
			} else {
				int updatedQuantity = p2.getProductQuantityAvailable() - quantityNeeded;
				p2.setProductQuantityAvailable(updatedQuantity);
				orderObj.setAmountPaid(cartObj.getTotalToPay());
				cartObj.setTotalToPay(p2.getProductPrice() * quantityNeeded);
				System.out.println("Item Added to Cart\n");
				System.out.println("	Viewing Cart");
				System.out.println("Item_Name		2Item_Price	Quantity_Needed Total_Price");
				System.out.println(p2.getProductName() + "\t" + p2.getProductPrice() + "\t	" + quantityNeeded
						+ "\t	" + cartObj.getTotalToPay() + "\n");
				String choice = "";
				System.out.println("press 1 to Order / press any other key to cancel");
				choice = input.next();
				if (choice.equals("1")) {
					makeOrder();
					System.out.println("\nProduct Ordered: " + p2.getProductName() + "\nQuantity Ordered: "
							+ quantityNeeded + "\nTotal Paid: " + cartObj.getTotalToPay());
					System.out.println(
							"\n Your Product will be delivered by Feb 19th,2018 through eCart Courier Service");
					System.out.println("\nTo add a product to cart press any key / Type 'exit' to exit Shoppify");
					user.applicationExit();
					addItemToCart();
				} else
					addItemToCart();
			}
		} else if (productId == p3.getProductId()) {
			System.out.println("Id 	Item_Name			Item_Price	Quantity_Available\n");
			System.out.println(+p3.getProductId() + "	" + p3.getProductName() + "		" + p3.getProductPrice()
					+ "		" + p3.getProductQuantityAvailable());
			System.out.print("\nEnter the quantity needed: ");
			int quantityNeeded = cartObj.setQuantityNeeded(input.nextInt());
			if (p3.getProductQuantityAvailable() < quantityNeeded) {
				System.out.println("Only " + p3.getProductQuantityAvailable() + " Available");
				addItemToCart();
			} else {
				int updatedQuantity = p3.getProductQuantityAvailable() - quantityNeeded;
				p3.setProductQuantityAvailable(updatedQuantity);
				orderObj.setAmountPaid(cartObj.getTotalToPay());
				cartObj.setTotalToPay(p3.getProductPrice() * quantityNeeded);
				System.out.println("Item Added to Cart\n");
				System.out.println("	Viewing Cart");
				System.out.println("Item_Name		Item_Price	Quantity_Needed Total_Price");
				System.out.println(p3.getProductName() + "\t" + p3.getProductPrice() + "\t	" + quantityNeeded
						+ "\t	" + cartObj.getTotalToPay() + "\n");
				String choice = "";
				System.out.println("press 1 to Order / press any other key to cancel");
				choice = input.next();
				if (choice.equals("1")) {
					makeOrder();
					System.out.println("\nProduct Ordered: " + p3.getProductName() + "\nQuantity Ordered: "
							+ quantityNeeded + "\nTotal Paid: " + cartObj.getTotalToPay());
					System.out.println(
							"\n Your Product will be delivered by Feb 19th,2018 through eCart Courier Service");
					System.out.println("\nTo add a product to cart press any key / Type 'exit' to exit Shoppify");
					user.applicationExit();
					addItemToCart();
				} else
					addItemToCart();
			}
		} else if (productId == p4.getProductId()) {
			System.out.println("Id 	Item_Name			Item_Price	Quantity_Available\n");
			System.out.println(+p4.getProductId() + "	" + p4.getProductName() + "		" + p4.getProductPrice()
					+ "		" + p4.getProductQuantityAvailable());
			System.out.print("\nEnter the quantity needed: ");
			int quantityNeeded = cartObj.setQuantityNeeded(input.nextInt());
			if (p4.getProductQuantityAvailable() < quantityNeeded) {
				System.out.println("Only " + p4.getProductQuantityAvailable() + " Available");
				addItemToCart();
			} else {
				int updatedQuantity = p4.getProductQuantityAvailable() - quantityNeeded;
				p4.setProductQuantityAvailable(updatedQuantity);
				orderObj.setAmountPaid(cartObj.getTotalToPay());
				cartObj.setTotalToPay(p4.getProductPrice() * quantityNeeded);
				System.out.println("Item Added to Cart\n");
				System.out.println("	Viewing Cart");
				System.out.println("Item_Name		Item_Price	Quantity_Needed Total_Price");
				System.out.println(p4.getProductName() + "\t" + p4.getProductPrice() + "\t	" + quantityNeeded
						+ "\t	" + cartObj.getTotalToPay() + "\n");
				String choice = "";
				System.out.println("press 1 to Order / press any other key to cancel");
				choice = input.next();
				if (choice.equals("1")) {
					makeOrder();
					System.out.println("\nProduct Ordered: " + p4.getProductName() + "\nQuantity Ordered: "
							+ quantityNeeded + "\nTotal Paid: " + cartObj.getTotalToPay());
					System.out.println(
							"\n Your Product will be delivered by Feb 19th,2018 through eCart Courier Service");
					System.out.println("\nTo add a product to cart press any key / Type 'exit' to exit Shoppify");
					user.applicationExit();
					addItemToCart();
				} else
					addItemToCart();
			}
		} else if (productId == p5.getProductId()) {
			System.out.println("Id 	Item_Name			Item_Price	Quantity_Available\n");
			System.out.println(+p5.getProductId() + "	" + p5.getProductName() + "		" + p5.getProductPrice()
					+ "		" + p5.getProductQuantityAvailable());
			System.out.print("\nEnter the quantity needed: ");
			int quantityNeeded = cartObj.setQuantityNeeded(input.nextInt());
			if (p5.getProductQuantityAvailable() < quantityNeeded) {
				System.out.println("Only " + p5.getProductQuantityAvailable() + " Available");
				addItemToCart();
			} else {
				int updatedQuantity = p5.getProductQuantityAvailable() - quantityNeeded;
				p5.setProductQuantityAvailable(updatedQuantity);
				orderObj.setAmountPaid(cartObj.getTotalToPay());
				cartObj.setTotalToPay(p5.getProductPrice() * quantityNeeded);
				System.out.println("Item Added to Cart\n");
				System.out.println("	Viewing Cart");
				System.out.println("Item_Name		Item_Price	Quantity_Needed Total_Price");
				System.out.println(p5.getProductName() + "\t" + p5.getProductPrice() + "\t	" + quantityNeeded
						+ "\t	" + cartObj.getTotalToPay() + "\n");
				String choice = "";
				System.out.println("press 1 to Order / press any other key to cancel");
				choice = input.next();
				if (choice.equals("1")) {
					makeOrder();
					System.out.println("\nProduct Ordered: " + p5.getProductName() + "\nQuantity Ordered: "
							+ quantityNeeded + "\nTotal Paid: " + cartObj.getTotalToPay());
					System.out.println(
							"\n Your Product will be delivered by Feb 19th,2018 through eCart Courier Service");
					System.out.println("\nTo add a product to cart press any key / Type 'exit' to exit Shoppify");
					user.applicationExit();
					addItemToCart();
				} else
					addItemToCart();
			}
		} else if (productId == p6.getProductId()) {
			System.out.println("Id 	Item_Name			Item_Price	Quantity_Available\n");
			System.out.println(+p6.getProductId() + "	" + p6.getProductName() + "		" + p6.getProductPrice()
					+ "		" + p6.getProductQuantityAvailable());
			System.out.print("\nEnter the quantity needed: ");
			int quantityNeeded = cartObj.setQuantityNeeded(input.nextInt());
			if (p6.getProductQuantityAvailable() < quantityNeeded) {
				System.out.println("Only " + p6.getProductQuantityAvailable() + " Available");
				addItemToCart();
			} else {
				int updatedQuantity = p6.getProductQuantityAvailable() - quantityNeeded;
				p6.setProductQuantityAvailable(updatedQuantity);
				orderObj.setAmountPaid(cartObj.getTotalToPay());
				cartObj.setTotalToPay(p6.getProductPrice() * quantityNeeded);
				System.out.println("Item Added to Cart\n");
				System.out.println("	Viewing Cart");
				System.out.println("Item_Name		Item_Price	Quantity_Needed Total_Price");
				System.out.println(p6.getProductName() + "\t" + p6.getProductPrice() + "\t	" + quantityNeeded
						+ "\t	" + cartObj.getTotalToPay() + "\n");
				String choice = "";
				System.out.println("press 1 to Order / press any other key to cancel");
				choice = input.next();
				if (choice.equals("1")) {
					makeOrder();
					System.out.println("\nProduct Ordered: " + p6.getProductName() + "\nQuantity Ordered: "
							+ quantityNeeded + "\nTotal Paid: " + cartObj.getTotalToPay());
					System.out.println(
							"\n Your Product will be delivered by Feb 19th,2018 through eCart Courier Service");
					System.out.println("\nTo add a product to cart press any key / Type 'exit' to exit Shoppify");
					user.applicationExit();
					addItemToCart();
				} else
					addItemToCart();
			}
		} else if (productId == p7.getProductId()) {
			System.out.println("Id 	Item_Name			Item_Price	Quantity_Available\n");
			System.out.println(+p7.getProductId() + "	" + p7.getProductName() + "		" + p7.getProductPrice()
					+ "		" + p7.getProductQuantityAvailable());
			System.out.print("\nEnter the quantity needed: ");
			int quantityNeeded = cartObj.setQuantityNeeded(input.nextInt());
			if (p7.getProductQuantityAvailable() < quantityNeeded) {
				System.out.println("Only " + p7.getProductQuantityAvailable() + " Available");
				addItemToCart();
			} else {
				int updatedQuantity = p7.getProductQuantityAvailable() - quantityNeeded;
				p7.setProductQuantityAvailable(updatedQuantity);
				orderObj.setAmountPaid(cartObj.getTotalToPay());
				cartObj.setTotalToPay(p7.getProductPrice() * quantityNeeded);
				System.out.println("Item Added to Cart\n");
				System.out.println("	Viewing Cart");
				System.out.println("Item_Name		Item_Price	Quantity_Needed Total_Price");
				System.out.println(p7.getProductName() + "\t" + p7.getProductPrice() + "\t	" + quantityNeeded
						+ "\t	" + cartObj.getTotalToPay() + "\n");
				String choice = "";
				System.out.println("press 1 to Order / press any other key to cancel");
				choice = input.next();
				if (choice.equals("1")) {
					makeOrder();
					System.out.println("\nProduct Ordered: " + p7.getProductName() + "\nQuantity Ordered: "
							+ quantityNeeded + "\nTotal Paid: " + cartObj.getTotalToPay());
					System.out.println(
							"\n Your Product will be delivered by Feb 19th,2018 through eCart Courier Service");
					System.out.println("\nTo add a product to cart press any key / Type 'exit' to exit Shoppify");
					user.applicationExit();
					addItemToCart();
				} else
					addItemToCart();
			}
		} else if (productId == p8.getProductId()) {
			System.out.println("Id 	Item_Name			Item_Price	Quantity_Available\n");
			System.out.println(+p8.getProductId() + "	" + p8.getProductName() + "		" + p8.getProductPrice()
					+ "		" + p8.getProductQuantityAvailable());
			System.out.print("\nEnter the quantity needed: ");
			int quantityNeeded = cartObj.setQuantityNeeded(input.nextInt());
			if (p8.getProductQuantityAvailable() < quantityNeeded) {
				System.out.println("Only " + p8.getProductQuantityAvailable() + " Available");
				addItemToCart();
			} else {
				int updatedQuantity = p8.getProductQuantityAvailable() - quantityNeeded;
				p8.setProductQuantityAvailable(updatedQuantity);
				orderObj.setAmountPaid(cartObj.getTotalToPay());
				cartObj.setTotalToPay(p8.getProductPrice() * quantityNeeded);
				System.out.println("Item Added to Cart\n");
				System.out.println("	Viewing Cart");
				System.out.println("Item_Name		Item_Price	Quantity_Needed Total_Price");
				System.out.println(p8.getProductName() + "\t" + p8.getProductPrice() + "\t	" + quantityNeeded
						+ "\t	" + cartObj.getTotalToPay() + "\n");
				String choice = "";
				System.out.println("press 1 to Order / press any other key to cancel");
				choice = input.next();
				if (choice.equals("1")) {
					makeOrder();
					System.out.println("\nProduct Ordered: " + p8.getProductName() + "\nQuantity Ordered: "
							+ quantityNeeded + "\nTotal Paid: " + cartObj.getTotalToPay());
					System.out.println(
							"\n Your Product will be delivered by Feb 19th,2018 through eCart Courier Service");
					System.out.println("\nTo add a product to cart press any key / Type 'exit' to exit Shoppify");
					user.applicationExit();
					addItemToCart();
				} else
					addItemToCart();
			}
		} else if (productId == p9.getProductId()) {
			System.out.println("Id 	Item_Name		Item_Price	Quantity_Available\n");
			System.out.println(+p9.getProductId() + "	" + p9.getProductName() + "	" + p9.getProductPrice()
					+ "		" + p9.getProductQuantityAvailable());
			System.out.print("\nEnter the quantity needed: ");
			int quantityNeeded = cartObj.setQuantityNeeded(input.nextInt());
			if (p9.getProductQuantityAvailable() < quantityNeeded) {
				System.out.println("Only " + p9.getProductQuantityAvailable() + " Available");
				addItemToCart();
			} else {
				int updatedQuantity = p9.getProductQuantityAvailable() - quantityNeeded;
				p9.setProductQuantityAvailable(updatedQuantity);
				orderObj.setAmountPaid(cartObj.getTotalToPay());
				cartObj.setTotalToPay(p9.getProductPrice() * quantityNeeded);
				System.out.println("Item Added to Cart\n");
				System.out.println("	Viewing Cart");
				System.out.println("Item_Name		Item_Price	Quantity_Needed Total_Price");
				System.out.println(p9.getProductName() + "\t" + p9.getProductPrice() + "	\t" + quantityNeeded
						+ "\t	" + cartObj.getTotalToPay() + "\n");
				String choice = "";
				System.out.println("press 1 to Order / press any other key to cancel");
				choice = input.next();
				if (choice.equals("1")) {
					makeOrder();
					System.out.println("\nProduct Ordered: " + p9.getProductName() + "\nQuantity Ordered: "
							+ quantityNeeded + "\nTotal Paid: " + cartObj.getTotalToPay());
					System.out.println(
							"\n Your Product will be delivered by Feb 19th,2018 through eCart Courier Service");
					System.out.println("\nTo add a product to cart press any key / Type 'exit' to exit Shoppify");
					user.applicationExit();
					addItemToCart();
				} else
					addItemToCart();
			}
		} else if (productId == p0.getProductId()) {
			System.out.println("Id 	Item_Name		Item_Price	Quantity_Available\n");
			System.out.println(+p0.getProductId() + "	" + p0.getProductName() + "	" + p0.getProductPrice()
					+ "		" + p0.getProductQuantityAvailable());
			System.out.print("\nEnter the quantity needed: ");
			int quantityNeeded = cartObj.setQuantityNeeded(input.nextInt());
			if (p0.getProductQuantityAvailable() < quantityNeeded) {
				System.out.println("Only " + p0.getProductQuantityAvailable() + " Available");
				addItemToCart();
			} else {
				int updatedQuantity = p0.getProductQuantityAvailable() - quantityNeeded;
				p0.setProductQuantityAvailable(updatedQuantity);
				orderObj.setAmountPaid(cartObj.getTotalToPay());
				cartObj.setTotalToPay(p0.getProductPrice() * quantityNeeded);
				System.out.println("Item Added to Cart\n");
				System.out.println("	Viewing Cart");
				System.out.println("Item_Name		Item_Price	Quantity_Needed Total_Price");
				System.out.println(p0.getProductName() + "\t" + p0.getProductPrice() + "	\t	" + quantityNeeded
						+ "\t" + cartObj.getTotalToPay() + "\n");
				System.out.println("press 1 to Order / press any other key to cancel");
				String choice = input.next();
				if (choice.equals("1")) {
					makeOrder();
					System.out.println("\nProduct Ordered: " + p0.getProductName() + "\nQuantity Ordered: "
							+ quantityNeeded + "\nTotal Paid: " + cartObj.getTotalToPay());
					System.out.println(
							"\n Your Product will be delivered by Feb 19th,2018 through eCart Courier Service");
					System.out.println("\nTo add a product to cart press any key / Type 'exit' to exit Shoppify");
					user.applicationExit();
					addItemToCart();
				} else
					addItemToCart();
			}
		} else {
			System.out.println("Please enter valid Product Id");
			addItemToCart();
		}
	}
}
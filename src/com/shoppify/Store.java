package com.shoppify;

public class Store extends Shoppify{
	public static void viewStore() {
		System.out.println("\n	Items Available on Shoppify\n");
		System.out.println("Id\tItem_Name\t		Item_Price\tQuantity_Available\n");
		System.out.println("---------------------------------------------------------------------------\n");
		p1 = new Product(1, "Moto X	32GB	", 16000.00, 15);
		p2 = new Product(2, "Iphone X 128GB	", 86000.00, 25);
		p3 = new Product(3, "Java 2 2nd Edition", 1000.00, 10);
		p4 = new Product(4, "lenovo p8 32GB	", 19000.00, 8);
		p5 = new Product(5, "LG TV 32 Inch\t", 55000.00, 5);
		p6 = new Product(6, "Blackberry 32GB	", 40000.00, 7);
		p7 = new Product(7, "Honor 7x 16GB	", 12000.00, 11);
		p8 = new Product(8, "Iphone 6S 16GB 	", 23000.00, 3);
		p9 = new Product(9, "Moto G	8GB	", 10000.00, 14);
		p0 = new Product(10, "Samsung S7 32GB	", 33000.00, 6);
		p1.viewProducts();
		p2.viewProducts();
		p3.viewProducts();
		p4.viewProducts();
		p5.viewProducts();
		p6.viewProducts();
		p7.viewProducts();
		p8.viewProducts();
		p9.viewProducts();
		p0.viewProducts();
		System.out.println("\nTo add a product to cart press any key / Type 'exit' to exit Shoppify");
		user.applicationExit();
	}
}

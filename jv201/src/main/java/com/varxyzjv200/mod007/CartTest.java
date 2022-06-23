package com.varxyzjv200.mod007;

public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.addProduct(new Notebook("ThinkPad"));
		cart.addProduct(new SmartPhone("Samsung Galuxy"));
		cart.addProduct(new SmartPhone("Apple Iphone"));
		System.out.println(cart.getProducts().length);
		System.out.println(cart.getDetails());
	}
}

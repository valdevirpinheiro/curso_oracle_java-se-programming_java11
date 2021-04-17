package br.com.valdevir;

import java.util.Arrays;

public class Product implements Cloneable {
	public Product(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public static void main(String[] args) {
		Product p1 = new Product("Tea");
		Product p2 = null;
		try {
			p2 = (Product) p1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Product[] products = { p1, p2 };
		for (Product product : products) {
			System.out.println(product.toString());			
		}
	}
}

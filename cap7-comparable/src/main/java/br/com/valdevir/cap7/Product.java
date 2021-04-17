package br.com.valdevir.cap7;

import java.util.Arrays;

public class Product implements Comparable<Product> {
	public Product(String name) {
		super();
		this.name = name;
	}

	private String name;

	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

	public static void main(String[] args) {
		Product[] products = { new Product("Tea"), new Product("Coffe"), new Product("Cake") };
		Arrays.sort(products);
		for (Product product : products) {
			System.out.println(product.toString());			
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}

package br.com.practices.cap4.app;

import java.math.BigDecimal;

import br.com.practices.cap4.data.Product;

public class Shop {
	
	public static void main(String[] args) {
		Product  p1 = new Product();
		p1.setId(101);
		p1.setName("Tea");
		p1.setPrice(BigDecimal.valueOf(1.99));
		System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() +  " " + p1.getDiscountRate());
		
	}
	
}

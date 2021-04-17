package br.com.practices.cap6.app;

import static enums.Rating.FIVE_STAR;
import static enums.Rating.FOUR_STAR;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.practices.cap6.data.Product;
import br.com.practices.cap6.data.ProductManager;
import enums.Rating;

public class Shop {
	
	public static void main(String[] args) {
		ProductManager pm = new ProductManager();
		Product  p1 =  pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.THREE_STAR);
		Product  p2 =  pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), FOUR_STAR);
		Product  p3 =  pm.createProduct( 103, "Cake", BigDecimal.valueOf(1.99), FIVE_STAR, LocalDate.now().plusDays(2));
		Product  p4 =  pm.createProduct( 104, "Cookie", BigDecimal.valueOf(1.99), FIVE_STAR, LocalDate.now().plusDays(2));
//		p1.setId(101);
//		p1.setName("Tea");
//		p1.setPrice(BigDecimal.valueOf(1.99));
//		System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() +  " " + p1.getDiscountRate() + " " + p1.getRating().getStars());
//		System.out.println(p2.getId() + " " + p1.getName() + " " + p2.getPrice() +  " " + p2.getDiscountRate() + " " + p2.getRating().getStars());
//		System.out.println(p3.getId() + " " + p3.getName() + " " + p3.getPrice() +  " " + p3.getDiscountRate() + " " + p3.getRating().getStars());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		Object objeto = new Object();
	}
	
}

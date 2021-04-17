package br.com.practices.cap5.app;

import java.math.BigDecimal;

import br.com.practices.cap5.data.Product;
import static enums.Rating.*;

public class Shop {
	
	public static void main(String[] args) {
		Product  p1 = new Product(101, "Tea", BigDecimal.valueOf(1.99));
		Product  p2 = new Product(101, "Coffee", BigDecimal.valueOf(1.99), FOUR_STAR);
		Product  p3 = new Product(101, "Cake", BigDecimal.valueOf(1.99), FIVE_STAR);
//		p1.setId(101);
//		p1.setName("Tea");
//		p1.setPrice(BigDecimal.valueOf(1.99));
		System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() +  " " + p1.getDiscountRate() + " " + p1.getRating().getStars());
		System.out.println(p2.getId() + " " + p1.getName() + " " + p2.getPrice() +  " " + p2.getDiscountRate() + " " + p2.getRating().getStars());
		System.out.println(p3.getId() + " " + p3.getName() + " " + p3.getPrice() +  " " + p3.getDiscountRate() + " " + p3.getRating().getStars());

	}
	
}

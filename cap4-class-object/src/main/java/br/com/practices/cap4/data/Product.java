package br.com.practices.cap4.data;

import java.math.BigDecimal;
import  static java.math.RoundingMode.HALF_UP;;

/**
 * @author valde
 *
 */
public class Product {
	
	public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

	private int id;
	private String name;
	private BigDecimal price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getDiscountRate() {
		return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
	}
	
	
	
}

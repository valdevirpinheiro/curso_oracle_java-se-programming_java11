package br.com.practices.cap5.data;

import java.math.BigDecimal;

import enums.Rating;
import static enums.Rating.*;

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
	Rating rating;
	
	public Product(){
		this(0, "no name", BigDecimal.ZERO);
	}
	
	public Product(int id, String name, BigDecimal price) {
		this(id, name, price,  NOT_RATED);
	}
	
	public Product(int id, String name, BigDecimal price, Rating rating) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public BigDecimal getPrice() {
		return price;
	}
//	public void setPrice(BigDecimal price) {
//		this.price = price;
//	}
	public BigDecimal getDiscountRate() {
		return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
	}
	public Rating getRating() {
		return rating;
	}
//	public void setRating(Rating rating) {
//		this.rating = rating;
//	}
//	
	
	
}

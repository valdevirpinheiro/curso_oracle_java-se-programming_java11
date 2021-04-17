package br.com.valdevir.cap7.data;

import static br.com.valdevir.cap7.enums.Rating.*;
import  static java.math.RoundingMode.HALF_UP;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.valdevir.cap7.enums.Rating;;

/**
 * @author valde
 *
 */
public abstract class Product {
	
	public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

	private int id;
	private String name;
	private BigDecimal price;
	Rating rating;
	
	Product(){
		this(0, "no name", BigDecimal.ZERO);
	}
	
	Product(int id, String name, BigDecimal price) {
		this(id, name, price,  NOT_RATED);
	}
	
	Product(int id, String name, BigDecimal price, Rating rating) {
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
	public BigDecimal getDiscount() {
		return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
	}
	
	public abstract Product applyRating(Rating newRating);
//	{
//		return new Product(this.id, this.name, this.price, newRating);
//	}
	public Rating getRating() {
		return rating;
	}
//	public void setRating(Rating rating) {
//		this.rating = rating;
//	}
//	
	
	public LocalDate getBestBefore() {
		return LocalDate.now();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id +"," + name +"," +price +"," +getDiscount() +"," +rating.getStars();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

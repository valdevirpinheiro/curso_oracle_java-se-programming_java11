package br.com.valdevir.cap7.data;

import java.math.BigDecimal;
import java.time.LocalTime;
import br.com.valdevir.cap7.enums.*;

import br.com.valdevir.cap7.enums.Rating;

public class Drink extends Product {

	Drink(int id, String name, BigDecimal price, Rating rating) {
		super(id, name, price, rating);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal getDiscount() {
		LocalTime now = LocalTime.now();
		return (now.isAfter(LocalTime.of(17, 30)) && now.isBefore(LocalTime.of(18, 30))) ? super.getDiscount()
				: BigDecimal.ZERO;
	}
	@Override
	public Product applyRating(Rating newRating) {
		return new Drink(getId(), getName(), getPrice(), newRating);
	}

}

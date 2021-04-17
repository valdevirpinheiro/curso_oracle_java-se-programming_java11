package br.com.practices.cap6.data;

import java.math.BigDecimal;
import java.time.LocalDate;

import enums.Rating;

public class Food extends Product {

	private LocalDate bestBefore;

	Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
		super(id, name, price, rating);
		this.bestBefore = bestBefore;
	}

	public LocalDate getBestBefore() {
		return bestBefore;
	}

	public void setBestBefore(LocalDate bestBefore) {
		this.bestBefore = bestBefore;
	}

	@Override
	public String toString() {
		return "Food{" + "bestBefore" + bestBefore + "}";
	}

	@Override
	public Product applyRating(Rating newRating) {
		return new Food(getId(), getName(), getPrice(), newRating, bestBefore);
	}

}

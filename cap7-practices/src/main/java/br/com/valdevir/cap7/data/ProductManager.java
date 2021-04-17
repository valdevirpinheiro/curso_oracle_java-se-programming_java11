package br.com.valdevir.cap7.data;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.valdevir.cap7.enums.Rating;

public class ProductManager {
	public Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
		return new Food(id, name, price, rating, bestBefore);
	}

	public Product createProduct(int id, String name, BigDecimal price, Rating rating) {
		return new Drink(id, name, price, rating);
	}

}

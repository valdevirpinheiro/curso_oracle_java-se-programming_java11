package br.com.valdevir.cap7.data;

import br.com.valdevir.cap7.enums.Rating;

public interface Rateable<T> {
	public static final Rating DEFAULT_RATING = Rating.NOT_RATED;
	T applyRating(Rating rating);
	
	public default Rating getRating() {
		return DEFAULT_RATING;
	}
}

package br.com.practices.cap3.testes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TesteBigDecimal {

	public static void main(String args[]) {
		double price = 1.85;
		System.out.println(price); // 1.85
		double rate = 0.065;
		System.out.println(rate); // 0.065
		price -= price * rate;
		System.out.println(price); // 1.7297500000000001
		price = Math.round(price * 100) / 100.0;
		System.out.println(price); // 1.73

		// BigDecimal
		System.out.println("BigDecimal");
		BigDecimal priceBig = BigDecimal.valueOf(1.85);
		System.out.println(priceBig); // 1.85
		BigDecimal rateBig = BigDecimal.valueOf(0.065);
		System.out.println(rateBig); // 0.065
		priceBig = priceBig.subtract(priceBig.multiply(rateBig)).setScale(2, RoundingMode.HALF_UP);
		System.out.println(priceBig); //1.73

	}

}

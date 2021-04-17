package br.com.valdevir.capt7;

public interface Consumable {
	int measure();
	public default void  prepare() {
		System.out.println("Teste");
	}
}

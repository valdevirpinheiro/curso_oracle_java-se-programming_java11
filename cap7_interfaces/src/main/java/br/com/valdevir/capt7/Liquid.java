package br.com.valdevir.capt7;

public interface Liquid {
	int measure();
	void consumable();
	public default void  prepare() {
		System.out.println("Teste");
	}
}

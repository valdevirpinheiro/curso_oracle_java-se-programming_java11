package br.com.valdevir.capt7;

public class Drink extends Water implements Liquid, Consumable {

	@Override
	public int measure() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void consumable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		Consumable.super.prepare();
	}

}

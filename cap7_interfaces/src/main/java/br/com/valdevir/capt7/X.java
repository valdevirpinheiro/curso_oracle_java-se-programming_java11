package br.com.valdevir.capt7;

public interface X {
	void a();

	public default void b() {

	}
//erro	
//	private void c() {
//		
//	}

	public static void d() {

	}
}

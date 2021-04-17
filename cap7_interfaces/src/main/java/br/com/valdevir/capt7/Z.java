package br.com.valdevir.capt7;

public class Z extends W implements X, Y {

	public void b() {
		
	}

	public void a() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Z z = new Z();
		z.a();
		z.b();
		z.e();
		X.d();
		Y.d();
		//erro //Z.d();
	}
	
}

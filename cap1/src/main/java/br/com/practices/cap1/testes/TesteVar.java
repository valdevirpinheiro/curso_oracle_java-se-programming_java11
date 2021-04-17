package br.com.practices.cap1.testes;

import java.util.Arrays;

public class TesteVar {
	public static void main(String[] args) {
		var lst = Arrays.asList(1, 2, 3, 4); 
	    //var lst = List.of(1, 2, 3, 4);
		lst.replaceAll(x -> x + 100);
		System.out.println("-Completed-");
		
		//Which action enables to print -Completed-?
		//A. Replacing line 10, with List<Integer> lst = List.of(1,2,3,4);
		//B. Replacing line 11, with lst.replaceAll(x = x + 100);
	    //C. Replacing line 10, with var lst = Arrays.asList(1, 2, 3, 4);  V - Resposta Correta 
		//D. Replacing line 11, with lst.forEach(x -> x + 100);
		
	}
}

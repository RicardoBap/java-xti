package br.com.xti.java;

public class StringMutavel {

	public static void main(String[] args) {
		
		StringBuffer s0 = new StringBuffer(); // metodos sincronizados
		StringBuilder s1 = new StringBuilder("Java"); // sem metodos sincronizados
		
		s1.toString();
		s1.length();
		//System.out.println(s1.length());
		s1.capacity(); // Informa a capacidade de armazenamento dentro dos objetos sem alocar mais memória
		//System.out.println(s1.capacity());
		
		//System.out.println(s1);
		//s1.reverse();
		//System.out.println(s1);
		
		s1.append(" Trabalhando ");
		char[] c = {'c', 'o', 'm'};
		s1.append(c).append(" Textos.");
		System.out.println(s1);
//--------------------------------------------------		
		String s = "Oi" + " como " + "vai voce?";
		String sb = new StringBuilder("Oi").append(" como ").append("vai voce?").toString();		
		System.out.println(s);
		System.out.println(sb);
		
		String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString(); 
		System.out.println(url); // remove parte do texto
		
	}

}

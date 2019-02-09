package br.com.xti.java;

public class StringToken {

	public static void main(String[] args) {
		//---> TOKENS cada palavra
		// ---> DELIMITADOR ;(ponto e virgula)
		
		String s2 = " XHTML; CSS; JavaScript; jQuery; Java"; // Tokens
		s2 = "Venha trabalhar na XTI";
		String[] tokens = s2.split(" ");
		System.out.println(tokens.length + " tokens");
		
		for (String token : tokens) {
			System.out.println(token);
		}
	}

}

package br.com.xti.java;

public class StringsOperacoes {

	public static void main(String[] args) {
		
/*		String s1 = "Write Once"; // literal string atribuindo aspas duplas
		String s2 = s1 + "Run anyWhere"; // concatenando duas string utilizando os operadores + ou +=
		String s3 = new String("Java Virtual Machine"); // Metodo consrutor da string, pode ser vazia ou informando o texto dentro dos parenteses
		
		char[] array = {'J', 'a', 'v', 'a'}; // array de caracteres, caracteres representam letras dentro de aspas simples, uma letra por caractere
		String s4 = new String(array); // pra utilizar o array, basta utilizar o construtor que recebe o array de string
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);  */
//-------------------------------------------------------------------------------		
		//OPERACOES BASICAS
/*		int tamanho = s1.length(); // length retorna o numero de caracteres dentro da String no formato int
		char letra = s1.charAt(0); // Informa o indice do caraceter que deseja localizar 0 a length() - 1;
		String texto = s1.toString(); // Retorna a propria String, a representação do texto
		
		System.out.println(tamanho);
		System.out.println(letra);
		System.out.println(texto);  */
//------------------------------------------------------------------------------		
		// LOCALIZAÇÃO DE CARACTERES e strings dentro do texto
/*		int posicao = s3.indexOf("Virtual"); // Retorna a posição que comeca essa letra, o indice no array de caracteres
		int ultima = s3.lastIndexOf('a'); // Retorna a ultima ocorrencia da letra
		boolean vazia = s3.isEmpty(); // Retorna se a String esta vazia, retorna booleano
		
		System.out.println(vazia);
		System.out.println(ultima);
		System.out.println(posicao);  */
//------------------------------------------------------------------------------		
		// COMPARACAO DE STRING
/*		String xti = "XTI";
		//boolean x = xti.equals("xti"); // equals compara o valor de duas Strings
		//boolean x = xti.equalsIgnoreCase("xti"); // Ignora as letras maiusculas e minusculas
		//boolean x = xti.startsWith("XT"); // Compara se a String comeca com XT
		boolean x = xti.endsWith("TI"); // Compara se a String termina com TI
		//System.out.println(x);
		
		int c =  "bola".compareTo("amor"); //  1 depois
		int d =  "amor".compareTo("bola"); // -1 antes
		int e = "amor".compareTo("amor"); // 0 igual
		int f = "123".compareTo("234"); // -1
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f); 
		
		String so = "Olhe, olhe";
		boolean o = so.regionMatches(6, "Olhe", 0, 4);
		System.out.println(o);  */
//----------------------------------------------------------------------------
/*		//EXTRAÇÃO
		String l = "O Brasil e Lindo";
		String sl = l.substring(11); // Encontrar um pedaço de texto dentro do texo maior, a partir da 11 posição
		sl = l.substring(2, 8); // um pedaco da String que comeca a partir da posição 2 ate a posição 8
		System.out.println(sl);  */
//----------------------------------------------------------------------------		
		// MODIFICACAO DE STRING
/*		String l = "O Brasil e Lindo";
		
		sl = l.concat(" que Maravilha"); // Concatenar String
		//sl = l.replace('s', 'z'); // Trocar caracteres dentro da Strings com o metodo Replace, informa o caracter antigo pelo  novo caracter
		//sl = l.replaceFirst(" ", "X"); // Trocar apenas a primeira ocorrencia desse caracter, o primeiro espaço em branco por X
		//sl = l.replaceAll(" ", "X"); // Trocar todos os espaços em brancos por X
		//sl +=  " que Maravilha";		
		System.out.println(sl);  */
//---------------------------------------------------------------------------
/*		//CONVERSAO
		String l = "O Brasil e Lindo";
		//String sl = l.toUpperCase(); // Todas as letras maiusculas
		String sl = l.toLowerCase(); // Todas as letras minusculas
		System.out.println(sl);  */
//---------------------------------------------------------------------------
		//LIMPA OS ESPAÇOS EM BRANCOS ANTES E DEPOIS DA STRING
//		System.out.println("    espaco    ".trim()); // trim() remove os espços em brancos
		
		
	}

}

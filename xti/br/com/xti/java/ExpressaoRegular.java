package br.com.xti.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
//------------------------------------------------------------------------------		
		//String padrao = "Java";
		//String texto = "Java";
		//boolean b = "Java".matches("Java"); // boolean b = texto.matches(padrao);
		//System.out.println(b);

		//boolean c = "Java".matches("java");  // definido com a letra minuscula
		//System.out.println(c); 
//-------------------------------------------------------------------------------	
		/* MODIFICADORES
		 * (?i), Ignora maiúscula e minúscula
		 * (?x), Comentários
		 * (?m), Multilinhas
		 * (?s), Dottal	 */
		
		//boolean d = "Java".matches("(?i)java"); // desconsidera maiuscula e minuscula
		//System.out.println(d);
		
		//boolean e = "Java".matches("(?im)java"); // pode colocar outros modificadores
		//System.out.println(e);  
//-------------------------------------------------------------------------------
		 /* METACARACTERES //Indica a ocorrencia de numeros, letras e caracters dentro do texto
		 * . qualquer caracter 
		 * \d digitos          [0-9]
		 * \D não é digito     [0-9]
		 * \s espaços          [\t\n\x0b\f\r]
		 * \S nao é espaço     [^\s]
		 * \w letra            [a-z|A-Z|0-9]
		 * \W nao e letra  */
		
/*	    boolean b = "@".matches(".");  // Validar o @
		System.out.println(b);
		
		boolean c = "3".matches("\\d");  // Validar um numero com duas \\
		boolean d = "a".matches("\\d");  // validar caracter utilizando comparador de digito (false)
		boolean e = "a".matches("\\w");  // validar ocorrencias de letras e numeros \\w (verdadeiro)
		boolean f = "#".matches("\\w");  // validar caracter utilizando \\w (false)
		boolean g = " ".matches("\\s");  // validar ocorrencia de espaços \\s (verdadeiro)
		boolean h = "A".matches("\\s");  // Validar um caracter comparando com espaços (false)
		System.out.println(c + " " + d + " " + e + " " + f + " " + g + " " + h);
		
		boolean i ="Pie".matches("..."); // Avaliação de 3 caracteres necessarios colocar 3 pontos (V)
		System.out.println(i);
		
		boolean j = "99".matches("\\d\\d"); // Encontrar dois digitos necessario repetir \\d
		System.out.println(j);
		
		//Validacao de cep
		boolean cep = "13050-410".matches("\\d\\d\\d\\d\\d.\\d\\d\\d");
		System.out.println(cep);	*/	
//---------------------------------------------------------------------------------		
		/* QUANTIFICADORES
		 * X{n}     X, exatamente n vezes
		 * X{n,}    X, pelo menos n vezes
		 * X{n, m}  X, pelo menos n mas não mais do que m vezes
		 * X?,      X, 0 ou 1 vez
		 * X*       X, 0 ou + vezes
		 * X+       X, 1 ou + vezes
		 * */
		
/*		boolean b = "21".matches("\\d{2}"); // Verifica a ocorrencia de 2 digitos
		System.out.println(b);	
		
		boolean c = "123".matches("\\d{2,}"); // "pelo menos" 2 digitos
		boolean d = "1".matches("\\d{2,}"); // coloquei digito a menos
		System.out.println(c + " " + d);
		
		boolean e = "1234".matches("\\d{2,4}"); // precisa ter 2 digitos mais nao mais que 4 digitos
		boolean f = "12345".matches("\\d{2,4}"); // coloquei um digito a mais (false)
		System.out.println(e + " " + f);
		
		boolean g = "".matches(".?"); // qualquer tipo de caracter 0 ou 1 vez
		boolean h = "@#".matches(".?"); // 2 caracteres (false)
		System.out.println(g + " " + h);
		
		boolean i = "".matches(".*");  // 0 ou mais vezes
		boolean j = "@#".matches(".*"); // aqui 2 caracteres (
		System.out.println(i + " " + j);
		
		boolean l = "".matches(".+");  // 1 ou mais vezes se colocar 0 retorna false
		boolean m = "12345".matches(".+"); // pode colocar quantas quiser retorn verdadeiro
		System.out.println(l + " " + m);
		
		//Avaliação do cep com QUANTIFICADORES
		boolean cep = "13050-410".matches(".+");
		System.out.println(cep);
		
		boolean cep1 = "13050-410".matches("\\d{5}-\\d{3}");
		System.out.println(cep1);
		
		//validar uma DATA
		boolean data = "21/01/2019".matches("\\d{2}/\\d{2}/\\d{4}");
		System.out.println(data);		*/
//--------------------------------------------------------------------------		
		/*METACARACTERES DE FRONTEIRAS (verifica se começa ou termina com determinado padrao)
		 * ^ inicia
		 * $ finaliza
		 * | ou   */
		
/*		boolean b = "Pier21".matches("^Pier.*"); // Começa com Pier e pode ter quantidade qualquer de caracter depois
		boolean c = "Pier21".matches(".*21$"); // Analisar se termina com 21, antes pode ter qq qtde de caracter
		boolean d = "tem java aqui".matches(".*java.*"); // existe a palavra java em algum lçugar do texto
		boolean e = "tem java aqui".matches("^tem.*aqui$"); // inicia com um texto e termina com outro
		System.out.println(b + " " + c + " " + d);
		System.out.println(e);
		boolean f = "sim".matches("sim|nao"); // sim ou nao |
		System.out.println(f);  */
//----------------------------------------------------------------------------
		/*AGRUPADORES (agrupam conjunto de caracteres)
		 * [...]           Agrupamento (conjunto de letras)
		 * [a-z]           Alcance     (todos os caracteres que estão entra a e z em letras minusculas)
		 * [a-e][i-u]      Uniao       (Entre a e e + i ate u)
		 * [a-z&&[aeiou]]  Intersecção (de a az mais aeiou)
		 * [^abc]          Exceção     (considera tudo menos abc)
		 * [a-z&&[^m-p]    Subtração   (padraode subtração)
		 * \x              Fuga literal    */
		
/*		boolean b = "x".matches("[a-z]"); // qualquer letra de a ate z minusculas (verdadeira)
		boolean c = "2".matches("[a-z]"); // colocou um numero (false)
		boolean d = "A".matches("[a-z]"); // A maiusculo (false)
		boolean e = "3".matches("[0-9]"); // procura um numero de 0-9
		System.out.println(b + " " + c + " " + d + " " + e);
		
		boolean f = "true".matches("[tT]rue"); //true True
		boolean g = "True".matches("[tT]rue"); // true True
		boolean h = "Yes".matches("[tT]rue|[yY]es"); // true true yes Yes
		boolean i = "yes".matches("[tT]rue|[yY]es"); // true True yes Yes
		System.out.println(f + " " + g + " " + h + " " + i);
		
		//Validação de um nome que sempre começa com uma letra maiuscula
		boolean nome = "Ricardo".matches("[A-Z][a-zA-Z]*"); // Comeca com letra maiuscula seguida de letra minusculas ou nao
		boolean nome1 = "Ricardo".matches("[A-Z][a-z]*"); // Depois da primeira letra somente letras minusculas
		boolean nome2 = "olho".matches("[^abc]lho"); // não quero que comece nem com a, ou c
		boolean nome3 = "alho".matches("[^abc]lho"); // alho retorna (falso)
		boolean nome4 = "crau".matches("cr[ae]u"); // sao validos crau e creu		
		System.out.println(nome + " " + nome1 + " " + nome2 + " " + nome3 + " " + nome4);
		
		//Validacão de e-mails
		boolean email = "ric_bap@hotmail.com".matches("\\w+@\\w+\\.\\w{2,3}");
		System.out.println(email);  */
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		
		String doce = "Qual e o Doce mais doCe que o doce?";// doce escrito de formas diferentes
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}   
//-----------------------------------------------------------------------------------------
		//SUBSTITUIÇÕES
		 String r = doce.replaceAll("(?i)doce", "DOCINHO");		 
		 System.out.println(r);
		 
		 String rato = "O rato roeu a roupa do rei de Roma";
		 String rr = rato.replaceAll("r[aeiou]", "XX");
		 System.out.println(rr);
		 
		 String tabular = "Tabular esse texto";
		 String tab = tabular.replaceAll("\\s", "\t");
		 System.out.println(tab);
		 
		 String url = "www.xti.com.br/clientes-2011.html"; // Reestruturação de links
		 			//http://www.xti.com.br/2011/clientes.jsp	
		 String re = "www.xti.com.br/\\w+{2}-\\d{4}.html";
		 boolean b = url.matches(re);
		 System.out.println(b);
		 
		 //"www.xti.com.br/clientes-2011.html"
		 re = "(www.xti.com.br)/(\\w+{2})-(\\d{4}).html";
		 
		 r = url.replaceAll(re, "http://$1/$3/$2.jsp");
		 System.out.println(r);
		 System.out.println(url);
		 
		 
		
	}
}

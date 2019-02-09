package br.com.xti.poo;

public class MatematicaTest {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		
//==========================================METODOS SOBRECARREGADOS
		
		System.out.println(m.media(5)); // passando apenas 1 parametro
		
		System.out.println(m.media(5,3)); // parametros do tipo inteiros
		
		System.out.println(m.media("50", "30")); // parametros do tipo String
		
		System.out.println(m.media(5, 3, 34, 56)); // passa varios argumentos

//==========================================ARGUMENTOS VARIAVEIS
		/*
		double total = m.soma("Números ", 2, 3, 5, 6, 7, 123, 345, 69);
		System.out.println("Total = " + total);
		*/
//=============================================================
		/*
		int ma = m.maior(10,20);
		System.out.println(ma);
		
		double so = m.soma(10, 20);
		System.out.println(so);  */
		
//==============================================================	
		
		/*int par = m.maior(2, 4);
		int impar = m.maior(3, 5);*/
		
		/*double so = m.soma(m.maior(2, 4), m.maior(3, 5));
		System.out.println(so); */
		
//===========================================RAIZ QUADRADA
		
		/*
		int raiz = m.raiz(27);
		System.out.println(raiz);
		
		
		System.out.println(Math.sqrt(27));
		*/
	}

}

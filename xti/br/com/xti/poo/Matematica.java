package br.com.xti.poo;

public class Matematica {
	
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return o maior dos dois numeros
	 */	
	int maior(int um, int dois) {
		if(um > dois) {
			return um;
		} else {
			return dois;
		}
				
	}
//-----------------------------------------------	ARGUMENTOS VARIAVEIS
	double soma(/*String titulo,*/ double ... numeros ) {
		//System.out.println(titulo);
		double total = 0;
		for ( double n : numeros ) {
			total += n;
		}
		return total;
	}
//-----------------------------------------------
	
	/** @return a raiz quadrada segundo a equação de Pell's */
	/*
	int aux = 1, raizq;
	int raiz(int numero) {	
		int num = numero;
		while(numero > aux) {
			numero = numero - aux;
			aux = aux + 2;
			raizq = raizq + 1;
		}
		int auxi = (raizq + 1) * (raizq + 1);
		if (num == auxi) {
			raizq = raizq + 1;
		return raizq;
		} else {
			return raizq;
		}
	}	*/

//=================================================XTI
	/**
	 * 
	 * @return a raiz quadrada segundo a equação de Pell's 
	 */
	int raiz(int numero) {
		
		int raiz = 0, impar = 1;
		
		while(numero >= impar) {
			numero -= impar;
			impar += 2; // próximo número ímpar
			++raiz;
		}
		
		return raiz;
	}
/*===================================================MÉTODOS SOBRECARREGADOS
 * 
 * . Tem o mesmo nome
 * 
 * . Com Assinaturas Diferentes
 */
//----------------------------------MEDIA DE 1 NUMERO
	
	double media(int x) {
		System.out.print("media(int x) ");
		return x;
	}
	
//---------------------------------MEDIA DE INTEIROS
	double media ( int x, int y) {
		System.out.print("media(int x, int y) ");
		return (x + y)/2;
	}
//------------------------------------MEDIA DE STRINGS
	double media (String x, String y) {
		System.out.print("media(String x, String y) ");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix + iy) / 2;
	}
//---------------------------------MEDIA DE QUANTIDADE ILIMITADA DE PARAMETROS
	double media (double ... numeros) {
		System.out.print("media(double ... numeros ) ");
		return this.soma(numeros) / numeros.length;
	}
	
} // fim class
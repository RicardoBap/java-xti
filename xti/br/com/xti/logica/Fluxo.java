package br.com.xti.logica;
import java.util.ArrayList;
import java.util.Scanner;

public class Fluxo {

	public static void main(String[] args) {
	
		/*
		int[] pares = { 2, 4, 6, 8 };
		for(int i=0; i <pares.length; i++) {
			int par = pares[i];
			System.out.println(par);
		} 
		
		/* forech 
		for(int par : pares) {
			System.out.println(par);
		} */
		/*		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		for(Integer numero : list) {
			System.out.println(numero);
		} */
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++
		/* FLUXO DE REPETICAO 
		while(condição) {..};
		do{...} while(condição); */
		
		/* int i = 3;
		while(i < 2) {
			System.out.println(i);
			i++;
		};
		for( i=0;  i < 2; i++) {
			System.out.println(i);
		
		
		do{
			System.out.println(i);
			i++;
			
		} while(i < 2);  */
		
		/*ArrayList<String> produtos = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Liste seus produtos : Para sair digite FIM");
		
		String produto;
				
		while(!"FIM".equals(produto = s.nextLine())) {
			produtos.add(produto);
		}
		
		System.out.println(produtos.toString());  */
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
		/*
		while(true) {
			System.out.println("Entrou");
			break;
		}  */
		
		/* for( int i = 0; i < 10; i++ ) {
			if (i == 5) {
				continue; // interação atual
			}
			System.out.println(i);			
		}  */
		
		/*um:
		for () {
			dois:
			for ( int i = 0; i < 10; i++) {
				if (i == 5) {
					break um;
				}
				System.out.println(i);
			}
		} */
		
		boolean[][] matrix = { 
		                       {false, true, false, false, false},
		                       {false, false, false, false, false}
							 };
							 
			busca:				 
			for(int a = 0; a < matrix.length; a++) {
				System.out.print("A ");
				for(int b = 0; b < matrix[a].length; b++) {
					if(matrix[a][b]) {
						System.out.print("TRUE ");
						break busca;
					}
					System.out.print("B ");
				}
			}
		
		
		
	}

}
















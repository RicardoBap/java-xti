package br.com.xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void dividir(Scanner s) throws InputMismatchException, ArithmeticException		
	{
		System.out.print("Numero: ");
		int a = s.nextInt();
		System.out.print("Divisor: ");
		int b = s.nextInt();

		System.out.println(a / b);
	}
	//-----------------------------------------------------
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);		
		boolean continua = true;

		do {

			try {

				dividir(s);

				continua = false;
			}
			catch (InputMismatchException  | ArithmeticException e ) {
				System.err.println("Numeros Invalido"); // err escreve a mensagem de erro em vermelho
				//e.printStackTrace();
				s.nextLine(); // descarta a entrada errada e libera novamente para o usuario
			}			
			finally {
				System.out.println("Finally Executado");
			}

		} while(continua);

	} // fim main
} // fim class

// java.util.InputMismatchException
// ArithmeticException
package br.com.xti.poo;

public class EnumTest {
	
	public static final double PI = 3.14; // Constante global
	
	public static void andar(Medida medida, int total) {
		if (medida == Medida.M) {
			// ... c�digo
		}
	}

	public static void main(String[] args) {
		
		System.out.println(PecasXadrez.BISPO);
		
		System.out.println(Medida.M.titulo);
		
		for(Medida m : Medida.values()) {
			System.out.println(m + " : " + m.titulo);
		}
		
		andar(Medida.M, 100);

	}

}

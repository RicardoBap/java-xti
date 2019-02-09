package br.com.xti.heranca;

public abstract class Animal {
	
	double peso;
	String comida;
	
	void dormir() {
		System.out.println("Dormiu");
	}
	
	abstract void fazerBarulho();

	
} // fim class

//....................................INICIO
/*
package br.com.xti.heranca;

public class Animal {
	
	double peso;
	String comida;
	
	public Animal() {}
	
	public Animal (double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}
	
	void dormir() {
		System.out.println("Dormiu!");
	}
	void fazerBarulho() {
		System.out.println("Fazer Barulho!");
	}

	
} // fim class */
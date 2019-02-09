package br.com.xti.heranca;

public class AnimalTest {
		public static void main(String[] args) {
			
			//Animal animal = new Animal(); // classe animal abstract gera erro no compilador
			Animal cachorro = new Cachorro();
			Animal galinha = new Galinha();
			
			cachorro.fazerBarulho();
			galinha.fazerBarulho();
		
	}

}


//...........................................................INICIO
//package br.com.xti.heranca;

//public class AnimalTest {

//*****************************************************************
/*	public static void barulho(Animal animal) { // POLIMORFISMO
		animal.fazerBarulho();
	}
//-----------------------------------------------------------------	
	public static void barulhoSemPolimorfismo(String animal) {
		if(animal.equals("Cachorro")) {
			System.out.println("Au, Au !");
		} else if (animal.equals("Galinha")) {
			System.out.println("Có, Có !");
		}
	} */
//****************************************************************
	//public static void main(String[] args) {
		
//****************************************************************
/*
		//Animal generico = new Animal(0, null);
		Animal toto = new Cachorro();		
		Animal carijo = new Galinha();	
		
		//barulho(toto);
		//barulho(carijo);
		
		barulhoSemPolimorfismo("Cachorro");
		barulhoSemPolimorfismo("Galinha");
		
		//generico.fazerBarulho();
		//toto.fazerBarulho();
		//carijo.fazerBarulho(); */
		
//----------------------------------------------------		
/*		System.out.println(toto instanceof Cachorro);
		System.out.println(toto instanceof Animal);
//-----------------------------------------CLASS OBJECT		
		toto.equals(carijo);
		toto.hashCode();
		toto.getClass();
		toto.toString(); */
//----------------------------------------------------

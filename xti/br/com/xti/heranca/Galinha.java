package br.com.xti.heranca;

public class Galinha extends Animal implements AreaCalculavel {
	
	@Override
	void fazerBarulho() {
		System.out.println("Có, Có !");		
	}

	@Override
	public double calculaArea() {
		return 0;
	}	

}

//...................................INICIO
/*
 * package br.com.xti.heranca;

public class Galinha extends Animal {
	
	public Galinha () {
		super(2, "Milho"); // A palavra "super" faz referencia a super classe
	}
	
	void fazerBarulho() {
		System.out.println("Có, Có !");
	}

}  */

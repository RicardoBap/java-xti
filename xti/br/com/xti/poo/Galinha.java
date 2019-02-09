package br.com.xti.poo;

public class Galinha {
	
	public static int ovosDaGranja; // variável global
	
	public int ovos; // total de ovos da galinha ou do objeto

//-------------------------------------------------
	public Galinha botar() {
		this.ovos++;  
		Galinha.ovosDaGranja++;
		return this;
	}
//--------------------------------------MÉTODO ESTATICO QUE RETORNA A MÉDIA DE OVOS DA GRANJA
	public static double mediaDeOvos(int galinhas) {
		return Galinha.ovosDaGranja / galinhas;
	}

}

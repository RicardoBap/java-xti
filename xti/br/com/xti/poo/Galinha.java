package br.com.xti.poo;

public class Galinha {
	
	public static int ovosDaGranja; // vari�vel global
	
	public int ovos; // total de ovos da galinha ou do objeto

//-------------------------------------------------
	public Galinha botar() {
		this.ovos++;  
		Galinha.ovosDaGranja++;
		return this;
	}
//--------------------------------------M�TODO ESTATICO QUE RETORNA A M�DIA DE OVOS DA GRANJA
	public static double mediaDeOvos(int galinhas) {
		return Galinha.ovosDaGranja / galinhas;
	}

}

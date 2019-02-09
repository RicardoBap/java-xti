package br.com.xti.poo;

public class CarroTest {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;
		Motor v12 = new Motor(); // Composição
		v12.tipo = "V-12"; // Composicao
		v12.potencia = 660; // Composicao
		ferrari.motor = v12; // adiciona motor ao carro
//---------------------------------------------------------------		
		Carro koeniseg = new Carro("Koeniseg CCXR", 430, 3.1);
		Motor v8 = new Motor("V8", 1018);
		koeniseg.motor = v8;
//---------------------------------------------------------------		
		Carro bugatti = new Carro("Bugatti Veryon", 430, 2.2, new Motor("W16", 1200));
//---------------------------------------------------------------FERRARI		
		System.out.println(ferrari.modelo);
		System.out.println(ferrari.velocidadeMaxima);
		System.out.println(ferrari.segundosZeroACem);
		System.out.println(ferrari.motor.tipo); // Composicao
		System.out.println(ferrari.motor.potencia); // Composicao
//---------------------------------------------------------------KOENISEG		
		System.out.println(koeniseg.modelo);
		System.out.println(koeniseg.velocidadeMaxima);
		System.out.println(koeniseg.segundosZeroACem); 
		System.out.println(koeniseg.motor.tipo); // Composicao
		System.out.println(koeniseg.motor.potencia); // Composicao
//---------------------------------------------------------------BUGATTI
		System.out.println(bugatti.modelo);
		System.out.println(bugatti.velocidadeMaxima);
		System.out.println(bugatti.segundosZeroACem);
		System.out.println(bugatti.motor.tipo); // Composicao
		System.out.println(bugatti.motor.potencia); // Composicao
	} 

}

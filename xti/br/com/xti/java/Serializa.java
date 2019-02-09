package br.com.xti.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import br.com.xti.poo.Conta;

public class Serializa {

	public static void main(String[] args) throws Exception {
		
/*		String[] nomes = { "Ricardo", "Heloisa", "Katita"}; 
		
		Conta conta1 = new Conta("XTI", 1_100.99);
		
		// ESCRITA DE OBJETO
		FileOutputStream fos = new FileOutputStream("C:/JAVA_Xti/files/objetos.ser");
		ObjectOutputStream oos = new  ObjectOutputStream(fos); 
		oos.writeObject(conta1);
		oos.close();
		
		// LEITURA DE OBJETO
		FileInputStream fis = new FileInputStream("C:/JAVA_Xti/files/objetos.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Conta c1 = (Conta) ois.readObject();
		ois.close();
		
		conta1.exibeSaldo(); */
		
		//System.out.println(Arrays.toString(c1)); // Apresenta o Array no console
//=======================================================================================
		String[] nomes = { "Ricardo", "Heloisa", "Katita"};

		Conta conta1 = new Conta("XTI", 1_100.99);
		Conta conta2 = new Conta("Ricardo", 1_350.98);
		Conta conta3 = new Conta("Albertina", 1_650.97);
		Conta conta4 = new Conta("Katita", 1_987.11);

		/* ESCRITA DE OBJETO*/
		FileOutputStream fos = new FileOutputStream("C:/JAVA_Xti/files/objetos.ser");
		ObjectOutputStream oos = new  ObjectOutputStream(fos); 
		oos.writeObject(conta1);
		oos.writeObject(conta2);
		oos.writeObject(conta3);
		oos.writeObject(conta4);
		oos.close();

		/*LEITURA DE OBJETO*/
		FileInputStream fis = new FileInputStream("C:/JAVA_Xti/files/objetos.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Conta c1 = (Conta) ois.readObject();
		Conta c2 = (Conta) ois.readObject();
		Conta c3 = (Conta) ois.readObject();
		Conta c4 = (Conta) ois.readObject();
		ois.close();

		conta1.exibeSaldo();
		conta2.exibeSaldo();
		conta3.exibeSaldo();
		conta4.exibeSaldo();

		//System.out.println(Arrays.toString(c1)); // Apresenta o Array no console

	}

}

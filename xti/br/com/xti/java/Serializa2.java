package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets; // <----UTF-8
import br.com.xti.poo.Conta;


public class Serializa2 {
	
//------------------------------------------------METODO DE GRAVAÇÃO
	public void armazenarContas(ArrayList<Conta> contas) throws FileNotFoundException, IOException {
		
		try (FileOutputStream fos = new FileOutputStream("C:/JAVA_Xti/files/contas.ser")) {
			try (ObjectOutputStream oos = new  ObjectOutputStream(fos)) {
				oos.writeObject(contas);
				}
		}
	}		 
//================================================METOD DE LEITURA
	public ArrayList<Conta> recuperarContas() throws IOException, ClassNotFoundException  {
		
		try (FileInputStream fis = new FileInputStream("C:/JAVA_Xti/files/contas.ser")) {
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			return (ArrayList<Conta>) ois.readObject();			
			}
		}
}
	
//==========================================================================
	public static void main(String[] args) throws IOException, ClassNotFoundException {
			
		ArrayList<Conta> contas = new ArrayList<>();
		
		contas.add(new Conta("Ricardo", 1_200.23));
		contas.add(new Conta("Katita", 345.33));
		contas.add(new Conta("Heloisa", 4_500.45));
		contas.add(new Conta("Patricia", 1_100.23));
		contas.add(new Conta("Albertina", 345.23));  
		
		Serializa2 operacao = new Serializa2();
		operacao.armazenarContas(contas);
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		for (Conta conta : contas2) {
			conta.exibeSaldo();
		} 
		

	}

}

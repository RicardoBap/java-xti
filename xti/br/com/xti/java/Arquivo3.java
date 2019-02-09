package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets; // <----UTF-8
import br.com.xti.poo.Conta;


public class Arquivo3 {
	
	// ESCOPO DE CLASSE
	private Path path = Paths.get("C:/JAVA_Xti/files/contas.txt");
	private Charset utf8 = StandardCharsets.UTF_8;

//------------------------------------------------METODO DE GRAVAÇÃO
	public void armazenarContas(ArrayList<Conta> contas) {
		
		try(BufferedWriter escrita = Files.newBufferedWriter(path, utf8)) {
			for (Conta conta : contas) {
				escrita.write(conta.getCliente() + ";" + conta.getSaldo() + "\n");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
//================================================METOD DE LEITURA
	public ArrayList<Conta> recuperarContas() throws IOException  {
		ArrayList<Conta> contas = new ArrayList<>();
		try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] t = line.split(";");
				System.out.println(t[0]+t[1]);
				Conta conta = new Conta(t[0], Double.parseDouble(t[1]));
				contas.add(conta);
			}
		}
		return contas;
	} 
//==========================================================================
	public static void main(String[] args) throws IOException {
			
		ArrayList<Conta> contas = new ArrayList<>();
		
/*		contas.add(new Conta("Ricardo", 1_200.23));
		contas.add(new Conta("Katita", 345.33));
		contas.add(new Conta("Heloisa", 4_500.45));
		contas.add(new Conta("Patricia", 1_100.23));
		contas.add(new Conta("Albertina", 345.23));  */
		
		Arquivo3 operacao = new Arquivo3();
		//operacao.armazenarContas(contas);
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		for (Conta conta : contas2) {
			conta.exibeSaldo();
		} 
		

	}

}

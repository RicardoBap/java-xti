package br.com.xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		
		// Java 7(nova forma de manipul��o de arquivos)
		Path path = Paths.get("C:/JAVA_Xti/files/texto.txt");
		System.out.println(path.toAbsolutePath());  // Caminho absoluto
		System.out.println(path.getParent()); // Caminho Pai
		System.out.println(path.getRoot()); // Raiz do Sistema
		System.out.println(path.getFileName()); // Nome do arquivo
		
		/*CRIA��O DO DIRET�RIO*/
		Files.createDirectories(path.getParent()); // lan�ar exececao no m�todo main throws
		
		/* ESCREVER E LER ARQUIVOS (ESCREVE) */
		byte[] escrevenoarquivo = "Meu Texto".getBytes();
		Files.write(path, escrevenoarquivo); // cria, limpa e escreve um texo dentro do arquivo
		
		/*LE*/
		byte[] retorno = Files.readAllBytes(path); // Imprime no console o conte�do do arquivo
		System.out.println(new String(retorno));
	}

}

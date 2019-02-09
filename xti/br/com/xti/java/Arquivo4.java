package br.com.xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	public static void main(String[] args) throws IOException {
//============================================================================================		
/*		Path caminho = Paths.get("C:/JAVA_Xti/files/texto.txt");
		System.out.println(Files.exists(caminho));
		System.out.println(Files.isDirectory(caminho));
		System.out.println(Files.isRegularFile(caminho));
		System.out.println(Files.isReadable(caminho));
		System.out.println(Files.isExecutable(caminho));
		System.out.println(Files.size(caminho)); // Lança exececcao de IO
		System.out.println(Files.getLastModifiedTime(caminho)); // Ultima vez que o arquivo foi modificado
		System.out.println(Files.getOwner(caminho)); // Retorna o dono do arquivo
		System.out.println(Files.probeContentType(caminho)); // Retorna o tipod e arquivo, se é texto, imagem, etc
		//==========================================================================================
		//DELETE
		//Files.delete(caminho); // lanca exececao ao tentar deletar, deleta apenas arquivo vazio
		Files.deleteIfExists(caminho); // so deleta se o diretorio existir */
//============================================================================================		
		Path path = Paths.get("C:/JAVA_Xti/files/fonte.txt");
		//CREATE
		Files.deleteIfExists(path); // Deleta arquivo
		Files.createFile(path); // Cria um arquivo em branco
		Files.write(path, "Meu texto".getBytes());
		
		//COPY
		Path copia = Paths.get("C:/JAVA_Xti/files/copia.txt");
		Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
		
		//MOVE
		Path mover = Paths.get("C:/JAVA_Xti/files/move/fonte.txt");
		Files.createDirectories(mover.getParent());
		Files.move(path, mover, StandardCopyOption.REPLACE_EXISTING);
		
		
	}

}

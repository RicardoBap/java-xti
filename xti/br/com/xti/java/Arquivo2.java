package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	/*	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:/JAVA_Xti/files/texto.txt");
		Charset utf8 = StandardCharsets.UTF_8;

		BufferedWriter w = Files.newBufferedWriter(path, utf8 ); // Informar o caminho e o tipode charset
		w.write("Texto");
		w.write("Testo");
		w.flush(); // Grava no arquivo
		w.close(); */
	//=================================================================Modelo tradicional - 
/*	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:/JAVA_Xti/files/texto.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		
		BufferedWriter w = null;
		try {
			w = Files.newBufferedWriter(path, utf8 ); // Informar o caminho e o tipode charset
			w.write("Outro Texto\n");
			w.write("Outro Testo2\n");
			w.flush(); // Grava no arquivo
		} catch (IOException e) {
			e.printStackTrace();		
		} finally {
			if (w != null) {
				w.close();
			}
		}  */
//====================================================================
	/*JAVA 7 - ESCRITA*/ 
/*	public static void main(String[] args) {

		Path path = Paths.get("C:/JAVA_Xti/files/texto.txt");
		Charset utf8 = StandardCharsets.UTF_8;

		try(BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
			w.write("Outro Texto");
			w.write("OutroTexto");
		} catch (IOException e) {
			e.printStackTrace();
		} */
//=====================================================================
	/*LEITURA*/
	public static void main(String[] args) {

		Path path = Paths.get("C:/JAVA_Xti/files/texto.txt");
		Charset utf8 = StandardCharsets.UTF_8;

		try(BufferedReader reader = Files.newBufferedReader(path, utf8)) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			} 
		}catch (IOException e) {
			e.printStackTrace();
		}

	} // fim main 
//=====================================================================
} // fim class

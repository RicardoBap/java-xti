package br.com.xti.logica;
import javax.swing.JOptionPane;

/**
  * CALCULO DO IMC INDICE DE MASSA CORPORAL	
  *	IMC = PESO / (ALTURA)2  
  *	
  *	< 20   = aBAIXO DO PESO
  * 20-25  = PESO IDEAL
  *	25-30  = SOBREPESO
  * 30-35  = OBESIDADE MODERADA
  *	35-40  = OBESIDADE SEVERA
  *	40-50  = OBESIDADE MÓRBIDA
  * > 50   = SUPER OBESIDADE   
  */
	
public class IMC {

	public static void main(String[] args) {
	
	String peso = JOptionPane.showInputDialog("Qual o seu peso em Quilogramas?");
	String altura = JOptionPane.showInputDialog("Qual sua altura em metros?");
	
	double pesoEmQuilogramas = Double.parseDouble(peso);
	double alturaEmMetros = Double.parseDouble(altura);
	double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
	
	String msg = (imc >= 20 && imc <= 25) ? "PESO IDEAL" : "FORA DO PESO";
	// avaliação ? valor : valor;
	
	msg = "IMC = " + imc + "\n" + msg;
	JOptionPane.showMessageDialog(null, msg);

	}
}
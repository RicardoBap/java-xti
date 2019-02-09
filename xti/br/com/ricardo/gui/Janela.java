package br.com.ricardo.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela() {		
		
/*		JFrame frame = new JFrame();
		JButton botao = new JButton("Click");
		frame.getContentPane().add(botao);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true); */
		
//---------------------------------------------------------
		// Apos a inserção de extends JFrame
		super("Minha Janela");
		JButton botao = new JButton("Click");
		getContentPane().add(botao);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}
//---------------------------------------------------------
	public static void main(String[] args) {

		new Janela();

	}

}

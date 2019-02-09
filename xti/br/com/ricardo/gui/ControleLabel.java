package br.com.ricardo.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame {
	
	public ControleLabel() {
		super("Controle Label"); // <-- defini o titulo do JFrame
				
		JLabel simples = new JLabel("Label Simples");
		simples.setToolTipText("Meu tooltip"); // <-- Mensagem aparece quando se passa o mouse
		
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC,  28);
		JLabel label = new JLabel("Label Simples");
		label.setFont(fonte);
		label.setForeground(Color.BLUE);
//------------------------------------------------------------------	
		// Imagem
		ImageIcon icon =
		new ImageIcon(getClass().getResource("fotos/olho.png"));		
		JLabel imagem = new JLabel(icon);
//-------------------------------------------------------------------		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(simples);
		c.add(label); //<---- adiciona label
		c.add(imagem); // <-- adiciona imagem
//...................................................................		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <-- operaçãod e fechamneto
		setSize(300, 300); // <-- tamanho da janela
		setVisible(true); // <-- visibilidade
	}
//...................................................................		
	public static void main(String[] args) {		
		new ControleLabel(); // <-- cria uma classe
	}
//-----------------------------------------------
} // fim class

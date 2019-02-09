package br.com.ricardo.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener {
	
	JButton botao;
	
	public Eventos() {
		super("Eventos");
		
		botao = new JButton("Clique aqui");  // <-- cria botao
		botao.addActionListener(this); // <-- lança eventos, metodos que termina com Listener
		getContentPane().add(botao);  // <-- adiciona botao
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <-- padrao de fechamento
		setSize(300,  300);
		setVisible(true);
	}	
//-------------------------------------------------MAIN
	public static void main(String[] args) {
		new Eventos();
	}
//-------------------------Método executado pelo botao
@Override
public void actionPerformed(ActionEvent e) {
	//System.out.println("Clicou");
	botao.setText("FOI CLICADO");
} // fim metodo

} // fim class

package br.com.ricardo.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends  JFrame {
	
	public Layouts() { // CONSTRUTOR
		
		super("Layouts"); // titulo da janela
		
		//getContentPane().add(new JButton("1"));
		//getContentPane().add(new JButton("2"));
		
		// LAYOUT PADRAO
/*		Container c = getContentPane();
		c.add(BorderLayout.NORTH,  new JButton("1"));
		c.add(BorderLayout.SOUTH,  new JButton("2"));
		c.add(BorderLayout.CENTER,  new JButton("3"));  
		c.add(BorderLayout.EAST,  new JButton("4"));    
		c.add(BorderLayout.WEST,  new JButton("5"));  */
//---------------------------------------------------------	
		
		// LAYOUT PADRAO DE FORMA SIMPLIFICADA
/*		Container c = getContentPane();
		BorderLayout border = new BorderLayout();
		c.setLayout(border);
		
		c.add(BorderLayout.NORTH,  new JButton("1"));
		c.add(BorderLayout.SOUTH,  new JButton("2"));
		c.add(BorderLayout.CENTER,  new JButton("3"));  
		c.add(BorderLayout.EAST,  new JButton("4"));    
		c.add(BorderLayout.WEST,  new JButton("5"));   */
//---------------------------------------------------------
		
		// DISTRIBUI OS BOTÕES DE ACORDO COM A ORDEM DE CHEGADA
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ao apertar no baotao sair
		setSize(300, 300); // define o tamanho
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Layouts();

	}  // fim main
} // fim class

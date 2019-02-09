package br.com.ricardo.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ControleTeste extends JFrame implements ActionListener {
	
	JTextField login;
	JPasswordField senha;
	
	JButton ok, cancelar;
	
//-------------------------------------------------	
	public ControleTeste() {
		super("Textos e Senhas");
		
		login = new JTextField();
		senha = new JPasswordField();
		
		ok = new JButton("OK");
		ok.addActionListener(new BotaoOKListener());
		
		cancelar = new JButton("CANCELAR");
		cancelar.addActionListener(new BotaoCancelarListener());
		
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,  2));
		
		// primeira linha
		c.add(new JLabel("LOGIN"));
		c.add(login);
		
		// segunda linha
		c.add(new JLabel("SENHA"));
		c.add(senha);
		
		// terceira linha
		//c.add(new JButton("OK")); // "EVENTOS" Mostra o login e senha
		//c.add(new JButton("Cancel")); // "CANCELAR" limpa o formulario
		c.add(ok);
		c.add(cancelar);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
		
		
	} // fim construtor	
//------------------------------------------------------	
	public static void main(String[] args) {		
		new ControleTeste();
	}
//------------------------------------------------------
	class BotaoOKListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = "login" + login.getText() + "\nsenha" + new String(senha.getPassword());
		JOptionPane.showMessageDialog(null, s);		
	} // fim metodo
		
	} // fim class
//------------------------------------------------------
	class BotaoCancelarListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		login.setText("");
		senha.setText("");
	} // fim metodo		
	} // fim class
//------------------------------------------------------
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
/*@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == ok) {
		String s = "login" + login.getText() + "\nsenha" + new String(senha.getPassword());
		JOptionPane.showMessageDialog(null, s);
	} else if (e.getSource() == cancelar) {
		login.setText("");
		senha.setText("");
	}
	
} // fim metodo
*/

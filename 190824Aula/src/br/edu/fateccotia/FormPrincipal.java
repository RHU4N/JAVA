package br.edu.fateccotia;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FormPrincipal extends JFrame {
	
	public FormPrincipal() {
		setTitle("Formulario Principal");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // Centraliza a janela
		
		//add conteudo(opp)
		JLabel lbWelcome = new JLabel("Bem vindo ao Sistema", SwingConstants.CENTER);
		add(lbWelcome);
		
		//Exibe a janela
		setVisible(true);
	}
}

package br.edu.fateccotia;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FormLogin extends JFrame {
	
	//Construtor Classe
	public FormLogin() {
		//config Janela
		setTitle("Tela de Login");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // Centraliza a janela
		setLayout(new BorderLayout()); // usa o BorderLAyout para organizar os componentes
		
		//Criando o Label "Acesso Restrito"
		JLabel lblRestrito = new JLabel("Acesso Restrito", SwingConstants.CENTER);
		lblRestrito.setFont(new Font("Arial", Font.BOLD, 18)); //define fonte e tamanho
		
		//add label no topo da janela
		add(lblRestrito, BorderLayout.NORTH);
		
		//Criando o painel para os campos de text e botão
		JPanel panel = new JPanel(new GridLayout(3,2));
		
		//criando componentes
		JLabel lbUser = new JLabel("Usuário:");
		JTextField txtUser = new JTextField();
		
		JLabel lbSenha =new JLabel("Senha:");
		JPasswordField txtSenha = new JPasswordField();
		
		JButton btLogin = new JButton("Entrar");
		JButton btSair = new JButton("Sair");
		
		//add componentes no panel
		panel.add(lbUser);
		panel.add(txtUser);
		panel.add(lbSenha);
		panel.add(txtSenha);
		panel.add(btLogin);
		panel.add(btSair);
		
		//Add panel centro janela
		add(panel, BorderLayout.CENTER);
		
		//Ação para btn "Entrar"
		btLogin.addActionListener(e->{
			String username = txtUser.getText();
			String password = new String(txtSenha.getPassword());
			
			//aqui vc pode add a log da verif de user e senha
			if(username.equals("admin") && password.equals("1234")) {
				dispose(); // fecha a janela login
				new FormPrincipal(); //Abre new form
			} else {
				JOptionPane.showMessageDialog(null, "User ou senha incorretos");
				txtUser.setText("");
				txtSenha.setText("");
				txtUser.grabFocus();
			}
		});
		//Ação para o botão "Sair"
		btSair.addActionListener( e-> System.exit(0)); //Fecha o app
		//exibe janela
		setVisible(true);
	}
	// Metodo principal pra rodar
	public static void main(String[] args) {
		new FormLogin();
	}
}

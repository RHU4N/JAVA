package br.edu.fateccotia;

import javax.swing.JOptionPane;

public class MediaFor {

	public static void main(String[] args) {
		float media=0;
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		
		for(int c=1;c<=4;c++) {
			float m = Float.parseFloat(JOptionPane.showInputDialog("Digite a "+c+"°nota:"));
			media += m;
		}
		media = media/4;
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, nome + " a sua média é " + media + " você está aprovado");
		} else {
			JOptionPane.showMessageDialog(null, nome + " a sua  média é " + media + " você está reprovado");
		} 
	}

}

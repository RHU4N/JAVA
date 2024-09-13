package br.edu.com.fatec.app;

import java.util.Scanner;

public class ProgramaImc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IMC imc = new IMC();
		System.out.println("Digite seu peso: ");
		imc.setPeso(sc.nextDouble());
		System.out.println("Digite sua altura: ");
		imc.setAltura(sc.nextDouble());
		
		System.out.println("=-=-=-=-=-=-=-=");
		System.out.println("Peso: "+imc.getPeso());
		System.out.println("Altura: "+imc.getAltura());
		System.out.println(imc);
		sc.close();
	}
}

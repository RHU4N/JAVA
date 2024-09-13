package br.edu.com.fatec.app;

import java.util.Scanner;

public class MediaVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float[] notas = new float[8];
		float soma=0,media=0;
		for(int i =0;i<notas.length;i++) {
			System.out.println("Digite o " + (i+1)+ "° Valor");
			notas[i] += sc.nextInt();
			soma+=notas[i];
		}
		System.out.println("-=-=-=Resultado=-=-=-");
		for(int i=0;i<notas.length;i++) {
			System.out.println(notas[i]+ " ");
		}
		media=soma/notas.length;
		System.out.println("Média final:"+media);
		sc.close();
	}

}

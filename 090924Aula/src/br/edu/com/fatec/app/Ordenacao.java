package br.edu.com.fatec.app;

import java.util.Scanner;

public class Ordenacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] valor = new int[10];
		int aux =0;
		for (int a=0;a<10;a++) {
			System.out.println("Digite o "+(a+1)+ "° Valor");
			valor[a] = sc.nextInt();
		}
		for(int a=0;a<10;a++) {
			for(int b=a+1;b<10;b++) {
				if(valor[a]>valor[b]) {
					aux = valor[b];
					valor[b]=valor[a];
					valor[a]=aux;
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(valor[i] + "");
		}
	}
}

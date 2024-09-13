package br.edu.com.fatec.app;

import java.util.Iterator;
import java.util.Scanner;

public class ReceberVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] valor = new int[10];
		
		for (int i = 0;i<valor.length; i++) {
			System.out.println("Digite o" + (i+1) +" °Valor");
			valor[i]=sc.nextInt();
		}
		
		System.out.println("Valores recebidos");
		for (int i = 0; i<valor.length; i++) {
			System.out.println(valor[i]+" ");
			
		}

		sc.close();
	}
}

package br.edu.fateccotia;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,result;
		String resp = "S";
		Scanner sc = new Scanner(System.in);
		while (resp.equals("S")) {
			System.out.println("Qual número vc quer a tabuada");
			n =sc.nextInt();
			for(int c = 1;c<=10;c++) {
				result = n * c;
				System.out.println(n+"x"+c+"="+result);
			}
			System.out.println("Deseja continuar (S/N)");
			resp = sc.next().toUpperCase();	
		}
		
		sc.close();
	}

}

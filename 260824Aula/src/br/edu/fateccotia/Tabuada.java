package br.edu.fateccotia;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual número vc quer a tabuada");
		n =sc.nextInt();
		for(int c = 1;c<=10;c++) {
			result = n * c;
			System.out.println(n+"x"+c+"="+result);
		}
		sc.close();
	}

}

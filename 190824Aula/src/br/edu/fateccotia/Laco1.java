package br.edu.fateccotia;

public class Laco1 {
	public static void main(String[] args) {
		System.out.println("=====Número de 0 a 100=====");
		for(int c=0;c<=100;c++) {
			System.out.println("Linha "+c);
		}
		
		System.out.println("=====Pares=====");
		for(int c=0;c<=100;c+=2) {
			System.out.println("Linha "+c);
		}
		
		System.out.println("=====Impares=====");
		for(int c=1;c<100;c+=2) {
			System.out.println("Linha "+c);
		}
	}
}

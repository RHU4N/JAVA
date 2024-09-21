package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto2;

public class ProgramaProduto2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do produto");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.println("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		Produto2 prod = new Produto2(nome,preco,quantidade);
		System.out.println();
		System.out.println("Nome do Produto : " + prod);
		System.out.println();
		System.out.println("Entre com número de produtos adicionados no estoque: ");
		quantidade = sc.nextInt();
		prod.adicionarProduto(quantidade);
		System.out.println();
		System.out.println("Atualizar" + prod);
		System.out.println();
		System.out.println("Entre com número de produtos removidos do estoque: ");
		quantidade = sc.nextInt();
		prod.removerProduto(quantidade);
		System.out.println();
		System.out.println("Produto Atualizados: "+ prod);
		sc.close();
	}
}

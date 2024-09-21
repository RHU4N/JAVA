package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ProgramaProduto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto prod = new Produto();
		
		System.out.println("Entre com o nome do produto");
		System.out.print("Nome: ");
		prod.setNome(sc.nextLine());
		System.out.print("Preço: ");
		prod.setPreco(sc.nextDouble());
		System.out.println("Quantidade em estoque: ");
		prod.adicionarProduto(sc.nextInt());
		System.out.println();
		System.out.println("Nome do Produto : " + prod);
		System.out.println();
		System.out.println("Entre com número de produtos adicionados no estoque: ");
		prod.adicionarProduto(sc.nextInt());
		System.out.println();
		System.out.println("Atualizar" + prod);
		System.out.println();
		System.out.println("Entre com número de produtos removidos do estoque: ");
		prod.removerProduto(sc.nextInt());
		System.out.println();
		System.out.println("Produto Atualizados: "+ prod);
		sc.close();
		
	}
}

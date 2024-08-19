import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		String nome;
		System.out.print("Digite seu nome: ");
		nome = sc.next();
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();

		if (idade >= 60) {
			System.out.println(nome + " Você é idoso");
		} else if (idade >= 18) {
			System.out.println(nome + " Você é adulto");
		} else {
			System.out.println(nome + " Você é criança");
		}
		sc.close();
	}

}

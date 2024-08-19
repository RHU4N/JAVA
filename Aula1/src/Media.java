import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double v1,v2,media;
		System.out.print("Digite o primeiro valor: ");
		v1 = sc.nextDouble();
		System.out.print("Digite o segundo valor: ");
		v2 = sc.nextDouble();
		media = v1 + v2 / 2;
		System.out.print("A média é " + media);
		sc.close();
	}

}

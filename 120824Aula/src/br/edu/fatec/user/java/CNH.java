package br.edu.fatec.user.java;

import java.util.Scanner;

public class CNH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Passou no psicotécnico(s para sim e n para não");
		char psico = Character.toLowerCase(sc.next().charAt(0));
		System.out.println("Passou no exame médico(s para sim e n para não");
		char medico = Character.toLowerCase(sc.next().charAt(0));
		System.out.println("Passou no exame prático(s para sim e n para não");
		char pratico = Character.toLowerCase(sc.next().charAt(0));
		if ((psico == 's') && (medico == 's') && (pratico == 's')) {
			System.out.println("O aluno está habilitado :)");
		} else {
			System.out.println("O aluno não está habilitado :( ");
		}

		sc.close();

	}

}

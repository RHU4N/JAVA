package br.edu.fateccotia;

public class Horario {

	public static void main(String[] args) {
		for (int hora = 0;hora<=23;hora++) {
			for (int min = 0; min<=59; min++) {
                // Usando String.format para formatar os números com dois dígitos
                String horario = String.format("%02d:%02d", hora, min);
                System.out.println(horario);
			}
			
		}

	}

}

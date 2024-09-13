package br.edu.com.fatec.app;

public class IMC {
	private double peso;
	private double altura;
	
	public IMC() {
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public String toString() {
		double imc = peso/(altura*altura);
		if(imc>30) {
			return String.format("Seu imc é %.2f%n você está obeso", imc);
		}else if(imc>25) {
			return String.format("Seu imc é %.2f%n você está com sobrepeso", imc);
		}else if(imc>18.5) {
			return String.format("Seu imc é %.2f%n você está com peso normal", imc);
		}else {
			return String.format("Seu imc é %.2f%n você está muito magro", imc);
		}
	}
	
}

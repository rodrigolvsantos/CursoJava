package Youtube.POO;

import java.util.Random;

public class Carro {
	int ano;
	String cor;
	
	public Carro() {
		Random numChassi = new Random();
		int chassi = numChassi.nextInt(1000);
		System.out.println("Chassi: " + chassi);
	}
	
	public Carro(int ano, String cor) {
//		Quando definimos parâmetros em uma classe que a vamos chamar depois precisamos da instrução This.
		this.ano = ano;
		this.cor = cor;
	}
	
	void ligar () {
		System.out.println("\nEngine - ON");
	}
	
	void desligar () {
		System.out.println("\nEngine - OFF");
	}
	
	void acelerar () {
		System.out.println("\nVrummmmmmmmmm!!");
	}
	
	
	
}

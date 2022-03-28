package Youtube.POO;

public class Camaro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Repare que ao executar o código, ele vai chamar um construtor. 
		 * Este construtor está na classe Carro, e chama-se Carro()
		 * O construtor já executa e chama o número do Chassis
		*/
		
		Carro camaro = new Carro();
		camaro.ano = 2012;
		camaro.cor = "Amarelo";
		
		System.out.println("Carro: Camaro" );
		System.out.println("Ano: " + camaro.ano );
		System.out.println("Cor: " + camaro.cor );
		
		camaro.ligar();
		camaro.acelerar();
		camaro.desligar();


	}

}

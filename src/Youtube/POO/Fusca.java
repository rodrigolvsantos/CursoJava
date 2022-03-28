package Youtube.POO;

public class Fusca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Repare que ao executar o código, ele vai chamar um construtor. 
		 * Este construtor está na classe Carro, e chama-se Carro()
		 * O construtor já executa e chama o número do Chassis
		*/
		
		Carro fusca = new Carro();
		fusca.ano = 1989;
		fusca.cor = "Azul";
		
		System.out.println("Carro: Fusca" );
		System.out.println("Ano: " + fusca.ano );
		System.out.println("Cor: " + fusca.cor );
		
		fusca.ligar();
		fusca.acelerar();
		fusca.desligar();

	}

}

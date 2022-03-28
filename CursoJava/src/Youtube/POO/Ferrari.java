package Youtube.POO;

public class Ferrari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Repare que ao executar o código, ele vai chamar um construtor. 
		 * Este construtor está na classe Carro, e chama-se Carro()
		 * O construtor já executa e chama o número do Chassis
		*/
		
		Carro ferrari = new Carro();
		ferrari.ano = 2012;
		ferrari.cor = "Vermelho";
		
		System.out.println("Carro: Ferrari" );
		System.out.println("Ano: " + ferrari.ano );
		System.out.println("Cor: " + ferrari.cor );
		
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.desligar();
		
	}

}

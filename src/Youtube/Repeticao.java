package Youtube;

public class Repeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Estrutura de repetição!!!");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i+ " - Dunha!!!!");
		}
		
		
		System.out.println("\n\nTabuada do numero X!!!\n\n");
		int resultado = 0;
		int multiplica = 8;
	    
		for (int tabuada = 0; tabuada <= 10; tabuada++ ) {
			resultado = multiplica * tabuada;
			System.out.println(tabuada + " * 5 = " + resultado);
		 
		}

		System.out.println("\n\nTabuada completa!!!\n\n");
		
		for (int tabuada = 0; tabuada <= 10; tabuada++ ) {
			System.out.println("");
			
			for (int multiplicador = 0; multiplicador <= 10; multiplicador++ ) {
				resultado = multiplicador * tabuada;
				System.out.println(tabuada + " * " + multiplicador + " = " + resultado);

			}
					 
		}

		System.out.println("\n\nUso estrutura While!!!\n\n");
		

		int contador = 0;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("\n\nUso estrutura Do While!!!\n\n");

		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente (s/n)??");
			novoJogo = 'n';
			
		}while (novoJogo =='s');
		System.out.println("GAME OVER!!!");
	}
	
	

}

package Youtube;

public class Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade = 15;
		char sexo = 'M';
		String nome = "Rodrigo";
		boolean empregado = true;
		double i = 10;
		
		System.out.println("Estrutura de controle condicional - If e Else");

		
			if (sexo != 'F' && sexo != 'M') {
				System.out.println("Digite apenas M ou F!!!");
			} else {
				if (sexo == 'M' && idade >= 18) {
				 System.out.println("Alistamento militar obrigatório!!!");	
				}else {
			     System.out.println("Alistamento militar não obrigatório!!!");				
				}
				
			}
			
		System.out.println("\n\nEstrutura de controle condicional - elseif");
		
		if (idade < 16) {
			System.out.println("Proibido votar!!!");
		} else if (idade >= 18 && idade <= 70) {
			System.out.println("VOTO OBRIGATORIO");
		}else  {
			System.out.println("Voto Facultativo");
		}
		
		System.out.println("\n\nEstrutura de controle Switch Case");
		System.out.println("1 - Cadastro de clientes");
		System.out.println("2 - Cadastro de usuários");
		System.out.println("3 - Relatórios");

		System.out.println("\n\n");
		int opcao = 3;
		
		switch (opcao) {
		case 1:
			System.out.println("Clientes!!");
			break;
		case 2:
			System.out.println("Usuários!!");
			break;
		case 3:
			System.out.println("Relatórios!!!");
			break;
		default:
			System.out.println("Opção inválida!!!");
			break;
			
		}
		
		
	}

}

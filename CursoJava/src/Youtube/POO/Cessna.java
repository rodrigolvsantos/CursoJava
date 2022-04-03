package Youtube.POO;

public class Cessna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao cessna = new Aviao();
		cessna.ano = 2012;
		cessna.cor = "Branco";
		cessna.envergadura = 11;
		
		System.out.println("Avião: Cessna!!!");
		System.out.println("Cor: "+ cessna.cor);
		System.out.println("Ano: " + cessna.ano);
		System.out.println("Envergadura: " + cessna.envergadura);
		
		
		cessna.ligar();
		cessna.acelerar();
		cessna.decolar();
		cessna.aterrizar();
		cessna.desligar();
	}

}

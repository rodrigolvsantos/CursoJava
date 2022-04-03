package Youtube;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 36;
		char sexo = 'M';
		String nome = "Rodrigo";
		boolean empregado = true;
		double i = 10;
		
		System.out.println("Operadores aritimeticos e atribuições!!");
		
		System.out.println("i =  " + i );
		System.out.println("i = "+ i + " + 5 | i = " + (i + 5));
		System.out.println("i = "+ i + " - 5 | i = " + (i - 5));
		System.out.println("i = "+ i + " * 5 | i = " + (i * 5));
		System.out.println("i = "+ i + " / 5 | i = " + (i / 5));
		System.out.println("i = "+ i + " MOD 5 | i = " + (i % 5));
		System.out.println("i += 5 | i = " + (i += 5));
		System.out.println("i -= 5 | i = " + (i -= 5));
		System.out.println("i *= 5 | i = " + (i *= 5));
		System.out.println("i /= 5 | i = " + (i /= 5));
		i++;
		System.out.println("i++ | i = " + i);
		i--;
		System.out.println("i -- | i = " + i);
		
	}

}

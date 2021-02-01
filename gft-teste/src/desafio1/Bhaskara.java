package desafio1;

import java.util.Scanner;

public class Bhaskara {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Valor de A = ");
		float a = entrada.nextFloat();
		
			if(a == 0) {
				System.out.println("Impossível calcular");
			
			}else {
		
				System.out.println("Valor de B = ");
				float b = entrada.nextFloat();
		
				System.out.println("Valor de C = ");
				float c = entrada.nextFloat();
		
				float delta = (float) (Math.pow(b, 2) - (4 * (a * c)));
				
					if(delta < 0) {
						System.out.println("Impossível calcular");		
					} else {
						float x1 = (float) ((-b + Math.sqrt(delta)) + (2 * a));
						float x2 = (float) ((-b - Math.sqrt(delta)) + (2 * a));
			
						System.out.printf("X1 = %.5f\n", x1);
						System.out.printf("X2 = %.5f", x2);
					}	
		}
		
		entrada.close();
	}

}

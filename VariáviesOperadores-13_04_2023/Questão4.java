package JavaTech;

import java.util.Scanner;

public class Atividade4VFloat {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, d;
		float numero1, numero2, numero3, numero4, diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-- Diferença dos Números Parte 1--\n");
		
		System.out.println("Número 1: ");
		n1= sc.nextFloat();
		System.out.println("Número 2: ");
		n2= sc.nextFloat();
		System.out.println("Número 3: ");
		n3= sc.nextFloat();
		System.out.println("Número 4: ");
		n4= sc.nextFloat();
		
		d= (n1*n2)-(n3*n4);
		System.out.printf("Diferença: %.1f \n", d);
		
		
System.out.println("\n-- Diferença dos Números Parte 2--\n");
		
		System.out.println("Número 1: ");
		numero1= sc.nextFloat();
		System.out.println("Número 2: ");
		numero2= sc.nextFloat();
		System.out.println("Número 3: ");
		numero3= sc.nextFloat();
		System.out.println("Número 4: ");
		numero4= sc.nextFloat();
		
		diferenca= (numero1*numero2)-(numero3*numero4);
		
		System.out.printf("Diferença: %.1f", diferenca);
			
	}

}

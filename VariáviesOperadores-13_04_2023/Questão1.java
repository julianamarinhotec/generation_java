package JavaTech;

import java.util.Scanner;

public class Atividade1VFloat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float salario,abono;
				
		System.out.println("Digite o salário: R$   ");
		 salario = sc.nextFloat();
		
		System.out.println("Digite o abono: R$   ");
		 abono = sc.nextFloat();
		
		System.out.println(" --- PROCESSANDO ---");
		
		float soma = salario + abono;
		System.out.printf("O novo salário: R$ %.2f",soma);
		
				
	}

}



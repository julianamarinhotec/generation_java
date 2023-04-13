package JavaTech;

import java.util.Scanner;

public class Atividade3VFloat {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-- Contracheque --");
		
		System.out.println("Salário Bruto: R$ ");
		salarioBruto = sc.nextFloat();
		System.out.println("Adicional Noturno: R$ ");
		adicionalNoturno = sc.nextFloat();
		System.out.println("Horas Extras: R$ ");
		horasExtras = sc.nextFloat();
		System.out.println("Descontos: R$ ");
		descontos = sc.nextFloat();
		
		salarioLiquido = salarioBruto+adicionalNoturno+ (horasExtras*5)- descontos;
		
		System.out.printf("Salário Líquido: R$  %.2f",salarioLiquido);
		
			
	}

}

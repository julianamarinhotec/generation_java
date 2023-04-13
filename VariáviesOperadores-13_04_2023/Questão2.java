package JavaTech;

import java.util.Scanner;

public class Atividade2Média {

	public static void main(String[] args) {
		
	 float n1, n2, n3, n4, media;
	 
	 Scanner sc = new Scanner(System.in);
	 	
	 System.out.println("--- Notas do Participante ---\n");
	 
	 System.out.println("Nota 1: ");
	  n1= sc.nextFloat();
	 System.out.println("Nota 2: ");
	  n2 = sc.nextFloat();
	 System.out.println("Nota 3: ");
	  n3 =sc.nextFloat();
	 System.out.println("Nota 4: ");
	  n4 =sc.nextFloat();
	 
	 media = (n1+n2+n3+n4)/4;
	 
	 System.out.printf("\n Média Final: %.1f", media);
		

	}

}

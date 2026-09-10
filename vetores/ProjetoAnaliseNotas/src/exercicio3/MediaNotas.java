package exercicio3;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double soma = 0;
		double [] notas = new double [5];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a "+ (i + 1) + "ª nota: ");
			notas[i] = Integer.parseInt(leia.nextLine());
			soma += notas[i];
		}
		System.out.println("Notas cadastradas:");
       for(double nota: notas) {
    	   System.out.println(nota);
       }
       System.out.println("Média final: " + soma/notas.length);
	}

}

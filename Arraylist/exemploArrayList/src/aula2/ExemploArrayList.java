package aula2;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();
		String nome;
		String continuar;
		
		do {
			System.out.println("Digiteum nome: ");
			nome = leia.nextLine();
			
			nomes.add(nome);
			
			System.out.println("Deseja adicionar outro nomme?  (s/n):");
			continuar = leia.nextLine();
		}while(continuar.equalsIgnoreCase("s"));
		
		System.out.println("\nNomes cadastrados:");
		
		for(String nomeCadastrado : nomes) {
			System.out.println(nomeCadastrado);
		}
		
		leia.close();
		
	}

}

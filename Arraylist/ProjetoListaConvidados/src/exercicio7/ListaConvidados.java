package exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaConvidados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> convidados = new ArrayList<>();
		
		int opcao;
		String convidado;
		int posicao;
		
		do {
			System.out.println("Escolha a opição: \n 1 - Adicionar convidad 2 - Alterar convidado 3 - Remover convidado 4 - Procurar convidado 5 - Exibir convidados 6 - Encerra");
			opcao = Integer.parseInt(leia.nextLine());
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o nome do convidado: ");
				convidado = leia.nextLine();
				convidados.add(convidado);
				break;
			case 2:
				System.out.println("Digite a posição do convidado que quer alterar e informe o novo nome: ");
				do {
					posicao = Integer.parseInt(leia.nextLine());
				}while(posicao >= 0 || posicao < convidados.size());
				convidados.set(posicao, leia.nextLine());
				break;
			case 3:
				System.out.println("Informe o nome do convidado que quer remover: ");
				convidados.contains(leia.nextLine());
				break;
			case 4:
				System.out.println("Informe o nome do convidado que deseja procurar: ");
				System.out.println(convidados.indexOf(leia.nextLine()));
				
			}
			
		}while(opcao != 6);

	}

}

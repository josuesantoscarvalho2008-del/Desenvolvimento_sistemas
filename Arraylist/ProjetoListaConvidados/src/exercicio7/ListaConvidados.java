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
		String novoNome;
		do {
			System.out.println("Escolha a opição: \n 1 - Adicionar convidad 2 - Alterar convidado 3 - Remover convidado 4 - Procurar convidado 5 - Exibir convidados 6 - Encerra");
			opcao = Integer.parseInt(leia.nextLine());
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o nome do convidado: ");
				convidado = leia.nextLine();
				System.out.println(convidados.add(convidado));
				break;
			case 2:
				System.out.println("Digite a posição do convidado: ");
				
					posicao = Integer.parseInt(leia.nextLine());
				
				System.out.println("Informe o novo nome do convidado: ");
				novoNome = leia.nextLine();
				System.out.println(convidados.set(posicao, novoNome));
				break;
			case 3:
				System.out.println("Informe o nome do convidado que quer remover: ");
				System.out.println(convidados.contains(leia.nextLine()));
				break;
			case 4:
				System.out.println("Informe o nome do convidado que deseja procurar: ");
				System.out.println(convidados.indexOf(leia.nextLine()));
				break;
			case 5:
				for(String nome: convidados) {
					System.out.println(nome);
				}
				break;
			case 6:
				System.out.println("Sistema encerrado");
				break;
				default:
					System.out.println("Opção invalida.");
					break;
				
			}
			
		}while(opcao != 6);

	}

}

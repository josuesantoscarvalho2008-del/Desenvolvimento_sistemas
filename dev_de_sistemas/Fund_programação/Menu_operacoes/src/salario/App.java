package salario;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Calcular o imposto sobre o salário");
            System.out.println("2. Calcular o novo salário após um aumento");
            System.out.println("3. Mostrar a classificação do salário");
            System.out.println("4. Finalizar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.print("Digite o salário bruto: ");
                    double salario = leia.nextDouble();
                    double imposto;

                    if (salario < 500.00) {
                        imposto = salario * 0.05;
                    } else if (salario <= 850.00) {
                        imposto = salario * 0.10;
                    } else {
                        imposto = salario * 0.15;
                    }

                    System.out.printf("Imposto a pagar: R$ %.2f%n", imposto);
                    break;
                }

                case 2: {
                    System.out.print("Digite o salário bruto: ");
                    double salario = leia.nextDouble();
                    double novoSalario;

                    if (salario > 1500.00) {
                        novoSalario = salario + 250.00;
                    } else if (salario >= 750.00) {
                        novoSalario = salario + 50.00;
                    } else if (salario >= 450.00) {
                        novoSalario = salario + 75.00;
                    } else {
                        novoSalario = salario + 100.00;
                    }

                    System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
                    break;
                }

                case 3: {
                    System.out.print("Digite o salário bruto: ");
                    double salario = leia.nextDouble();

                    if (salario < 700.00) {
                        System.out.println("Classificação: Mal remunerado");
                    } else {
                        System.out.println("Classificação: Bem remunerado");
                    }
                    break;
                }

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 4);

        leia.close();

	}

}

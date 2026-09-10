package exercicio5;

import java.util.Scanner;

public class ParesElmpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println();

       
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                
                System.out.println("Número " + numero + ": par");
                quantidadePares++;
            } else {
                System.out.println("Número " + numero + ": ímpar");
                quantidadeImpares++;
            }
        }

        
        System.out.println("\nQuantidade de pares: " + quantidadePares);
        System.out.println("Quantidade de ímpares: " + quantidadeImpares);

        scanner.close();
    }
}
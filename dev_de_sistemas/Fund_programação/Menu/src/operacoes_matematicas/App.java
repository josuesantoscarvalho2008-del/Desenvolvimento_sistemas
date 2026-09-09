package operacoes_matematicas;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		int numero1 = leia.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		int numero2 = leia.nextInt();
		
		System.out.println("");
		System.out.println("     1 - Calcular a média dos números; ");
		System.out.println("     2 - Subtrair o menor número do maior; ");
		System.out.println("     3 - Multiplicar os números; ");
		System.out.println("     4 - Dividir o primeiro número pelo segundo. ");
		System.out.println(""
				+ "");
		System.out.println("INFORME O NÙMERO CORRESPONDENTE AO CALCULO");
        int numero = leia.nextInt();
		
		switch(numero){
		case 1:
			System.out.println("A média é: " + (numero1 + numero2)/2);
			break;
		case 2:
			if(numero1 > numero2) {
			System.out.println("O valor da subtração do menor número é: " + (numero1 - numero2));
			}else {
				System.out.println("O valor da subtração do menor número é: " + (numero2 - numero1));	
			}
			break;
		case 3:
			System.out.println("O valor da multiplicação é: " + numero1 * numero2);
			break;
		case 4:
			if(numero2 != 0) {
			System.out.println("O valor da divição é: " + numero1 / numero2);
			}else {
				System.out.println("Não da para fazer divição por Zero");
			}
			break;
			default:
				System.out.println("Opição Inválida");
		}
	}

}

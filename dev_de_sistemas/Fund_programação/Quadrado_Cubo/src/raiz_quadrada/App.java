package raiz_quadrada;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		

		
		        Scanner leia = new Scanner(System.in);
		        double numero;

		        System.out.print("Digite um número (0 ou negativo para sair): ");
		        numero = leia.nextDouble();

		        while (numero > 0) {
		            double quadrado = numero * numero;
		            double cubo = numero * numero * numero;
		            double raiz = Math.sqrt(numero);

		            System.out.println("Valor digitado: " + numero);
		            System.out.println("Quadrado: " + quadrado);
		            System.out.println("Cubo: " + cubo);
		            System.out.println("Raiz quadrada: " + raiz);
		            System.out.println("-----------------------------");

		            System.out.print("Digite um número (0 ou negativo para sair): ");
		            numero = leia.nextDouble();
		        }

		        System.out.println("Programa finalizado.");
		        leia.close();
		    
		}

	}



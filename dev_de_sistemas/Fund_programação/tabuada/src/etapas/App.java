package etapas;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		
        do {
        	
        	System.out.println("Informe um numero: ");
    		numero = leia.nextInt();
    		
	}while(numero <= 0);
        
        for (int i = 1;i <= 10;i++) {
        	System.out.println(numero + " x " + i + " = " + numero*i);
        }

}
}

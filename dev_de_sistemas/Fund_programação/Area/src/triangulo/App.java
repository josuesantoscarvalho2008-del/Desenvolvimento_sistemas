package triangulo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double area;
		double base;
		double altura;
      do {  
    	  
      
		System.out.println("Informe a altura do triangulo: ");
		altura = leia.nextDouble();
		
		System.out.println("Informe a base do triangulo: ");
		base = leia.nextDouble();
		
		if(altura <= 0 ||base <= 0 ) {
		System.out.println("ERRO!!! informe os valores novamente.");	
	}
   }while(altura <= 0 || base <=0 );
      area = (base*altura)/2;
System.out.println("A area do Triangulo é " + area + "m" );
}
}
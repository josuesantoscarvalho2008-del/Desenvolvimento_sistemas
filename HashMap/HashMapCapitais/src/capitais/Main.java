package capitais;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> capitais = new HashMap<>();
		Scanner leia = new Scanner(System.in);
		
		capitais.put("Rio de Janeiro", "Rio de Janeiro");
		capitais.put("São Paulo", "São Paulo");
		capitais.put("Minas Gerais", "Belo Horizonte");
		capitais.put("Bahia","Salvador");
		capitais.put("Paraná" , "Curitiba");
		
		System.out.println("Informe o nome do Estado: ");
		String estado = leia.nextLine();
		
		if(capitais.containsKey(estado)) {
			String nome = capitais.get(estado);
			System.out.println("Capital: " + nome);
		}else {
			System.out.println("Estado não encontrado.");
		}
        leia.close();
	}

}

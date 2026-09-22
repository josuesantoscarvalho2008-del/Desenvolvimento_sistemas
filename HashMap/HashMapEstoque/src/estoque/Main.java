package estoque;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Integer> estoque = new HashMap<>();
		
		estoque.put("Teclado", 10);
		estoque.put("Mouse", 15);
		estoque.put("Monitor", 6);
		estoque.put("Notebook", 4);
		
		System.out.println("Lista de Produtos\n");
		
		for(Map.Entry<String, Integer> produto : estoque.entrySet()) {
			System.out.println(
					"Nome do produto: " + produto.getKey()
			        + "\nQuantidade: " + produto.getValue()+"\n" 
		    );
		}

	}

}

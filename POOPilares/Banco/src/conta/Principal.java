package conta;

public class Principal {

	public static void main(String[] args) {
		 
		ContaBancaria conta1 = new ContaBancaria(100,"Josué",1000000.00);
		ContaBancaria conta2 = new ContaBancaria(101,"pedro",10000.00);
		
		conta1.exibirDados();
		conta2.exibirDados();

	}

}

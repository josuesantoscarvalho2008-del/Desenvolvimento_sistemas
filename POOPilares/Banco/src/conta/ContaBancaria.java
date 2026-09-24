package conta;

public class ContaBancaria {
	
	private int numeroConta;
	private String nomeCliente;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String nomeCliente, double saldo) {
		
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}
	
	public ContaBancaria() {
		
		this.numeroConta = 0;
		this.nomeCliente = "";
		this.saldo = 0.0;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void exibirDados () {
		System.out.printf("Numero da conta: %d%n Nome do cliente: %s%n Saldo: %.2f%n%n", numeroConta, nomeCliente,saldo);
	}

       
	
}

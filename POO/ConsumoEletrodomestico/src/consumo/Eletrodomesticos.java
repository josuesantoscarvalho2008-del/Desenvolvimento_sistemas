package consumo;

public class Eletrodomesticos {
	String nome;
	double potenciaWatts;
	double horasPorDia;
	
	public Eletrodomesticos(String nome, double potenciaWatts, double horasPorDia) {
		
		this.nome = nome;
		this.potenciaWatts = potenciaWatts;
		this.horasPorDia = horasPorDia;
		
	
	}
	public Eletrodomesticos() {
		
		this.nome = "";
		this.potenciaWatts = 0.0;
		this.horasPorDia = 0.0;
		
	}
	 public double consumoDiarioWh() {
		 
		 return potenciaWatts * horasPorDia;
	 }
	 public double consumoMensalWh() { 
		 
		 return consumoDiarioWh()* 30;
	 }
	 public double consumoAnualWh() {
		 
		 return consumoMensalWh()* 12;
	 }
	 public double gastoMensal(double precoKwh) {
		 
		 return (consumoMensalWh() / 1000) * precoKwh;
	 }
	public void exibirRelatorio(double precoKwh) {
		
		System.out.printf("Nome: %s%n",nome);
		System.out.printf("Potencia em watts: %.2f%n",potenciaWatts);
		System.out.printf("Horas por dia: %.2f%n",horasPorDia);
		System.out.printf("Tarifa: %.2f%n",precoKwh);
		System.out.printf("Consumo diario : %.2f%n",consumoDiarioWh());
		System.out.printf("Consumo mensal : %.2f%n",consumoMensalWh());
		System.out.printf("Consumo anual: %.2f%n",consumoAnualWh());
		System.out.printf("Gasto mensal : %.2f%n",gastoMensal(precoKwh));
	}
	

}

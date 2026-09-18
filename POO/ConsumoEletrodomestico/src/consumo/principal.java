package consumo;

public class principal {

	public static void main(String[] args) {
		Eletrodomesticos eletro1 = new Eletrodomesticos("ventilador",100,8);
		
		eletro1.nome = "Ventilador";
		eletro1.potenciaWatts = 100;
		eletro1.horasPorDia = 8;
		
		
		eletro1.exibirRelatorio(0.9);

	}

}

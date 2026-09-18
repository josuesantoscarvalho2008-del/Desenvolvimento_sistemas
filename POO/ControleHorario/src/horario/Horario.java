package horario;

public class Horario {
	
	int horas;
	int minutos;
	int segundos;
	
	public Horario(int hora, int minuto, int segundo) {
		if(
		   (hora>= 0 && hora<=23) && 
		   (minuto >= 0 && minuto <=59) &&
		   (segundo>= 0 && segundo <=59) )
		
		this.horas = hora;
		this.minutos = minuto;
		this.segundos = segundo;
	}

	public Horario() {
		this.horas = 00;
		this.minutos = 00;
		this.segundos = 00;
		
	}
	
	public  void exibir() {
		System.out.printf("Hora: %02d:%02d:%02d %n", horas,minutos,segundos );
		
	}

	public int calcularSegundos() {
		return (horas * 3600) + (minutos * 60) + segundos;
	}
	
	

}

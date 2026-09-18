package horario;

public class Principal {

	public static void main(String[] args) {
		Horario tempo1 = new Horario();
		Horario tempo2 = new Horario(14,20,05);
		
		tempo1.horas = 8;
		tempo1.minutos = 15;
		tempo1.segundos = 30;
		
		
		tempo1.exibir();
		System.out.println("Segundos: "+ tempo1.calcularSegundos());	
		
		tempo2.exibir();
		System.out.println("Segundos: "+ tempo2.calcularSegundos());
		}

}

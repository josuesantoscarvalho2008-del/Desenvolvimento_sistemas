package carlos_joao;

public class App {

	public static void main(String[] args) {
		double valorCarlos = 3000.00;
        double taxaCarlos = 0.02; // 2% ao mês

        double valorJoao = valorCarlos / 3;
        double taxaJoao = 0.05; // 5% ao mês

        int meses = 0;

        while (valorJoao < valorCarlos) {
            valorCarlos += valorCarlos * taxaCarlos;
            valorJoao += valorJoao * taxaJoao;
            meses++;
        }

        System.out.println("Meses necessários: " + meses);
        System.out.printf("Valor acumulado por Carlos: R$ %.2f%n", valorCarlos);
        System.out.printf("Valor acumulado por João: R$ %.2f%n", valorJoao);
	}

}

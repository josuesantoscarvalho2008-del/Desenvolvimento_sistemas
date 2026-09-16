package academia;

public class Pricipal {

    public static void main(String[] args) {

        AlunoAcademia ana = new AlunoAcademia("Ana", 17, 60, 1.65);
        AlunoAcademia bruno = new AlunoAcademia("Bruno", 25, 80, 1.80);

        System.out.println("--- Dados de Ana ---");
        ana.exibirDados();

        System.out.println("\n--- Dados de Bruno ---");
        bruno.exibirDados();

        // Alterando o peso de Bruno
        bruno.setPeso(78);

        System.out.println("\n--- Dados de Bruno apos alteracao de peso ---");
        bruno.exibirDados();
    }
}
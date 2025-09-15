import java.util.Scanner;

public class Lista1N12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a taxa fixa por dia: ");
        double taxaDia = entrada.nextDouble();
        System.out.print("Informe a taxa por Km rodado: ");
        double taxaKm = entrada.nextDouble();
        System.out.print("Informe o número de dias: ");
        int dias = entrada.nextInt();
        System.out.print("Informe a quilometragem rodada: ");
        double kmRodado = entrada.nextDouble();

        double desconto = taxaDia * dias * 0.10;
        double valorTotal = (taxaDia * dias - desconto) + (taxaKm * kmRodado);

        System.out.println("Valor total do aluguel: R$ " + valorTotal);
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Número de dias: " + dias);
        System.out.println("Quilometragem rodada: " + kmRodado);

        entrada.close();
    }
}

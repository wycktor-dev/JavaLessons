import java.util.Scanner;

public class Lista1N13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a taxa de consumo do refrigerador (kW): ");
        double taxaConsumo = entrada.nextDouble();
        System.out.print("Informe o tempo ligado (horas): ");
        double horas = entrada.nextDouble();
        System.out.print("Informe o valor do kWh: ");
        double valorKwh = entrada.nextDouble();

        double energiaGasta = taxaConsumo * horas;
        double valorPago = energiaGasta * valorKwh;

        System.out.println("Energia total gasta: " + energiaGasta + " kWh");
        System.out.println("Valor a ser pago: R$ " + valorPago);

        entrada.close();
    }
}

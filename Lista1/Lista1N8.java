import java.util.Scanner;

public class Lista1N8 {
    public static void main(String[] args) {
        final double MILIMETRO_POL = 25.4;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a temperatura em Fahrenheit: ");
        double fahrenheit = entrada.nextDouble();
        double celsius = (5 * (fahrenheit - 32)) / 9;
        System.out.println("Temperatura em Celsius: " + celsius);

        System.out.print("Informe a quantidade de chuva em polegadas: ");
        double polegadas = entrada.nextDouble();
        double milimetros = polegadas * MILIMETRO_POL;
        System.out.println("Quantidade de chuva em milímetros: " + milimetros);

        entrada.close();
    }
}

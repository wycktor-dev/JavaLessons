import java.util.Scanner;

public class Lista1N7 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        final double CUSTO_M2 = 100.0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o raio da lata (em metros): ");
        double raio = entrada.nextDouble();

        System.out.print("Informe a altura da lata (em metros): ");
        double altura = entrada.nextDouble();

        double area = 2 * PI * raio * (raio + altura);
        double custo = area * CUSTO_M2;

        System.out.println("O custo da lata é: R$ " + custo);

        entrada.close();
    }
}

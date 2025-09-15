import java.util.Scanner;

public class Lista1N3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a cotação do dólar (em reais): ");
		double cotacao = entrada.nextDouble();

		System.out.print("Informe o valor do produto (em dólar): ");
		double valorDolar = entrada.nextDouble();

		double valorReais = cotacao * valorDolar;

		System.out.println("O valor do produto em reais é: R$ " + valorReais);

		entrada.close();
	}
}

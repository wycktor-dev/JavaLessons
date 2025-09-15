import java.util.Scanner;

public class Lista1N4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o número de horas trabalhadas no mês: ");
		double horas = entrada.nextDouble();

		System.out.print("Informe o valor da hora: ");
		double valorHora = entrada.nextDouble();

		double salarioBruto = horas * valorHora;
		double descontoVT = salarioBruto * 0.06;
		double salarioLiquido = salarioBruto - descontoVT;

		System.out.println("O salário líquido é: R$ " + salarioLiquido);

		entrada.close();
		}
	}


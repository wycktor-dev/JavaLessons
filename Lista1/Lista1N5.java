import java.util.Scanner;

public class Lista1N5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o salário mensal atual: ");
        double salario = entrada.nextDouble();

        System.out.print("Informe o percentual de reajuste: ");
        double percentual = entrada.nextDouble();

        double novoSalario = salario + (salario * percentual / 100);
        System.out.println("O novo salário é: R$ " + novoSalario);

        entrada.close();
    }
}

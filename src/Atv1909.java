import java.util.Scanner;

public class Atv1909 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = scanner.nextInt();

        int soma = num1 + num2 + num3;

        if (soma < 100) {
            System.out.println("O valor não tem desconto.");
        } else {
            System.out.println("Excelente compra.");
        }
    }
}

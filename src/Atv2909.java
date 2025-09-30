import java.util.Scanner;

public class Atv2909 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        if (nota >= 7.0) {
            System.out.println("Aprovado");
        } else if (nota >= 4.0) {
            System.out.println("Substitutiva");
        } else {
            System.out.println("Reprovado");
        }
    }
}

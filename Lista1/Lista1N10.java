import java.util.Scanner;

public class Lista1N10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a idade em anos: ");
        int anos = entrada.nextInt();
        System.out.print("Informe a idade em meses: ");
        int meses = entrada.nextInt();
        System.out.print("Informe a idade em dias: ");
        int dias = entrada.nextInt();

        int idadeDias = anos * 365 + meses * 30 + dias;
        System.out.println("A idade em dias é: " + idadeDias);

        entrada.close();
    }
}

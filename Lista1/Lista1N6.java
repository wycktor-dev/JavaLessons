import java.util.Scanner;

public class Lista1N6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe quantos anos a pessoa viverá: ");
        int anos = entrada.nextInt();

        int batimentos = anos * 365 * 24 * 60 * 60;
        System.out.println("O coração baterá aproximadamente " + batimentos + " vezes.");

        entrada.close();
    }
}

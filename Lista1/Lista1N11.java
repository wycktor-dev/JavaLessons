import java.util.Scanner;

public class Lista1N11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o público total do jogo: ");
        int publico = entrada.nextInt();

        int popular = (int)(publico * 0.10);
        int geral = (int)(publico * 0.50);
        int arquibancada = (int)(publico * 0.30);
        int cadeiras = publico - (popular + geral + arquibancada);

        double renda = popular * 1.0 + geral * 5.0 + arquibancada * 10.0 + cadeiras * 20.0;
        System.out.println("A renda do jogo é: R$ " + renda);

        entrada.close();
    }
}

import java.util.Scanner;

public class Lista1N9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[3];
        int[] idades = new int[3];
        double[] pesos = new double[3];
        int somaIdade = 0;
        double somaPeso = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Informe o nome da pessoa " + (i+1) + ": ");
            nomes[i] = entrada.next();
            System.out.print("Informe a idade da pessoa " + (i+1) + ": ");
            idades[i] = entrada.nextInt();
            System.out.print("Informe o peso da pessoa " + (i+1) + ": ");
            pesos[i] = entrada.nextDouble();
            somaIdade += idades[i];
            somaPeso += pesos[i];
        }

        double mediaIdade = somaIdade / 3.0;
        double mediaPeso = somaPeso / 3.0;

        System.out.println("Idade média: " + mediaIdade);
        System.out.println("Peso médio: " + mediaPeso);

        entrada.close();
    }
}

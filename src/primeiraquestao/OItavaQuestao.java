package primeiraquestao;

import java.util.Scanner;

public class OItavaQuestao {
    public static void main(String[] args) {
        double altura, peso, soma;
        String[] arrayNomes = new String[5];
        double[] arrayAltura = new double[5];
        double[] arrayPeso = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome de 5 pessoas e suas respectivas altura e peso ");
            Scanner scanner = new Scanner(System.in);
            arrayNomes[i] = scanner.nextLine();
            arrayAltura[i] = scanner.nextDouble();
            arrayPeso[i] = scanner.nextDouble();
        }

        for (int j = 1; j < 5; j++) {
            double imc = arrayPeso[j] / (arrayAltura[j] * arrayAltura[j]);
            if (imc < 18.5 || imc > 25) {
                System.out.println("Fora do peso ideal " + arrayNomes[j]);
            }
        }

    }
}

package primeiraquestao;

import java.util.Scanner;

public class TerceiraQuestao {
    public static void main(String[] args) {
        int[] listaArray = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Escreva um numero");
            Scanner scanner = new Scanner(System.in);
            listaArray[i] = scanner.nextInt();
        }
        System.out.println("Números ímpares: ");
        for (int j = 0; j < 5; j++) {
            if (listaArray[j] % 2 != 0) {

                System.out.println(listaArray[j]);
            }
        }

        System.out.println("Números pares: ");
        for (int h = 0; h < 5; h++) {
            if (listaArray[h] % 2 == 0) {
                System.out.println(listaArray[h]);
            }
        }
    }
}
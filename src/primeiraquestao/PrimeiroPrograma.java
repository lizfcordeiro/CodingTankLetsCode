package primeiraquestao;

import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        String[] arrayFrutas = new String[5];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome da fruta ");
            arrayFrutas[i] = teclado.nextLine();
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(arrayFrutas[j]);
        }
    }
}


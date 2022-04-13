package primeiraquestao;

import java.util.Scanner;

public class QuintaQuestao {
    public static void main(String[] args) {
        int maior = 0;
        String[] arrayNomes = new String[5];
        String maiornome = "";
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome dos convidados ");
            arrayNomes[i] = teclado.nextLine();
        }
        for (int j = 0; j < 5; j++) {
            if (arrayNomes[j].length() > maior) {
                maior = arrayNomes[j].length();
                maiornome = arrayNomes[j];
            }
        }
        System.out.println("O maior nome é: " + maiornome);
    }
}

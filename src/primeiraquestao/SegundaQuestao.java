package primeiraquestao;

import java.util.Scanner;

public class SegundaQuestao {
    public static void main(String[] args) {
        String palavraInvertida = "";
        System.out.println("Escreva a palavra ");
        Scanner teclado = new Scanner(System.in);
        String palavra = teclado.nextLine();
        int tam = palavra.length();
        char[] palavraArray = palavra.toCharArray();
        for (int i = tam - 1; i >= 0 ; i--) {
            palavraInvertida = palavraInvertida + palavraArray[i];
        }
        System.out.println(palavraInvertida);
    }
}
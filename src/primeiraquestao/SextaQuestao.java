package primeiraquestao;

import java.util.Scanner;
public class SextaQuestao {
    public static void main(String[] args) {
        System.out.println("Escreva a palavra ");
        Scanner teclado = new Scanner(System.in);
        String palavra = teclado.nextLine();
        int tam = palavra.length();
        char[] palavraArray = palavra.toCharArray();
        for (int i = 0; i < tam ; i++) {
            if(i % 2 == 0) {
                palavraArray[i] = Character.toUpperCase(palavraArray[i]);
            }
        }
        System.out.println(new String(palavraArray));
    }
}

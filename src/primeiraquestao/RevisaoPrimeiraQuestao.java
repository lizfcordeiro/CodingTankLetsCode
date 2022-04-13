package primeiraquestao;

import java.util.Scanner;

public class RevisaoPrimeiraQuestao {
    public static void main(String[] args) {
        String[] carrinhoFrutas = new String[5];
        System.out.println("Escreva o nome de 5 frutas.");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < carrinhoFrutas.length; i++) {
            System.out.printf("Fruta %d/5: ", i + 1);
            carrinhoFrutas[i] = sc.next();
        }
        System.out.println("As frutas adicionadas ao seu carrinho são: ");

        for (
                String fruta : carrinhoFrutas) {
            System.out.println(fruta);
        }

    }
}
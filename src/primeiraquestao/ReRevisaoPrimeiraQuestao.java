package primeiraquestao;

import java.util.Scanner;

public class ReRevisaoPrimeiraQuestao {
    public static void main(String[] args) {
        String[] carrinhoDeFrutas = new String[5];
        System.out.println("Escreva o nome de 5 frutas ");
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < carrinhoDeFrutas.length; i++) {
            System.out.printf("Fruta %d/5: ", i+1);
            carrinhoDeFrutas[i] = teclado.next();
        }
        System.out.println("As frutas adicionadas ao seu carrinho, são ");
        for (String fruta : carrinhoDeFrutas) {
            System.out.println(fruta);

        }
    }
}

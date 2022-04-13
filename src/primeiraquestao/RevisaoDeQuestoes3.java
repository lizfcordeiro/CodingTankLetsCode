package primeiraquestao;

import java.util.Scanner;

public class RevisaoDeQuestoes3 {
    public static void main(String[] args) {
        int a, b;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        a = teclado.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(b = a * i);
        }
    }

}

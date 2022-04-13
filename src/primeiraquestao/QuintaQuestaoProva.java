package primeiraquestao;

import java.util.Scanner;

public class QuintaQuestaoProva {
    public static void main(String[] args) {
        System.out.println("Digite um número ");
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        if (n1 % 10 == 0) {
            System.out.println("É divisível por 10");
        } if (n1 % 5 == 0) {
            System.out.println("É divisível por 5");
        } if (n1 % 2 == 0) {
            System.out.println("É divisível por 2");
        } else {
            System.out.println("Não é divisível pelos 3: 10, 5, 2");
        }
    }
}

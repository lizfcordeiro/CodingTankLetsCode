package primeiraquestao;

import java.util.Scanner;
public class QuartaQuestao {
    public static void main(String[] args) {
        int soma = 0, maior, menor;
        System.out.println("Digite 5 números ");
        Scanner scanner = new Scanner(System.in);
        int primeiro = scanner.nextInt();
        maior = primeiro;
        menor = primeiro;
        soma = soma + primeiro;
        for (int i = 0; i < 4; i++) {
            Scanner teclado = new Scanner(System.in);
            int number = teclado.nextInt();
            if (number > maior) {
                maior = number;
            }
            if (number < menor) {
              menor = number;
            }
            soma = soma + number;
        }
        int media = soma / 5;
        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
        System.out.println("A média de todos os números é " + media);
    }

}

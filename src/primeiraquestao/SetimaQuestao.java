package primeiraquestao;

import java.util.Scanner;

public class SetimaQuestao {
    public static void main(String[] args) {
        int soma = 0, maiorIdade, menorIdade, indiceDaMaiorIdade = 0 , indiceDaMenorIdade = 0;
        String[] arrayNomes = new String[5];
        int[] arrayIdades = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite 5 nomes e 5 idades ");
            Scanner scanner = new Scanner(System.in);
            arrayNomes[i] = scanner.nextLine();
            arrayIdades[i] = scanner.nextInt();
        }
        maiorIdade = arrayIdades[0];
        menorIdade = arrayIdades[0];
        soma = soma + arrayIdades[0];

        for (int j = 1; j < 5; j++) {
            if (arrayIdades[j] > maiorIdade) {
                maiorIdade = arrayIdades[j];
                indiceDaMaiorIdade = j;
            }
            if (arrayIdades[j] < menorIdade) {
                menorIdade = arrayIdades[j];
                indiceDaMenorIdade = j;
            }
            soma = soma + arrayIdades[j];
        }
        int media = soma / 5;
        System.out.println("O maior número é " + arrayNomes[indiceDaMaiorIdade]);
        System.out.println("O menor número é " + arrayNomes[indiceDaMenorIdade]);
        System.out.println("A média de todos os números é " + media);
    }

}



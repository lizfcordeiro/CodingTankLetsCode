package primeiraquestao;

import java.util.Scanner;

public class PrimeiraQuestaoProva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float baseMaior =  scanner.nextFloat();
        float baseMenor = scanner.nextFloat();
        float altura = scanner.nextFloat();

        float area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println(area);
    }
}

package primeiraquestao;

import java.util.Scanner;

public class SegundaQuestaoProva {
    public static void main(String[] args) {
        int[] numeros = new int[]{100,50,1000,2};
        for(int i=0;i<numeros.length-1;i++){
            for (int j = i; j < numeros.length; j++) {
                if(numeros[i] > numeros[j]){
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        for (int numero: numeros) {
            System.out.printf(" %d ",numero);
        }
    }
}

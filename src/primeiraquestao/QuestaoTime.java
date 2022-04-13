package primeiraquestao;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Scanner;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class QuestaoTime {
    public static void main(String[] args) {
        String arrayPlacas = new String[1000000];
        String arrayEntrada = new String[1000000];
        String arraySaida = new String[1000000];

        while(true){
            System.out.println("Digite a placa do carro: ");
            Scanner teclado = new Scanner(System.in);
            String placa = teclado.next();
            for(int i = 0;i < 1000000; i++){
                //Se ao percorrer os elementos do array e o atual não for nulo
                //Quer dizer que a placa não foi cadastrada ainda
                if(arrayPlacas[i] == null){
                    arrayPlacas[i] = placa;
                    System.out.println("Entrada do veículo de placa: " + placa);
                    String horaCarro = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
                    arrayEntrada[i] = horaCarro;

                    break;
                }
                //Se a placa tiver sido cadastrada mas não tiver uma saida pra ela
                //Então ela é uma nova saida
                if(
                        arrayPlacas[i] == placa
                                && arraySaida[i] == null
                ){
                    arrayPlacas[i] = placa;
                    System.out.println("Saída do veículo de placa " + placa + ". Tempo no estabelecimento .);
                            String horaCarro = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
                    arraySaida[i] = horaCarro;

                    break;
                }
            }

            for(int j = 0;j < 100000; j++){
                //Se o registro tiver a placa imprimir entrada e saida
                if(arrayPlacas[i] == placa){
                    System.out.println("Entrada: " + arraEntrada[j]);
                    System.out.println("Saida: " + arraSaida[j]);
                }
            }
        }
    }
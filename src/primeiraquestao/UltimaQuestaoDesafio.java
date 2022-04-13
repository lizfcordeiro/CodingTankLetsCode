package primeiraquestao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UltimaQuestaoDesafio {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String[] vehiclesThatEnter = new String[40];
            String[] vehicleThatLeft = new String[40];
            String[] initialTime = new String[40];
            String[] finalTime = new String[40];
            Date time = Calendar.getInstance().getTime();
            int positionEnterControl = 0;
            int positionLeftControl = 0;
            boolean start = true;

            int option;
            while (start) {
                do {
                    System.out.println("==================MENU===============");
                    System.out.println("Opção 1: Verificar placa             ");
                    System.out.println("Opção 2: Relatório do dia            ");
                    System.out.println("Opção 3: Sair do programa            ");
                    System.out.println("=====================================");
                    System.out.print("\nEscolha uma opção: ");
                    option = sc.nextInt();
                } while (option == 0);
                switch (option) {

                    case 1:
                        System.out.print("\nEntre com a placa que deseja verificar: ");
                        clearScannerBuffer(sc);
                        String carPlate = sc.nextLine();

                        if (verifyIfTheLicensePlateAlreadyExistsInTheSystem(vehiclesThatEnter, carPlate)) {
                            vehicleThatLeft[positionLeftControl] = carPlate;
                            finalTime[positionLeftControl] = sdf.format(time);
                            positionLeftControl++;
                            System.out.printf("O veiculo de placa %s está saindo do estacionamento\n\n", carPlate);
                        } else {
                            vehiclesThatEnter[positionEnterControl] = carPlate;
                            initialTime[positionEnterControl] = sdf.format(time);
                            positionEnterControl++;
                            System.out.printf("O veiculo de placa %s está entrando no estacionamento\n\n", carPlate);
                        }
                        break;
                    case 2:
                        System.out.println("================RELATORIO============");
                        System.out.println("Veículos que saíram: ");
                        for (int i = 0; i < vehicleThatLeft.length; i++) {
                            String s = vehicleThatLeft[i];
                            if (s != null) {
                                System.out.printf("Placa do veiculo: %s\n\nHorario de saida: %s\n", s, finalTime);
                            }
                        }
                        System.out.println("\nVeículos que entraram: ");
                        for (int i = 0; i < vehiclesThatEnter.length; i++) {
                            String s = vehiclesThatEnter[i];
                            if (s != null) {
                                System.out.printf("Placa do veiculo: %s\nHorario de entrada: %s\n", s, initialTime[i]);
                            }
                        }
                        System.out.println("=====================================\n");
                        break;
                    case 3:
                        System.out.print("Até mais!");
                        start = false;
                        break;
                }
            }
        }

        public static boolean verifyIfTheLicensePlateAlreadyExistsInTheSystem(String[] vehicleThatEnter, String carPlate){
            for (String plate : vehicleThatEnter) {
                if (plate.equals(carPlate)) {
                    return true;
                }
            }
            return false;
        }

        public static void clearScannerBuffer(Scanner scanner){
            if (scanner.hasNext()){
                scanner.nextLine();
            }
        }
    }
}

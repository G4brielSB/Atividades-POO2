import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tempo de viagem feito em horas: ");
        int tempo = scanner.nextInt();

        System.out.print("Informe a velocidade média: ");
        int velocMedia = scanner.nextInt();

        int distanciaPercorrida = tempo * velocMedia;

        System.out.println("O tempo de viagem informado foi de " + tempo + " horas. A distância percorrida foi de " + distanciaPercorrida +
        "Km \nA quantidade de litros de combustivel consumido foram de " + (distanciaPercorrida/12) + " litros.");
        
        scanner.close();
    }
    
}

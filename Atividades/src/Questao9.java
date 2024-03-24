import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {
        
        System.out.print("Informe a temperatura em graus centígrados: ");
        Scanner scanner = new Scanner(System.in);

        int temperatura = scanner.nextInt();

        temperatura = ((9 * temperatura) + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é de: " + temperatura);

        scanner.close();

    }
    
}

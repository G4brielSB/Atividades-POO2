import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Informe o saldo atual para reajuste da poupança:");
    double saldo = scanner.nextDouble();

    
    System.out.println("O valor adicional seria de R$" + (saldo * 0.02) + ", o saldo total é de R$" + (saldo*1.02));

    scanner.close();
    }
    
}

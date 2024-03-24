import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu salário base: R$");
        double salario = scanner.nextDouble();

        System.out.println("Informe o percentual de ajuste:");
        double ajuste = scanner.nextDouble();

        salario = salario + (salario * (ajuste /100));

    System.out.println("O salario reajustado é de: R$" + salario );

    scanner.close();

    }
    
}

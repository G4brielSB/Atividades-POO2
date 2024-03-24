import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Calculadora somarInteiros = new Calculadora();

        System.out.print("Informe o primeiro valor: ");
        int primeiroValor = scanner.nextInt();
        somarInteiros.setPrimeiroValorSoma(primeiroValor);

        System.out.print("Informe o segundo valor: ");
        int segundoValor = scanner.nextInt();
        somarInteiros.setSegundoValorSoma(segundoValor);

        int soma = somarInteiros.getSoma();
        System.out.println(primeiroValor + " + " + segundoValor + " = " + soma);

        scanner.close();
    }
}

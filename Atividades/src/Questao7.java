import java.util.Scanner;

public class Questao7 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Calculadora somarValor = new Calculadora();
        Calculadora multiplicarValor = new Calculadora();

        System.out.print("Informe a base do retângulo: ");
        int primeiroValor = scanner.nextInt();
        somarValor.setPrimeiroValorSoma(primeiroValor);
        multiplicarValor.setPrimeiroValorMultiplicacao(primeiroValor);

        System.out.println("Informe a altura do retângulo: ");
        int segundoValor = scanner.nextInt();
        somarValor.setSegundoValorSoma(segundoValor);
        multiplicarValor.setSegundoValorMultiplicacao(segundoValor);

        int somar = somarValor.getSoma();
        int multiplicar = multiplicarValor.getMultiplicacao();

        System.out.println("Perímetro do retângulo: " + (somar * 2) + " | Área do retângulo: " + multiplicar);

        scanner.close();

    }

}

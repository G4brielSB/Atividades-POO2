import java.util.Scanner;

public class Questao2 {
    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Calculadora ProdutoInteiros = new Calculadora();

        System.out.print("Informe o primeiro valor: ");
        int primeiroValor = scanner.nextInt();
        ProdutoInteiros.setPrimeiroValorMultiplicacao(primeiroValor);

        System.out.print("Informe o segundo valor: ");
        int segundoValor = scanner.nextInt();
        ProdutoInteiros.setSegundoValorMultiplicacao(segundoValor);

        int soma = ProdutoInteiros.getMultiplicacao();
        System.out.println(primeiroValor + " * " + segundoValor + " = " + soma);

        scanner.close();
    }

}

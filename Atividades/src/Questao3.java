import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        CalculadoraMedia valorMedia = new CalculadoraMedia();

        System.out.print("Informe o primeiro valor: ");
        double primeiroValor = scanner.nextInt();
        valorMedia.setPrimeiroValor(primeiroValor);

        System.out.print("Informe o segundo valor: ");
        double segundoValor = scanner.nextInt();
        valorMedia.setSegundoValor(segundoValor);

        System.out.print("Informe o terceiro valor: ");
        double terceiroValor = scanner.nextInt();
        valorMedia.setTerceiroValor(segundoValor);


        double media = valorMedia.getMedia();
        System.out.println("(" + primeiroValor + " + " + segundoValor + " + " +  terceiroValor + ")" + "/3 = " + media);

        scanner.close();        
    }
    
}

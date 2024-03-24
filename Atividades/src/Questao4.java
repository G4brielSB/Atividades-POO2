import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int valor = scanner.nextInt();

        System.out.println("Valor informado: " + valor);
        System.out.println("Antecessor: " + (valor-1) + " | Sucessor: " + (valor+1));


        scanner.close();    

    }
    
}

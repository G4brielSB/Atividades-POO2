import java.util.Scanner;

public class Questao5 {

    
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira seu nome: ");
        String nome = scanner.nextLine();
    
    System.out.println("Insira seu endereço: ");
        String endereco = scanner.nextLine();
   
    System.out.println("Insira seu telefone: ");
        int telefone = scanner.nextInt();


        
    System.out.println("Nome: " + nome + " | Endereço: " + endereco + " | Telefone " + telefone);

    scanner.close();

    }


}

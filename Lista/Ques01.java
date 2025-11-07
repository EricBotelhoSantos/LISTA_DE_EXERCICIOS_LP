import java.util.Scanner;

public class Ques01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        while (true) {
            System.out.print("Digite um número inteiro: ");

            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                break;
            } else {
                System.out.println("Erro: Por favor, digite um número inteiro válido.");
                scanner.next();
            }
        }

        if (numero % 2 == 0) {
            System.out.println("Resultado: O número " + numero + " é Par.");
        } else {
            System.out.println("Resultado: O número " + numero + " é Ímpar.");
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Ques04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        long fatorial = 1;

        System.out.println("--- Calculadora de Fatorial (n! para n de 0 a 20) ---");

        while (true) {
            System.out.print("Digite um número inteiro n (0 a 20): ");
            
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                
                if (n >= 0 && n <= 20) {
                    break;
                } else {
                    System.out.println("Erro: O número deve estar no intervalo de 0 a 20.");
                }
            } else {
                System.out.println("Erro: Por favor, digite um número inteiro.");
                scanner.next();
            }
        }
        
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println("\nO Fatorial de " + n + " (" + n + "!) é: **" + fatorial + "**");

        scanner.close();
    }
}

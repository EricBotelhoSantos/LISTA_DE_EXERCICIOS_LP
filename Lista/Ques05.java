import java.util.Scanner;

public class Ques05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("--- Sequência de Fibonacci ---");
        System.out.println("A sequência inicia em: 0, 1...");
        
        while (true) {
            System.out.print("Quantos termos (n >= 1) você deseja? ");
            
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            
                if (n >= 1) {
                    break;
                } else {
                    System.out.println("Erro: O número de termos (n) deve ser maior ou igual a 1.");
                }
            } else {
                // Se não for um inteiro
                System.out.println("Erro: Por favor, digite um número inteiro válido.");
                scanner.next();
            }
        }
        
        long termoAtual = 0;
        long proximoTermo = 1;
        long somaTermos;
        int contador = 1;

        System.out.print("\nSequência (primeiros " + n + " termos): ");

        while (contador <= n) {
            System.out.print(termoAtual);
            
            if (contador < n) {
                System.out.print(", ");
            }

            if (n > 1) { 
                 somaTermos = termoAtual + proximoTermo;
                 termoAtual = proximoTermo;
                 proximoTermo = somaTermos;
            }
            
            contador++;
        }
        System.out.println(".");
        scanner.close();
    }
}
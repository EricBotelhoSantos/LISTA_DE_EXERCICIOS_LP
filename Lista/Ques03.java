import java.util.Scanner;

public class Ques03 {

    public static int max3(int a, int b, int c) {
        int maior = a;

        if (b > maior) {
            maior = b;
        }
        
        if (c > maior) {
            maior = c;
        }
        
        return maior;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1, val2, val3;
        
        System.out.println("--- Máximo de Três Números ---");


        val1 = lerInteiro(scanner, "Digite o primeiro número inteiro (a): ");
        val2 = lerInteiro(scanner, "Digite o segundo número inteiro (b): ");
        val3 = lerInteiro(scanner, "Digite o terceiro número inteiro (c): ");


        int maximo = max3(val1, val2, val3);

        System.out.println("\nOs números digitados foram: " + val1 + ", " + val2 + ", " + val3);
        System.out.println("O maior valor entre os três é: **" + maximo + "**");

        scanner.close();
    }

    private static int lerInteiro(Scanner scanner, String prompt) {
        int numero;

        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                break;
            } 
            else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();
            }
        }
        return numero;
    }
}
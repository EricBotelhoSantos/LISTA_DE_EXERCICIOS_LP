import java.util.Scanner;

public class Ques06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        System.out.println("--- Análise de Vetor (Soma, Média, Mínimo, Máximo) ---");
        
        while (true) {
            System.out.print("Digite o tamanho do vetor N (entre 1 e 100): ");
            
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                
                if (N >= 1 && N <= 100) {
                    break;
                } else {
                    System.out.println("Erro: N deve ser um número inteiro entre 1 e 100.");
                }
            } else {
                System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
                scanner.next();
            }
        }
        
        double[] vetor = new double[N];
        System.out.println("\n-> Digite os " + N + " números double:");

        double soma = 0.0;
        double minimo;
        double maximo;

        while (true) {
            System.out.print("  [1/" + N + "]: ");
            if (scanner.hasNextDouble()) {
                vetor[0] = scanner.nextDouble();
                soma += vetor[0];
                minimo = vetor[0];
                maximo = vetor[0]; 
                break;
            } else {
                System.out.println("Erro: Entrada inválida. Digite um valor double.");
                scanner.next();
            }
        }

        for (int i = 1; i < N; i++) {
            double valor;
            
            while (true) {
                System.out.print("  [" + (i + 1) + "/" + N + "]: ");
                if (scanner.hasNextDouble()) {
                    valor = scanner.nextDouble();
                    vetor[i] = valor;
                    break;
                } else {
                    System.out.println("Erro: Entrada inválida. Digite um valor double.");
                    scanner.next();
                }
            }

            soma += valor;

            if (valor < minimo) {
                minimo = valor;
            }
            if (valor > maximo) {
                maximo = valor;
            }
        }

        double media = soma / N;

        System.out.println("\n========================================");
        System.out.println("Análise do Vetor:");
        System.out.printf("Soma Total:   %.2f\n", soma);
        System.out.printf("Média Aritmética: %.2f\n", media);
        System.out.printf("Valor Mínimo: %.2f\n", minimo);
        System.out.printf("Valor Máximo: %.2f\n", maximo);
        System.out.println("========================================");

        scanner.close();
    }
}
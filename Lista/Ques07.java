import java.util.Scanner;

public class Ques07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        int alvoX;
        int contadorOcorrencias = 0;

        System.out.println("--- Contagem de Ocorrências em Vetor ---");
        
        while (true) {
            System.out.print("Digite o tamanho do vetor N (N >= 1): ");
            
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                
                if (N >= 1) {
                    break; 
                } else {
                    System.out.println("Erro: N deve ser um número inteiro maior ou igual a 1.");
                }
            } else {
                System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
                scanner.next();
            }
        }
        
        int[] vetor = new int[N];
        System.out.println("\n-> Digite os " + N + " números inteiros do vetor:");

        for (int i = 0; i < N; i++) {
            while (true) {
                System.out.print("  Vetor[" + i + "]: ");
                if (scanner.hasNextInt()) {
                    vetor[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
                    scanner.next();
                }
            }
        }
        
        while (true) {
            System.out.print("\nDigite o valor alvo X que você deseja contar: ");
            if (scanner.hasNextInt()) {
                alvoX = scanner.nextInt();
                break;
            } else {
                System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
                scanner.next();
            }
        }

        for (int elemento : vetor) {
            if (elemento == alvoX) {
                contadorOcorrencias++;
            }
        }

        System.out.println("\n========================================================");
        System.out.println("O valor alvo " + alvoX + " foi encontrado " + contadorOcorrencias + " vezes no vetor.");
        System.out.println("========================================================");

        scanner.close();
    }
}
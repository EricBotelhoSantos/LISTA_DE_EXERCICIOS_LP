import java.util.Scanner;
import java.util.Arrays;

public class Ques08 {

    public static void selectionSort(int[] v) {
        int n = v.length;

        for (int i = 0; i < n - 1; i++) {

            int indiceMenor = i;

            for (int j = i + 1; j < n; j++) {
                if (v[j] < v[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            if (indiceMenor != i) {
                int temp = v[i];
                v[i] = v[indiceMenor];
                v[indiceMenor] = temp;
            }
        }
    }

    private static int lerInteiro(Scanner scanner, String prompt) {
        int numero;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                break;
            } else {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); 
            }
        }
        return numero;
    }

    private static int lerTamanho(Scanner scanner, String prompt) {
        int N;
        while (true) {
            N = lerInteiro(scanner, prompt);
            if (N >= 1) {
                return N;
            } else {
                System.out.println("Erro: O tamanho N deve ser maior ou igual a 1.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Ordenação por Seleção (Selection Sort) ---");

        int N = lerTamanho(scanner, "Digite o tamanho do vetor N (N >= 1): ");

        int[] vetor = new int[N];
        System.out.println("\n-> Digite os " + N + " números inteiros do vetor:");

        for (int i = 0; i < N; i++) {
            vetor[i] = lerInteiro(scanner, "  Elemento [" + i + "]: ");
        }

        System.out.println("\n=============================================");
        System.out.println("Vetores:");
        System.out.println("  Antes da Ordenação: " + Arrays.toString(vetor));

        selectionSort(vetor);

        System.out.println("  Depois da Ordenação: " + Arrays.toString(vetor) + " ");
        System.out.println("=============================================");

        scanner.close();
    }
}
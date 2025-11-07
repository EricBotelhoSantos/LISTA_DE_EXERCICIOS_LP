import java.util.Scanner;
import java.util.Arrays;

public class Ques09 {

    public static int buscaBinaria(int[] v, int x) {
        int ini = 0;
        int fim = v.length - 1;
        int meio;

        while (ini <= fim) {

            meio = ini + (fim - ini) / 2; 

            if (v[meio] == x) {
                return meio;
            } 
            else if (v[meio] < x) {
                ini = meio + 1; 
            }
            else {
                fim = meio - 1;
            }
        }

        return -1;
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
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); 
            }
        }
        return numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Busca Binária (Vetor Ordenado) ---");

        int[] vetor = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int N = vetor.length;

        System.out.println("Vetor de Teste Ordenado: " + Arrays.toString(vetor));

        int alvoX = lerInteiro(scanner, "\nDigite o valor alvo X para buscar: ");

        long inicio = System.nanoTime();
        int indiceEncontrado = buscaBinaria(vetor, alvoX);
        long fim = System.nanoTime();

        System.out.println("\n========================================================");
        if (indiceEncontrado != -1) {
            System.out.println("Elemento " + alvoX + " encontrado no **índice: " + indiceEncontrado + "**.");

            if (indiceEncontrado == 0) {
                 System.out.println("Caso de Borda: Primeiro elemento do vetor.");
            } else if (indiceEncontrado == N - 1) {
                 System.out.println("Caso de Borda: Último elemento do vetor.");
            }
        } else {
            System.out.println("Elemento " + alvoX + " não foi encontrado. Retornou **-1**.");
            System.out.println("Caso de Borda: Elemento não existente.");
        }
        System.out.printf("Tempo de busca: %.5f ms\n", (fim - inicio) / 1000000.0);
        System.out.println("========================================================");

        scanner.close();
    }
}
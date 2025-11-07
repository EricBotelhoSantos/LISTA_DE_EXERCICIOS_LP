import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques10 {

    private static List<Integer> listaDeNumeros = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        
        System.out.println("--- Menu Interativo de Lista de Números ---");

        do {
            exibirMenu();
            opcao = lerOpcaoMenu();

            switch (opcao) {
                case 1:
                    inserirNumero();
                    break;
                case 2:
                    listarNumeros();
                    break;
                case 3:
                    somarNumeros();
                    break;
                case 4:
                    limparLista();
                    break;
                case 0:
                    System.out.println("\nSaindo do programa. Lista final: " + listaDeNumeros);
                    break;
                default:
                    System.out.println("Opção inválida. Digite uma opção de 0 a 4.");
            }
            
            if (opcao != 0) {
                 System.out.println("\nPressione ENTER para continuar...");
                 scanner.nextLine();
                 scanner.nextLine();
            }

        } while (opcao != 0);

        scanner.close();
    }
    
    private static void exibirMenu() {
        System.out.println("\n-------------------------------------------");
        System.out.println("(1) Inserir número na lista");
        System.out.println("(2) Listar números");
        System.out.println("(3) Somar números");
        System.out.println("(4) Limpar lista");
        System.out.println("(0) Sair");
        System.out.println("-------------------------------------------");
    }

    private static int lerOpcaoMenu() {
        while (true) {
            System.out.print("Escolha uma opção: ");
            if (scanner.hasNextInt()) {
                int opcao = scanner.nextInt();
                scanner.nextLine();
                return opcao;
            } else {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine();
            }
        }
    }

    private static int lerInteiroParaLista() {
        while (true) {
            System.out.print("Digite o número inteiro a inserir: ");
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                scanner.nextLine();
                return numero;
            } else {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine();
            }
        }
    }

    public static void inserirNumero() {
        int numero = lerInteiroParaLista();
        listaDeNumeros.add(numero);
        System.out.println("Número " + numero + " inserido com sucesso.");
    }

    public static void listarNumeros() {
        if (listaDeNumeros.isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            System.out.println("Números na lista: " + listaDeNumeros.size() + " termos");
            System.out.println("   [ " + listaDeNumeros.toString().replace("[", "").replace("]", "") + " ]");
        }
    }

    public static void somarNumeros() {
        if (listaDeNumeros.isEmpty()) {
            System.out.println("Lista vazia. A soma é 0.");
            return;
        }

        long soma = 0;
        for (int numero : listaDeNumeros) {
            soma += numero;
        }
        
        System.out.println("Soma total dos números (" + listaDeNumeros.size() + " termos): " + soma + " ");
    }

    public static void limparLista() {
        if (listaDeNumeros.isEmpty()) {
             System.out.println("Lista já está vazia.");
             return;
        }
        listaDeNumeros.clear();
        System.out.println("Lista limpa com sucesso.");
    }
}
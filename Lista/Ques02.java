import java.util.Scanner;

public class Ques02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numero1;
        double numero2;
        char operacao;
        double resultado = 0;
        boolean operacaoValida = true;

      
        System.out.println("--- Calculadora Simples ---");
        System.out.print("Digite o primeiro valor: ");
        numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        numero2 = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = scanner.next().charAt(0); 
        
        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("\nERRO: Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                // Trata Operação Inválida
                System.out.println("\nERRO: Operação '" + operacao + "' inválida. Use apenas +, -, *, ou /.");
                operacaoValida = false;
                break;
        }
        if (operacaoValida) {
            System.out.println("\n✅ Resultado da operação " + numero1 + " " + operacao + " " + numero2 + " = " + resultado + "");
        }

        scanner.close();
    }
}
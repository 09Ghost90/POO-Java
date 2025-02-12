import java.util.Scanner; // Biblioteca para receber dados.
import java.util.ArrayList;
import java.util.List; // Biblioteca para criar listas

class Somatorio {
    // Definiçõa da função
    public static boolean funcaoSomatorio() {
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quando desejar sair do somatório, digite '0'.");
        
        // Criar lista para armazenar os números digitados
        List<Double> numeros = new ArrayList<>();

        // Loop pare receber os numeros:
        while (true) {
            System.out.print("Digite um número: ");
            double num = scanner.nextDouble();
            if (num == 0) {
                System.out.println("Deseja continuar? (s/n)");
                String resposta = scanner.next();
                
                if (resposta.equals("n")) {
                    continuar = false;
                }
                break;
            }
            numeros.add(num);
        }

        // Exibir os números inseridos
        double resul_soma = 0;
        System.out.print("\nNumeros digitados:");
        for (double num : numeros) {
            System.out.print(" " + num);
            resul_soma += num;
        }

        System.out.println("\nSomatório: " + resul_soma);
        scanner.close();
        return continuar;
    }
}

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("\nCalculadora Simples");
            System.out.println("0. Somatório");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Potencia");
            System.out.println("6. Sair");
            System.out.print("Digite sua escolha: ");

            int choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Escolheu sair...");
                break;
            }

            if (choice == 0) {
                continueCalculating = Somatorio.funcaoSomatorio();
                if (!continueCalculating) {
                    System.out.println("Encerrando o programa...");
                    break;
                }
                continue;
            }

            // Pede os números ao usuário:
            System.out.print("Digiete o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            // Processando a operação escolhida:
            switch (choice) {
                case 1:
                    resultado = (num1 + num2);
                    break;
                case 2:
                    resultado = (num1 - num2);
                    break;
                case 3:
                    resultado = (num1 * num2);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Erro: Divisão por zero não permitida.");
                        continue;
                    }
                    resultado = (num1 / num2);
                    break;
                case 5:
                    resultado = Math.pow(num1, num2);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }
            System.out.println("Resultado:" + resultado);
        }

        scanner.close();
    }

}
import java.util.Scanner;

//Calculadora de Potência
public class CalcPot {
    public static void main(String[] args) {
        // Cria uma instância de Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite a base e o expoente
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();
        System.out.print("Digite o expoente: ");
        double expoente = scanner.nextDouble();

        // Calcula a potência usando o método pow da classe Math
        double resultado = Math.pow(base, expoente);

        // Exibe o resultado da potência
        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);

        // Fecha o scanner
        scanner.close();
    }
}
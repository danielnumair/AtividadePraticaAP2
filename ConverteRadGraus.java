import java.util.Scanner;

// Conversor de Radianos para Graus
public class ConverteRadGraus {
    public static void main(String[] args) {
        // Cria uma instância de Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o valor em radianos
        System.out.print("Digite o valor em radianos: ");
        double radianos = scanner.nextDouble();

        // Converte radianos para graus usando o método toDegrees da classe Math
        double graus = Math.toDegrees(radianos);

        // Exibe o resultado da conversão
        System.out.println(radianos + " radianos é igual a " + graus + " graus");

        // Fecha o scanner
        scanner.close();
    }
}
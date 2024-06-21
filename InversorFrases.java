import java.util.Scanner;

//Inversor de Frases
public class InversorFrases {
    public static void main(String[] args) {
        // Cria uma instância de Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite uma frase
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Remove os espaços em branco da frase
        String fraseSemEspacos = removerEspacos(frase);

        // Inverte a frase
        String fraseInvertida = inverterFrase(fraseSemEspacos);

        // Exibe a frase invertida
        System.out.println("Frase sem espaços, invertida: " + fraseInvertida);

        // Fecha o scanner
        scanner.close();
    }

    public static String removerEspacos(String frase) {
        // Remove todos os espaços em branco da frase
        return frase.replaceAll("\\s", "");
    }

    public static String inverterFrase(String frase) {
        // Usa StringBuilder para inverter a frase
        StringBuilder sb = new StringBuilder(frase);
        return sb.reverse().toString();
    }
}
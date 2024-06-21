import java.util.Scanner;

//Detector de Conteúdo Impróprio
public class DetectorImproprio {
    public static void main(String[] args) {
        // Cria uma instância de Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite uma frase
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Verifica se a frase contém palavras impróprias
        boolean contem = verificar(frase);

        // Exibe resultado
        if (contem) {
            System.out.println("Conteúdo impróprio");
        } else {
            System.out.println("Conteúdo liberado");
        }

        // Fecha o scanner
        scanner.close();
    }

    public static boolean verificar(String frase) {
        // Converte a frase para minúsculas para facilitar a verificação
        String fraseMinuscula = frase.toLowerCase();

        // Verifica se a frase contém "sexo" ou "sexual"
        return fraseMinuscula.contains("sexo") || fraseMinuscula.contains("sexual");
    }
}
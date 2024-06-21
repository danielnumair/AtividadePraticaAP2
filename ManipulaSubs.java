import java.util.Scanner;

//Manipulação de Substrings
public class ManipulaSubs {
    public static void main(String[] args) {
        // Cria uma instância de Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite uma string
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();
        String textonovo;

        // Verifica se a string tem pelo menos um caractere
        if (texto.length() > 0) {
            // Retorna a substring excluindo o último caractere
            textonovo = texto.substring(0, texto.length() - 1);
        } else textonovo = "";

        // Exibe o substring obtido
        System.out.println("Substring exceto último: " + textonovo);

        // Fecha o scanner
        scanner.close();
    }
}
import java.util.Random;

//Gerador de Senhas Aleatórias
public class GeradorSenhas {
    public static void main(String[] args) {
        // Cria uma instância de Random
        Random random = new Random();

        // Gera um número de dígitos entre 5 e 10
        int numDigitos = random.nextInt(6) + 5; // (0-5) + 5 = (5-10)

        // Gera a senha com o número de dígitos determinado
        String senha = gerarSenha(numDigitos);

        // Exibe a senha gerada
        System.out.println("Senha gerada: " + senha);
    }

    public static String gerarSenha(int numDigitos) {
        // Cria uma instância de StringBuilder para construir a senha
        StringBuilder senha = new StringBuilder();

        // Cria uma instância de Random para gerar dígitos aleatórios
        Random random = new Random();

        // Adiciona os dígitos aleatórios à senha
        for (int i = 0; i < numDigitos; i++) {
            int digito = random.nextInt(10); // Gera um dígito entre 0 e 9
            senha.append(digito); // Adiciona o dígito à senha
        }

        // Retorna a senha gerada
        return senha.toString();
    }
}
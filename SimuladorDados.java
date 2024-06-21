import java.util.Random;

//Simulador de Dados
public class SimuladorDados {
    public static void main(String[] args) {
        Random random = new Random();

        //Simula a jogada de dados 3 vezes
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int dado3 = random.nextInt(6) + 1;

        //Soma os resultados
        int sum = dado1 + dado2 + dado3;

        //Exibe resultados
        System.out.println("Jogada 1: " + dado1);
        System.out.println("Jogada 2: " + dado2);
        System.out.println("Jogada 3: " + dado3);
        System.out.println("Soma das jogadas: " + sum);
    }
}
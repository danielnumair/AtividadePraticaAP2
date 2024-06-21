import java.util.Scanner;

//Ajuste de Preços em Farmácia
public class AjusteFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precoProduto;

        //Loop até digitar 0 para encerrar
        while (true) {
            //Digite o preço a ser atualizado
            System.out.print("Digite o preço do produto (ou 0 para encerrar): ");
            precoProduto = scanner.nextDouble();

            //Se digitou 0 encerra
            if (precoProduto == 0) {
                break;
            }

            //Calcula novo preço e arredonda
            double novoPreco = precoProduto * 1.12;
            double precoArredondado = Math.round(novoPreco * 100.0) / 100.0;

            //Exibe resultados
            System.out.println("Preço original: R$" + precoProduto);
            System.out.println("Novo preço com aumento de 12%: R$" + precoArredondado);
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
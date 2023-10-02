import java.util.Scanner;

public class CalcularPrecoFinalPedido {

    public static void main(String[] args) {
        // Declaração das variáveis
        float valorHamburguer;
        int quantidadeHamburguer;
        float valorBebida;
        int quantidadeBebida;
        float valorPago;

        // Leitura dos dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Adicionando as strings
        System.out.println("Valor do Hamburguer:  ");
        valorHamburguer = scanner.nextFloat();
        System.out.println("Quantidade de Hamburguer:  ");
        quantidadeHamburguer = scanner.nextInt();
        System.out.println("Valor da Bebida:  ");
        valorBebida = scanner.nextFloat();
        System.out.println("Quantidade de Bebida:  ");
        quantidadeBebida = scanner.nextInt();
        System.out.println("Valor a Ser Pago:  ");
        valorPago = scanner.nextFloat();

        // Cálculo do valor total dos hambúrgueres e das bebidas
        float totalHamburgueres = valorHamburguer * quantidadeHamburguer;
        float totalBebidas = valorBebida * quantidadeBebida;

        // Cálculo do preço total do pedido
        float precoTotal = totalHamburgueres + totalBebidas;

        // Cálculo do troco necessário
        float troco = valorPago - precoTotal;

        // Impressão da saída formatada
        System.out.printf("O preço final do pedido é R$ %.2f. Seu troco é R$ %.2f.\n", precoTotal, troco);
    }
}

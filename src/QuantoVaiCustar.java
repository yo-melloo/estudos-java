public class QuantoVaiCustar {
    public static void main(String[] args) {

        double precoProduto = 79.99;
        int quantidade = 4;

        double precoFinal = precoProduto * quantidade;

        String mensagem = String.format("Este produto custa R$ %.2f, %s destes custarão: R$ %.2f", precoProduto, quantidade, precoFinal);

        System.out.println(mensagem);

    }
}

import javax.swing.*;

public class QualDesconto {
    public static void main(String[] args) {
        double precoOriginal = 250;
        double percentualDesconto = 90;

        double precoComDesconto = precoOriginal - (precoOriginal * percentualDesconto / 100);

        String mensagem = String.format("Este produto custa R$ %.2f. com desconto, custará R$ %.2f - %.1f%% de desconto",precoOriginal, precoComDesconto, percentualDesconto);

        System.out.println(mensagem);

    }
}

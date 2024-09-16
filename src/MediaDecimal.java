public class MediaDecimal {
    public static void main(String[] args) {

        double nota1 = 7.12;
        double nota2 = 8.25;
        double media = (nota1 + nota2) / 2;

        String mensagem = String.format("A média entre %.1f e %.1f é: %.1f", nota1, nota2, media);

        System.out.println(mensagem);

    }
}

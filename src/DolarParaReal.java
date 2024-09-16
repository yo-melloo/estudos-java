public class DolarParaReal {
    public static void main(String[] args) {
        double valDolar = 16.99;
        double valReal = valDolar * 4.94;

        String mensagem = String.format("BRL %.2f equivalem a USD %.2f", valReal , valDolar);

        System.out.println(mensagem);

    }
}

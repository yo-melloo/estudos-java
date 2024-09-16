public class CharEString {
    public static void main(String[] args) {
        char letra = 'a';
        String palavra = "Palavr";

        String concatenacao = String.format("%s%s concatenado(a) com sucesso!",palavra, letra);

        System.out.printf(concatenacao);


    }
}

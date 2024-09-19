import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaDeAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaDeAvaliacao += nota;
        }

        mediaDeAvaliacao /= 3;

        System.out.println("Media do filme: " + mediaDeAvaliacao);
    }

}

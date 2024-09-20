import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Tabuada ---");
        System.out.print("Digite um número para exibir a tabuada: ");
        int multiplicando = entrada.nextInt();

        System.out.println("#############");
        for (int i = 0; i <= 10; i++) {
            int multiplicacao = multiplicando * i;
            System.out.printf("%s x %s = %s %n", multiplicando, i, multiplicacao);
        }
        System.out.println("#############");

    }
}

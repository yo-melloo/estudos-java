import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.printf("%s! = %s", numero, fatorial);
    }
}

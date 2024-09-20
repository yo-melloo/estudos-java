import java.util.Scanner;

public class CompraradorDeInt {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Bem-vindo ao Comparador 2000!");

        System.out.println("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        if (num2 == num1) {
            System.out.println("números iguais.");
        } else if (num2 < num1) {
            System.out.printf("O primeiro número (%s) é maior.%n", num1);
        } else {
            System.out.printf("O segundo número (%s) é maior.%n", num2);
        }
    }


}

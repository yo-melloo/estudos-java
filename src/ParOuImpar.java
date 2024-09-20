import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = entrada.nextInt();

        if(num % 2 == 0){
            System.out.println("** Número par **");
        } else {
            System.out.println("** Número ímpar **");
        }

    }
}

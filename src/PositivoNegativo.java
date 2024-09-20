import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double usuarioNumero = entrada.nextDouble();

        if (usuarioNumero < 0){
            System.out.println("Número negativo.");
        } else {
            System.out.println("Número positivo.");
        }

    }
}

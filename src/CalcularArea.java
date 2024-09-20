import java.util.Arrays;
import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("-----Menu-----");
        System.out.println("(Digite o número da opção)");
        System.out.println("1. Calcular Área de Quadrado");
        System.out.println("2. Calcular Área de Círculo");
        System.out.println("3. Sair");
        System.out.println("------------------------");

        while(true) {
            System.out.print("Escolha: ");
            int escolha = entrada.nextInt();

            if (escolha == 1) {
                System.out.println("#######################");
                System.out.println("## Área do Quadrado ##");
                System.out.println("########################");
                System.out.print("digite a medida de um dos lados do quadrado: ");
                double lado = entrada.nextInt();

                double areaQuadrado = lado * lado;
                System.out.printf("--> A área do quadrado de lado %s, é %s.%n", lado, areaQuadrado);
                break;

            } else if (escolha == 2) {
                System.out.println("#######################");
                System.out.println("## Área do Círculo ##");
                System.out.println("########################");
                System.out.print("digite a medida do raio do círculo: ");
                double r = entrada.nextInt();

                double pi = 3.14;
                double areaCirculo = pi * (r * r);
                System.out.printf("--> A área do círculo de raio %s, é %s.%n", r, areaCirculo);
                break;

            } else if (escolha == 3) {
                System.out.println("---> Saindo...");
                break;

            } else {
                System.out.println("Erro. Tente novamente.");
            }
        }


    }
}

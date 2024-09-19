import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numeroLimite = 100;
        int numeroAleatorio = new Random().nextInt(numeroLimite);
        Scanner input = new Scanner(System.in);
        int tentativas = 0;
        int numeroInput = 0;

        while(tentativas < 5){
            System.out.println("Digite um número de 1 a " + numeroLimite);
            tentativas++;
            numeroInput = input.nextInt();


            if (numeroInput == numeroAleatorio){
                System.out.println("Você acertou! o número aleatório era: " + numeroAleatorio);
                System.out.println("Você usou " + tentativas + " tentativas");
                break;
            } else if (numeroInput < numeroAleatorio){
                System.out.println("O número digitado é menor que o número aleatório");
            } else if (numeroInput > numeroAleatorio) {
                System.out.println("o número digitado é maior que o número aleatório");
            }

            if(tentativas == 5 && numeroInput != numeroAleatorio){
                System.out.println("Infelizmente você não conseguiu adivinhar o número " + numeroAleatorio + " em 5 tentativas.");
            }

        }

    }
}

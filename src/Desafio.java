import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Strings de estilização - coisa minha, não estranhe isso aqui.
        String linhax = "****************************************";
        String linhau = "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@";
        String linhah = "#######################";
        String linhai = "---------------";

        // 1. Inicializar dados do cliente
        String nome = "Gustavo";
        String tipoDeConta = "Poupança";
        double usuarioSaldo = 100;

        System.out.println(linhau);
        System.out.println("Dados do Cliente\n");
        System.out.printf("Nome:               %s%n", nome);
        System.out.printf("Tipo de conta:      %s%n", tipoDeConta);
        System.out.printf("Saldo:              R$ %.2f%n", usuarioSaldo);
        System.out.println(linhau);
        System.out.println("\n");

        // 2. Menu de Opções
        while (true) {
            System.out.println(linhah);
            System.out.println("Operações\n");

            System.out.println("1. Consultar saldos");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");
            System.out.println(linhai);
            System.out.print("Digite o número da opção desejada: ");
            int usuarioEscolha = entrada.nextInt();
            System.out.println(linhai);

            if (usuarioEscolha != 0) {

                System.out.println("\n--> Opção selecionada:");
                if (usuarioEscolha == 1) { // 3. Visualização de saldo
                    System.out.println("* 1. Consultar saldos\n");

                    System.out.println(linhax);
                    System.out.printf("Saldo em conta: R$ %.2f %n", usuarioSaldo);
                    System.out.println(linhax);

                } else if (usuarioEscolha == 2) { // 5. Recebe valor
                    System.out.println("* 2. Receber valor\n");

                    System.out.println(linhax);
                    System.out.println("Chave de recebimento: xxxx-xxxx/xxx.xx");
                    System.out.println(linhai);
                    System.out.print("Qual valor deseja receber? > R$ ");
                    double valorRecebido = entrada.nextDouble();

                    System.out.printf("%n** Recebido R$ %.2f **%n", valorRecebido);
                    System.out.printf("Saldo: R$ %.2f ---> R$ %.2f %n", usuarioSaldo, (usuarioSaldo + valorRecebido));
                    usuarioSaldo += valorRecebido;
                    System.out.println(linhax);

                } else if (usuarioEscolha == 3) { // 4. Envia valor
                    System.out.println("* 3. Transferir valor\n");

                    System.out.println(linhax);
                    System.out.print("Chave de recebimento: ");
                    String depositoConta = entrada.next();
                    System.out.println(linhai);

                    System.out.print("Qual valor deseja enviar? > R$ ");
                    double depositoValor = entrada.nextDouble();
                    System.out.println(linhai);
                    System.out.printf("%n** Valor enviado para %s! ** %n", depositoConta);
                    System.out.printf("Saldo: R$ %.2f ---> R$ %.2f %n", usuarioSaldo, (usuarioSaldo - depositoValor));
                    usuarioSaldo -= depositoValor;
                    System.out.println(linhax);

                } else if (usuarioEscolha == 4) {
                    System.out.println("* 4. Sair");
                    System.out.println("\n* Encerrando sistema... *");
                    break;
                }

            } else {
                System.out.printf("* %s. ???? - Opção inválida.%n", usuarioEscolha);
                //System.out.println("\n** Abortando... **");
            }
        }

        System.out.println("\n-- Obrigado por usar nossos serviços, volte sempre! --");


    }

}

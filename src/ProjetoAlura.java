import java.util.Scanner;

public class ProjetoAlura {
    public static void main(String[] args) {
        String nome = "Enzo";
        String conta = "Corrente";
        double saldo = 0;
        Scanner leitura = new Scanner(System.in);

        String menu = """
                *************************************************
                Dados Iniciais do cliente:
                                
                Nome:               %s
                Tipo conta:         %s
                Saldo inicial:      %f
                *************************************************
                """.formatted(nome, conta, saldo);
        String operacoe = """
                 Operações
                
                1- Consultar saldos
                2- Transferencia
                3- Deposito
                4- Sair
                
                Digite a operação desejada:
                """;
        System.out.println(menu);
        System.out.println(operacoe);

        int opcao = leitura.nextInt();

        while (opcao != 4) {
            System.out.println(operacoe);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }

        }
    }
}

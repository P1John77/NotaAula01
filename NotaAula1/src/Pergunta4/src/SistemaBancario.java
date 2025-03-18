import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        System.out.println();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor a depositar: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.printf("Depósito de R$ %.2f realizado.\n", valorDeposito);
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    break;

                case 3:
                    if (saldo > 0) {
                        System.out.print("Digite o valor a sacar: R$ ");
                        double valorSaque = scanner.nextDouble();
                        if (valorSaque > 0 && valorSaque <= saldo) {
                            saldo -= valorSaque;
                            System.out.printf("Saque de R$ %.2f realizado.\n", valorSaque);
                        } else {
                            System.out.println("Valor inválido ou saldo insuficiente.");
                        }
                    } else {
                        System.out.println("Saldo zerado.");
                    }
                    break;

                case 4:
                    if (saldo > 0) {
                        System.out.print("Digite o valor a transferir: R$ ");
                        double valorTransferencia = scanner.nextDouble();
                        if (valorTransferencia > 0 && valorTransferencia <= saldo) {
                            saldo -= valorTransferencia;
                            System.out.printf("Transferência de R$ %.2f realizada.\n", valorTransferencia);
                        } else {
                            System.out.println("Valor inválido ou saldo insuficiente.");
                        }
                    } else {
                        System.out.println("Saldo zerado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

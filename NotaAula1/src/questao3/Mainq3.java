import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto("Notebook", 2500.00, 10);

        produto.exibirEstoque();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar estoque");
            System.out.println("2 - Vender produtos");
            System.out.println("3 - Exibir estoque");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantidade a adicionar: ");
                    int quantidadeAdicionar = sc.nextInt();
                    produto.adicionarEstoque(quantidadeAdicionar);
                    break;

                case 2:
                    System.out.print("Quantidade a vender: ");
                    int quantidadeVender = sc.nextInt();
                    produto.vender(quantidadeVender);
                    break;

                case 3:
                    produto.exibirEstoque();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

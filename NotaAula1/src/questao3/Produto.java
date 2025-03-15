import java.util.Scanner;

public class Produto {
    // Atributos sem private
    String nome;
    double preco;
    int quantidadeEmEstoque;


    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("A quantidade deve ser maior que zero.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades vendidas.");
        } else {
            System.out.println("Quantidade inválida ou estoque insuficiente.");
        }
    }

    public void exibirEstoque() {
        System.out.println("Estoque atual de " + nome + ": " + quantidadeEmEstoque + " unidades.");
    }
}

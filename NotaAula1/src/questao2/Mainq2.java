package questao2;

import java.util.Scanner;

public class Mainq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora c = new Calculadora();


        System.out.println("Bem-vindo a calculadora inteligente!");
        System.out.println("Digite um numero:");
        c.num1 = sc.nextDouble();
        System.out.println("Digite o segundo numero:");
        c.num2 = sc.nextDouble();



        System.out.println("1-soma");
        System.out.println("2-dividir");
        System.out.println("3-subtrair");
        System.out.println("4-multiplicar");
        System.out.println("5- sair");


        int operacao = sc.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Resultado da Soma: " + (c.num1 + c.num2));
                break;
            case 2:
                if (c.num2 != 0) {
                    System.out.println("Resultado da Divisão: " + (c.num1 / c.num2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                }
                break;
            case 3:
                System.out.println("Resultado da Subtração: " + (c.num1 - c.num2));
                break;
            case 4:
                System.out.println("Resultado da Multiplicação: " + (c.num1 * c.num2));
                break;
            case 5:
                System.out.println("Saindo... Obrigado por usar a calculadora!");
                break;
            default:
                System.out.println("Operação inválida!");
                break;

        }









    }

}

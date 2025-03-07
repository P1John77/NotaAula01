package questao1;

import java.util.Scanner;

public class Mainq1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno a = new Aluno();

        System.out.println("Digite seu nome:");
        a.nome = sc.nextLine();
        System.out.println(a.nome);


        System.out.println("Digite uma nota");
        a.nota1 = sc.nextDouble();

        System.out.println("Digite uma nota");
        a.nota2 = sc.nextDouble();

        System.out.println("Digite uma nota");
        a.nota3 = sc.nextDouble();

        a.calcule_a_media();


        System.out.printf( "%.1f",a.media);

        if (a.media >= 7) {
            System.out.println(" Aprovado! ");
        } else if (a.media >= 4) {
            System.out.println(" Final! ");
        } else {
            System.out.println(" Reprovado! ");
        }

        }


    }


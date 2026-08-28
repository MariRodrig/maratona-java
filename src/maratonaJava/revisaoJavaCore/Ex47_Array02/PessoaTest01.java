package maratonaJava.revisaoJavaCore.Ex47_Array02;

//  Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
//  Fazer um programa que calcule e escreva a maior e a menor altura do grupo,
//  a média de altura das mulheres, e o número de homens.

import java.util.Scanner;

public class PessoaTest01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.println("Altura da " + (i + 1) + "a pessoa:");
            double altura = sc.nextDouble();

            System.out.println("Genero da " + (i + 1) + "a pessoa:");
            char genero = sc.next().charAt(0);

            pessoas[i] = new Pessoa(altura, genero);
        }

        double maiorAltura = pessoas[0].getAltura();
        double menorAltura = pessoas[0].getAltura();

        for (int i = 0; i < n; i++) {
            if (pessoas[i].getAltura() > maiorAltura) {
                maiorAltura = pessoas[i].getAltura();
            }

            if (pessoas[i].getAltura() < menorAltura) {
                menorAltura = pessoas[i].getAltura();
            }
        }

        double somaAlturaMulheres = 0.0;
        int qtdMulheres = 0;
        int qtdHomens = 0;


        for (int i = 0; i < n ; i++) {
            if (pessoas[i].getGenero() == 'F'){
                somaAlturaMulheres += pessoas[i].getAltura();
                qtdMulheres++;
            } else {
                qtdHomens++;
            }
        }

        double mediaAlturaMulheres = somaAlturaMulheres / qtdMulheres;

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.printf("Média das alturas das mulheres:  %.2f%n", mediaAlturaMulheres);
        System.out.println("Numero de homens: " + qtdHomens);

    }
}

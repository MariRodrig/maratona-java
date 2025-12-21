package maratonaJava.exercíciosGuia1ao10;

//   Faça um algoritmo para receber um número qualquer
//   Em seguida imprima na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class ExercícioGuia02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        String parOuImpar;
        String positivoOuNegativo;

        if (num % 2 == 0) {
            parOuImpar = "par";
        } else {
            parOuImpar = "ímpar";
        }

        if (num > 0) {
            positivoOuNegativo = "positivo";
        } else if (num == 0) {
            positivoOuNegativo = "zero";

    } else {
            positivoOuNegativo = "negativo";
        }
        System.out.println("O número "+ num + " é "  + parOuImpar + " e " + positivoOuNegativo + ".");
    }
}
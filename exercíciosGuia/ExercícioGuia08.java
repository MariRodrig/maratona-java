package maratonaJava.exercíciosGuia;

// Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

import java.util.Scanner;

public class ExercícioGuia08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int a = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int b = sc.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int c = sc.nextInt();

        if (a < b) { int tmp = a; a = b; b = tmp; } // agora a >= b
        if (a < c) { int tmp = a; a = c; c = tmp; } // agora a é o maior
        if (b < c) { int tmp = b; b = c; c = tmp; } // agora b >= c

        System.out.println("Ordem decrescente: " + a + ", " + b + ", " + c + ".");
        sc.close();
    }
}

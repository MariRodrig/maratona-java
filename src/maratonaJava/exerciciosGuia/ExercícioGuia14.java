package maratonaJava.exercíciosGuia1a10;

// Faça um algoritmo que receba um valor A e B e troque o valor de A por B
// e o valor de B por A e imprima na tela os valores.

import java.util.Locale;
import java.util.Scanner;

public class ExercícioGuia14 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para A: ");
        double a = sc.nextDouble();

        System.out.println("Digite um valor para B: ");
        double b = sc.nextDouble();


        System.out.println("Antes da troca -> A = " + a + ", B = " + b);

        double temp = a;
        a = b;
        b = temp;

        System.out.println("Depois da troca -> A = " + a + ", B = " + b);

        sc.close();

    }
}

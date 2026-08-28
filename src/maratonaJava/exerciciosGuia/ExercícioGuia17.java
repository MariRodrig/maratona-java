package maratonaJava.exercíciosGuia1a10;

//  Faça um algoritmo que leia uma temperatura em Fahrenheit e
//  calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
//  Fórmula: C = (5 * ( F-32) / 9)

import java.util.Scanner;

public class ExercícioGuia17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperatura em Fahrenheit: ");
        double f = sc.nextDouble();

        double c = ( 5.0 * (f - 32) / 9);

        System.out.println("A temperatura em Fahrenheit %.2f é igual a %.2f graus Celsius".formatted(f, c));

        sc.close();
    }
}

package maratonaJava.exercíciosGuia1ao10;

/*  Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais,
    deverá somar os dois valores, caso contrário devera multiplicar A por B.
    Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C
    e imprimir seu valor na tela.
 */

import java.util.Scanner;

public class ExercícioGuia03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double a = sc.nextDouble();

        System.out.println("Digite mais um valor: ");
        double b = sc.nextDouble();

        double c;

        if (a == b){
            c = a + b;
            System.out.printf("O valor de C é "+ c);
        } else {
            c = a * b;

            System.out.println("O valor de C é "+ c);
        }
    }
}

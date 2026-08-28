package maratonaJava.exercíciosGuia1ao10;

//   Faça um algoritmo que leia os valores de A, B, C
//   Em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

import java.util.Scanner;

public class ExercícioGuia01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite A: ");
        double a = sc.nextDouble();

        System.out.println("Digite B: ");
        double b = sc.nextDouble();

        System.out.println("Digite C: ");
        double c = sc.nextDouble();

        double soma = a + b;
        System.out.println(soma);

        if (soma <= c){
            System.out.println("A soma é menor que "+ c);
        }else {
            System.out.println("A soma é maior que "+ c);
        }
    }
}

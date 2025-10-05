package maratonaJava.exercíciosGuia;

//  Faça um algoritmo que leia três notas obtidas por um aluno e imprima na tela a média das notas.

import java.util.Scanner;

public class ExercícioGuia10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira nota: ");
         double nota1 = sc.nextDouble();

         System.out.println("Segunda nota: ");
         double nota2 = sc.nextDouble();

        System.out.println("Terceira nota: ");
         double nota3 = sc.nextDouble();

         double sum = nota1 + nota2 + nota3;
         float result = (float) sum/ 3;

        System.out.println("A média das notas do aluno é " + result +".");


    }
}

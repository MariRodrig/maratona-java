package maratonaJava.exercíciosGuia1ao10;

// Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

import java.util.Scanner;

public class ExercícioGuia07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        boolean valor1 = sc.nextBoolean();

        System.out.println("Digite mais um valor: ");
        boolean valor2 = sc.nextBoolean();

        if (valor1 && valor2){
            System.out.println("Ambos são verdadeiros");
        } else if (!valor1 && !valor2) {
            System.out.println("Ambos são falsos");
        } else {
            System.out.println("São diferentes (um verdadeiro e o outro falso)");
        }
    }
}

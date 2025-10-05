package maratonaJava.exercíciosGuia;

//   Faça um algoritmo que receba um número inteiro
//   Imprima na tela o seu antecessor e o seu sucessor

import java.util.Scanner;

public class ExercícioGuia04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.println("Número: "+ num);
        System.out.println("Número: "+ antecessor + " é seu antecessor");
        System.out.println("Número: "+ sucessor + " é seu sucessor");
    }
}

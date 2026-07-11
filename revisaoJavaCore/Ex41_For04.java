package maratonaJava.revisaoJavaCore;

//  Fazer um programa para ler um número N.
//  Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
//  Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

import java.util.Scanner;

public class Ex41_For04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de pares de números que serão utilizado:");
        int n = sc.nextInt();

        System.out.println("Digite os pares de números inteiros:");
        for (int i = 0; i < n; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (num2 == 0) {
                System.out.println("Divisao impossivel!");
            } else {
                double divisao = (double) num1 / num2;
                System.out.printf("%.2f%n", divisao);
            }
        }
        sc.close();
    }
}
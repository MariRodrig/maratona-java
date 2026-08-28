package maratonaJava.exercíciosGuia1a10;

//  Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.


import java.util.Scanner;

public class ExercícioGuia20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = sc.nextInt();

        System.out.println("Tabuada do " + n);
        for (int i = 1; i <= 10 ; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
        sc.close();
    }
}

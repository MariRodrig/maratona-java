package maratonaJava.exercíciosGuia1ao10;

//  Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

public class ExercícioGuia06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();
        double reajuste = valor + (valor * 0.05);

        System.out.printf("O valor com reajuste é de %.2f", reajuste);
    }
}

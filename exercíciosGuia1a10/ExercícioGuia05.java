package maratonaJava.exercíciosGuia1ao10;

//  Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//  calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
//  (Base para o salário mínimo R$ 1.293,20).

import java.util.Scanner;

public class ExercícioGuia05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioMinimo = 1293.20;

        System.out.println("Digite um salário: ");
        double salarioUsuario = sc.nextDouble();
        double quantidadeSalarios = salarioUsuario / salarioMinimo;

        System.out.printf("O usuário ganha aproximadamente %.2f salários mínimos", quantidadeSalarios);
    }
}

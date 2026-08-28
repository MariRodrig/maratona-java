package maratonaJava.exercíciosGuia1a10;

/*   Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas,
imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado.
Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.   */

import java.util.Scanner;

public class ExercícioGuia11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.println("Quarta nota: ");
        double nota4 = sc.nextDouble();

        double sum = nota1 + nota2 + nota3 + nota4;
        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        System.out.println("A nota do " + nome + " foi de " + sum + ".");

        if (media >= 7.0){
        System.out.println("Com essa nota " + nome + " foi aprovado!");
    } else {
        System.out.println("Com essa nota " + nome + " foi reprovado!");
    }
        sc.close();
    }
}

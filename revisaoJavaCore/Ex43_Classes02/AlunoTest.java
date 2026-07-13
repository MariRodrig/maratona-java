package maratonaJava.revisaoJavaCore.Ex43_Classes02;

//  Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
//  (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano.
//  Dizer também se o aluno está aprovado ou não e, em caso negativo,
//  quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).

import java.util.Scanner;

public class AlunoTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno:");
        aluno.nome = sc.nextLine();
        System.out.println("Digite a nota dos 3 trimestres com a casa decimal:");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        double resultado = (aluno.nota1 + aluno.nota2 + aluno.nota3);

        System.out.printf("Nota final: %.2f%n", resultado);

        if (resultado >= 60) {
            System.out.println("Aluno aprovado!");
        } else {
            double pontosPendentes = (60 - resultado);
            System.out.println("Aluno reprovado!");
            System.out.println("Faltam " + pontosPendentes + " pontos.");

            sc.close();
        }
    }
}

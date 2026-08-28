package maratonaJava.revisaoJavaCore.Ex46_Array01;

//  Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres.
//  Cada uma dessas informações deve ser armazenada em um vetor.
//  Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas
//  seja maior ou igual a 6.0 (seis).

import java.util.Scanner;

public class AlunoTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Digite o nome do aluno e suas notas referentes ao 1 e 2 semestre:");
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            alunos[i] = new Aluno(nome, nota1, nota2);
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < n; i++) {
            double media = (alunos[i].getNota1() + alunos[i].getNota2()) / 2;

            if (media >= 6) {
                System.out.println(alunos[i].getNome());

            }
        }
    }
}
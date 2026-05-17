package maratonaJava.revisaoJavaCore.Ex27_StreamAlunosAprovados.test;

import maratonaJava.revisaoJavaCore.Ex27_StreamAlunosAprovados.dominio.Aluno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*   Crie uma classe chamada Aluno com os atributos: nome e nota
Crie: construtor e getters
Crie uma lista de alunos e dicione: Ana 7, João 5, Maria 9 e Pedro 4
Usando stream, mostre apenas os aprovados com nota >= 7,
a media geral das notas e o melhor aluno da lista
 */


public class AlunoTest01 {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Ana", 7));
        alunos.add(new Aluno("Joao", 5));
        alunos.add(new Aluno("Maria", 9));
        alunos.add(new Aluno("Pedro", 4));
        alunos.add(new Aluno("Carlos", 8));

        System.out.println("Alunos aprovados:");
        alunos.stream()
                .filter(aluno -> aluno.getNota() >= 7)
                .forEach(aluno -> System.out.println(aluno.getNome()));

        double media = alunos.stream()
                .mapToInt(Aluno::getNota)
                .average()
                .orElse(0);
        System.out.println("Media geral das notas: "+ media);

        Aluno melhorAluno = alunos.stream()
                .max(Comparator.comparing(aluno -> aluno.getNota()))
                .orElse(null);
        System.out.println("Melhor aluno: " + melhorAluno.getNome());
    }
}

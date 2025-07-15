package maratonaJava.objetos.Gassossiacao.test;

import maratonaJava.objetos.Gassossiacao.dominio.Aluno;
import maratonaJava.objetos.Gassossiacao.dominio.Local;
import maratonaJava.objetos.Gassossiacao.dominio.Professor;
import maratonaJava.objetos.Gassossiacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Alfredo", 8);
        Professor professor = new Professor("José", "TI");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Como se tornar um dev", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}

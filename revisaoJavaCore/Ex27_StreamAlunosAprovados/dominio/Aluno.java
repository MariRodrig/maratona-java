package maratonaJava.revisaoJavaCore.Ex27_StreamAlunosAprovados.dominio;


public class Aluno {
    private String nome;
    private int nota;

    public Aluno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }
}

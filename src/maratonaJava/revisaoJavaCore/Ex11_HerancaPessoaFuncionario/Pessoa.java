package maratonaJava.revisaoJavaCore.Ex11_HerancaPessoaFuncionario;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}



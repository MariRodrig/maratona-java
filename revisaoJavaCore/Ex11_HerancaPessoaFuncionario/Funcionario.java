package maratonaJava.revisaoJavaCore.Ex11_HerancaPessoaFuncionario;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(){
    }

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }


    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

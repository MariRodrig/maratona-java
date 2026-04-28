package maratonaJava.revisaoJavaCore.Ex13_SistemaFuncionarios;

public class Gerente extends  Funcionario{
    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    public double calcularBonus(){
        return getSalario() * 0.20;
    }
}

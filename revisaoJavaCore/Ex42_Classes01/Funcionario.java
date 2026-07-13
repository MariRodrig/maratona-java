package maratonaJava.revisaoJavaCore.Ex42_Classes01;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    @Override
    public String toString() {
        return "Salario{" +
                "nome='" + nome + '\'' +
                ", salarioBruto=" + salarioBruto +
                ", imposto=" + imposto +
                '}';
    }

    public double salarioLiquido() {
        double salarioLiquido = (salarioBruto - imposto);
        return salarioLiquido;
    }

    public void aumentarSalario(double porcentagem) {
        salarioBruto = salarioBruto + (salarioBruto * (porcentagem / 100));
    }
}

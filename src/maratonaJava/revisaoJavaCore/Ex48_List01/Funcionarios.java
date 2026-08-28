package maratonaJava.revisaoJavaCore.Ex48_List01;

public class Funcionarios {
    private String nome;
    private int id;
    private double salario;


    public Funcionarios(String nome, int id, double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }


    public void aumentarSalario(double porcentagem) {
        salario += salario * porcentagem / 100;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return id + ", "
                + nome
                + ", " + String.format("%.2f", salario);
    }
}

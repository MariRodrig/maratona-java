package maratonaJava.revisaoJavaCore.Ex11_HerancaPessoaFuncionario;

// Faca: Pessoa p = new Funcionario()
// Preencha os dados e imprima

public class PolimorfismoTest01 {
    public static void main(String[] args) {
        Pessoa p = new Funcionario();

        p.setNome("Leticia");
        p.setIdade(30);

        if(p instanceof Funcionario){
            ((Funcionario) p).setSalario(3000);
    }
        p.imprime();
    }
}

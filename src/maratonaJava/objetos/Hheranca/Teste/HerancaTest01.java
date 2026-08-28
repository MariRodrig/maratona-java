package maratonaJava.objetos.Hheranca.Teste;

import maratonaJava.objetos.Hheranca.dominio.Endereco;
import maratonaJava.objetos.Hheranca.dominio.Funcionario;
import maratonaJava.objetos.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua ");
        endereco.setCep("36046-205");
        Pessoa pessoa = new Pessoa("Alfredo Rodrigues");
        pessoa.setCpf("1245556");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Cecilia");
        funcionario.setCpf("33333");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("--------------");

        funcionario.imprime();

    }
}
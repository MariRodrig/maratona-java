package maratonaJava.objetos.Bintroducaometodos.test;

import maratonaJava.objetos.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alfredo");
        pessoa.setIdade(7);
 //       pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}

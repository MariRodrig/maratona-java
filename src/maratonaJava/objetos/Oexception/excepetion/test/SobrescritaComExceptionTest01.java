package maratonaJava.objetos.Oexception.excepetion.test;

import maratonaJava.objetos.Oexception.excepetion.dominio.Funcionario;
import maratonaJava.objetos.Oexception.excepetion.dominio.LoginInvalidoException;
import maratonaJava.objetos.Oexception.excepetion.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}

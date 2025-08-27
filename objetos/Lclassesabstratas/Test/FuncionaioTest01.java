package maratonaJava.objetos.Lclassesabstratas.Test;

import maratonaJava.objetos.Lclassesabstratas.dominio.Desenvolvedor;
import maratonaJava.objetos.Lclassesabstratas.dominio.Gerente;

public class FuncionaioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Joao", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}

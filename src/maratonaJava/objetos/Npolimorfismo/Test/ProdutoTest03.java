package maratonaJava.objetos.Npolimorfismo.Test;

import maratonaJava.objetos.Npolimorfismo.dominio.Computador;
import maratonaJava.objetos.Npolimorfismo.dominio.Produto;
import maratonaJava.objetos.Npolimorfismo.dominio.Tomate;
import maratonaJava.objetos.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Raizen", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}

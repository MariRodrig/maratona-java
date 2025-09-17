package maratonaJava.objetos.Npolimorfismo.Test;

import maratonaJava.objetos.Npolimorfismo.dominio.Computador;
import maratonaJava.objetos.Npolimorfismo.dominio.Produto;
import maratonaJava.objetos.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02{
    public static void main(String[] args) {
        Produto produto = new Computador("Raizen", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("-----------------------");
        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}

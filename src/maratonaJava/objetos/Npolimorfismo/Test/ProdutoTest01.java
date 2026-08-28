package maratonaJava.objetos.Npolimorfismo.Test;

import maratonaJava.objetos.Npolimorfismo.dominio.Computador;
import maratonaJava.objetos.Npolimorfismo.dominio.Televisao;
import maratonaJava.objetos.Npolimorfismo.dominio.Tomate;
import maratonaJava.objetos.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50 pol", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}

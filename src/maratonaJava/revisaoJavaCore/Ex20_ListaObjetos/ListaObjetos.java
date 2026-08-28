package maratonaJava.revisaoJavaCore.Ex20_ListaObjetos;

// Crie uma List<Produto>
// adicione 3 produtos na lista, imprima todos os produtos cadastrados
// Cada produto deve possuir: nome e preço
// some o preço de todos os produtos e exiba o valor total ao final
// encontre o produto mais caro sem usar sort e exiba: Produto mais caro = Notebook

import java.util.ArrayList;
import java.util.List;

public class ListaObjetos {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 3500.00;

        Produto p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 80.00;

        Produto p3 = new Produto();
        p3.nome = "Teclado";
        p3.preco = 150.00;

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        double total = 0;

        Produto maisCaro = produtos.get(0);

        for (Produto produto : produtos) {
            System.out.println(produto.nome + "- R$" + produto.preco);
            total += produto.preco;

            if (produto.preco > maisCaro.preco) {
                maisCaro = produto;
            }
        }
        System.out.println("----------------");
        System.out.println("Total = R$ " + total);
        System.out.println("Produto mais caro = " + maisCaro.nome);
    }
}



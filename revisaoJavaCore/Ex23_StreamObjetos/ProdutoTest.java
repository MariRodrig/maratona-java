package maratonaJava.revisaoJavaCore.Ex23_StreamObjetos;

//  Crie uma classe Produto com os atributos nome e preco.
//  Depois, crie uma lista de produtos com os seguintes valores:
//  Notebook - 3500, Mouse - 80, Teclado - 200
//  Utilizando Streams: Filtre e exiba apenas os produtos com preço maior que 100.
//  Exiba o nome e o preço dos produtos filtrados no console.

import java.util.Arrays;
import java.util.List;

public class ProdutoTest {
    public static void main(String[] args) {

        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", 3500.00),
                new Produto("Mouse", 80.00),
                new Produto("Teclado", 200.00)
        );

        produtos.stream().filter(p -> p.getPreco() > 100)
                .forEach(p -> System.out.println(p.getNome() + ": " + p.getPreco()));
    }
}

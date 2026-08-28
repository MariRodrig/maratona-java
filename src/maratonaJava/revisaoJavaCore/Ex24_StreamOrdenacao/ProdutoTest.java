package maratonaJava.revisaoJavaCore.Ex24_StreamOrdenacao;

// Crie uma classe Produto com os atributos nome e preco.
// Crie uma lista de produtos com os valores: Notebook - 3500, Mouse - 80, Teclado - 200
// Utilizando a API de Streams:
// Ordene os produtos pelo preço (do menor para o maior).
// Exiba apenas o nome dos produtos no console, já ordenados.

import maratonaJava.revisaoJavaCore.Ex23_StreamObjetos.Produto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ProdutoTest {
    public static void main(String[] args) {

        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", 3500.00),
                new Produto("Mouse", 80.00),
                new Produto("Teclado", 200.00)
        );

        produtos.stream().sorted(Comparator.comparing(Produto::getPreco))
                .map(Produto::getNome)
                .forEach(System.out::println);
    }
}

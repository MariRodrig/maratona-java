package maratonaJava.revisaoJavaCore.Ex34_TestProduto.test;

/*  Crie uma classe chamada Produto com os atributos: nome, preco e estoque
Crie: constructor e getters
1. Crie um produto
2. Teste se o nome está correto
3. Teste se o preço é maior que 0
4. Teste se o estoque é igual ao esperado
5. Teste se o produto não é nulo
DESAFIO: Teste se o preço é menor que 10000
*/

import maratonaJava.revisaoJavaCore.Ex34_TestProduto.dominio.Produto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProdutoTest01 {

    @Test
    void shouldReturnTrue_WhenNameIsCorrect() {
        Produto produto = new Produto(
                "Notebook Dell",
                7500.00,
                5
        );

        Assertions.assertEquals("Notebook Dell", produto.getNome());
    }

    @Test
    void shouldReturnTrue_WhenPriceIsGreaterThanZero() {
        Produto produto = new Produto(
                "Notebook Dell",
                7500.00,
                5
        );

        Assertions.assertTrue(produto.getPreco() > 0);
    }

    @Test
    void shouldReturnTrue_WhenStockEqualExpected() {
        Produto produto = new Produto(
                "Notebook Dell",
                7500.00,
                500
        );
        Assertions.assertEquals(500, produto.getEstoque());
    }

    @Test
    void shouldReturn_isProductNotBeNull(){
        Produto produto = new Produto(
                "Notebook Dell",
                7500.00,
                500
        );
        Assertions.assertNotNull(produto);
    }

    @Test
    void shouldReturn_whenPriceIsLowerThan10000(){
        Produto produto = new Produto(
                "Notebook Dell",
                7500.00,
                500
        );
        Assertions.assertTrue(produto.getPreco() < 10000.00);
    }
}



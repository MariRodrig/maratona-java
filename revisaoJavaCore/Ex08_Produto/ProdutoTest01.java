package maratonaJava.revisaoJavaCore.Ex08_Produto;

// Exercicio: Classe simples
// Crie uma classe >Produto< com os atributos > nome e preço e imprima o resultado na tela

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Notebook Dell";
        produto.preco = 5300.00;

        System.out.println("Produto: " +produto.nome);
        System.out.println("Preço: " +produto.preco);

    }
}

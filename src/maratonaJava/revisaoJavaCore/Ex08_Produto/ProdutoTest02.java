package maratonaJava.revisaoJavaCore.Ex08_Produto;

// Na classe produto crie o void imprimir() que imprime o produto: x e preço: X

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Notebook Dell";
        produto.preco = 5300.00;

        produto.imprimir();
        
    }
}

package maratonaJava.revisaoJavaCore.Ex09_ProdutoConstrutor;


// Ex: Crie o construtor: Produto(String nome, double preco)
// E instacie assim: Produto p = new Produto("Mouse", 80)
// Ex02: Deixe os atributos como (private) e crie os getters e setters


public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto p = new Produto("Mouse", 80);

        p.imprime();
    }
}

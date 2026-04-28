package maratonaJava.revisaoJavaCore.Ex12_InterfaceProduto;

// Criar a interface imprimivel, com o metodo void imprimir();
// Faça o produto implementar a interface

public class ProdutoTest01 {
    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 3500);

        produto.imprimir();
    }
}

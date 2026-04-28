package maratonaJava.revisaoJavaCore.Ex12_InterfaceProduto;

public class Produto implements Imprimivel{
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

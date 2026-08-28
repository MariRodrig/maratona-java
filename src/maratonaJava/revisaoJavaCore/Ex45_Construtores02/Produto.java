package maratonaJava.revisaoJavaCore.Ex45_Construtores02;

public class Produto {
    public int codigo;
    public String nome;
    public int quantidade;

    @Override
    public String toString() {
        return "Dados do produto:\n" +
                "Código produto: " + codigo + "\n" +
                "Nome: " + nome + "\n" +
                "Quantidade: " + quantidade;
    }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void estoqueEntrada(int entrada){
        quantidade += entrada;
    }

    public void estoqueSaida(int saida){
        quantidade -= saida;
    }
}

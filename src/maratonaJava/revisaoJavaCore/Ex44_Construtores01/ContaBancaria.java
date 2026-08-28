package maratonaJava.revisaoJavaCore.Ex44_Construtores01;

public class ContaBancaria {
    private int numeroConta;
    private String nome;
    private double saldo;

    @Override
    public String toString() {
        return "Conta: "
                + numeroConta
                + ", Titular: " + nome
                + ", Saldo: $ "
                + String.format("%.2f", saldo);
    }

    public ContaBancaria(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public ContaBancaria(int numeroConta, String nome, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        deposito(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void deposito(double depositoInicial) {
        saldo += depositoInicial;
    }

    public void saque(double valor) {
        saldo -= valor + 5.00;

    }
}
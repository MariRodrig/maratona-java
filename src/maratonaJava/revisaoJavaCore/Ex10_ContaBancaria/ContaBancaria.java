package maratonaJava.revisaoJavaCore.Ex10_ContaBancaria;

public class ContaBancaria {

    String titular;
    double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void sacar(double valor){
       if (valor > saldo){
           System.out.println("Saldo insuficiente");
       }
       else {
           saldo = saldo - valor;
       }
    }

    public void imprimirSaldo(){
        System.out.println("Saldo = " +saldo);
    }
}

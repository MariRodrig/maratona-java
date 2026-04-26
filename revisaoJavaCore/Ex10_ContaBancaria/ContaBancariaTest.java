package maratonaJava.revisaoJavaCore.Ex10_ContaBancaria;

// Ex01: Crie uma classe <Conta bancaria> com os atributos <titular e saldo>
// Metodos <depositar(valor), sacar(valor), imprimir(valor)
// Ex02: No <sacar()> se saldo insuficiente, mostrar <Saldo insuficiente>
// Ex03: Criar um construtor: Contabancaria(String titular)

public class ContaBancariaTest {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria("Charles");

        contaBancaria.depositar(50);
        contaBancaria.sacar(200);

        contaBancaria.imprimirSaldo();

    }
}

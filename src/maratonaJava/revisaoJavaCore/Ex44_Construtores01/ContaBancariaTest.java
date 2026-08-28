package maratonaJava.revisaoJavaCore.Ex44_Construtores01;

import java.util.Scanner;

public class ContaBancariaTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome do titular da conta:");
        String nome = sc.nextLine();

        System.out.println("Haverá um depósto inicial? 1 - SIM | 2 - NÃO");
        int opcao = sc.nextInt();

        ContaBancaria contaBancaria;
        if (opcao == 1) {
            System.out.println("Digite o valor do depósito inicial:");
            double depositoInicial = sc.nextDouble();

            contaBancaria = new ContaBancaria(numeroConta, nome, depositoInicial);

        }else {
            contaBancaria = new ContaBancaria(numeroConta, nome);
        }
        System.out.println("Dados da conta:");
        System.out.println(contaBancaria);

        System.out.println("Insira um valor de depósito:");
        double valorDeposito = sc.nextDouble();
        contaBancaria.deposito(valorDeposito);

        System.out.println("Dados da conta atualizados:");
        System.out.println(contaBancaria);

        System.out.println("Insira um valor de saque:");
        double valorSaque = sc.nextDouble();
        contaBancaria.saque(valorSaque);

        System.out.println("Dados da conta atualizados:");
        System.out.println(contaBancaria);

        sc.close();
    }
}

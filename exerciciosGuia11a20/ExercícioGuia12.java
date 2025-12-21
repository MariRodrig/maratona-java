package maratonaJava.exercíciosGuia1a10;

/*   Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago.
Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

Tabela de Código de Condições de Pagamento
1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
2 - À Vista no cartão de crédito, recebe 10% de desconto
3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%   */

import java.util.Locale;
import java.util.Scanner;

public class ExercícioGuia12 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do produto: R$ ");
        double preco = sc.nextDouble();

        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("1 - À vista (Dinheiro/Pix): 15% de desconto");
        System.out.println("2 - À vista (Cartão de crédito): 10% de desconto");
        System.out.println("3 - Cartão em 2x (sem juros)");
        System.out.println("4 - Cartão em 3x ou mais (juros de 10%)");
        System.out.println("Opção: ");

        int opcao = sc.nextInt();

        double valorFinal;
        int parcelas = 1;

        if (opcao == 1) {
            valorFinal = preco * 0.85;
        } else if (opcao == 2) {
            valorFinal = preco * 0.90;
        } else if (opcao == 3) {
            valorFinal = preco;
            parcelas = 2;
        } else if (opcao == 4) {
            System.out.println("Informe o número de parcelas (3 ou mais): ");
            parcelas = sc.nextInt();
            if (parcelas < 3) {
                System.out.println("Número de parcelas inválido para a opção 4. Usando 3 parcelas.");
                parcelas = 3;
            }
            valorFinal = preco * 1.10;
        } else {
            System.out.println("Opção inválida. Encerrando.");
            sc.close();
            return;
        }
        double valorParcela = valorFinal / parcelas;

        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);
        if (parcelas > 1) {
            System.out.printf("Em %dx de R$ %.2f%n", parcelas, valorParcela);
        } else {
            System.out.println("Pagamento à vista.");
        }
    }
}

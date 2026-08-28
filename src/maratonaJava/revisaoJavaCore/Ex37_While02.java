package maratonaJava.revisaoJavaCore;

//  Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
//  Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//  4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
//  deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4.
//  Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.

import java.util.Scanner;

public class Ex37_While02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Tipos de combustíveis");
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Fim");

        while (opcao != 4) {
            System.out.println("Digite o tipo de combustível abastecido:");

            if (scanner.hasNextInt()) {

                opcao = scanner.nextInt();
                scanner.nextLine();

                if (opcao == 1) {
                    alcool++;
                } else if (opcao == 2) {
                    gasolina++;
                } else if (opcao == 3) {
                    diesel++;
                } else if (opcao == 4) {
                    System.out.println("Fim");
                } else {
                    System.out.println("Código inválido, digite o código correto.");
                }

            } else {
                System.out.println("Digite apenas números.");
                scanner.nextLine();
            }
        }

        System.out.println();
        System.out.println("Muito obrigada!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        scanner.close();
    }
}
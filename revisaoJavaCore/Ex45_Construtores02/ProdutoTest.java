package maratonaJava.revisaoJavaCore.Ex45_Construtores02;

import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do produto a ser cadastrado: ");
        int codProduto = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.println("Haverá um estoque inicial? 1 - SIM | 2 - NÃO");
        int opcao = sc.nextInt();

        Produto produto;
        if (opcao == 1) {
            System.out.print("Digite a quantidade do estoque inicial: ");
            int qtdEstoque = sc.nextInt();

            produto = new Produto(codProduto, nomeProduto, qtdEstoque);

        } else {
            produto = new Produto(codProduto, nomeProduto);
        }

        System.out.print("Digite a quantidade para entrada no estoque: ");
        int qtdEntrada = sc.nextInt();
        produto.estoqueEntrada(qtdEntrada);
        System.out.println(produto);

        System.out.print("Digite a quantidade para saída do estoque: ");
        int qtdSaida = sc.nextInt();
        produto.estoqueSaida(qtdSaida);
        System.out.println(produto);

        sc.close();


    }
}

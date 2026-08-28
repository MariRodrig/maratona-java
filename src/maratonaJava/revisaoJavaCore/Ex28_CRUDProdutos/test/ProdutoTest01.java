package maratonaJava.revisaoJavaCore.Ex28_CRUDProdutos.test;

/*
Crie uma classe chamada Produto com os atributos: id, nome, preco
Crie: construtor, getters, toString
Crie uma lista de produtos: adicione pelo menos 4 produtos
Mostre todos os produtos
Atualize o preço de um produto específico
Remova um produto da lista
Mostre a lista atualizada
DESAFIO: use Stream para mostrar apenas produtos com preço maior que 3000.00
*/

import maratonaJava.revisaoJavaCore.Ex28_CRUDProdutos.dominio.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoTest01 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("TV", 1, 4500.00));
        produtos.add(new Produto("Notebook", 2, 7000.00));
        produtos.add(new Produto("Geladeira", 3, 3000.00));
        produtos.add(new Produto("Frigobar", 4, 2500.00));

        System.out.println("\nProdutos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }


        System.out.println("---------------");
        System.out.println("\nAtualizando preco...");
        for (Produto produto : produtos) {
            if (produto.getId() == 2) {
                produto.setPreco(6500.00);
                break;
            }
        }
        System.out.println("Lista atualizada:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        System.out.println("---------------");
        System.out.println("\nRemovendo produto...");
        produtos.removeIf(produto -> produto.getPreco() <= 4000.00);

        System.out.println("Lista atualizada:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        System.out.println("---------------");
        System.out.println("\nFiltrando produto...");
        produtos.stream()
                .filter(produto -> produto.getPreco() > 3000.00)
                .forEach(System.out::println);
    }
}


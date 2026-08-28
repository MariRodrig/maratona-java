package maratonaJava.revisaoJavaCore.Ex32_CRUDPedidos.test;

/* Crie uma classe chamada Pedido com os atributos: numeroPedido, cliente e valor
Crie: constructor, getters, toString
Crie uma lista de pedidos
Adicione 5 pedidos
Mostre todos os pedidos
Atualize o valor de um pedido específico
Remova um pedido pelo número
Mostre os pedidos atualizados
DESAFIO: Use Stream para mostrar apenas pedidos com valor maior que 500
*/

import maratonaJava.revisaoJavaCore.Ex31_CRUDClientes.dominio.Cliente;
import maratonaJava.revisaoJavaCore.Ex32_CRUDPedidos.dominio.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoTest01 {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>(List.of(
                new Pedido(10, "Rodrigo Silva", 700.00),
                new Pedido(11, "Luciane Gama", 1200.00),
                new Pedido(12, "Pedro Silva", 250.00),
                new Pedido(13, "Sandra Souza", 400.00),
                new Pedido(14, "Charles Schettino", 1500.00)
        ));
        System.out.println("\nPedidos:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }

        for (Pedido pedido : pedidos) {
            if (pedido.getValor() == 250.00) {
                pedido.setValor(800.00);
                break;
            }
        }
        for (Pedido pedido : pedidos) {
            if (pedido.getNumeroPedido() == 13) {
                pedidos.remove(pedido);
                break;
            }
        }
        System.out.println("\nPedidos atualizados:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }

        System.out.println("\nPedidos com valor maior que 500:");
        pedidos.stream()
                .filter(pedido -> pedido.getValor()>500)
                .forEach(System.out::println);
    }
}

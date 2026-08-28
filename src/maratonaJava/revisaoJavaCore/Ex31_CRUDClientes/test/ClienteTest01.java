package maratonaJava.revisaoJavaCore.Ex31_CRUDClientes.test;

/* Crie uma classe chamada Cliente com os atributos: nome, email e idade
Crie: constructor, getters, toString
Crie uma lista de clientes
Adicione 5 clientes
Mostre todos os clientes
Atualize o email de um cliente específico
Remova um cliente pelo nome
Mostre os clientes atualizados
DESAFIO: Use Stream para mostrar apenas clientes maiores de 30 anos
*/

import maratonaJava.revisaoJavaCore.Ex31_CRUDClientes.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteTest01 {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>(List.of(
                new Cliente("Leticia Silva", "leticia2026@gmail.com", 31),
                new Cliente("Lucas Nascimento", "lucasnasc@gmail.com", 25),
                new Cliente("Pedro Lucas Ortega", "pedro.ortega@yahoo.com.br", 27),
                new Cliente("Lucas Amaral", "amaral@hotmail.com", 29),
                new Cliente("Vinicius Wiliam Medeiros", "viniwiliam@gmail.com", 26)
        ));
        System.out.println("\nLista clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals("amaral@hotmail.com")) {
                cliente.setEmail("lucas.amaral@yahoo.com.br");
                break;
            }
        }
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals("Vinicius Wiliam Medeiros")) {
                clientes.remove(cliente);
                break;
            }
        }
        System.out.println("\nLista de clientes atualizada:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        System.out.println("\nClientes com idade superiores a 30 anos:");
        clientes.stream()
                .filter(cliente -> cliente.getIdade() > 30)
                .forEach(System.out::println);
    }
}

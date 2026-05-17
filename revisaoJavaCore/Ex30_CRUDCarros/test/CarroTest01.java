package maratonaJava.revisaoJavaCore.Ex30_CRUDCarros.test;

/* Crie uma classe chamada Carro com os atributos: marca, modelo e ano
Crie: constructor, getters, toString
Crie uma lista de carros
Adicione 5 carros
Mostre todos os carros
Atualize o ano de um carro específico
Remova um carro pelo modelo
Mostre os carros atualizados
DESAFIO: Use Stream para mostrar apenas carros com ano > 2022
*/

import maratonaJava.revisaoJavaCore.Ex30_CRUDCarros.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroTest01 {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>(List.of(
                new Carro("Toyota", "Corolla", 2024),
                new Carro("Honda", "Civic", 2023),
                new Carro("Ford", "Mustang", 2021),
                new Carro("Chevrolet", "Camaro", 2018),
                new Carro("Tesla", "Model 3", 2022)
        ));
        System.out.println("\nCarros:");
        for (Carro carro : carros) {
            System.out.println(carro);
        }

        for (Carro carro : carros) {
            if (carro.getModelo().equals("Mustang")) {
                carro.setAno(2024);
                break;
            }
        }
        for (Carro carro : carros) {
            if (carro.getModelo().equals("Camaro")) {
                carros.remove(carro);
                break;
            }
        }
        System.out.println("\nLista atualizada:");
        for (Carro carro : carros) {
            System.out.println(carro);
        }
        System.out.println("\nCarros com ano >= 2022");
        carros.stream()
                .filter(carro -> carro.getAno() > 2022)
                .forEach(System.out::println);
    }
}

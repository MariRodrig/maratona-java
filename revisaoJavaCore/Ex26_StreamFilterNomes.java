package maratonaJava.revisaoJavaCore;

// Crie uma lista de nomes com os valores: Ana, Carlos, Pedro, Amanda, Lucas
// Utilizando a API de Streams: Filtre e exiba apenas os nomes que começam com a letra 'A'.
// Exiba os nomes filtrados no console.

import java.util.Arrays;
import java.util.List;

public class Ex26_StreamFilterNomes {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Ana", "Carlos", "Pedro", "Amanda", "Lucas");

        nomes.stream().filter(nome -> nome.startsWith("A"))
                .forEach(System.out::println);
    }
}

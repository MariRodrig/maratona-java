package maratonaJava.revisaoJavaCore;

// Crie uma lista de nomes com os valores: Ana, Joao, Maria
// Utilizando a API de Streams: Converta todos os nomes para letras maiúsculas.
// Exiba os nomes convertidos no console.

import java.util.Arrays;
import java.util.List;

public class Ex25_StreamMap {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Ana", "Joao", "Maria");

        nomes.stream().map(nome -> nome.toUpperCase())
                .forEach(System.out::println);
    }
}

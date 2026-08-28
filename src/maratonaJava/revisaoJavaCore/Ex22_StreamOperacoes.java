package maratonaJava.revisaoJavaCore;

// Crie uma lista de números inteiros com os valores: 10, 20, 30, 40, 50.
// Utilizando a API de Streams:
// 1. Filtre e exiba apenas os números maiores que 25.
// 2. Calcule a média dos valores da lista.
// Exiba os resultados no console.

import java.util.Arrays;
import java.util.List;

public class Ex22_StreamOperacoes {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        numeros.stream().filter(n -> n > 25).forEach(n -> System.out.println(n));

        double media = numeros.stream().mapToInt( n -> n).average().orElse(0);
        System.out.println("Media = " + media);
    }
}

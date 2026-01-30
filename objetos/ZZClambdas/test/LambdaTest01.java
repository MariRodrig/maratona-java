package maratonaJava.objetos.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Alfredo", "Charles", "Afonso", "Joao");
        List<Integer> integers = List.of(10, 20, 30, 40);
        forEach(strings, (String s) -> System.out.println(s));
        forEach(integers, i -> System.out.println(i)); //simplificando o código
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }


    }
}

package maratonaJava.objetos.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Charles", "Afonso");
        List<Integer> intergers = map(strings, (String s) -> s.length());
        List<String> map = map(strings, String::toUpperCase); // simplicando o código com o method reference
        System.out.println(intergers);
        System.out.println(map);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}

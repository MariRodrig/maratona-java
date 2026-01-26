package maratonaJava.objetos.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Narcos");
        lista.add("Narcos");

        for(String o : lista){
            System.out.println(o);
        }
    }
}

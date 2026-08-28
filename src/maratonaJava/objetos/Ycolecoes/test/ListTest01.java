package maratonaJava.objetos.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Alfredo");
        nomes.add("Escola TI");
        nomes.add("Charles");
        nomes.add("Rodrigues");

        nomes.addAll(nomes2);

//        nomes.remove(0);    // pode selecionar por índice ou objeto

        for(String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("--------------");
        int size = nomes.size();
        for (int i = 0; i < nomes.size(); i++) {     // outra forma de usar mas não muito usada!
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}

package maratonaJava.revisaoJavaCore;

// Crie um programa que crie um Map<Integer, String>
// adicione os seguintes valores: 1 -> Mariana, 2 -> João e 3 -> Ana
// imprima todos os elementos no formato: 1 Mariana, 2 João, 3 Ana

import java.util.HashMap;
import java.util.Map;

public class Ex21_Map {
    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(1, "Mariana");
        pessoas.put(2, "João");
        pessoas.put(3, "Ana");

        for (Map.Entry<Integer, String> entry : pessoas.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

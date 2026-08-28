package maratonaJava.revisaoJavaCore.Ex20_ListaObjetos;

// Crie um Map<String, Integer>, adicione os seguintes valores:
// Mariana -> 28, João -> 35, Ana -> 22 e percorra o Map
// exiba no formato: Carolina tem 28 anos, João tem 35 anos, Ana tem 22 anos

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ex22_MapReal {
    public static void main(String[] args) {

        Map<String, Integer> pessoas = new LinkedHashMap<>();

        pessoas.put("Carolina", 34);
        pessoas.put("João", 35);
        pessoas.put("Ana", 22);

        for (Map.Entry<String, Integer> entry : pessoas.entrySet()){
            System.out.println(entry.getKey() + " tem " + entry.getValue() + " anos.");
        }
    }
}

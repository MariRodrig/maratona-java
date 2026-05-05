package maratonaJava.revisaoJavaCore;

// Crie um programa que crie uma List<String>,
// adicione os valores "Java", "SQL" e "Spring" e imprima todos os elementos da lista

import java.util.ArrayList;
import java.util.List;

public class Ex19_ListStrings {
    public static void main(String[] args) {

        List<String> tecnologias = new ArrayList<>();

        tecnologias.add("Java");
        tecnologias.add("SQL");
        tecnologias.add("Spring");

        for (String tecnologia : tecnologias){
            System.out.println(tecnologia);
        }
    }
}

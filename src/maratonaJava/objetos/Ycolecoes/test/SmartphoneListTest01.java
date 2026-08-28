package maratonaJava.objetos.Ycolecoes.test;

import maratonaJava.objetos.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ADC1", "Iphone");
        Smartphone s2 = new Smartphone("102030", "LG");
        Smartphone s3 = new Smartphone("050607", "Samsumg");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

//        smartphones.clear();  // deleta tudo que está dentro do array

        for(Smartphone smartphone : smartphones){
             System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("050607", "Samsumg");

        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);//Traz o índice do objeto ou -1 caso não exista
        System.out.println(indexSmartphone4);

    }
}


package maratonaJava.objetos.Ycolecoes.test;

import maratonaJava.objetos.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
       Smartphone s1 = new Smartphone("1ADC1", "Iphone");
       Smartphone s2 = new Smartphone("1ADC1", "Iphone");
        System.out.println(s1.equals(s2));
    }
}

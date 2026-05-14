package maratonaJava.objetos.ZZHpadroesdeprojeto.test;

import maratonaJava.objetos.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Jose")
                .lastName("Silva")
                .username("Zeca")
                .email("josesilva@dev.com")
                .build();
        System.out.println(build);
    }
}

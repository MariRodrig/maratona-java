package maratonaJava.objetos.Aintroducaoclasses.test;

import maratonaJava.objetos.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "VW";
        carro01.modelo = "Nivus";
        carro01.ano = 2025;

        carro02.nome = "Fiat";
        carro02.modelo = "Fastback";
        carro02.ano = 2025;

        System.out.println("Carro 01");
        System.out.println(carro01.nome);
        System.out.println(carro01.modelo);
        System.out.println(carro01.ano);

        System.out.println("----------");

        System.out.println("Carro 02");
        System.out.println(carro02.nome);
        System.out.println(carro02.modelo);
        System.out.println(carro02.ano);
    }
}

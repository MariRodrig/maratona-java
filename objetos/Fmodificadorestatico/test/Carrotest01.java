package maratonaJava.objetos.Fmodificadorestatico.test;

import maratonaJava.objetos.Fmodificadorestatico.dominio.Carro;

public class Carrotest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro ("BWW", 280);
        Carro c2 = new Carro ("Merceds", 275);
        Carro c3 = new Carro ("Audi", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}


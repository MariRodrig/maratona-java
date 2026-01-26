package maratonaJava.objetos.Zgenerics.test;

import maratonaJava.objetos.Zgenerics.dominio.Barco;
import maratonaJava.objetos.Zgenerics.dominio.Carro;
import maratonaJava.objetos.Zgenerics.service.BarcoRentavelService;
import maratonaJava.objetos.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = BarcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}

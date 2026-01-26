package maratonaJava.objetos.Zgenerics.test;

import maratonaJava.objetos.Zgenerics.dominio.Carro;
import maratonaJava.objetos.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = CarroRentavelService.buscarCarrosDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}

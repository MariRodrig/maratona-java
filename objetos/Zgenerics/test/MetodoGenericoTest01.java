package maratonaJava.objetos.Zgenerics.test;

import maratonaJava.objetos.Zgenerics.dominio.Barco;
import maratonaJava.objetos.Zgenerics.service.BarcoRentavelService;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto (new Barco("Canoa marota"));
        System.out.println(barcoList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
}

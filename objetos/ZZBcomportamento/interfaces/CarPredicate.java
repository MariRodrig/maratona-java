package maratonaJava.objetos.ZZBcomportamento.interfaces;

import maratonaJava.objetos.ZZBcomportamento.dominio.Car;

public interface CarPredicate {
    // anonimas, funçoes, conciso
    boolean test(Car car);
    // (parametro) -> <expressao>
    //(Car car) -> car.getcolor().equals("green);
}

package maratonaJava.objetos.ZZBcomportamento.test;

import maratonaJava.objetos.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("-----------------");
        System.out.println(filterByYearBefore(cars, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String cor) {
        List<Car> filterRedCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)) {
                filterRedCar.add(car);
            }
        }
        return filterRedCar;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> filterByYearBefore = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filterByYearBefore.add(car);
            }
        }
        return filterByYearBefore;
    }
}
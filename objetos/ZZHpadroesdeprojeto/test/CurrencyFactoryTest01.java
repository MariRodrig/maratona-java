package maratonaJava.objetos.ZZHpadroesdeprojeto.test;

import maratonaJava.objetos.ZZHpadroesdeprojeto.dominio.Country;
import maratonaJava.objetos.ZZHpadroesdeprojeto.dominio.Currency;
import maratonaJava.objetos.ZZHpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}

package maratonaJava.revisaoJavaCore;

// Crie um programa que utilize a classe LocalDate para representar a data atual.
// Crie uma variável chamada "hoje" com a data atual.
// Exiba separadamente:
// - Ano
// - Mês
// - Dia

import java.time.LocalDate;

public class Ex16_LocalDate {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        System.out.println("Ano: "+hoje.getYear());
        System.out.println("Mes: "+hoje.getMonthValue());
        System.out.println("Dia: "+hoje.getDayOfMonth());
    }
}

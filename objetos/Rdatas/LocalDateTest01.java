package maratonaJava.objetos.Rdatas;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        LocalDate date = LocalDate.of(2002,Month.JANUARY, 27);
        LocalDate agora = LocalDate.now();  // data atual
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());  // quantos dias tem o mês
        System.out.println(date.isLeapYear());  // mostra se o ano é bisexto ou não
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date);
        System.out.println(agora);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}

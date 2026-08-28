package maratonaJava.objetos.Rdatas;

// Representa um intervalo de tempo baseado em anos, meses e dias.
// Diferente de Duration (que mede segundos, minutos e horas)
// o Period lida com tempo calendário, ou seja, datas.

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

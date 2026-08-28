package maratonaJava.objetos.Rdatas;

// Muito similar a Date, porém a date trabalha com milissegundos a partir de 01/01/1970
// já a Instant trabalha com nanosegundos

// Instant mais interessante quando trabalhamos com aplicação, para datas melhor a LocalDate, LocalTime

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(3));
    }
}

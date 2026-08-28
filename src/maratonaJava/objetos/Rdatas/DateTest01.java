package maratonaJava.objetos.Rdatas;

// Não é mais utilizada, principalmente em sistemas modernos.

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000);  // long 10000000
        System.out.println(date);
    }
}

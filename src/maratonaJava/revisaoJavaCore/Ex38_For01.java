package maratonaJava.revisaoJavaCore;

//  Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,
//  um valor por linha, inclusive o X, se for o caso.

public class Ex38_For01 {
    public static void main(String[] args) {

        int x = 20;
        for (int i = 1; i <= x ; i+= 2) {
                System.out.println(i);
            }
        System.out.println("Cálculo encerrado.");
    }
}



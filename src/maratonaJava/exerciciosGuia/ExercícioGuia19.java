package maratonaJava.exercíciosGuia1a10;

// Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

public class ExercícioGuia19 {
    public static void main(String[] args) {

        for (int n = 1; n <=10; n++){
            System.out.println("Tabuada do " +n);
            for (int i = 1; i <= 10; i++){
                System.out.println(n + " x " + i + " = " + (n * i));
            }
            System.out.println();
        }
    }
}

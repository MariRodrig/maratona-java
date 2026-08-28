package maratonaJava.revisaoJavaCore;

// Crie um programa que tenha um array de inteiros (10, 20, 30, 40, 50)
// Mostre todos os numeros, a soma e a media

public class Ex02_ArrayLoop {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};

        for (int i = 0; i <= 4; i++) {
            System.out.println(num[i]);
        }

        int soma = 0;
        for (int numero : num) {
            soma += numero;
        }
        System.out.println("Soma total: " + soma);

        double media = (double) soma / num.length;
        System.out.println("Media: " + media);
    }
}




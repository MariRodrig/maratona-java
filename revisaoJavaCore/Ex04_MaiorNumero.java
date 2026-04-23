package maratonaJava.revisaoJavaCore;

// Mostre o maior numedo do array abaixo sem usar o sort.

public class Ex04_MaiorNumero {
    public static void main(String[] args) {
        int[] num = {5, 18, 2, 44, 9, 30};

        int maior = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > maior) {
                maior = num[i];
            }
        }
        System.out.println("Maior número é: " + maior);
    }
}



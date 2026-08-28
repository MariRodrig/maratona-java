package maratonaJava.revisaoJavaCore;

// Contar a quantidade de pares do array abaixo.

public class Ex05_ContarPares {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8};

        int contador = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0){
                contador++;
            }
        }
        System.out.println("Quantidade pares é: " +contador);
    }
}

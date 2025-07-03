package maratonaJava.exercícios;

// Desafio 01: Criar uma calculadora que valida se um número é primo ou não
// Retornar true se for, false se não for

public class Exercício01 {
    public static void main(String[] args) {
        int numero = 10;
        boolean numPrimo = true;

        if (numero <= 1) {
            numPrimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i ==0) {
                    numPrimo = false;
                    break;
                }
            }
        }
        if (numPrimo) {
            System.out.println(numero + " é primo");
        } else {
            System.out.println(numero + " não é primo");
        }
    }
}

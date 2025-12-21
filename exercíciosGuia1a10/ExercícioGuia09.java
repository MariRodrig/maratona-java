package maratonaJava.exercíciosGuia1ao10;

/* Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura
e imprima na tela sua condição de acordo com a tabela abaixo:

Fórmula do IMC = peso / (altura) ²
Tabela Condições IMC
Abaixo de 18,5   | Abaixo do peso
Entre 18,6 e 24,9 | Peso ideal (parabéns)
Entre 25,0 e 29,9 | Levemente acima do peso
Entre 30,0 e 34,9 | Obesidade grau I
Entre 35,0 e 39,9 | Obesidade grau II (severa)
Maior ou igual a 40 | Obesidade grau III (mórbida) */

import java.util.Scanner;

public class ExercícioGuia09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Peso (Kg): ");
        double peso = parseDouble(sc.nextLine());

        System.out.println("Altura (m): ");
        double altura = parseDouble(sc.nextLine());

        if (peso <= 0 || altura <= 0) {
            System.out.println("Valores invalidos. Informe peso/altura maiores que zero");
            sc.close();
            return;
        }

        double imc = peso / (altura * altura);

        String condicao;
        if (imc < 18.5) {
            condicao = "Abaixo do peso";
        } else if (imc < 25) {
            condicao = "Peso ideal";
        } else if (imc < 30) {
            condicao = "Levemente acima do peso";
        } else if (imc < 35) {
            condicao = "Obesidade grau I";
        } else if (imc < 40) {
            condicao = "Obesidade grau II (severa)";
        } else {
            condicao = "Obesidade grau III (morbida)";
        }
        System.out.printf("IMC = %.2f -> %s%n", imc, condicao);
        sc.close();
    }

    private static double parseDouble(String texto) {
        return Double.parseDouble(texto.trim().replace(',' , '.'));
    }
}
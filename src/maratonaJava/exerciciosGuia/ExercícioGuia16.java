package maratonaJava.exercíciosGuia1a10;

//   Faça um algoritmo que leia três valores que representam os três lados de um triângulo
//   e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.

import java.util.Scanner;

public class ExercícioGuia16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado A: ");
        double a = sc.nextDouble();

        System.out.println("Digite o lado B: ");
        double b = sc.nextDouble();

        System.out.println("Digite o lado C: ");
        double c = sc.nextDouble();

        boolean ladosPositivos = a > 0 && b > 0 && c > 0;
        boolean formaTriangulo = a < b + c && b < a + c && c < a + b;

        if (! ladosPositivos || !formaTriangulo){
        System.out.println("Valores inválidos: não formam um triângulo.");
        sc.close();
        return;
    }
        if (a == b && b ==c){
            System.out.println("Triângulo EQUILÁTERO (três lados iguais).");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triângulo ISÓSCELES (dois lados iguais).");
        } else {
            System.out.println("Triângulo ESCALENO (todos os lados diferentes).");
        }
            sc.close();
        }
    }

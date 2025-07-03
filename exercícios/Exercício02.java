package maratonaJava.exercícios;

// Desafio02: Criar uma calculadora que recebe uma lista/array
// Retornar a lista 2x


public class Exercício02 {
    public static void main(String[] args) {
        CalculadoraExercício02 calculadora = new CalculadoraExercício02("Desafio 02");

        int[] numeros = {3, 6, 9, 12};
        int[] resultado = calculadora.dobrarLista(numeros);

        for (int valor : resultado){
        System.out.println(valor);
        }
    }
}

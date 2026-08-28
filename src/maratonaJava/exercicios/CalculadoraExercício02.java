package maratonaJava.exercícios;

public class CalculadoraExercício02 {
    public String nome;

    public CalculadoraExercício02(String nome) {
        this.nome = nome;
    }
    public int[] dobrarLista(int[] numeros){
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultado[i] = numeros[i] * 2;
        }
        return resultado;
    }
}

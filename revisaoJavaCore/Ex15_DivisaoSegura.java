package maratonaJava.revisaoJavaCore;

// Crie um programa que realize a divisão entre dois números inteiros.
// Utilize try-catch para tratar possíveis erros de divisão por zero.
// Caso ocorra erro, exiba a mensagem: "Não pode dividir por zero".


public class Ex15_DivisaoSegura {
    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: "+resultado);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public static int dividir (int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Não pode dividir por zero");
        }
        return a / b;
    }
}

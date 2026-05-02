package maratonaJava.revisaoJavaCore;

//  Crie um programa que realize uma divisão entre dois números inteiros.
//  Utilize try-catch para tratar possíveis erros de divisão por zero.
//  Caso ocorra erro, exiba a mensagem: "Erro: divisão por zero".

public class Ex14_TryCatch {
    public static void main(String[] args) {

        int x = 10;
        int y = 0;

        try {
            int resultado = x / y;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero");
        }
    }
}

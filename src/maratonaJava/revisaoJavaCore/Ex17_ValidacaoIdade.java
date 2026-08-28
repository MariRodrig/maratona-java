package maratonaJava.revisaoJavaCore;

// Crie um programa que possua um método setIdade(int idade).
// O método deve validar se a idade é válida.
// Caso a idade seja menor que 0, lançar uma exception com a mensagem: "Idade inválida".
// Utilize try-catch para tratar o erro ao chamar o método.

public class Ex17_ValidacaoIdade {
    public static void main(String[] args) {

        try {
            setIdade(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade inválida");
        }
        System.out.println("Idade válida: "+idade);
    }
}

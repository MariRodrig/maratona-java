package maratonaJava.revisaoJavaCore;

// Crie um programa que recebe uma nota 7.5
// Mostra aprovado se >=7, recuperacao se >=5 e reprovado se <5


public class Ex03_IfElse {
    public static void main(String[] args) {

        double nota = 7.5;

        if (nota >= 7) {
            System.out.println("Aluno aprovado");
        } else if (nota >= 5) {
            System.out.println("Aluno de recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}

package maratonaJava.revisaoJavaCore;

// Crie uma String nome e mostre quantos caracteres possui e
// o nome em maiúsculo e se contém o sobrenome da String

public class Ex07_Strings {
    public static void main(String[] args) {

        String nome = "Charles Silva";

        System.out.println(nome.length());
        System.out.println(nome.toUpperCase());

        nome.contains("Silva");
        if (nome.contains("Silva")){
            System.out.println("Contém Silva");
        }
        else {
            System.out.println("Não contém Silva");
        }
    }
}

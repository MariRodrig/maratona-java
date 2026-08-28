package maratonaJava.objetos.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Charles";
        String numeros = "012345";
        System.out.println(nome.charAt(3));  // mostra o caracter referente à posição numérica
        System.out.println(nome.length());  // conta os caracteres
        System.out.println(nome.replace("h","i"));  // troca um caracter pelo outro
        System.out.println(nome.toLowerCase());  // deixa tudo em letra minúscula
        System.out.println(nome.toUpperCase());  // deixa tudo em letra maiúscula
        System.out.println(numeros.substring(0,2));  //devolve um novo texto pegando os caracteres do índice inicial
        // inclusivo até o índice final exclusivo.
        System.out.println(numeros.length());  // conta os caracteres
        System.out.println(nome.trim());  //  remove os valores em brancos do começo e final da string

    }
}

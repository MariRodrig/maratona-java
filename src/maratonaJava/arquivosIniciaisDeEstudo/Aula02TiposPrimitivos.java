package maratonaJava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean

        /* Casting: forçar uma variavel a se tornar outra
           long numeroGrande = (long) 155.23;
               Vai imprimir só 155 porque o long nao suporta numero com decimal

           Tipo Primitivo: guarda um valor simples
           String NÃO é primitivo. É uma classe, classes começam com letra maiúscula.
           String NO JAVA é um objeto.
         */

        int age = 10;
        long numeroGrande = 1000000;
        double salarioDouble = 2000;
        float  salarioFloat = 2500;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 10;
        System.out.println(age);
    }
}
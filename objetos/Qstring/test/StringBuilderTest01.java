package maratonaJava.objetos.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Charles";
        nome.concat("Rodrigues");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Charles");
        sb.append(" Rodrigues");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb.toString());

    }
}

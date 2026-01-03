package maratonaJava.objetos.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Alfredo";  // String constant pool
        String nome2 = "Alfredo";
        nome = nome.concat(" Rodrigues");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Alfredo");  // resumo abaixo
        // 1 variável de referência, 2 objeto do tipo String, 3 uma string no pool de string, ngm utiliza dessa forma
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
